const { parse, stringify } = require('protocol-buffers-schema')
const { dirname, resolve } = require('path')
const { readFileSync } = require('fs')
const compile = require('protocol-buffers')

const kImportPath = resolve(__dirname, 'src')

// root
const schema = Node('cfsnet/', {package: 'cfsnet', imports: ['index.proto']})
const output = visit(schema, []).join('')
const messages = compile(output)

module.exports = Object.assign(messages, {raw: output})

function visit(node, output) {
  for (const k of node.imports) {
    const child = Node(k, read(file(k)))
    const buffer = stringify(child).split('\n').slice(1).join('\n')
    output.push('\n')
    output.push(`// '${k}' generated on ${Date()}`)
    output.push(buffer)
    visit(child, output)
  }

  return output

  function file(filename) {
    if (/.*.proto$/.test(filename)) {
      return filename
    } else {
      return `${filename}.proto`
    }
  }

  function read(filename) {
    return parse(readFileSync(resolve(kImportPath, filename)))
  }
}

function Node(filename, node) {
  const defaults = {
    syntax: 3,
    filename: resolve(kImportPath, filename),
    package: null,
    imports: [],
    enums: [],
    messages: [],
    options: {},
    extends: []
  }

  return Object.assign(defaults, node || {})
}

const { sync: isDirectory } = require('is-directory')
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
    const child = Node(k, read(k))
    const buffer = stringify(child).split('\n').slice(1).join('\n')
    output.push('\n')
    output.push(`// '${k}' generated on ${Date()}`)
    output.push(buffer)
    visit(child, output)
  }

  return output

  function read(filename) {
    filename = resolve(kImportPath, filename)
    if (isDirectory(filename)) {
      filename = resolve(filename, 'index.proto')
    }
    if (false == /.*.proto$/.test(filename)) {
      filename = `${filename}.proto`
    }
    return parse(readFileSync(filename))
  }
}

function Node(filename, node) {
  const defaults = {
    syntax: 3,
    filename: resolve(kImportPath, filename),
    package: null,
    messages: [],
    options: {},
    extends: [],
    imports: [],
    enums: [],
  }

  return Object.assign(defaults, node || {})
}

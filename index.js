const { sync: isDirectory } = require('is-directory')
const { parse, stringify } = require('protocol-buffers-schema')
const { dirname, resolve } = require('path')
const { readFileSync } = require('fs')
const compile = require('protocol-buffers')
const debug = require('debug')('cfsnet-protocol-buffers')

const kImportPath = resolve(__dirname, 'src')

// root
const schema = Node('cfsnet/', {package: 'cfsnet', imports: ['index.proto']})
const output = visit(schema, [], []).join('')
const messages = compile(output)

module.exports = Object.assign(messages, {raw: output})

function visit(node, output, seen) {
  if (0 == output.length) {
    output.push('syntax = "proto3";\n')
  }

  for (let f of node.imports) {
    filename = resolve(kImportPath, f)
    if (isDirectory(filename)) {
      filename = resolve(filename, 'index.proto')
    }

    if (false == /.*.proto$/.test(filename)) {
      filename = `${filename}.proto`
    }

    if (seen.includes(filename)) {
      continue
    }

    const child = Node(filename, read(filename))
    const buffer = stringify(child)
      .split('\n')
      .slice(0)
      .join('\n')
      .replace(/required\s+/g, '')
      .replace(/optional\s+/g, '')

    debug("visit: seen: %s", filename)
    seen.push(filename)
    output.push('\n')
    output.push(`// '${f}' generated on ${Date()}`)
    output.push(buffer)
    visit(child, output, seen)
  }

  return output

  function read(filename) {
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

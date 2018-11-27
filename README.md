<img src="https://github.com/arablocks/ara-module-template/blob/master/ara.png" width="30" height="30" /> cfsnet-protocol-buffers
========

[![Build Status](https://travis-ci.com/AraBlocks/cfsnet-protocol-tests.svg?token=6WjTyCg41y8MBmCzro5x&branch=master)](https://travis-ci.com/AraBlocks/cfsnet-protocol-tests)

Protocol buffers for CFSNET

## Table of Contents
- [Status](#status)
- [Dependencies](#dependencies)
- [Installation](#installation)
- [Usage](#usage)
- [Messages](#messages)
- [Enums](#enums)
- [Contributing](#contributing)
- [See Also](#see-also)

## Status
**Stable**

## Dependencies
- Protocol Buffer compiler [protoc](https://github.com/protocolbuffers/protobuf/releases)
- [protoc-c](https://github.com/protobuf-c/protobuf-c)
- [protoc-gen-doc](https://github.com/pseudomuto/protoc-gen-doc) to generate docs _optional_

## Installation
```sh
$ npm install
$ make all
```
## Usage
- TODO

## Messages
- [AccessFile](#AccessFile)
- [Boolean](#Boolean)
- [Buffer](#Buffer)
- [Close](#Close)
- [DownloadDirectory](#DownloadDirectory)
- [DownloadFile](#DownloadFile)
- [Handshake](#Handshake)
- [KeyPair](#KeyPair)
- [List](#List)
- [ListDirectory](#ListDirectory)
- [MakeDirectory](#MakeDirectory)
- [Number](#Number)
- [Open](#Open)
- [Read](#Read)
- [ReadFile](#ReadFile)
- [RemoveDirectory](#RemoveDirectory)
- [RemoveDirectoryPath](#RemoveDirectoryPath)
- [Request](#Request)
- [Resolve](#Resolve)
- [Response](#Response)
- [Stat](#Stat)
- [StatFile](#StatFile)
- [String](#String)
- [TouchFile](#TouchFile)
- [UnlinkFile](#UnlinkFile)
- [WriteFile](#WriteFile)

<a name="AccessFile"></a>
### AccessFile
Implements `AccessFile(path, [mode])` operation. Send this message to check the access of a file.

| Field | Type | Description |
| ----- | ---- | ----------- |
| path | string | filepath |
| mode | FileMode | One of the [FileMode enum values](#FileMode) |

<a name="Boolean"></a>
### Boolean
Protobuf message wrapping `Bool`.

| Field | Type | Description |
| ----- | ---- | ----------- |
| value | bool | boolean |

<a name="Buffer"></a>
### Buffer
Protobuf message wrapping generic byte buffer.

| Field | Type | Description |
| ----- | ---- | ----------- |
| value | bytes | TODO |
| length | uint64 | Size of value |

<a name="Close"></a>
### Close
Implements `Open(fd)` operation. Send this message to open a file and get a file descriptor.

| Field | Type | Description |
| ----- | ---- | ----------- |
| fileDescriptor | unit32 | TODO |

<a name="DownloadDirectory"></a>
### DownloadDirectory
Implements `DownloadDirectory(path)` operation. Send this message to download a directory.

| Field | Type | Description |
| ----- | ---- | ----------- |
| path | string | Filepath of directory to download |

<a name="DownloadFile"></a>
### DownloadFile
Implements `DownloadFile(path)` operation. Send this message to download a file.

| Field | Type | Description |
| ----- | ---- | ----------- |
| path | string | Filepath of file to download |

<a name="Drive"></a>
### Drive
TODO

| Field | Type | Description |
| ----- | ---- | ----------- |
| id | bytes | TODO |
| key | bytes | TODO |
| secretKey | bytes | TODO |

<a name="Handshake"></a>
### Handshake
A `Handshake` message is used between client (Alice) and server (Bob) to capture a handshake prior to a request message exchange. This should be the first payload sent in request to initiate a connection handshake.

| Field | Type | Description |
| ----- | ---- | ----------- |
| nonce | bytes | One time use nonce value; should be SHA256 hash of output from a pseudo random number generator |
| key | bytes | BLAKE2b hash of the concatenation of "CFSNET1" and nonce |
| ack | bool | indicates the handshake was *ack*nowledged by receiver |

<a name="KeyPair"></a>
### KeyPair
TODO

| Field | Type | Description |
| ----- | ---- | ----------- |
| seed | bytes | TODO |
| publicKey | bytes | TODO |
| secretKey | bytes | TODO |

<a name="List"></a>
### List
TODO

| Field | Type | Description |
| ----- | ---- | ----------- |
| values | repeated bytes | TODO |
| length | uint64 | TODO |

<a name="ListDirectory"></a>
### ListDirectory
Implements `ListDirectory(path)` operation. Send this message to list a directory.

| Field | Type | Description |
| ----- | ---- | ----------- |
| path | string | Filepath of directory to list |

<a name="MakeDirectory"></a>
### MakeDirectory
Implements `MakeDirectory(path)` operation. Send this message to make a directory. _Parent directory should already exist._

| Field | Type | Description |
| ----- | ---- | ----------- |
| path | string | Filepath of where to create directory |

<a name="MakeDirectoryPath"></a>
### MakeDirectoryPath
Implements `MakeDirectory(path)` operation. Send this message to make a directory. _Parent directories will be made if they do not already exist in the path._

| Field | Type | Description |
| ----- | ---- | ----------- |
| path | string | Filepath of where to create directory |

<a name="Number"></a>
### Number
TODO

| Field | Type | Description |
| ----- | ---- | ----------- |
| value | double | TODO |

<a name="Open"></a>
### Open
Implements `Open(path)` operation. Send this message to open a file and get a file descriptor.

| Field | Type | Description |
| ----- | ---- | ----------- |
| path | string | Filepath to file to open |
| flags | string | TODO |

<a name="Read"></a>
### Read
Implements `Read(fd, start, end)` operation. Send this message to read a range from an open file descriptor.

| Field | Type | Description |
| ----- | ---- | ----------- |
| fileDescriptor | uint32 | TODO |
| start | uint32 | Offset to start reading from |
| end | uint32 | Offset to stop reading from |

<a name="ReadFile"></a>
### ReadFile
Implements `ReadFile(path, [start], [end])` operation. Send this message to read a range from an open file descriptor.

| Field | Type | Description |
| ----- | ---- | ----------- |
| path | string | Path to file to read |
| start | uint32 | Offset to start reading from |
| end | uint32 | Offset to stop reading from |

<a name="RemoveDirectory"></a>
### RemoveDirectory
Implements `RemoveDirectory(path)` operation. Send this message to remove a directory. _The directory should already exist and be empty._

| Field | Type | Description |
| ----- | ---- | ----------- |
| path | string | Filepath of directory to remove |

<a name="RemoveDirectoryPath"></a>
### RemoveDirectoryPath
Implements `RemoveDirectoryPath(path)` operation. Send this message to remove a directory. _The directory does not have to exist or be empty._

| Field | Type | Description |
| ----- | ---- | ----------- |
| path | string | Filepath of where to create directory |

<a name="Request"></a>
### Request
Represents a request payload for an operation on a CFSNet drive instance.

| Field | Type | Description |
| ----- | ---- | ----------- |
| nonce | bytes | Number used once |
| drive | Drive | [Drive](#Drive) |
| operation | Operation | [Operation](#Operation) |
| buffer | bytes | TODO |

<a name="Resolve"></a>
### Resolve
Implements `Resolve(path)` operation. Send this message to resolve a given file path to a fully qualified file name by resolving relative paths (`./`) and special tokens (`~`).

| Field | Type | Description |
| ----- | ---- | ----------- |
| path | string | Filepath to resolve |

<a name="Response"></a>
### Response
Represents a response payload for an operation on a CFSNet drive instance.

| Field | Type | Description |
| ----- | ---- | ----------- |
| nonce | bytes | matches `Request.nonce` |
| drive | Drive | [Drive](#Drive) |
| operation | Operation | [Operation](#Operation) |
| request | Request | [Request](#Request) |
| errorCode | ErrorCode | [ErrorCode](#ErrorCode) |
| buffer | bytes | TODO |

<a name="Stat"></a>
### Stat
TODO

| Field | Type | Description |
| ----- | ---- | ----------- |
| uid | uint32 | TODO |
| gid | uint32 | TODO |
| mode | uint32 | TODO |
| size | uint64 | TODO |
| atime | uint64 | TODO |
| ctime | uint64 | TODO |
| mtime | uint64 | TODO |
| blocks | uint64 | TODO |

<a name="StatFile"></a>
### StatFile
Implements `StatFile(path)` operation.

| Field | Type | Description |
| ----- | ---- | ----------- |
| path | string | TODO |

<a name="String"></a>
### String
TODO

| Field | Type | Description |
| ----- | ---- | ----------- |
| value | string | TODO |

<a name="TouchFile"></a>
### TouchFile
Implements `TouchFile(path)` operation.

| Field | Type | Description |
| ----- | ---- | ----------- |
| path | string | Filepath to touch |

<a name="UnlinkFile"></a>
### UnlinkFile
Implements `UnlinkFile(path)` operation.

| Field | Type | Description |
| ----- | ---- | ----------- |
| path | string | Filepath to unlink |

<a name="WriteFile"></a>
### WriteFile
Implements `WriteFile(path, buffer, [start], [end])` operation.

| Field | Type | Description |
| ----- | ---- | ----------- |
| path | string | TODO |
| buffer | bytes | TODO |
| start | uint32 | TODO |
| end | uint32 | TODO |

## Enums
- [FileMode](#FileMode)
- [ErrorCode](#ErrorCode)
- [Operation](#Operation)

<a name="FileMode"></a>
### FileMode
File mode constants for determining file access.

| Constant | Value |Description |
| ----- | ----- |----------- |
| F_OK | 0 | TODO |
| X_OK | 1 | File is executable |
| W_OK | 2 | File is writable |
| R_OK | 4 | File is readable |

<a name="ErrorCode"></a>
### ErrorCode
Error codes that indicate client or remote errors.

| Constant | Value |Description |
| ----- | ----- |----------- |
| NoError | 0 | TODO |
| BadRequestError | 400 | TODO |
| AccessDeniedError | 403 | TODO |
| NotFoundError | 404 | TODO |
| NotSupportedError | 405 | TODO |
| NotOpenedError | 410 | TODO |
| InternalError | 500 | TODO |
| NotImplementedError | 501 | TODO |

<a name="Operation"></a>
### Operation
TODO

| Constant | Value |Description |
| ----- | ----- |----------- |
| NoOperation | 0 | TODO |
| ResolveOperation | 1 | TODO |
| KeyPairOperation | 2 | TODO |
| OpenOperation | 10 | TODO |
| CloseOperation | 11 | TODO |
| ReadOperation | 12 | TODO |
| WriteOperation | 13 | TODO |
| ReadFileOperation | 20 | TODO |
| WriteFileOperation | 21 | TODO |
| StatFileOperation | 22 | TODO |
| UnlinkFileOperation | 23 | TODO |
| AccessFileOperation | 24 | TODO |
| TouchFileOperation | 25 | TODO |
| DownloadFileOperation | 26 | TODO |
| DownloadDirectoryOperation | 30 | TODO |
| MakeDirectoryOperation | 31 | TODO |
| MakeDirectoryPathOperation | 32 | TODO |
| RemoveDirectoryOperation | 33 | TODO |
| RemoveDirectoryPathOperation | 34 | TODO |
| ListDirectoryOperation | 35 | TODO |


## Contributing
- [Commit message format](/.github/COMMIT_FORMAT.md)
- [Commit message examples](/.github/COMMIT_FORMAT_EXAMPLES.md)
- [How to contribute](/.github/CONTRIBUTING.md)

Releases follow [Semantic Versioning](https://semver.org/)

## See Also
- [Protocol Buffers](https://github.com/protocolbuffers/protobuf)

## License
LGPL-3.0
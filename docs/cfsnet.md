# Protocol Documentation
<a name="top"></a>

## Table of Contents

- [cfsnet.proto](#cfsnet.proto)
    - [AccessFile](#ara.cfsnet.AccessFile)
    - [Boolean](#ara.cfsnet.Boolean)
    - [Buffer](#ara.cfsnet.Buffer)
    - [Close](#ara.cfsnet.Close)
    - [DownloadDirectory](#ara.cfsnet.DownloadDirectory)
    - [DownloadFile](#ara.cfsnet.DownloadFile)
    - [Drive](#ara.cfsnet.Drive)
    - [Handshake](#ara.cfsnet.Handshake)
    - [KeyPair](#ara.cfsnet.KeyPair)
    - [List](#ara.cfsnet.List)
    - [ListDirectory](#ara.cfsnet.ListDirectory)
    - [MakeDirectory](#ara.cfsnet.MakeDirectory)
    - [MakeDirectoryPath](#ara.cfsnet.MakeDirectoryPath)
    - [Number](#ara.cfsnet.Number)
    - [Open](#ara.cfsnet.Open)
    - [Read](#ara.cfsnet.Read)
    - [ReadFile](#ara.cfsnet.ReadFile)
    - [RemoveDirectory](#ara.cfsnet.RemoveDirectory)
    - [RemoveDirectoryPath](#ara.cfsnet.RemoveDirectoryPath)
    - [Request](#ara.cfsnet.Request)
    - [Resolve](#ara.cfsnet.Resolve)
    - [Response](#ara.cfsnet.Response)
    - [Stat](#ara.cfsnet.Stat)
    - [StatFile](#ara.cfsnet.StatFile)
    - [String](#ara.cfsnet.String)
    - [TouchFile](#ara.cfsnet.TouchFile)
    - [UnlinkFile](#ara.cfsnet.UnlinkFile)
    - [WriteFile](#ara.cfsnet.WriteFile)
  
    - [ErrorCode](#ara.cfsnet.ErrorCode)
    - [FileMode](#ara.cfsnet.FileMode)
    - [Operation](#ara.cfsnet.Operation)
  
  
  

- [Scalar Value Types](#scalar-value-types)



<a name="cfsnet.proto"></a>
<p align="right"><a href="#top">Top</a></p>

## cfsnet.proto



<a name="ara.cfsnet.AccessFile"></a>

### AccessFile



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| path | [string](#string) |  |  |
| mode | [FileMode](#ara.cfsnet.FileMode) |  |  |






<a name="ara.cfsnet.Boolean"></a>

### Boolean



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| value | [bool](#bool) |  |  |






<a name="ara.cfsnet.Buffer"></a>

### Buffer



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| value | [bytes](#bytes) |  |  |
| length | [uint64](#uint64) |  |  |






<a name="ara.cfsnet.Close"></a>

### Close



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| fileDescriptor | [uint32](#uint32) |  |  |






<a name="ara.cfsnet.DownloadDirectory"></a>

### DownloadDirectory



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| path | [string](#string) |  |  |






<a name="ara.cfsnet.DownloadFile"></a>

### DownloadFile



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| path | [string](#string) |  |  |






<a name="ara.cfsnet.Drive"></a>

### Drive



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| id | [bytes](#bytes) |  |  |
| key | [bytes](#bytes) |  |  |
| secretKey | [bytes](#bytes) |  |  |






<a name="ara.cfsnet.Handshake"></a>

### Handshake



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| nonce | [bytes](#bytes) |  |  |
| key | [bytes](#bytes) |  |  |
| ack | [bool](#bool) |  |  |






<a name="ara.cfsnet.KeyPair"></a>

### KeyPair



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| seed | [bytes](#bytes) |  |  |
| publicKey | [bytes](#bytes) |  |  |
| secretKey | [bytes](#bytes) |  |  |






<a name="ara.cfsnet.List"></a>

### List



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| values | [bytes](#bytes) | repeated |  |
| length | [uint64](#uint64) |  |  |






<a name="ara.cfsnet.ListDirectory"></a>

### ListDirectory



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| path | [string](#string) |  |  |






<a name="ara.cfsnet.MakeDirectory"></a>

### MakeDirectory



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| path | [string](#string) |  |  |






<a name="ara.cfsnet.MakeDirectoryPath"></a>

### MakeDirectoryPath



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| path | [string](#string) |  |  |






<a name="ara.cfsnet.Number"></a>

### Number



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| value | [double](#double) |  |  |






<a name="ara.cfsnet.Open"></a>

### Open



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| path | [string](#string) |  |  |
| flags | [string](#string) |  |  |






<a name="ara.cfsnet.Read"></a>

### Read



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| fileDescriptor | [uint32](#uint32) |  |  |
| start | [uint32](#uint32) |  |  |
| end | [uint32](#uint32) |  |  |






<a name="ara.cfsnet.ReadFile"></a>

### ReadFile



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| path | [string](#string) |  |  |
| start | [uint32](#uint32) |  |  |
| end | [uint32](#uint32) |  |  |






<a name="ara.cfsnet.RemoveDirectory"></a>

### RemoveDirectory



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| path | [string](#string) |  |  |






<a name="ara.cfsnet.RemoveDirectoryPath"></a>

### RemoveDirectoryPath



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| path | [string](#string) |  |  |






<a name="ara.cfsnet.Request"></a>

### Request



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| nonce | [bytes](#bytes) |  |  |
| drive | [Drive](#ara.cfsnet.Drive) |  |  |
| operation | [Operation](#ara.cfsnet.Operation) |  |  |
| buffer | [bytes](#bytes) |  |  |






<a name="ara.cfsnet.Resolve"></a>

### Resolve



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| path | [string](#string) |  |  |






<a name="ara.cfsnet.Response"></a>

### Response



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| nonce | [bytes](#bytes) |  |  |
| drive | [Drive](#ara.cfsnet.Drive) |  |  |
| operation | [Operation](#ara.cfsnet.Operation) |  |  |
| request | [Request](#ara.cfsnet.Request) |  |  |
| errorCode | [ErrorCode](#ara.cfsnet.ErrorCode) |  |  |
| buffer | [bytes](#bytes) |  |  |






<a name="ara.cfsnet.Stat"></a>

### Stat



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| uid | [uint32](#uint32) |  |  |
| gid | [uint32](#uint32) |  |  |
| mode | [uint32](#uint32) |  |  |
| size | [uint64](#uint64) |  |  |
| atime | [uint64](#uint64) |  |  |
| ctime | [uint64](#uint64) |  |  |
| mtime | [uint64](#uint64) |  |  |
| blocks | [uint64](#uint64) |  |  |






<a name="ara.cfsnet.StatFile"></a>

### StatFile



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| path | [string](#string) |  |  |






<a name="ara.cfsnet.String"></a>

### String



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| value | [string](#string) |  |  |






<a name="ara.cfsnet.TouchFile"></a>

### TouchFile



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| path | [string](#string) |  |  |






<a name="ara.cfsnet.UnlinkFile"></a>

### UnlinkFile



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| path | [string](#string) |  |  |






<a name="ara.cfsnet.WriteFile"></a>

### WriteFile



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| path | [string](#string) |  |  |
| buffer | [bytes](#bytes) |  |  |
| start | [uint32](#uint32) |  |  |
| end | [uint32](#uint32) |  |  |





 


<a name="ara.cfsnet.ErrorCode"></a>

### ErrorCode


| Name | Number | Description |
| ---- | ------ | ----------- |
| NoError | 0 |  |
| BadRequestError | 400 |  |
| AccessDeniedError | 403 |  |
| NotFoundError | 404 |  |
| NotSupportedError | 405 |  |
| NotOpenedError | 410 |  |
| InternalError | 500 |  |
| NotImplementedError | 501 |  |



<a name="ara.cfsnet.FileMode"></a>

### FileMode


| Name | Number | Description |
| ---- | ------ | ----------- |
| F_OK | 0 |  |
| X_OK | 1 |  |
| W_OK | 2 |  |
| R_OK | 4 |  |



<a name="ara.cfsnet.Operation"></a>

### Operation


| Name | Number | Description |
| ---- | ------ | ----------- |
| NoOperation | 0 |  |
| ResolveOperation | 1 |  |
| KeyPairOperation | 2 |  |
| OpenOperation | 10 |  |
| CloseOperation | 11 |  |
| ReadOperation | 12 |  |
| WriteOperation | 13 |  |
| ReadFileOperation | 20 |  |
| WriteFileOperation | 21 |  |
| StatFileOperation | 22 |  |
| UnlinkFileOperation | 23 |  |
| AccessFileOperation | 24 |  |
| TouchFileOperation | 25 |  |
| DownloadFileOperation | 26 |  |
| DownloadDirectoryOperation | 30 |  |
| MakeDirectoryOperation | 31 |  |
| MakeDirectoryPathOperation | 32 |  |
| RemoveDirectoryOperation | 33 |  |
| RemoveDirectoryPathOperation | 34 |  |
| ListDirectoryOperation | 35 |  |


 

 

 



## Scalar Value Types

| .proto Type | Notes | C++ Type | Java Type | Python Type |
| ----------- | ----- | -------- | --------- | ----------- |
| <a name="double" /> double |  | double | double | float |
| <a name="float" /> float |  | float | float | float |
| <a name="int32" /> int32 | Uses variable-length encoding. Inefficient for encoding negative numbers – if your field is likely to have negative values, use sint32 instead. | int32 | int | int |
| <a name="int64" /> int64 | Uses variable-length encoding. Inefficient for encoding negative numbers – if your field is likely to have negative values, use sint64 instead. | int64 | long | int/long |
| <a name="uint32" /> uint32 | Uses variable-length encoding. | uint32 | int | int/long |
| <a name="uint64" /> uint64 | Uses variable-length encoding. | uint64 | long | int/long |
| <a name="sint32" /> sint32 | Uses variable-length encoding. Signed int value. These more efficiently encode negative numbers than regular int32s. | int32 | int | int |
| <a name="sint64" /> sint64 | Uses variable-length encoding. Signed int value. These more efficiently encode negative numbers than regular int64s. | int64 | long | int/long |
| <a name="fixed32" /> fixed32 | Always four bytes. More efficient than uint32 if values are often greater than 2^28. | uint32 | int | int |
| <a name="fixed64" /> fixed64 | Always eight bytes. More efficient than uint64 if values are often greater than 2^56. | uint64 | long | int/long |
| <a name="sfixed32" /> sfixed32 | Always four bytes. | int32 | int | int |
| <a name="sfixed64" /> sfixed64 | Always eight bytes. | int64 | long | int/long |
| <a name="bool" /> bool |  | bool | boolean | boolean |
| <a name="string" /> string | A string must always contain UTF-8 encoded or 7-bit ASCII text. | string | String | str/unicode |
| <a name="bytes" /> bytes | May contain any arbitrary sequence of bytes. | string | ByteString | str |


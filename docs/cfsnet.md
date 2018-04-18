# Protocol Documentation
<a name="top"/>

## Table of Contents

- [cfsnet.proto](#cfsnet.proto)
    - [AccessFile](#littlstar.cfsnet.AccessFile)
    - [Close](#littlstar.cfsnet.Close)
    - [DownloadDirectory](#littlstar.cfsnet.DownloadDirectory)
    - [DownloadFile](#littlstar.cfsnet.DownloadFile)
    - [Drive](#littlstar.cfsnet.Drive)
    - [Handshake](#littlstar.cfsnet.Handshake)
    - [ListDirectory](#littlstar.cfsnet.ListDirectory)
    - [MakeDirectory](#littlstar.cfsnet.MakeDirectory)
    - [MakeDirectoryPath](#littlstar.cfsnet.MakeDirectoryPath)
    - [Open](#littlstar.cfsnet.Open)
    - [Read](#littlstar.cfsnet.Read)
    - [ReadFile](#littlstar.cfsnet.ReadFile)
    - [RemoveDirectory](#littlstar.cfsnet.RemoveDirectory)
    - [RemoveDirectoryPath](#littlstar.cfsnet.RemoveDirectoryPath)
    - [Request](#littlstar.cfsnet.Request)
    - [Resolve](#littlstar.cfsnet.Resolve)
    - [Response](#littlstar.cfsnet.Response)
    - [Stat](#littlstar.cfsnet.Stat)
    - [StatFile](#littlstar.cfsnet.StatFile)
    - [TouchFile](#littlstar.cfsnet.TouchFile)
    - [UnlinkFile](#littlstar.cfsnet.UnlinkFile)
    - [WriteFile](#littlstar.cfsnet.WriteFile)
  
    - [ErrorCode](#littlstar.cfsnet.ErrorCode)
    - [FileMode](#littlstar.cfsnet.FileMode)
    - [Operation](#littlstar.cfsnet.Operation)
  
  
  

- [Scalar Value Types](#scalar-value-types)



<a name="cfsnet.proto"/>
<p align="right"><a href="#top">Top</a></p>

## cfsnet.proto



<a name="littlstar.cfsnet.AccessFile"/>

### AccessFile



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| path | [string](#string) |  |  |
| mode | [FileMode](#littlstar.cfsnet.FileMode) |  |  |






<a name="littlstar.cfsnet.Close"/>

### Close



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| fd | [uint32](#uint32) |  |  |






<a name="littlstar.cfsnet.DownloadDirectory"/>

### DownloadDirectory



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| path | [string](#string) |  |  |






<a name="littlstar.cfsnet.DownloadFile"/>

### DownloadFile



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| path | [string](#string) |  |  |






<a name="littlstar.cfsnet.Drive"/>

### Drive



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| id | [bytes](#bytes) |  |  |
| key | [bytes](#bytes) |  |  |
| secretKey | [bytes](#bytes) |  |  |






<a name="littlstar.cfsnet.Handshake"/>

### Handshake



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| nonce | [bytes](#bytes) |  |  |
| key | [bytes](#bytes) |  |  |
| ack | [bool](#bool) |  |  |






<a name="littlstar.cfsnet.ListDirectory"/>

### ListDirectory



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| path | [string](#string) |  |  |






<a name="littlstar.cfsnet.MakeDirectory"/>

### MakeDirectory



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| path | [string](#string) |  |  |






<a name="littlstar.cfsnet.MakeDirectoryPath"/>

### MakeDirectoryPath



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| path | [string](#string) |  |  |






<a name="littlstar.cfsnet.Open"/>

### Open



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| path | [string](#string) |  |  |






<a name="littlstar.cfsnet.Read"/>

### Read



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| fd | [uint32](#uint32) |  |  |
| start | [uint32](#uint32) |  |  |
| end | [uint32](#uint32) |  |  |






<a name="littlstar.cfsnet.ReadFile"/>

### ReadFile



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| path | [string](#string) |  |  |
| start | [uint32](#uint32) |  |  |
| end | [uint32](#uint32) |  |  |






<a name="littlstar.cfsnet.RemoveDirectory"/>

### RemoveDirectory



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| path | [string](#string) |  |  |






<a name="littlstar.cfsnet.RemoveDirectoryPath"/>

### RemoveDirectoryPath



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| path | [string](#string) |  |  |






<a name="littlstar.cfsnet.Request"/>

### Request



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| nonce | [bytes](#bytes) |  |  |
| drive | [Drive](#littlstar.cfsnet.Drive) |  |  |
| operation | [Operation](#littlstar.cfsnet.Operation) |  |  |
| buffer | [bytes](#bytes) |  |  |






<a name="littlstar.cfsnet.Resolve"/>

### Resolve



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| path | [string](#string) |  |  |






<a name="littlstar.cfsnet.Response"/>

### Response



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| nonce | [bytes](#bytes) |  |  |
| drive | [Drive](#littlstar.cfsnet.Drive) |  |  |
| operation | [Operation](#littlstar.cfsnet.Operation) |  |  |
| request | [Request](#littlstar.cfsnet.Request) |  |  |
| errorCode | [ErrorCode](#littlstar.cfsnet.ErrorCode) |  |  |
| buffer | [bytes](#bytes) |  |  |






<a name="littlstar.cfsnet.Stat"/>

### Stat



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| mode | [uint32](#uint32) |  |  |
| uid | [uint32](#uint32) |  |  |
| gid | [uint32](#uint32) |  |  |
| size | [uint64](#uint64) |  |  |
| blocks | [uint64](#uint64) |  |  |
| offset | [uint64](#uint64) |  |  |
| byteOffset | [uint64](#uint64) |  |  |
| mtime | [uint64](#uint64) |  |  |
| ctime | [uint64](#uint64) |  |  |






<a name="littlstar.cfsnet.StatFile"/>

### StatFile



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| path | [string](#string) |  |  |






<a name="littlstar.cfsnet.TouchFile"/>

### TouchFile



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| path | [string](#string) |  |  |






<a name="littlstar.cfsnet.UnlinkFile"/>

### UnlinkFile



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| path | [string](#string) |  |  |






<a name="littlstar.cfsnet.WriteFile"/>

### WriteFile



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| path | [string](#string) |  |  |
| buffer | [bytes](#bytes) |  |  |
| start | [uint32](#uint32) |  |  |
| end | [uint32](#uint32) |  |  |





 


<a name="littlstar.cfsnet.ErrorCode"/>

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



<a name="littlstar.cfsnet.FileMode"/>

### FileMode


| Name | Number | Description |
| ---- | ------ | ----------- |
| F_OK | 0 |  |
| X_OK | 1 |  |
| W_OK | 2 |  |
| R_OK | 4 |  |



<a name="littlstar.cfsnet.Operation"/>

### Operation


| Name | Number | Description |
| ---- | ------ | ----------- |
| NoOperation | 0 |  |
| ResolveOperation | 1 |  |
| OpenOperation | 2 |  |
| CloseOperation | 3 |  |
| ReadOperation | 4 |  |
| WriteOperation | 5 |  |
| ReadFileOperation | 10 |  |
| WriteFileOperation | 11 |  |
| StatFileOperation | 12 |  |
| UnlinkFileOperation | 13 |  |
| AccessFileOperation | 14 |  |
| TouchFileOperation | 15 |  |
| DownloadFileOperation | 16 |  |
| DownloadDirectoryOperation | 20 |  |
| MakeDirectoryOperation | 21 |  |
| MakeDirectoryPathOperation | 22 |  |
| RemoveDirectoryOperation | 23 |  |
| RemoveDirectoryPathOperation | 24 |  |
| ListDirectoryOperation | 25 |  |


 

 

 



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


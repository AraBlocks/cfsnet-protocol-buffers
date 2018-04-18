// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: cfsnet.proto

// This CPP symbol can be defined to use imports that match up to the framework
// imports needed when using CocoaPods.
#if !defined(GPB_USE_PROTOBUF_FRAMEWORK_IMPORTS)
 #define GPB_USE_PROTOBUF_FRAMEWORK_IMPORTS 0
#endif

#if GPB_USE_PROTOBUF_FRAMEWORK_IMPORTS
 #import <Protobuf/GPBProtocolBuffers.h>
#else
 #import "GPBProtocolBuffers.h"
#endif

#if GOOGLE_PROTOBUF_OBJC_VERSION < 30002
#error This file was generated by a newer version of protoc which is incompatible with your Protocol Buffer library sources.
#endif
#if 30002 < GOOGLE_PROTOBUF_OBJC_MIN_SUPPORTED_VERSION
#error This file was generated by an older version of protoc which is incompatible with your Protocol Buffer library sources.
#endif

// @@protoc_insertion_point(imports)

#pragma clang diagnostic push
#pragma clang diagnostic ignored "-Wdeprecated-declarations"

CF_EXTERN_C_BEGIN

@class CFSPBDrive;
@class CFSPBRequest;

NS_ASSUME_NONNULL_BEGIN

#pragma mark - Enum CFSPBFileMode

typedef GPB_ENUM(CFSPBFileMode) {
  /**
   * Value used if any message's field encounters a value that is not defined
   * by this enum. The message will also have C functions to get/set the rawValue
   * of the field.
   **/
  CFSPBFileMode_GPBUnrecognizedEnumeratorValue = kGPBUnrecognizedEnumeratorValue,
  CFSPBFileMode_FOk = 0,
  CFSPBFileMode_XOk = 1,
  CFSPBFileMode_WOk = 2,
  CFSPBFileMode_ROk = 4,
};

GPBEnumDescriptor *CFSPBFileMode_EnumDescriptor(void);

/**
 * Checks to see if the given value is defined by the enum or was not known at
 * the time this source was generated.
 **/
BOOL CFSPBFileMode_IsValidValue(int32_t value);

#pragma mark - Enum CFSPBErrorCode

typedef GPB_ENUM(CFSPBErrorCode) {
  /**
   * Value used if any message's field encounters a value that is not defined
   * by this enum. The message will also have C functions to get/set the rawValue
   * of the field.
   **/
  CFSPBErrorCode_GPBUnrecognizedEnumeratorValue = kGPBUnrecognizedEnumeratorValue,
  CFSPBErrorCode_NoError = 0,
  CFSPBErrorCode_AccessDeniedError = 403,
  CFSPBErrorCode_NotFoundError = 404,
  CFSPBErrorCode_NotSupportedError = 405,
  CFSPBErrorCode_NotOpenedError = 410,
};

GPBEnumDescriptor *CFSPBErrorCode_EnumDescriptor(void);

/**
 * Checks to see if the given value is defined by the enum or was not known at
 * the time this source was generated.
 **/
BOOL CFSPBErrorCode_IsValidValue(int32_t value);

#pragma mark - Enum CFSPBOperation

typedef GPB_ENUM(CFSPBOperation) {
  /**
   * Value used if any message's field encounters a value that is not defined
   * by this enum. The message will also have C functions to get/set the rawValue
   * of the field.
   **/
  CFSPBOperation_GPBUnrecognizedEnumeratorValue = kGPBUnrecognizedEnumeratorValue,
  CFSPBOperation_NoOperation = 0,
  CFSPBOperation_ResolveOperation = 1,
  CFSPBOperation_OpenOperation = 2,
  CFSPBOperation_CloseOperation = 3,
  CFSPBOperation_ReadOperation = 4,
  CFSPBOperation_WriteOperation = 5,
  CFSPBOperation_ReadFileOperation = 10,
  CFSPBOperation_WriteFileOperation = 11,
  CFSPBOperation_StatFileOperation = 12,
  CFSPBOperation_UnlinkFileOperation = 13,
  CFSPBOperation_AccessFileOperation = 14,
  CFSPBOperation_TouchFileOperation = 15,
  CFSPBOperation_DownloadFileOperation = 16,
  CFSPBOperation_DownloadDirectoryOperation = 20,
  CFSPBOperation_MakeDirectoryOperation = 21,
  CFSPBOperation_MakeDirectoryPathOperation = 22,
  CFSPBOperation_RemoveDirectoryOperation = 23,
  CFSPBOperation_RemoveDirectoryPathOperation = 24,
  CFSPBOperation_ListDirectoryOperation = 25,
};

GPBEnumDescriptor *CFSPBOperation_EnumDescriptor(void);

/**
 * Checks to see if the given value is defined by the enum or was not known at
 * the time this source was generated.
 **/
BOOL CFSPBOperation_IsValidValue(int32_t value);

#pragma mark - CFSPBCfsnetRoot

/**
 * Exposes the extension registry for this file.
 *
 * The base class provides:
 * @code
 *   + (GPBExtensionRegistry *)extensionRegistry;
 * @endcode
 * which is a @c GPBExtensionRegistry that includes all the extensions defined by
 * this file and all files that it depends on.
 **/
@interface CFSPBCfsnetRoot : GPBRootObject
@end

#pragma mark - CFSPBAccessFile

typedef GPB_ENUM(CFSPBAccessFile_FieldNumber) {
  CFSPBAccessFile_FieldNumber_Path = 1,
  CFSPBAccessFile_FieldNumber_Mode = 2,
};

@interface CFSPBAccessFile : GPBMessage

@property(nonatomic, readwrite, copy, null_resettable) NSString *path;

@property(nonatomic, readwrite) CFSPBFileMode mode;

@end

/**
 * Fetches the raw value of a @c CFSPBAccessFile's @c mode property, even
 * if the value was not defined by the enum at the time the code was generated.
 **/
int32_t CFSPBAccessFile_Mode_RawValue(CFSPBAccessFile *message);
/**
 * Sets the raw value of an @c CFSPBAccessFile's @c mode property, allowing
 * it to be set to a value that was not defined by the enum at the time the code
 * was generated.
 **/
void SetCFSPBAccessFile_Mode_RawValue(CFSPBAccessFile *message, int32_t value);

#pragma mark - CFSPBClose

typedef GPB_ENUM(CFSPBClose_FieldNumber) {
  CFSPBClose_FieldNumber_Fd = 1,
};

@interface CFSPBClose : GPBMessage

@property(nonatomic, readwrite) uint32_t fd;

@end

#pragma mark - CFSPBDownloadDirectory

typedef GPB_ENUM(CFSPBDownloadDirectory_FieldNumber) {
  CFSPBDownloadDirectory_FieldNumber_Path = 1,
};

@interface CFSPBDownloadDirectory : GPBMessage

@property(nonatomic, readwrite, copy, null_resettable) NSString *path;

@end

#pragma mark - CFSPBDownloadFile

typedef GPB_ENUM(CFSPBDownloadFile_FieldNumber) {
  CFSPBDownloadFile_FieldNumber_Path = 1,
};

@interface CFSPBDownloadFile : GPBMessage

@property(nonatomic, readwrite, copy, null_resettable) NSString *path;

@end

#pragma mark - CFSPBDrive

typedef GPB_ENUM(CFSPBDrive_FieldNumber) {
  CFSPBDrive_FieldNumber_Id_p = 1,
  CFSPBDrive_FieldNumber_Key = 2,
};

@interface CFSPBDrive : GPBMessage

@property(nonatomic, readwrite, copy, null_resettable) NSData *id_p;

@property(nonatomic, readwrite, copy, null_resettable) NSData *key;

@end

#pragma mark - CFSPBHandshake

typedef GPB_ENUM(CFSPBHandshake_FieldNumber) {
  CFSPBHandshake_FieldNumber_Nonce = 1,
  CFSPBHandshake_FieldNumber_Key = 2,
  CFSPBHandshake_FieldNumber_Ack = 3,
};

@interface CFSPBHandshake : GPBMessage

@property(nonatomic, readwrite, copy, null_resettable) NSData *nonce;

@property(nonatomic, readwrite, copy, null_resettable) NSData *key;

@property(nonatomic, readwrite) BOOL ack;

@end

#pragma mark - CFSPBListDirectory

typedef GPB_ENUM(CFSPBListDirectory_FieldNumber) {
  CFSPBListDirectory_FieldNumber_Path = 1,
};

@interface CFSPBListDirectory : GPBMessage

@property(nonatomic, readwrite, copy, null_resettable) NSString *path;

@end

#pragma mark - CFSPBMakeDirectory

typedef GPB_ENUM(CFSPBMakeDirectory_FieldNumber) {
  CFSPBMakeDirectory_FieldNumber_Path = 1,
};

@interface CFSPBMakeDirectory : GPBMessage

@property(nonatomic, readwrite, copy, null_resettable) NSString *path;

@end

#pragma mark - CFSPBMakeDirectoryPath

typedef GPB_ENUM(CFSPBMakeDirectoryPath_FieldNumber) {
  CFSPBMakeDirectoryPath_FieldNumber_Path = 1,
};

@interface CFSPBMakeDirectoryPath : GPBMessage

@property(nonatomic, readwrite, copy, null_resettable) NSString *path;

@end

#pragma mark - CFSPBOpen

typedef GPB_ENUM(CFSPBOpen_FieldNumber) {
  CFSPBOpen_FieldNumber_Path = 1,
};

@interface CFSPBOpen : GPBMessage

@property(nonatomic, readwrite, copy, null_resettable) NSString *path;

@end

#pragma mark - CFSPBRead

typedef GPB_ENUM(CFSPBRead_FieldNumber) {
  CFSPBRead_FieldNumber_Fd = 1,
  CFSPBRead_FieldNumber_Start = 2,
  CFSPBRead_FieldNumber_End = 3,
};

@interface CFSPBRead : GPBMessage

@property(nonatomic, readwrite) uint32_t fd;

@property(nonatomic, readwrite) uint32_t start;

@property(nonatomic, readwrite) uint32_t end;

@end

#pragma mark - CFSPBReadFile

typedef GPB_ENUM(CFSPBReadFile_FieldNumber) {
  CFSPBReadFile_FieldNumber_Path = 1,
  CFSPBReadFile_FieldNumber_Start = 2,
  CFSPBReadFile_FieldNumber_End = 3,
};

@interface CFSPBReadFile : GPBMessage

@property(nonatomic, readwrite, copy, null_resettable) NSString *path;

@property(nonatomic, readwrite) uint32_t start;

@property(nonatomic, readwrite) uint32_t end;

@end

#pragma mark - CFSPBRemoveDirectory

typedef GPB_ENUM(CFSPBRemoveDirectory_FieldNumber) {
  CFSPBRemoveDirectory_FieldNumber_Path = 1,
};

@interface CFSPBRemoveDirectory : GPBMessage

@property(nonatomic, readwrite, copy, null_resettable) NSString *path;

@end

#pragma mark - CFSPBRemoveDirectoryPath

typedef GPB_ENUM(CFSPBRemoveDirectoryPath_FieldNumber) {
  CFSPBRemoveDirectoryPath_FieldNumber_Path = 1,
};

@interface CFSPBRemoveDirectoryPath : GPBMessage

@property(nonatomic, readwrite, copy, null_resettable) NSString *path;

@end

#pragma mark - CFSPBRequest

typedef GPB_ENUM(CFSPBRequest_FieldNumber) {
  CFSPBRequest_FieldNumber_Nonce = 1,
  CFSPBRequest_FieldNumber_Drive = 2,
  CFSPBRequest_FieldNumber_Operation = 3,
  CFSPBRequest_FieldNumber_Buffer = 4,
};

@interface CFSPBRequest : GPBMessage

@property(nonatomic, readwrite, copy, null_resettable) NSData *nonce;

@property(nonatomic, readwrite, strong, null_resettable) CFSPBDrive *drive;
/** Test to see if @c drive has been set. */
@property(nonatomic, readwrite) BOOL hasDrive;

@property(nonatomic, readwrite) CFSPBOperation operation;

@property(nonatomic, readwrite, copy, null_resettable) NSData *buffer;

@end

/**
 * Fetches the raw value of a @c CFSPBRequest's @c operation property, even
 * if the value was not defined by the enum at the time the code was generated.
 **/
int32_t CFSPBRequest_Operation_RawValue(CFSPBRequest *message);
/**
 * Sets the raw value of an @c CFSPBRequest's @c operation property, allowing
 * it to be set to a value that was not defined by the enum at the time the code
 * was generated.
 **/
void SetCFSPBRequest_Operation_RawValue(CFSPBRequest *message, int32_t value);

#pragma mark - CFSPBResolve

typedef GPB_ENUM(CFSPBResolve_FieldNumber) {
  CFSPBResolve_FieldNumber_Path = 1,
};

@interface CFSPBResolve : GPBMessage

@property(nonatomic, readwrite, copy, null_resettable) NSString *path;

@end

#pragma mark - CFSPBResponse

typedef GPB_ENUM(CFSPBResponse_FieldNumber) {
  CFSPBResponse_FieldNumber_Nonce = 1,
  CFSPBResponse_FieldNumber_Drive = 2,
  CFSPBResponse_FieldNumber_Operation = 3,
  CFSPBResponse_FieldNumber_Request = 4,
  CFSPBResponse_FieldNumber_ErrorCode = 5,
  CFSPBResponse_FieldNumber_Buffer = 6,
};

@interface CFSPBResponse : GPBMessage

@property(nonatomic, readwrite, copy, null_resettable) NSData *nonce;

@property(nonatomic, readwrite, strong, null_resettable) CFSPBDrive *drive;
/** Test to see if @c drive has been set. */
@property(nonatomic, readwrite) BOOL hasDrive;

@property(nonatomic, readwrite) CFSPBOperation operation;

@property(nonatomic, readwrite, strong, null_resettable) CFSPBRequest *request;
/** Test to see if @c request has been set. */
@property(nonatomic, readwrite) BOOL hasRequest;

@property(nonatomic, readwrite) CFSPBErrorCode errorCode;

@property(nonatomic, readwrite, copy, null_resettable) NSData *buffer;

@end

/**
 * Fetches the raw value of a @c CFSPBResponse's @c operation property, even
 * if the value was not defined by the enum at the time the code was generated.
 **/
int32_t CFSPBResponse_Operation_RawValue(CFSPBResponse *message);
/**
 * Sets the raw value of an @c CFSPBResponse's @c operation property, allowing
 * it to be set to a value that was not defined by the enum at the time the code
 * was generated.
 **/
void SetCFSPBResponse_Operation_RawValue(CFSPBResponse *message, int32_t value);

/**
 * Fetches the raw value of a @c CFSPBResponse's @c errorCode property, even
 * if the value was not defined by the enum at the time the code was generated.
 **/
int32_t CFSPBResponse_ErrorCode_RawValue(CFSPBResponse *message);
/**
 * Sets the raw value of an @c CFSPBResponse's @c errorCode property, allowing
 * it to be set to a value that was not defined by the enum at the time the code
 * was generated.
 **/
void SetCFSPBResponse_ErrorCode_RawValue(CFSPBResponse *message, int32_t value);

#pragma mark - CFSPBStat

typedef GPB_ENUM(CFSPBStat_FieldNumber) {
  CFSPBStat_FieldNumber_Mode = 1,
  CFSPBStat_FieldNumber_Uid = 2,
  CFSPBStat_FieldNumber_Gid = 3,
  CFSPBStat_FieldNumber_Size = 4,
  CFSPBStat_FieldNumber_Blocks = 5,
  CFSPBStat_FieldNumber_Offset = 6,
  CFSPBStat_FieldNumber_ByteOffset = 7,
  CFSPBStat_FieldNumber_Mtime = 8,
  CFSPBStat_FieldNumber_Ctime = 9,
};

@interface CFSPBStat : GPBMessage

@property(nonatomic, readwrite) uint32_t mode;

@property(nonatomic, readwrite) uint32_t uid;

@property(nonatomic, readwrite) uint32_t gid;

@property(nonatomic, readwrite) uint64_t size;

@property(nonatomic, readwrite) uint64_t blocks;

@property(nonatomic, readwrite) uint64_t offset;

@property(nonatomic, readwrite) uint64_t byteOffset;

@property(nonatomic, readwrite) uint64_t mtime;

@property(nonatomic, readwrite) uint64_t ctime;

@end

#pragma mark - CFSPBStatFile

typedef GPB_ENUM(CFSPBStatFile_FieldNumber) {
  CFSPBStatFile_FieldNumber_Path = 1,
};

@interface CFSPBStatFile : GPBMessage

@property(nonatomic, readwrite, copy, null_resettable) NSString *path;

@end

#pragma mark - CFSPBTouchFile

typedef GPB_ENUM(CFSPBTouchFile_FieldNumber) {
  CFSPBTouchFile_FieldNumber_Path = 1,
};

@interface CFSPBTouchFile : GPBMessage

@property(nonatomic, readwrite, copy, null_resettable) NSString *path;

@end

#pragma mark - CFSPBUnlinkFile

typedef GPB_ENUM(CFSPBUnlinkFile_FieldNumber) {
  CFSPBUnlinkFile_FieldNumber_Path = 1,
};

@interface CFSPBUnlinkFile : GPBMessage

@property(nonatomic, readwrite, copy, null_resettable) NSString *path;

@end

#pragma mark - CFSPBWriteFile

typedef GPB_ENUM(CFSPBWriteFile_FieldNumber) {
  CFSPBWriteFile_FieldNumber_Path = 1,
  CFSPBWriteFile_FieldNumber_Buffer = 2,
  CFSPBWriteFile_FieldNumber_Start = 3,
  CFSPBWriteFile_FieldNumber_End = 4,
};

@interface CFSPBWriteFile : GPBMessage

@property(nonatomic, readwrite, copy, null_resettable) NSString *path;

@property(nonatomic, readwrite, copy, null_resettable) NSData *buffer;

@property(nonatomic, readwrite) uint32_t start;

@property(nonatomic, readwrite) uint32_t end;

@end

NS_ASSUME_NONNULL_END

CF_EXTERN_C_END

#pragma clang diagnostic pop

// @@protoc_insertion_point(global_scope)

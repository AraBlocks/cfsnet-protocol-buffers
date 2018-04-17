// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: cfsnet.proto

package com.littlstar.protobuf;

/**
 * Protobuf type {@code littlstar.cfsnet.Request}
 */
public  final class Request extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:littlstar.cfsnet.Request)
    RequestOrBuilder {
  // Use Request.newBuilder() to construct.
  private Request(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private Request() {
    nonce_ = com.google.protobuf.ByteString.EMPTY;
    operation_ = 0;
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return com.google.protobuf.UnknownFieldSet.getDefaultInstance();
  }
  private Request(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    int mutable_bitField0_ = 0;
    try {
      boolean done = false;
      while (!done) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            done = true;
            break;
          default: {
            if (!input.skipField(tag)) {
              done = true;
            }
            break;
          }
          case 10: {

            nonce_ = input.readBytes();
            break;
          }
          case 18: {
            com.littlstar.protobuf.Drive.Builder subBuilder = null;
            if (drive_ != null) {
              subBuilder = drive_.toBuilder();
            }
            drive_ = input.readMessage(com.littlstar.protobuf.Drive.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(drive_);
              drive_ = subBuilder.buildPartial();
            }

            break;
          }
          case 24: {
            int rawValue = input.readEnum();

            operation_ = rawValue;
            break;
          }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(
          e).setUnfinishedMessage(this);
    } finally {
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.littlstar.protobuf.CFSNetProtobuf.internal_static_littlstar_cfsnet_Request_descriptor;
  }

  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.littlstar.protobuf.CFSNetProtobuf.internal_static_littlstar_cfsnet_Request_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.littlstar.protobuf.Request.class, com.littlstar.protobuf.Request.Builder.class);
  }

  public static final int NONCE_FIELD_NUMBER = 1;
  private com.google.protobuf.ByteString nonce_;
  /**
   * <code>bytes nonce = 1;</code>
   */
  public com.google.protobuf.ByteString getNonce() {
    return nonce_;
  }

  public static final int DRIVE_FIELD_NUMBER = 2;
  private com.littlstar.protobuf.Drive drive_;
  /**
   * <code>.littlstar.cfsnet.Drive drive = 2;</code>
   */
  public boolean hasDrive() {
    return drive_ != null;
  }
  /**
   * <code>.littlstar.cfsnet.Drive drive = 2;</code>
   */
  public com.littlstar.protobuf.Drive getDrive() {
    return drive_ == null ? com.littlstar.protobuf.Drive.getDefaultInstance() : drive_;
  }
  /**
   * <code>.littlstar.cfsnet.Drive drive = 2;</code>
   */
  public com.littlstar.protobuf.DriveOrBuilder getDriveOrBuilder() {
    return getDrive();
  }

  public static final int OPERATION_FIELD_NUMBER = 3;
  private int operation_;
  /**
   * <code>.littlstar.cfsnet.Operation operation = 3;</code>
   */
  public int getOperationValue() {
    return operation_;
  }
  /**
   * <code>.littlstar.cfsnet.Operation operation = 3;</code>
   */
  public com.littlstar.protobuf.Operation getOperation() {
    com.littlstar.protobuf.Operation result = com.littlstar.protobuf.Operation.valueOf(operation_);
    return result == null ? com.littlstar.protobuf.Operation.UNRECOGNIZED : result;
  }

  private byte memoizedIsInitialized = -1;
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (!nonce_.isEmpty()) {
      output.writeBytes(1, nonce_);
    }
    if (drive_ != null) {
      output.writeMessage(2, getDrive());
    }
    if (operation_ != com.littlstar.protobuf.Operation.NoOperation.getNumber()) {
      output.writeEnum(3, operation_);
    }
  }

  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!nonce_.isEmpty()) {
      size += com.google.protobuf.CodedOutputStream
        .computeBytesSize(1, nonce_);
    }
    if (drive_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, getDrive());
    }
    if (operation_ != com.littlstar.protobuf.Operation.NoOperation.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(3, operation_);
    }
    memoizedSize = size;
    return size;
  }

  private static final long serialVersionUID = 0L;
  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof com.littlstar.protobuf.Request)) {
      return super.equals(obj);
    }
    com.littlstar.protobuf.Request other = (com.littlstar.protobuf.Request) obj;

    boolean result = true;
    result = result && getNonce()
        .equals(other.getNonce());
    result = result && (hasDrive() == other.hasDrive());
    if (hasDrive()) {
      result = result && getDrive()
          .equals(other.getDrive());
    }
    result = result && operation_ == other.operation_;
    return result;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + NONCE_FIELD_NUMBER;
    hash = (53 * hash) + getNonce().hashCode();
    if (hasDrive()) {
      hash = (37 * hash) + DRIVE_FIELD_NUMBER;
      hash = (53 * hash) + getDrive().hashCode();
    }
    hash = (37 * hash) + OPERATION_FIELD_NUMBER;
    hash = (53 * hash) + operation_;
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.littlstar.protobuf.Request parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.littlstar.protobuf.Request parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.littlstar.protobuf.Request parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.littlstar.protobuf.Request parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.littlstar.protobuf.Request parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.littlstar.protobuf.Request parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.littlstar.protobuf.Request parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.littlstar.protobuf.Request parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.littlstar.protobuf.Request parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.littlstar.protobuf.Request parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.littlstar.protobuf.Request parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.littlstar.protobuf.Request parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(com.littlstar.protobuf.Request prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(
      com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * Protobuf type {@code littlstar.cfsnet.Request}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:littlstar.cfsnet.Request)
      com.littlstar.protobuf.RequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.littlstar.protobuf.CFSNetProtobuf.internal_static_littlstar_cfsnet_Request_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.littlstar.protobuf.CFSNetProtobuf.internal_static_littlstar_cfsnet_Request_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.littlstar.protobuf.Request.class, com.littlstar.protobuf.Request.Builder.class);
    }

    // Construct using com.littlstar.protobuf.Request.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }
    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3
              .alwaysUseFieldBuilders) {
      }
    }
    public Builder clear() {
      super.clear();
      nonce_ = com.google.protobuf.ByteString.EMPTY;

      if (driveBuilder_ == null) {
        drive_ = null;
      } else {
        drive_ = null;
        driveBuilder_ = null;
      }
      operation_ = 0;

      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.littlstar.protobuf.CFSNetProtobuf.internal_static_littlstar_cfsnet_Request_descriptor;
    }

    public com.littlstar.protobuf.Request getDefaultInstanceForType() {
      return com.littlstar.protobuf.Request.getDefaultInstance();
    }

    public com.littlstar.protobuf.Request build() {
      com.littlstar.protobuf.Request result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public com.littlstar.protobuf.Request buildPartial() {
      com.littlstar.protobuf.Request result = new com.littlstar.protobuf.Request(this);
      result.nonce_ = nonce_;
      if (driveBuilder_ == null) {
        result.drive_ = drive_;
      } else {
        result.drive_ = driveBuilder_.build();
      }
      result.operation_ = operation_;
      onBuilt();
      return result;
    }

    public Builder clone() {
      return (Builder) super.clone();
    }
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        Object value) {
      return (Builder) super.setField(field, value);
    }
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return (Builder) super.clearField(field);
    }
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return (Builder) super.clearOneof(oneof);
    }
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, Object value) {
      return (Builder) super.setRepeatedField(field, index, value);
    }
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        Object value) {
      return (Builder) super.addRepeatedField(field, value);
    }
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.littlstar.protobuf.Request) {
        return mergeFrom((com.littlstar.protobuf.Request)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.littlstar.protobuf.Request other) {
      if (other == com.littlstar.protobuf.Request.getDefaultInstance()) return this;
      if (other.getNonce() != com.google.protobuf.ByteString.EMPTY) {
        setNonce(other.getNonce());
      }
      if (other.hasDrive()) {
        mergeDrive(other.getDrive());
      }
      if (other.operation_ != 0) {
        setOperationValue(other.getOperationValue());
      }
      onChanged();
      return this;
    }

    public final boolean isInitialized() {
      return true;
    }

    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      com.littlstar.protobuf.Request parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.littlstar.protobuf.Request) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private com.google.protobuf.ByteString nonce_ = com.google.protobuf.ByteString.EMPTY;
    /**
     * <code>bytes nonce = 1;</code>
     */
    public com.google.protobuf.ByteString getNonce() {
      return nonce_;
    }
    /**
     * <code>bytes nonce = 1;</code>
     */
    public Builder setNonce(com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      nonce_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>bytes nonce = 1;</code>
     */
    public Builder clearNonce() {
      
      nonce_ = getDefaultInstance().getNonce();
      onChanged();
      return this;
    }

    private com.littlstar.protobuf.Drive drive_ = null;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.littlstar.protobuf.Drive, com.littlstar.protobuf.Drive.Builder, com.littlstar.protobuf.DriveOrBuilder> driveBuilder_;
    /**
     * <code>.littlstar.cfsnet.Drive drive = 2;</code>
     */
    public boolean hasDrive() {
      return driveBuilder_ != null || drive_ != null;
    }
    /**
     * <code>.littlstar.cfsnet.Drive drive = 2;</code>
     */
    public com.littlstar.protobuf.Drive getDrive() {
      if (driveBuilder_ == null) {
        return drive_ == null ? com.littlstar.protobuf.Drive.getDefaultInstance() : drive_;
      } else {
        return driveBuilder_.getMessage();
      }
    }
    /**
     * <code>.littlstar.cfsnet.Drive drive = 2;</code>
     */
    public Builder setDrive(com.littlstar.protobuf.Drive value) {
      if (driveBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        drive_ = value;
        onChanged();
      } else {
        driveBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <code>.littlstar.cfsnet.Drive drive = 2;</code>
     */
    public Builder setDrive(
        com.littlstar.protobuf.Drive.Builder builderForValue) {
      if (driveBuilder_ == null) {
        drive_ = builderForValue.build();
        onChanged();
      } else {
        driveBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <code>.littlstar.cfsnet.Drive drive = 2;</code>
     */
    public Builder mergeDrive(com.littlstar.protobuf.Drive value) {
      if (driveBuilder_ == null) {
        if (drive_ != null) {
          drive_ =
            com.littlstar.protobuf.Drive.newBuilder(drive_).mergeFrom(value).buildPartial();
        } else {
          drive_ = value;
        }
        onChanged();
      } else {
        driveBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <code>.littlstar.cfsnet.Drive drive = 2;</code>
     */
    public Builder clearDrive() {
      if (driveBuilder_ == null) {
        drive_ = null;
        onChanged();
      } else {
        drive_ = null;
        driveBuilder_ = null;
      }

      return this;
    }
    /**
     * <code>.littlstar.cfsnet.Drive drive = 2;</code>
     */
    public com.littlstar.protobuf.Drive.Builder getDriveBuilder() {
      
      onChanged();
      return getDriveFieldBuilder().getBuilder();
    }
    /**
     * <code>.littlstar.cfsnet.Drive drive = 2;</code>
     */
    public com.littlstar.protobuf.DriveOrBuilder getDriveOrBuilder() {
      if (driveBuilder_ != null) {
        return driveBuilder_.getMessageOrBuilder();
      } else {
        return drive_ == null ?
            com.littlstar.protobuf.Drive.getDefaultInstance() : drive_;
      }
    }
    /**
     * <code>.littlstar.cfsnet.Drive drive = 2;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.littlstar.protobuf.Drive, com.littlstar.protobuf.Drive.Builder, com.littlstar.protobuf.DriveOrBuilder> 
        getDriveFieldBuilder() {
      if (driveBuilder_ == null) {
        driveBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.littlstar.protobuf.Drive, com.littlstar.protobuf.Drive.Builder, com.littlstar.protobuf.DriveOrBuilder>(
                getDrive(),
                getParentForChildren(),
                isClean());
        drive_ = null;
      }
      return driveBuilder_;
    }

    private int operation_ = 0;
    /**
     * <code>.littlstar.cfsnet.Operation operation = 3;</code>
     */
    public int getOperationValue() {
      return operation_;
    }
    /**
     * <code>.littlstar.cfsnet.Operation operation = 3;</code>
     */
    public Builder setOperationValue(int value) {
      operation_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>.littlstar.cfsnet.Operation operation = 3;</code>
     */
    public com.littlstar.protobuf.Operation getOperation() {
      com.littlstar.protobuf.Operation result = com.littlstar.protobuf.Operation.valueOf(operation_);
      return result == null ? com.littlstar.protobuf.Operation.UNRECOGNIZED : result;
    }
    /**
     * <code>.littlstar.cfsnet.Operation operation = 3;</code>
     */
    public Builder setOperation(com.littlstar.protobuf.Operation value) {
      if (value == null) {
        throw new NullPointerException();
      }
      
      operation_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <code>.littlstar.cfsnet.Operation operation = 3;</code>
     */
    public Builder clearOperation() {
      
      operation_ = 0;
      onChanged();
      return this;
    }
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return this;
    }

    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return this;
    }


    // @@protoc_insertion_point(builder_scope:littlstar.cfsnet.Request)
  }

  // @@protoc_insertion_point(class_scope:littlstar.cfsnet.Request)
  private static final com.littlstar.protobuf.Request DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.littlstar.protobuf.Request();
  }

  public static com.littlstar.protobuf.Request getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<Request>
      PARSER = new com.google.protobuf.AbstractParser<Request>() {
    public Request parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
        return new Request(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<Request> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<Request> getParserForType() {
    return PARSER;
  }

  public com.littlstar.protobuf.Request getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

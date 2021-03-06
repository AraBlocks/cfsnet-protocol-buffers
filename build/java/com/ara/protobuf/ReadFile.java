// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: cfsnet.proto

package com.ara.protobuf;

/**
 * Protobuf type {@code ara.cfsnet.ReadFile}
 */
public  final class ReadFile extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:ara.cfsnet.ReadFile)
    ReadFileOrBuilder {
private static final long serialVersionUID = 0L;
  // Use ReadFile.newBuilder() to construct.
  private ReadFile(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private ReadFile() {
    path_ = "";
    start_ = 0;
    end_ = 0;
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private ReadFile(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
    int mutable_bitField0_ = 0;
    com.google.protobuf.UnknownFieldSet.Builder unknownFields =
        com.google.protobuf.UnknownFieldSet.newBuilder();
    try {
      boolean done = false;
      while (!done) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            done = true;
            break;
          default: {
            if (!parseUnknownFieldProto3(
                input, unknownFields, extensionRegistry, tag)) {
              done = true;
            }
            break;
          }
          case 10: {
            java.lang.String s = input.readStringRequireUtf8();

            path_ = s;
            break;
          }
          case 16: {

            start_ = input.readUInt32();
            break;
          }
          case 24: {

            end_ = input.readUInt32();
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
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.ara.protobuf.CFSNetProtobuf.internal_static_ara_cfsnet_ReadFile_descriptor;
  }

  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.ara.protobuf.CFSNetProtobuf.internal_static_ara_cfsnet_ReadFile_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.ara.protobuf.ReadFile.class, com.ara.protobuf.ReadFile.Builder.class);
  }

  public static final int PATH_FIELD_NUMBER = 1;
  private volatile java.lang.Object path_;
  /**
   * <code>string path = 1;</code>
   */
  public java.lang.String getPath() {
    java.lang.Object ref = path_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      path_ = s;
      return s;
    }
  }
  /**
   * <code>string path = 1;</code>
   */
  public com.google.protobuf.ByteString
      getPathBytes() {
    java.lang.Object ref = path_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      path_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int START_FIELD_NUMBER = 2;
  private int start_;
  /**
   * <code>uint32 start = 2;</code>
   */
  public int getStart() {
    return start_;
  }

  public static final int END_FIELD_NUMBER = 3;
  private int end_;
  /**
   * <code>uint32 end = 3;</code>
   */
  public int getEnd() {
    return end_;
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
    if (!getPathBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, path_);
    }
    if (start_ != 0) {
      output.writeUInt32(2, start_);
    }
    if (end_ != 0) {
      output.writeUInt32(3, end_);
    }
    unknownFields.writeTo(output);
  }

  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!getPathBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, path_);
    }
    if (start_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeUInt32Size(2, start_);
    }
    if (end_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeUInt32Size(3, end_);
    }
    size += unknownFields.getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof com.ara.protobuf.ReadFile)) {
      return super.equals(obj);
    }
    com.ara.protobuf.ReadFile other = (com.ara.protobuf.ReadFile) obj;

    boolean result = true;
    result = result && getPath()
        .equals(other.getPath());
    result = result && (getStart()
        == other.getStart());
    result = result && (getEnd()
        == other.getEnd());
    result = result && unknownFields.equals(other.unknownFields);
    return result;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + PATH_FIELD_NUMBER;
    hash = (53 * hash) + getPath().hashCode();
    hash = (37 * hash) + START_FIELD_NUMBER;
    hash = (53 * hash) + getStart();
    hash = (37 * hash) + END_FIELD_NUMBER;
    hash = (53 * hash) + getEnd();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.ara.protobuf.ReadFile parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.ara.protobuf.ReadFile parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.ara.protobuf.ReadFile parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.ara.protobuf.ReadFile parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.ara.protobuf.ReadFile parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.ara.protobuf.ReadFile parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.ara.protobuf.ReadFile parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.ara.protobuf.ReadFile parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.ara.protobuf.ReadFile parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.ara.protobuf.ReadFile parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.ara.protobuf.ReadFile parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.ara.protobuf.ReadFile parseFrom(
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
  public static Builder newBuilder(com.ara.protobuf.ReadFile prototype) {
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
   * Protobuf type {@code ara.cfsnet.ReadFile}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:ara.cfsnet.ReadFile)
      com.ara.protobuf.ReadFileOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.ara.protobuf.CFSNetProtobuf.internal_static_ara_cfsnet_ReadFile_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.ara.protobuf.CFSNetProtobuf.internal_static_ara_cfsnet_ReadFile_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.ara.protobuf.ReadFile.class, com.ara.protobuf.ReadFile.Builder.class);
    }

    // Construct using com.ara.protobuf.ReadFile.newBuilder()
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
      path_ = "";

      start_ = 0;

      end_ = 0;

      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.ara.protobuf.CFSNetProtobuf.internal_static_ara_cfsnet_ReadFile_descriptor;
    }

    public com.ara.protobuf.ReadFile getDefaultInstanceForType() {
      return com.ara.protobuf.ReadFile.getDefaultInstance();
    }

    public com.ara.protobuf.ReadFile build() {
      com.ara.protobuf.ReadFile result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public com.ara.protobuf.ReadFile buildPartial() {
      com.ara.protobuf.ReadFile result = new com.ara.protobuf.ReadFile(this);
      result.path_ = path_;
      result.start_ = start_;
      result.end_ = end_;
      onBuilt();
      return result;
    }

    public Builder clone() {
      return (Builder) super.clone();
    }
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
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
        int index, java.lang.Object value) {
      return (Builder) super.setRepeatedField(field, index, value);
    }
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return (Builder) super.addRepeatedField(field, value);
    }
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.ara.protobuf.ReadFile) {
        return mergeFrom((com.ara.protobuf.ReadFile)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.ara.protobuf.ReadFile other) {
      if (other == com.ara.protobuf.ReadFile.getDefaultInstance()) return this;
      if (!other.getPath().isEmpty()) {
        path_ = other.path_;
        onChanged();
      }
      if (other.getStart() != 0) {
        setStart(other.getStart());
      }
      if (other.getEnd() != 0) {
        setEnd(other.getEnd());
      }
      this.mergeUnknownFields(other.unknownFields);
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
      com.ara.protobuf.ReadFile parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.ara.protobuf.ReadFile) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private java.lang.Object path_ = "";
    /**
     * <code>string path = 1;</code>
     */
    public java.lang.String getPath() {
      java.lang.Object ref = path_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        path_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string path = 1;</code>
     */
    public com.google.protobuf.ByteString
        getPathBytes() {
      java.lang.Object ref = path_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        path_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string path = 1;</code>
     */
    public Builder setPath(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      path_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string path = 1;</code>
     */
    public Builder clearPath() {
      
      path_ = getDefaultInstance().getPath();
      onChanged();
      return this;
    }
    /**
     * <code>string path = 1;</code>
     */
    public Builder setPathBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      path_ = value;
      onChanged();
      return this;
    }

    private int start_ ;
    /**
     * <code>uint32 start = 2;</code>
     */
    public int getStart() {
      return start_;
    }
    /**
     * <code>uint32 start = 2;</code>
     */
    public Builder setStart(int value) {
      
      start_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>uint32 start = 2;</code>
     */
    public Builder clearStart() {
      
      start_ = 0;
      onChanged();
      return this;
    }

    private int end_ ;
    /**
     * <code>uint32 end = 3;</code>
     */
    public int getEnd() {
      return end_;
    }
    /**
     * <code>uint32 end = 3;</code>
     */
    public Builder setEnd(int value) {
      
      end_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>uint32 end = 3;</code>
     */
    public Builder clearEnd() {
      
      end_ = 0;
      onChanged();
      return this;
    }
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFieldsProto3(unknownFields);
    }

    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:ara.cfsnet.ReadFile)
  }

  // @@protoc_insertion_point(class_scope:ara.cfsnet.ReadFile)
  private static final com.ara.protobuf.ReadFile DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.ara.protobuf.ReadFile();
  }

  public static com.ara.protobuf.ReadFile getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ReadFile>
      PARSER = new com.google.protobuf.AbstractParser<ReadFile>() {
    public ReadFile parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new ReadFile(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<ReadFile> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ReadFile> getParserForType() {
    return PARSER;
  }

  public com.ara.protobuf.ReadFile getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}


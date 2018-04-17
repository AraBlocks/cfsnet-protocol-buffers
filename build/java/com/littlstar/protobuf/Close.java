// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: cfsnet.proto

package com.littlstar.protobuf;

/**
 * Protobuf type {@code littlstar.cfsnet.Close}
 */
public  final class Close extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:littlstar.cfsnet.Close)
    CloseOrBuilder {
  // Use Close.newBuilder() to construct.
  private Close(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private Close() {
    fd_ = 0;
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return com.google.protobuf.UnknownFieldSet.getDefaultInstance();
  }
  private Close(
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
          case 8: {

            fd_ = input.readUInt32();
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
    return com.littlstar.protobuf.CFSNetProtobuf.internal_static_littlstar_cfsnet_Close_descriptor;
  }

  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.littlstar.protobuf.CFSNetProtobuf.internal_static_littlstar_cfsnet_Close_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.littlstar.protobuf.Close.class, com.littlstar.protobuf.Close.Builder.class);
  }

  public static final int FD_FIELD_NUMBER = 1;
  private int fd_;
  /**
   * <code>uint32 fd = 1;</code>
   */
  public int getFd() {
    return fd_;
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
    if (fd_ != 0) {
      output.writeUInt32(1, fd_);
    }
  }

  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (fd_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeUInt32Size(1, fd_);
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
    if (!(obj instanceof com.littlstar.protobuf.Close)) {
      return super.equals(obj);
    }
    com.littlstar.protobuf.Close other = (com.littlstar.protobuf.Close) obj;

    boolean result = true;
    result = result && (getFd()
        == other.getFd());
    return result;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + FD_FIELD_NUMBER;
    hash = (53 * hash) + getFd();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.littlstar.protobuf.Close parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.littlstar.protobuf.Close parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.littlstar.protobuf.Close parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.littlstar.protobuf.Close parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.littlstar.protobuf.Close parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.littlstar.protobuf.Close parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.littlstar.protobuf.Close parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.littlstar.protobuf.Close parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.littlstar.protobuf.Close parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.littlstar.protobuf.Close parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.littlstar.protobuf.Close parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.littlstar.protobuf.Close parseFrom(
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
  public static Builder newBuilder(com.littlstar.protobuf.Close prototype) {
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
   * Protobuf type {@code littlstar.cfsnet.Close}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:littlstar.cfsnet.Close)
      com.littlstar.protobuf.CloseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.littlstar.protobuf.CFSNetProtobuf.internal_static_littlstar_cfsnet_Close_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.littlstar.protobuf.CFSNetProtobuf.internal_static_littlstar_cfsnet_Close_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.littlstar.protobuf.Close.class, com.littlstar.protobuf.Close.Builder.class);
    }

    // Construct using com.littlstar.protobuf.Close.newBuilder()
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
      fd_ = 0;

      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.littlstar.protobuf.CFSNetProtobuf.internal_static_littlstar_cfsnet_Close_descriptor;
    }

    public com.littlstar.protobuf.Close getDefaultInstanceForType() {
      return com.littlstar.protobuf.Close.getDefaultInstance();
    }

    public com.littlstar.protobuf.Close build() {
      com.littlstar.protobuf.Close result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public com.littlstar.protobuf.Close buildPartial() {
      com.littlstar.protobuf.Close result = new com.littlstar.protobuf.Close(this);
      result.fd_ = fd_;
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
      if (other instanceof com.littlstar.protobuf.Close) {
        return mergeFrom((com.littlstar.protobuf.Close)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.littlstar.protobuf.Close other) {
      if (other == com.littlstar.protobuf.Close.getDefaultInstance()) return this;
      if (other.getFd() != 0) {
        setFd(other.getFd());
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
      com.littlstar.protobuf.Close parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.littlstar.protobuf.Close) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private int fd_ ;
    /**
     * <code>uint32 fd = 1;</code>
     */
    public int getFd() {
      return fd_;
    }
    /**
     * <code>uint32 fd = 1;</code>
     */
    public Builder setFd(int value) {
      
      fd_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>uint32 fd = 1;</code>
     */
    public Builder clearFd() {
      
      fd_ = 0;
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


    // @@protoc_insertion_point(builder_scope:littlstar.cfsnet.Close)
  }

  // @@protoc_insertion_point(class_scope:littlstar.cfsnet.Close)
  private static final com.littlstar.protobuf.Close DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.littlstar.protobuf.Close();
  }

  public static com.littlstar.protobuf.Close getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<Close>
      PARSER = new com.google.protobuf.AbstractParser<Close>() {
    public Close parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
        return new Close(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<Close> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<Close> getParserForType() {
    return PARSER;
  }

  public com.littlstar.protobuf.Close getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

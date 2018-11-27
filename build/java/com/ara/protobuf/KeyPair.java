// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: cfsnet.proto

package com.ara.protobuf;

/**
 * Protobuf type {@code ara.cfsnet.KeyPair}
 */
public  final class KeyPair extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:ara.cfsnet.KeyPair)
    KeyPairOrBuilder {
private static final long serialVersionUID = 0L;
  // Use KeyPair.newBuilder() to construct.
  private KeyPair(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private KeyPair() {
    seed_ = com.google.protobuf.ByteString.EMPTY;
    publicKey_ = com.google.protobuf.ByteString.EMPTY;
    secretKey_ = com.google.protobuf.ByteString.EMPTY;
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private KeyPair(
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

            seed_ = input.readBytes();
            break;
          }
          case 18: {

            publicKey_ = input.readBytes();
            break;
          }
          case 26: {

            secretKey_ = input.readBytes();
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
    return com.ara.protobuf.CFSNetProtobuf.internal_static_ara_cfsnet_KeyPair_descriptor;
  }

  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.ara.protobuf.CFSNetProtobuf.internal_static_ara_cfsnet_KeyPair_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.ara.protobuf.KeyPair.class, com.ara.protobuf.KeyPair.Builder.class);
  }

  public static final int SEED_FIELD_NUMBER = 1;
  private com.google.protobuf.ByteString seed_;
  /**
   * <code>bytes seed = 1;</code>
   */
  public com.google.protobuf.ByteString getSeed() {
    return seed_;
  }

  public static final int PUBLICKEY_FIELD_NUMBER = 2;
  private com.google.protobuf.ByteString publicKey_;
  /**
   * <code>bytes publicKey = 2;</code>
   */
  public com.google.protobuf.ByteString getPublicKey() {
    return publicKey_;
  }

  public static final int SECRETKEY_FIELD_NUMBER = 3;
  private com.google.protobuf.ByteString secretKey_;
  /**
   * <code>bytes secretKey = 3;</code>
   */
  public com.google.protobuf.ByteString getSecretKey() {
    return secretKey_;
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
    if (!seed_.isEmpty()) {
      output.writeBytes(1, seed_);
    }
    if (!publicKey_.isEmpty()) {
      output.writeBytes(2, publicKey_);
    }
    if (!secretKey_.isEmpty()) {
      output.writeBytes(3, secretKey_);
    }
    unknownFields.writeTo(output);
  }

  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!seed_.isEmpty()) {
      size += com.google.protobuf.CodedOutputStream
        .computeBytesSize(1, seed_);
    }
    if (!publicKey_.isEmpty()) {
      size += com.google.protobuf.CodedOutputStream
        .computeBytesSize(2, publicKey_);
    }
    if (!secretKey_.isEmpty()) {
      size += com.google.protobuf.CodedOutputStream
        .computeBytesSize(3, secretKey_);
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
    if (!(obj instanceof com.ara.protobuf.KeyPair)) {
      return super.equals(obj);
    }
    com.ara.protobuf.KeyPair other = (com.ara.protobuf.KeyPair) obj;

    boolean result = true;
    result = result && getSeed()
        .equals(other.getSeed());
    result = result && getPublicKey()
        .equals(other.getPublicKey());
    result = result && getSecretKey()
        .equals(other.getSecretKey());
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
    hash = (37 * hash) + SEED_FIELD_NUMBER;
    hash = (53 * hash) + getSeed().hashCode();
    hash = (37 * hash) + PUBLICKEY_FIELD_NUMBER;
    hash = (53 * hash) + getPublicKey().hashCode();
    hash = (37 * hash) + SECRETKEY_FIELD_NUMBER;
    hash = (53 * hash) + getSecretKey().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.ara.protobuf.KeyPair parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.ara.protobuf.KeyPair parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.ara.protobuf.KeyPair parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.ara.protobuf.KeyPair parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.ara.protobuf.KeyPair parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.ara.protobuf.KeyPair parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.ara.protobuf.KeyPair parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.ara.protobuf.KeyPair parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.ara.protobuf.KeyPair parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.ara.protobuf.KeyPair parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.ara.protobuf.KeyPair parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.ara.protobuf.KeyPair parseFrom(
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
  public static Builder newBuilder(com.ara.protobuf.KeyPair prototype) {
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
   * Protobuf type {@code ara.cfsnet.KeyPair}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:ara.cfsnet.KeyPair)
      com.ara.protobuf.KeyPairOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.ara.protobuf.CFSNetProtobuf.internal_static_ara_cfsnet_KeyPair_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.ara.protobuf.CFSNetProtobuf.internal_static_ara_cfsnet_KeyPair_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.ara.protobuf.KeyPair.class, com.ara.protobuf.KeyPair.Builder.class);
    }

    // Construct using com.ara.protobuf.KeyPair.newBuilder()
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
      seed_ = com.google.protobuf.ByteString.EMPTY;

      publicKey_ = com.google.protobuf.ByteString.EMPTY;

      secretKey_ = com.google.protobuf.ByteString.EMPTY;

      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.ara.protobuf.CFSNetProtobuf.internal_static_ara_cfsnet_KeyPair_descriptor;
    }

    public com.ara.protobuf.KeyPair getDefaultInstanceForType() {
      return com.ara.protobuf.KeyPair.getDefaultInstance();
    }

    public com.ara.protobuf.KeyPair build() {
      com.ara.protobuf.KeyPair result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public com.ara.protobuf.KeyPair buildPartial() {
      com.ara.protobuf.KeyPair result = new com.ara.protobuf.KeyPair(this);
      result.seed_ = seed_;
      result.publicKey_ = publicKey_;
      result.secretKey_ = secretKey_;
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
      if (other instanceof com.ara.protobuf.KeyPair) {
        return mergeFrom((com.ara.protobuf.KeyPair)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.ara.protobuf.KeyPair other) {
      if (other == com.ara.protobuf.KeyPair.getDefaultInstance()) return this;
      if (other.getSeed() != com.google.protobuf.ByteString.EMPTY) {
        setSeed(other.getSeed());
      }
      if (other.getPublicKey() != com.google.protobuf.ByteString.EMPTY) {
        setPublicKey(other.getPublicKey());
      }
      if (other.getSecretKey() != com.google.protobuf.ByteString.EMPTY) {
        setSecretKey(other.getSecretKey());
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
      com.ara.protobuf.KeyPair parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.ara.protobuf.KeyPair) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private com.google.protobuf.ByteString seed_ = com.google.protobuf.ByteString.EMPTY;
    /**
     * <code>bytes seed = 1;</code>
     */
    public com.google.protobuf.ByteString getSeed() {
      return seed_;
    }
    /**
     * <code>bytes seed = 1;</code>
     */
    public Builder setSeed(com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      seed_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>bytes seed = 1;</code>
     */
    public Builder clearSeed() {
      
      seed_ = getDefaultInstance().getSeed();
      onChanged();
      return this;
    }

    private com.google.protobuf.ByteString publicKey_ = com.google.protobuf.ByteString.EMPTY;
    /**
     * <code>bytes publicKey = 2;</code>
     */
    public com.google.protobuf.ByteString getPublicKey() {
      return publicKey_;
    }
    /**
     * <code>bytes publicKey = 2;</code>
     */
    public Builder setPublicKey(com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      publicKey_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>bytes publicKey = 2;</code>
     */
    public Builder clearPublicKey() {
      
      publicKey_ = getDefaultInstance().getPublicKey();
      onChanged();
      return this;
    }

    private com.google.protobuf.ByteString secretKey_ = com.google.protobuf.ByteString.EMPTY;
    /**
     * <code>bytes secretKey = 3;</code>
     */
    public com.google.protobuf.ByteString getSecretKey() {
      return secretKey_;
    }
    /**
     * <code>bytes secretKey = 3;</code>
     */
    public Builder setSecretKey(com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      secretKey_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>bytes secretKey = 3;</code>
     */
    public Builder clearSecretKey() {
      
      secretKey_ = getDefaultInstance().getSecretKey();
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


    // @@protoc_insertion_point(builder_scope:ara.cfsnet.KeyPair)
  }

  // @@protoc_insertion_point(class_scope:ara.cfsnet.KeyPair)
  private static final com.ara.protobuf.KeyPair DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.ara.protobuf.KeyPair();
  }

  public static com.ara.protobuf.KeyPair getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<KeyPair>
      PARSER = new com.google.protobuf.AbstractParser<KeyPair>() {
    public KeyPair parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new KeyPair(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<KeyPair> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<KeyPair> getParserForType() {
    return PARSER;
  }

  public com.ara.protobuf.KeyPair getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

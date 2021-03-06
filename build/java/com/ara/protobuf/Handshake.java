// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: cfsnet.proto

package com.ara.protobuf;

/**
 * Protobuf type {@code ara.cfsnet.Handshake}
 */
public  final class Handshake extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:ara.cfsnet.Handshake)
    HandshakeOrBuilder {
private static final long serialVersionUID = 0L;
  // Use Handshake.newBuilder() to construct.
  private Handshake(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private Handshake() {
    nonce_ = com.google.protobuf.ByteString.EMPTY;
    key_ = com.google.protobuf.ByteString.EMPTY;
    ack_ = false;
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private Handshake(
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

            nonce_ = input.readBytes();
            break;
          }
          case 18: {

            key_ = input.readBytes();
            break;
          }
          case 24: {

            ack_ = input.readBool();
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
    return com.ara.protobuf.CFSNetProtobuf.internal_static_ara_cfsnet_Handshake_descriptor;
  }

  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.ara.protobuf.CFSNetProtobuf.internal_static_ara_cfsnet_Handshake_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.ara.protobuf.Handshake.class, com.ara.protobuf.Handshake.Builder.class);
  }

  public static final int NONCE_FIELD_NUMBER = 1;
  private com.google.protobuf.ByteString nonce_;
  /**
   * <code>bytes nonce = 1;</code>
   */
  public com.google.protobuf.ByteString getNonce() {
    return nonce_;
  }

  public static final int KEY_FIELD_NUMBER = 2;
  private com.google.protobuf.ByteString key_;
  /**
   * <code>bytes key = 2;</code>
   */
  public com.google.protobuf.ByteString getKey() {
    return key_;
  }

  public static final int ACK_FIELD_NUMBER = 3;
  private boolean ack_;
  /**
   * <code>bool ack = 3;</code>
   */
  public boolean getAck() {
    return ack_;
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
    if (!key_.isEmpty()) {
      output.writeBytes(2, key_);
    }
    if (ack_ != false) {
      output.writeBool(3, ack_);
    }
    unknownFields.writeTo(output);
  }

  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!nonce_.isEmpty()) {
      size += com.google.protobuf.CodedOutputStream
        .computeBytesSize(1, nonce_);
    }
    if (!key_.isEmpty()) {
      size += com.google.protobuf.CodedOutputStream
        .computeBytesSize(2, key_);
    }
    if (ack_ != false) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(3, ack_);
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
    if (!(obj instanceof com.ara.protobuf.Handshake)) {
      return super.equals(obj);
    }
    com.ara.protobuf.Handshake other = (com.ara.protobuf.Handshake) obj;

    boolean result = true;
    result = result && getNonce()
        .equals(other.getNonce());
    result = result && getKey()
        .equals(other.getKey());
    result = result && (getAck()
        == other.getAck());
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
    hash = (37 * hash) + NONCE_FIELD_NUMBER;
    hash = (53 * hash) + getNonce().hashCode();
    hash = (37 * hash) + KEY_FIELD_NUMBER;
    hash = (53 * hash) + getKey().hashCode();
    hash = (37 * hash) + ACK_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
        getAck());
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.ara.protobuf.Handshake parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.ara.protobuf.Handshake parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.ara.protobuf.Handshake parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.ara.protobuf.Handshake parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.ara.protobuf.Handshake parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.ara.protobuf.Handshake parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.ara.protobuf.Handshake parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.ara.protobuf.Handshake parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.ara.protobuf.Handshake parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.ara.protobuf.Handshake parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.ara.protobuf.Handshake parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.ara.protobuf.Handshake parseFrom(
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
  public static Builder newBuilder(com.ara.protobuf.Handshake prototype) {
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
   * Protobuf type {@code ara.cfsnet.Handshake}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:ara.cfsnet.Handshake)
      com.ara.protobuf.HandshakeOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.ara.protobuf.CFSNetProtobuf.internal_static_ara_cfsnet_Handshake_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.ara.protobuf.CFSNetProtobuf.internal_static_ara_cfsnet_Handshake_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.ara.protobuf.Handshake.class, com.ara.protobuf.Handshake.Builder.class);
    }

    // Construct using com.ara.protobuf.Handshake.newBuilder()
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

      key_ = com.google.protobuf.ByteString.EMPTY;

      ack_ = false;

      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.ara.protobuf.CFSNetProtobuf.internal_static_ara_cfsnet_Handshake_descriptor;
    }

    public com.ara.protobuf.Handshake getDefaultInstanceForType() {
      return com.ara.protobuf.Handshake.getDefaultInstance();
    }

    public com.ara.protobuf.Handshake build() {
      com.ara.protobuf.Handshake result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public com.ara.protobuf.Handshake buildPartial() {
      com.ara.protobuf.Handshake result = new com.ara.protobuf.Handshake(this);
      result.nonce_ = nonce_;
      result.key_ = key_;
      result.ack_ = ack_;
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
      if (other instanceof com.ara.protobuf.Handshake) {
        return mergeFrom((com.ara.protobuf.Handshake)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.ara.protobuf.Handshake other) {
      if (other == com.ara.protobuf.Handshake.getDefaultInstance()) return this;
      if (other.getNonce() != com.google.protobuf.ByteString.EMPTY) {
        setNonce(other.getNonce());
      }
      if (other.getKey() != com.google.protobuf.ByteString.EMPTY) {
        setKey(other.getKey());
      }
      if (other.getAck() != false) {
        setAck(other.getAck());
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
      com.ara.protobuf.Handshake parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.ara.protobuf.Handshake) e.getUnfinishedMessage();
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

    private com.google.protobuf.ByteString key_ = com.google.protobuf.ByteString.EMPTY;
    /**
     * <code>bytes key = 2;</code>
     */
    public com.google.protobuf.ByteString getKey() {
      return key_;
    }
    /**
     * <code>bytes key = 2;</code>
     */
    public Builder setKey(com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      key_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>bytes key = 2;</code>
     */
    public Builder clearKey() {
      
      key_ = getDefaultInstance().getKey();
      onChanged();
      return this;
    }

    private boolean ack_ ;
    /**
     * <code>bool ack = 3;</code>
     */
    public boolean getAck() {
      return ack_;
    }
    /**
     * <code>bool ack = 3;</code>
     */
    public Builder setAck(boolean value) {
      
      ack_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>bool ack = 3;</code>
     */
    public Builder clearAck() {
      
      ack_ = false;
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


    // @@protoc_insertion_point(builder_scope:ara.cfsnet.Handshake)
  }

  // @@protoc_insertion_point(class_scope:ara.cfsnet.Handshake)
  private static final com.ara.protobuf.Handshake DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.ara.protobuf.Handshake();
  }

  public static com.ara.protobuf.Handshake getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<Handshake>
      PARSER = new com.google.protobuf.AbstractParser<Handshake>() {
    public Handshake parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new Handshake(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<Handshake> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<Handshake> getParserForType() {
    return PARSER;
  }

  public com.ara.protobuf.Handshake getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}


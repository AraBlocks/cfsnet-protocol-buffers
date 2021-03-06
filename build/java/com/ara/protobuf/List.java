// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: cfsnet.proto

package com.ara.protobuf;

/**
 * Protobuf type {@code ara.cfsnet.List}
 */
public  final class List extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:ara.cfsnet.List)
    ListOrBuilder {
private static final long serialVersionUID = 0L;
  // Use List.newBuilder() to construct.
  private List(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private List() {
    values_ = java.util.Collections.emptyList();
    length_ = 0L;
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private List(
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
            if (!((mutable_bitField0_ & 0x00000001) == 0x00000001)) {
              values_ = new java.util.ArrayList<com.google.protobuf.ByteString>();
              mutable_bitField0_ |= 0x00000001;
            }
            values_.add(input.readBytes());
            break;
          }
          case 16: {

            length_ = input.readUInt64();
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
      if (((mutable_bitField0_ & 0x00000001) == 0x00000001)) {
        values_ = java.util.Collections.unmodifiableList(values_);
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.ara.protobuf.CFSNetProtobuf.internal_static_ara_cfsnet_List_descriptor;
  }

  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.ara.protobuf.CFSNetProtobuf.internal_static_ara_cfsnet_List_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.ara.protobuf.List.class, com.ara.protobuf.List.Builder.class);
  }

  private int bitField0_;
  public static final int VALUES_FIELD_NUMBER = 1;
  private java.util.List<com.google.protobuf.ByteString> values_;
  /**
   * <code>repeated bytes values = 1;</code>
   */
  public java.util.List<com.google.protobuf.ByteString>
      getValuesList() {
    return values_;
  }
  /**
   * <code>repeated bytes values = 1;</code>
   */
  public int getValuesCount() {
    return values_.size();
  }
  /**
   * <code>repeated bytes values = 1;</code>
   */
  public com.google.protobuf.ByteString getValues(int index) {
    return values_.get(index);
  }

  public static final int LENGTH_FIELD_NUMBER = 2;
  private long length_;
  /**
   * <code>uint64 length = 2;</code>
   */
  public long getLength() {
    return length_;
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
    for (int i = 0; i < values_.size(); i++) {
      output.writeBytes(1, values_.get(i));
    }
    if (length_ != 0L) {
      output.writeUInt64(2, length_);
    }
    unknownFields.writeTo(output);
  }

  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    {
      int dataSize = 0;
      for (int i = 0; i < values_.size(); i++) {
        dataSize += com.google.protobuf.CodedOutputStream
          .computeBytesSizeNoTag(values_.get(i));
      }
      size += dataSize;
      size += 1 * getValuesList().size();
    }
    if (length_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeUInt64Size(2, length_);
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
    if (!(obj instanceof com.ara.protobuf.List)) {
      return super.equals(obj);
    }
    com.ara.protobuf.List other = (com.ara.protobuf.List) obj;

    boolean result = true;
    result = result && getValuesList()
        .equals(other.getValuesList());
    result = result && (getLength()
        == other.getLength());
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
    if (getValuesCount() > 0) {
      hash = (37 * hash) + VALUES_FIELD_NUMBER;
      hash = (53 * hash) + getValuesList().hashCode();
    }
    hash = (37 * hash) + LENGTH_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getLength());
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.ara.protobuf.List parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.ara.protobuf.List parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.ara.protobuf.List parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.ara.protobuf.List parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.ara.protobuf.List parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.ara.protobuf.List parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.ara.protobuf.List parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.ara.protobuf.List parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.ara.protobuf.List parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.ara.protobuf.List parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.ara.protobuf.List parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.ara.protobuf.List parseFrom(
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
  public static Builder newBuilder(com.ara.protobuf.List prototype) {
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
   * Protobuf type {@code ara.cfsnet.List}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:ara.cfsnet.List)
      com.ara.protobuf.ListOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.ara.protobuf.CFSNetProtobuf.internal_static_ara_cfsnet_List_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.ara.protobuf.CFSNetProtobuf.internal_static_ara_cfsnet_List_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.ara.protobuf.List.class, com.ara.protobuf.List.Builder.class);
    }

    // Construct using com.ara.protobuf.List.newBuilder()
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
      values_ = java.util.Collections.emptyList();
      bitField0_ = (bitField0_ & ~0x00000001);
      length_ = 0L;

      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.ara.protobuf.CFSNetProtobuf.internal_static_ara_cfsnet_List_descriptor;
    }

    public com.ara.protobuf.List getDefaultInstanceForType() {
      return com.ara.protobuf.List.getDefaultInstance();
    }

    public com.ara.protobuf.List build() {
      com.ara.protobuf.List result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public com.ara.protobuf.List buildPartial() {
      com.ara.protobuf.List result = new com.ara.protobuf.List(this);
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        values_ = java.util.Collections.unmodifiableList(values_);
        bitField0_ = (bitField0_ & ~0x00000001);
      }
      result.values_ = values_;
      result.length_ = length_;
      result.bitField0_ = to_bitField0_;
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
      if (other instanceof com.ara.protobuf.List) {
        return mergeFrom((com.ara.protobuf.List)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.ara.protobuf.List other) {
      if (other == com.ara.protobuf.List.getDefaultInstance()) return this;
      if (!other.values_.isEmpty()) {
        if (values_.isEmpty()) {
          values_ = other.values_;
          bitField0_ = (bitField0_ & ~0x00000001);
        } else {
          ensureValuesIsMutable();
          values_.addAll(other.values_);
        }
        onChanged();
      }
      if (other.getLength() != 0L) {
        setLength(other.getLength());
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
      com.ara.protobuf.List parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.ara.protobuf.List) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private java.util.List<com.google.protobuf.ByteString> values_ = java.util.Collections.emptyList();
    private void ensureValuesIsMutable() {
      if (!((bitField0_ & 0x00000001) == 0x00000001)) {
        values_ = new java.util.ArrayList<com.google.protobuf.ByteString>(values_);
        bitField0_ |= 0x00000001;
       }
    }
    /**
     * <code>repeated bytes values = 1;</code>
     */
    public java.util.List<com.google.protobuf.ByteString>
        getValuesList() {
      return java.util.Collections.unmodifiableList(values_);
    }
    /**
     * <code>repeated bytes values = 1;</code>
     */
    public int getValuesCount() {
      return values_.size();
    }
    /**
     * <code>repeated bytes values = 1;</code>
     */
    public com.google.protobuf.ByteString getValues(int index) {
      return values_.get(index);
    }
    /**
     * <code>repeated bytes values = 1;</code>
     */
    public Builder setValues(
        int index, com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  ensureValuesIsMutable();
      values_.set(index, value);
      onChanged();
      return this;
    }
    /**
     * <code>repeated bytes values = 1;</code>
     */
    public Builder addValues(com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  ensureValuesIsMutable();
      values_.add(value);
      onChanged();
      return this;
    }
    /**
     * <code>repeated bytes values = 1;</code>
     */
    public Builder addAllValues(
        java.lang.Iterable<? extends com.google.protobuf.ByteString> values) {
      ensureValuesIsMutable();
      com.google.protobuf.AbstractMessageLite.Builder.addAll(
          values, values_);
      onChanged();
      return this;
    }
    /**
     * <code>repeated bytes values = 1;</code>
     */
    public Builder clearValues() {
      values_ = java.util.Collections.emptyList();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }

    private long length_ ;
    /**
     * <code>uint64 length = 2;</code>
     */
    public long getLength() {
      return length_;
    }
    /**
     * <code>uint64 length = 2;</code>
     */
    public Builder setLength(long value) {
      
      length_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>uint64 length = 2;</code>
     */
    public Builder clearLength() {
      
      length_ = 0L;
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


    // @@protoc_insertion_point(builder_scope:ara.cfsnet.List)
  }

  // @@protoc_insertion_point(class_scope:ara.cfsnet.List)
  private static final com.ara.protobuf.List DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.ara.protobuf.List();
  }

  public static com.ara.protobuf.List getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<List>
      PARSER = new com.google.protobuf.AbstractParser<List>() {
    public List parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new List(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<List> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<List> getParserForType() {
    return PARSER;
  }

  public com.ara.protobuf.List getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}


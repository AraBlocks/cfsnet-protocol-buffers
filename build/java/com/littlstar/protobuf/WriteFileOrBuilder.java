// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: cfsnet.proto

package com.littlstar.protobuf;

public interface WriteFileOrBuilder extends
    // @@protoc_insertion_point(interface_extends:littlstar.cfsnet.WriteFile)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>string path = 1;</code>
   */
  java.lang.String getPath();
  /**
   * <code>string path = 1;</code>
   */
  com.google.protobuf.ByteString
      getPathBytes();

  /**
   * <code>bytes buffer = 2;</code>
   */
  com.google.protobuf.ByteString getBuffer();

  /**
   * <code>uint32 start = 3;</code>
   */
  int getStart();

  /**
   * <code>uint32 end = 4;</code>
   */
  int getEnd();
}
// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: cfsnet.proto

package com.littlstar.protobuf;

public interface RequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:littlstar.cfsnet.Request)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>bytes nonce = 1;</code>
   */
  com.google.protobuf.ByteString getNonce();

  /**
   * <code>.littlstar.cfsnet.Drive drive = 2;</code>
   */
  boolean hasDrive();
  /**
   * <code>.littlstar.cfsnet.Drive drive = 2;</code>
   */
  com.littlstar.protobuf.Drive getDrive();
  /**
   * <code>.littlstar.cfsnet.Drive drive = 2;</code>
   */
  com.littlstar.protobuf.DriveOrBuilder getDriveOrBuilder();

  /**
   * <code>.littlstar.cfsnet.Operation operation = 3;</code>
   */
  int getOperationValue();
  /**
   * <code>.littlstar.cfsnet.Operation operation = 3;</code>
   */
  com.littlstar.protobuf.Operation getOperation();

  /**
   * <code>bytes buffer = 4;</code>
   */
  com.google.protobuf.ByteString getBuffer();
}

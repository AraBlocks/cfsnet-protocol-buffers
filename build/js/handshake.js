/**
 * @fileoverview
 * @enhanceable
 * @public
 */
// GENERATED CODE -- DO NOT EDIT!

goog.provide('proto.littlstar.cfsnet.Handshake');

goog.require('jspb.Message');
goog.require('jspb.BinaryReader');
goog.require('jspb.BinaryWriter');


/**
 * Generated by JsPbCodeGenerator.
 * @param {Array=} opt_data Optional initial data array, typically from a
 * server response, or constructed directly in Javascript. The array is used
 * in place and becomes part of the constructed object. It is not cloned.
 * If no data is provided, the constructed object will be empty, but still
 * valid.
 * @extends {jspb.Message}
 * @constructor
 */
proto.littlstar.cfsnet.Handshake = function(opt_data) {
  jspb.Message.initialize(this, opt_data, 0, -1, null, null);
};
goog.inherits(proto.littlstar.cfsnet.Handshake, jspb.Message);
if (goog.DEBUG && !COMPILED) {
  proto.littlstar.cfsnet.Handshake.displayName = 'proto.littlstar.cfsnet.Handshake';
}


if (jspb.Message.GENERATE_TO_OBJECT) {
/**
 * Creates an object representation of this proto suitable for use in Soy templates.
 * Field names that are reserved in JavaScript and will be renamed to pb_name.
 * To access a reserved field use, foo.pb_<name>, eg, foo.pb_default.
 * For the list of reserved names please see:
 *     com.google.apps.jspb.JsClassTemplate.JS_RESERVED_WORDS.
 * @param {boolean=} opt_includeInstance Whether to include the JSPB instance
 *     for transitional soy proto support: http://goto/soy-param-migration
 * @return {!Object}
 */
proto.littlstar.cfsnet.Handshake.prototype.toObject = function(opt_includeInstance) {
  return proto.littlstar.cfsnet.Handshake.toObject(opt_includeInstance, this);
};


/**
 * Static version of the {@see toObject} method.
 * @param {boolean|undefined} includeInstance Whether to include the JSPB
 *     instance for transitional soy proto support:
 *     http://goto/soy-param-migration
 * @param {!proto.littlstar.cfsnet.Handshake} msg The msg instance to transform.
 * @return {!Object}
 */
proto.littlstar.cfsnet.Handshake.toObject = function(includeInstance, msg) {
  var f, obj = {
    nonce: msg.getNonce_asB64(),
    key: msg.getKey_asB64(),
    ack: jspb.Message.getFieldWithDefault(msg, 3, false)
  };

  if (includeInstance) {
    obj.$jspbMessageInstance = msg;
  }
  return obj;
};
}


/**
 * Deserializes binary data (in protobuf wire format).
 * @param {jspb.ByteSource} bytes The bytes to deserialize.
 * @return {!proto.littlstar.cfsnet.Handshake}
 */
proto.littlstar.cfsnet.Handshake.deserializeBinary = function(bytes) {
  var reader = new jspb.BinaryReader(bytes);
  var msg = new proto.littlstar.cfsnet.Handshake;
  return proto.littlstar.cfsnet.Handshake.deserializeBinaryFromReader(msg, reader);
};


/**
 * Deserializes binary data (in protobuf wire format) from the
 * given reader into the given message object.
 * @param {!proto.littlstar.cfsnet.Handshake} msg The message object to deserialize into.
 * @param {!jspb.BinaryReader} reader The BinaryReader to use.
 * @return {!proto.littlstar.cfsnet.Handshake}
 */
proto.littlstar.cfsnet.Handshake.deserializeBinaryFromReader = function(msg, reader) {
  while (reader.nextField()) {
    if (reader.isEndGroup()) {
      break;
    }
    var field = reader.getFieldNumber();
    switch (field) {
    case 1:
      var value = /** @type {!Uint8Array} */ (reader.readBytes());
      msg.setNonce(value);
      break;
    case 2:
      var value = /** @type {!Uint8Array} */ (reader.readBytes());
      msg.setKey(value);
      break;
    case 3:
      var value = /** @type {boolean} */ (reader.readBool());
      msg.setAck(value);
      break;
    default:
      reader.skipField();
      break;
    }
  }
  return msg;
};


/**
 * Serializes the message to binary data (in protobuf wire format).
 * @return {!Uint8Array}
 */
proto.littlstar.cfsnet.Handshake.prototype.serializeBinary = function() {
  var writer = new jspb.BinaryWriter();
  proto.littlstar.cfsnet.Handshake.serializeBinaryToWriter(this, writer);
  return writer.getResultBuffer();
};


/**
 * Serializes the given message to binary data (in protobuf wire
 * format), writing to the given BinaryWriter.
 * @param {!proto.littlstar.cfsnet.Handshake} message
 * @param {!jspb.BinaryWriter} writer
 */
proto.littlstar.cfsnet.Handshake.serializeBinaryToWriter = function(message, writer) {
  var f = undefined;
  f = message.getNonce_asU8();
  if (f.length > 0) {
    writer.writeBytes(
      1,
      f
    );
  }
  f = message.getKey_asU8();
  if (f.length > 0) {
    writer.writeBytes(
      2,
      f
    );
  }
  f = message.getAck();
  if (f) {
    writer.writeBool(
      3,
      f
    );
  }
};


/**
 * optional bytes nonce = 1;
 * @return {string}
 */
proto.littlstar.cfsnet.Handshake.prototype.getNonce = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 1, ""));
};


/**
 * optional bytes nonce = 1;
 * This is a type-conversion wrapper around `getNonce()`
 * @return {string}
 */
proto.littlstar.cfsnet.Handshake.prototype.getNonce_asB64 = function() {
  return /** @type {string} */ (jspb.Message.bytesAsB64(
      this.getNonce()));
};


/**
 * optional bytes nonce = 1;
 * Note that Uint8Array is not supported on all browsers.
 * @see http://caniuse.com/Uint8Array
 * This is a type-conversion wrapper around `getNonce()`
 * @return {!Uint8Array}
 */
proto.littlstar.cfsnet.Handshake.prototype.getNonce_asU8 = function() {
  return /** @type {!Uint8Array} */ (jspb.Message.bytesAsU8(
      this.getNonce()));
};


/** @param {!(string|Uint8Array)} value */
proto.littlstar.cfsnet.Handshake.prototype.setNonce = function(value) {
  jspb.Message.setField(this, 1, value);
};


/**
 * optional bytes key = 2;
 * @return {string}
 */
proto.littlstar.cfsnet.Handshake.prototype.getKey = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 2, ""));
};


/**
 * optional bytes key = 2;
 * This is a type-conversion wrapper around `getKey()`
 * @return {string}
 */
proto.littlstar.cfsnet.Handshake.prototype.getKey_asB64 = function() {
  return /** @type {string} */ (jspb.Message.bytesAsB64(
      this.getKey()));
};


/**
 * optional bytes key = 2;
 * Note that Uint8Array is not supported on all browsers.
 * @see http://caniuse.com/Uint8Array
 * This is a type-conversion wrapper around `getKey()`
 * @return {!Uint8Array}
 */
proto.littlstar.cfsnet.Handshake.prototype.getKey_asU8 = function() {
  return /** @type {!Uint8Array} */ (jspb.Message.bytesAsU8(
      this.getKey()));
};


/** @param {!(string|Uint8Array)} value */
proto.littlstar.cfsnet.Handshake.prototype.setKey = function(value) {
  jspb.Message.setField(this, 2, value);
};


/**
 * optional bool ack = 3;
 * Note that Boolean fields may be set to 0/1 when serialized from a Java server.
 * You should avoid comparisons like {@code val === true/false} in those cases.
 * @return {boolean}
 */
proto.littlstar.cfsnet.Handshake.prototype.getAck = function() {
  return /** @type {boolean} */ (jspb.Message.getFieldWithDefault(this, 3, false));
};


/** @param {boolean} value */
proto.littlstar.cfsnet.Handshake.prototype.setAck = function(value) {
  jspb.Message.setField(this, 3, value);
};



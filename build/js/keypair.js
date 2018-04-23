/**
 * @fileoverview
 * @enhanceable
 * @public
 */
// GENERATED CODE -- DO NOT EDIT!

goog.provide('proto.littlstar.cfsnet.KeyPair');

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
proto.littlstar.cfsnet.KeyPair = function(opt_data) {
  jspb.Message.initialize(this, opt_data, 0, -1, null, null);
};
goog.inherits(proto.littlstar.cfsnet.KeyPair, jspb.Message);
if (goog.DEBUG && !COMPILED) {
  proto.littlstar.cfsnet.KeyPair.displayName = 'proto.littlstar.cfsnet.KeyPair';
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
proto.littlstar.cfsnet.KeyPair.prototype.toObject = function(opt_includeInstance) {
  return proto.littlstar.cfsnet.KeyPair.toObject(opt_includeInstance, this);
};


/**
 * Static version of the {@see toObject} method.
 * @param {boolean|undefined} includeInstance Whether to include the JSPB
 *     instance for transitional soy proto support:
 *     http://goto/soy-param-migration
 * @param {!proto.littlstar.cfsnet.KeyPair} msg The msg instance to transform.
 * @return {!Object}
 */
proto.littlstar.cfsnet.KeyPair.toObject = function(includeInstance, msg) {
  var f, obj = {
    seed: msg.getSeed_asB64(),
    publickey: msg.getPublickey_asB64(),
    secretkey: msg.getSecretkey_asB64()
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
 * @return {!proto.littlstar.cfsnet.KeyPair}
 */
proto.littlstar.cfsnet.KeyPair.deserializeBinary = function(bytes) {
  var reader = new jspb.BinaryReader(bytes);
  var msg = new proto.littlstar.cfsnet.KeyPair;
  return proto.littlstar.cfsnet.KeyPair.deserializeBinaryFromReader(msg, reader);
};


/**
 * Deserializes binary data (in protobuf wire format) from the
 * given reader into the given message object.
 * @param {!proto.littlstar.cfsnet.KeyPair} msg The message object to deserialize into.
 * @param {!jspb.BinaryReader} reader The BinaryReader to use.
 * @return {!proto.littlstar.cfsnet.KeyPair}
 */
proto.littlstar.cfsnet.KeyPair.deserializeBinaryFromReader = function(msg, reader) {
  while (reader.nextField()) {
    if (reader.isEndGroup()) {
      break;
    }
    var field = reader.getFieldNumber();
    switch (field) {
    case 1:
      var value = /** @type {!Uint8Array} */ (reader.readBytes());
      msg.setSeed(value);
      break;
    case 2:
      var value = /** @type {!Uint8Array} */ (reader.readBytes());
      msg.setPublickey(value);
      break;
    case 3:
      var value = /** @type {!Uint8Array} */ (reader.readBytes());
      msg.setSecretkey(value);
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
proto.littlstar.cfsnet.KeyPair.prototype.serializeBinary = function() {
  var writer = new jspb.BinaryWriter();
  proto.littlstar.cfsnet.KeyPair.serializeBinaryToWriter(this, writer);
  return writer.getResultBuffer();
};


/**
 * Serializes the given message to binary data (in protobuf wire
 * format), writing to the given BinaryWriter.
 * @param {!proto.littlstar.cfsnet.KeyPair} message
 * @param {!jspb.BinaryWriter} writer
 */
proto.littlstar.cfsnet.KeyPair.serializeBinaryToWriter = function(message, writer) {
  var f = undefined;
  f = message.getSeed_asU8();
  if (f.length > 0) {
    writer.writeBytes(
      1,
      f
    );
  }
  f = message.getPublickey_asU8();
  if (f.length > 0) {
    writer.writeBytes(
      2,
      f
    );
  }
  f = message.getSecretkey_asU8();
  if (f.length > 0) {
    writer.writeBytes(
      3,
      f
    );
  }
};


/**
 * optional bytes seed = 1;
 * @return {string}
 */
proto.littlstar.cfsnet.KeyPair.prototype.getSeed = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 1, ""));
};


/**
 * optional bytes seed = 1;
 * This is a type-conversion wrapper around `getSeed()`
 * @return {string}
 */
proto.littlstar.cfsnet.KeyPair.prototype.getSeed_asB64 = function() {
  return /** @type {string} */ (jspb.Message.bytesAsB64(
      this.getSeed()));
};


/**
 * optional bytes seed = 1;
 * Note that Uint8Array is not supported on all browsers.
 * @see http://caniuse.com/Uint8Array
 * This is a type-conversion wrapper around `getSeed()`
 * @return {!Uint8Array}
 */
proto.littlstar.cfsnet.KeyPair.prototype.getSeed_asU8 = function() {
  return /** @type {!Uint8Array} */ (jspb.Message.bytesAsU8(
      this.getSeed()));
};


/** @param {!(string|Uint8Array)} value */
proto.littlstar.cfsnet.KeyPair.prototype.setSeed = function(value) {
  jspb.Message.setField(this, 1, value);
};


/**
 * optional bytes publicKey = 2;
 * @return {string}
 */
proto.littlstar.cfsnet.KeyPair.prototype.getPublickey = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 2, ""));
};


/**
 * optional bytes publicKey = 2;
 * This is a type-conversion wrapper around `getPublickey()`
 * @return {string}
 */
proto.littlstar.cfsnet.KeyPair.prototype.getPublickey_asB64 = function() {
  return /** @type {string} */ (jspb.Message.bytesAsB64(
      this.getPublickey()));
};


/**
 * optional bytes publicKey = 2;
 * Note that Uint8Array is not supported on all browsers.
 * @see http://caniuse.com/Uint8Array
 * This is a type-conversion wrapper around `getPublickey()`
 * @return {!Uint8Array}
 */
proto.littlstar.cfsnet.KeyPair.prototype.getPublickey_asU8 = function() {
  return /** @type {!Uint8Array} */ (jspb.Message.bytesAsU8(
      this.getPublickey()));
};


/** @param {!(string|Uint8Array)} value */
proto.littlstar.cfsnet.KeyPair.prototype.setPublickey = function(value) {
  jspb.Message.setField(this, 2, value);
};


/**
 * optional bytes secretKey = 3;
 * @return {string}
 */
proto.littlstar.cfsnet.KeyPair.prototype.getSecretkey = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 3, ""));
};


/**
 * optional bytes secretKey = 3;
 * This is a type-conversion wrapper around `getSecretkey()`
 * @return {string}
 */
proto.littlstar.cfsnet.KeyPair.prototype.getSecretkey_asB64 = function() {
  return /** @type {string} */ (jspb.Message.bytesAsB64(
      this.getSecretkey()));
};


/**
 * optional bytes secretKey = 3;
 * Note that Uint8Array is not supported on all browsers.
 * @see http://caniuse.com/Uint8Array
 * This is a type-conversion wrapper around `getSecretkey()`
 * @return {!Uint8Array}
 */
proto.littlstar.cfsnet.KeyPair.prototype.getSecretkey_asU8 = function() {
  return /** @type {!Uint8Array} */ (jspb.Message.bytesAsU8(
      this.getSecretkey()));
};


/** @param {!(string|Uint8Array)} value */
proto.littlstar.cfsnet.KeyPair.prototype.setSecretkey = function(value) {
  jspb.Message.setField(this, 3, value);
};



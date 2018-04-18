/**
 * @fileoverview
 * @enhanceable
 * @public
 */
// GENERATED CODE -- DO NOT EDIT!

goog.provide('proto.littlstar.cfsnet.Drive');

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
proto.littlstar.cfsnet.Drive = function(opt_data) {
  jspb.Message.initialize(this, opt_data, 0, -1, null, null);
};
goog.inherits(proto.littlstar.cfsnet.Drive, jspb.Message);
if (goog.DEBUG && !COMPILED) {
  proto.littlstar.cfsnet.Drive.displayName = 'proto.littlstar.cfsnet.Drive';
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
proto.littlstar.cfsnet.Drive.prototype.toObject = function(opt_includeInstance) {
  return proto.littlstar.cfsnet.Drive.toObject(opt_includeInstance, this);
};


/**
 * Static version of the {@see toObject} method.
 * @param {boolean|undefined} includeInstance Whether to include the JSPB
 *     instance for transitional soy proto support:
 *     http://goto/soy-param-migration
 * @param {!proto.littlstar.cfsnet.Drive} msg The msg instance to transform.
 * @return {!Object}
 */
proto.littlstar.cfsnet.Drive.toObject = function(includeInstance, msg) {
  var f, obj = {
    id: msg.getId_asB64(),
    key: msg.getKey_asB64(),
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
 * @return {!proto.littlstar.cfsnet.Drive}
 */
proto.littlstar.cfsnet.Drive.deserializeBinary = function(bytes) {
  var reader = new jspb.BinaryReader(bytes);
  var msg = new proto.littlstar.cfsnet.Drive;
  return proto.littlstar.cfsnet.Drive.deserializeBinaryFromReader(msg, reader);
};


/**
 * Deserializes binary data (in protobuf wire format) from the
 * given reader into the given message object.
 * @param {!proto.littlstar.cfsnet.Drive} msg The message object to deserialize into.
 * @param {!jspb.BinaryReader} reader The BinaryReader to use.
 * @return {!proto.littlstar.cfsnet.Drive}
 */
proto.littlstar.cfsnet.Drive.deserializeBinaryFromReader = function(msg, reader) {
  while (reader.nextField()) {
    if (reader.isEndGroup()) {
      break;
    }
    var field = reader.getFieldNumber();
    switch (field) {
    case 1:
      var value = /** @type {!Uint8Array} */ (reader.readBytes());
      msg.setId(value);
      break;
    case 2:
      var value = /** @type {!Uint8Array} */ (reader.readBytes());
      msg.setKey(value);
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
proto.littlstar.cfsnet.Drive.prototype.serializeBinary = function() {
  var writer = new jspb.BinaryWriter();
  proto.littlstar.cfsnet.Drive.serializeBinaryToWriter(this, writer);
  return writer.getResultBuffer();
};


/**
 * Serializes the given message to binary data (in protobuf wire
 * format), writing to the given BinaryWriter.
 * @param {!proto.littlstar.cfsnet.Drive} message
 * @param {!jspb.BinaryWriter} writer
 */
proto.littlstar.cfsnet.Drive.serializeBinaryToWriter = function(message, writer) {
  var f = undefined;
  f = message.getId_asU8();
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
  f = message.getSecretkey_asU8();
  if (f.length > 0) {
    writer.writeBytes(
      3,
      f
    );
  }
};


/**
 * optional bytes id = 1;
 * @return {string}
 */
proto.littlstar.cfsnet.Drive.prototype.getId = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 1, ""));
};


/**
 * optional bytes id = 1;
 * This is a type-conversion wrapper around `getId()`
 * @return {string}
 */
proto.littlstar.cfsnet.Drive.prototype.getId_asB64 = function() {
  return /** @type {string} */ (jspb.Message.bytesAsB64(
      this.getId()));
};


/**
 * optional bytes id = 1;
 * Note that Uint8Array is not supported on all browsers.
 * @see http://caniuse.com/Uint8Array
 * This is a type-conversion wrapper around `getId()`
 * @return {!Uint8Array}
 */
proto.littlstar.cfsnet.Drive.prototype.getId_asU8 = function() {
  return /** @type {!Uint8Array} */ (jspb.Message.bytesAsU8(
      this.getId()));
};


/** @param {!(string|Uint8Array)} value */
proto.littlstar.cfsnet.Drive.prototype.setId = function(value) {
  jspb.Message.setField(this, 1, value);
};


/**
 * optional bytes key = 2;
 * @return {string}
 */
proto.littlstar.cfsnet.Drive.prototype.getKey = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 2, ""));
};


/**
 * optional bytes key = 2;
 * This is a type-conversion wrapper around `getKey()`
 * @return {string}
 */
proto.littlstar.cfsnet.Drive.prototype.getKey_asB64 = function() {
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
proto.littlstar.cfsnet.Drive.prototype.getKey_asU8 = function() {
  return /** @type {!Uint8Array} */ (jspb.Message.bytesAsU8(
      this.getKey()));
};


/** @param {!(string|Uint8Array)} value */
proto.littlstar.cfsnet.Drive.prototype.setKey = function(value) {
  jspb.Message.setField(this, 2, value);
};


/**
 * optional bytes secretKey = 3;
 * @return {string}
 */
proto.littlstar.cfsnet.Drive.prototype.getSecretkey = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 3, ""));
};


/**
 * optional bytes secretKey = 3;
 * This is a type-conversion wrapper around `getSecretkey()`
 * @return {string}
 */
proto.littlstar.cfsnet.Drive.prototype.getSecretkey_asB64 = function() {
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
proto.littlstar.cfsnet.Drive.prototype.getSecretkey_asU8 = function() {
  return /** @type {!Uint8Array} */ (jspb.Message.bytesAsU8(
      this.getSecretkey()));
};


/** @param {!(string|Uint8Array)} value */
proto.littlstar.cfsnet.Drive.prototype.setSecretkey = function(value) {
  jspb.Message.setField(this, 3, value);
};



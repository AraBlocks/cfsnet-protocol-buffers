/**
 * @fileoverview
 * @enhanceable
 * @public
 */
// GENERATED CODE -- DO NOT EDIT!

goog.provide('proto.littlstar.cfsnet.Buffer');

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
proto.littlstar.cfsnet.Buffer = function(opt_data) {
  jspb.Message.initialize(this, opt_data, 0, -1, null, null);
};
goog.inherits(proto.littlstar.cfsnet.Buffer, jspb.Message);
if (goog.DEBUG && !COMPILED) {
  proto.littlstar.cfsnet.Buffer.displayName = 'proto.littlstar.cfsnet.Buffer';
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
proto.littlstar.cfsnet.Buffer.prototype.toObject = function(opt_includeInstance) {
  return proto.littlstar.cfsnet.Buffer.toObject(opt_includeInstance, this);
};


/**
 * Static version of the {@see toObject} method.
 * @param {boolean|undefined} includeInstance Whether to include the JSPB
 *     instance for transitional soy proto support:
 *     http://goto/soy-param-migration
 * @param {!proto.littlstar.cfsnet.Buffer} msg The msg instance to transform.
 * @return {!Object}
 */
proto.littlstar.cfsnet.Buffer.toObject = function(includeInstance, msg) {
  var f, obj = {
    value: msg.getValue_asB64()
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
 * @return {!proto.littlstar.cfsnet.Buffer}
 */
proto.littlstar.cfsnet.Buffer.deserializeBinary = function(bytes) {
  var reader = new jspb.BinaryReader(bytes);
  var msg = new proto.littlstar.cfsnet.Buffer;
  return proto.littlstar.cfsnet.Buffer.deserializeBinaryFromReader(msg, reader);
};


/**
 * Deserializes binary data (in protobuf wire format) from the
 * given reader into the given message object.
 * @param {!proto.littlstar.cfsnet.Buffer} msg The message object to deserialize into.
 * @param {!jspb.BinaryReader} reader The BinaryReader to use.
 * @return {!proto.littlstar.cfsnet.Buffer}
 */
proto.littlstar.cfsnet.Buffer.deserializeBinaryFromReader = function(msg, reader) {
  while (reader.nextField()) {
    if (reader.isEndGroup()) {
      break;
    }
    var field = reader.getFieldNumber();
    switch (field) {
    case 1:
      var value = /** @type {!Uint8Array} */ (reader.readBytes());
      msg.setValue(value);
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
proto.littlstar.cfsnet.Buffer.prototype.serializeBinary = function() {
  var writer = new jspb.BinaryWriter();
  proto.littlstar.cfsnet.Buffer.serializeBinaryToWriter(this, writer);
  return writer.getResultBuffer();
};


/**
 * Serializes the given message to binary data (in protobuf wire
 * format), writing to the given BinaryWriter.
 * @param {!proto.littlstar.cfsnet.Buffer} message
 * @param {!jspb.BinaryWriter} writer
 */
proto.littlstar.cfsnet.Buffer.serializeBinaryToWriter = function(message, writer) {
  var f = undefined;
  f = message.getValue_asU8();
  if (f.length > 0) {
    writer.writeBytes(
      1,
      f
    );
  }
};


/**
 * optional bytes value = 1;
 * @return {string}
 */
proto.littlstar.cfsnet.Buffer.prototype.getValue = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 1, ""));
};


/**
 * optional bytes value = 1;
 * This is a type-conversion wrapper around `getValue()`
 * @return {string}
 */
proto.littlstar.cfsnet.Buffer.prototype.getValue_asB64 = function() {
  return /** @type {string} */ (jspb.Message.bytesAsB64(
      this.getValue()));
};


/**
 * optional bytes value = 1;
 * Note that Uint8Array is not supported on all browsers.
 * @see http://caniuse.com/Uint8Array
 * This is a type-conversion wrapper around `getValue()`
 * @return {!Uint8Array}
 */
proto.littlstar.cfsnet.Buffer.prototype.getValue_asU8 = function() {
  return /** @type {!Uint8Array} */ (jspb.Message.bytesAsU8(
      this.getValue()));
};


/** @param {!(string|Uint8Array)} value */
proto.littlstar.cfsnet.Buffer.prototype.setValue = function(value) {
  jspb.Message.setField(this, 1, value);
};



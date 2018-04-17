/**
 * @fileoverview
 * @enhanceable
 * @public
 */
// GENERATED CODE -- DO NOT EDIT!

goog.provide('proto.littlstar.cfsnet.Stat');

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
proto.littlstar.cfsnet.Stat = function(opt_data) {
  jspb.Message.initialize(this, opt_data, 0, -1, null, null);
};
goog.inherits(proto.littlstar.cfsnet.Stat, jspb.Message);
if (goog.DEBUG && !COMPILED) {
  proto.littlstar.cfsnet.Stat.displayName = 'proto.littlstar.cfsnet.Stat';
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
proto.littlstar.cfsnet.Stat.prototype.toObject = function(opt_includeInstance) {
  return proto.littlstar.cfsnet.Stat.toObject(opt_includeInstance, this);
};


/**
 * Static version of the {@see toObject} method.
 * @param {boolean|undefined} includeInstance Whether to include the JSPB
 *     instance for transitional soy proto support:
 *     http://goto/soy-param-migration
 * @param {!proto.littlstar.cfsnet.Stat} msg The msg instance to transform.
 * @return {!Object}
 */
proto.littlstar.cfsnet.Stat.toObject = function(includeInstance, msg) {
  var f, obj = {
    mode: jspb.Message.getFieldWithDefault(msg, 1, 0),
    uid: jspb.Message.getFieldWithDefault(msg, 2, 0),
    gid: jspb.Message.getFieldWithDefault(msg, 3, 0),
    size: jspb.Message.getFieldWithDefault(msg, 4, 0),
    blocks: jspb.Message.getFieldWithDefault(msg, 5, 0),
    offset: jspb.Message.getFieldWithDefault(msg, 6, 0),
    byteoffset: jspb.Message.getFieldWithDefault(msg, 7, 0),
    mtime: jspb.Message.getFieldWithDefault(msg, 8, 0),
    ctime: jspb.Message.getFieldWithDefault(msg, 9, 0)
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
 * @return {!proto.littlstar.cfsnet.Stat}
 */
proto.littlstar.cfsnet.Stat.deserializeBinary = function(bytes) {
  var reader = new jspb.BinaryReader(bytes);
  var msg = new proto.littlstar.cfsnet.Stat;
  return proto.littlstar.cfsnet.Stat.deserializeBinaryFromReader(msg, reader);
};


/**
 * Deserializes binary data (in protobuf wire format) from the
 * given reader into the given message object.
 * @param {!proto.littlstar.cfsnet.Stat} msg The message object to deserialize into.
 * @param {!jspb.BinaryReader} reader The BinaryReader to use.
 * @return {!proto.littlstar.cfsnet.Stat}
 */
proto.littlstar.cfsnet.Stat.deserializeBinaryFromReader = function(msg, reader) {
  while (reader.nextField()) {
    if (reader.isEndGroup()) {
      break;
    }
    var field = reader.getFieldNumber();
    switch (field) {
    case 1:
      var value = /** @type {number} */ (reader.readUint32());
      msg.setMode(value);
      break;
    case 2:
      var value = /** @type {number} */ (reader.readUint32());
      msg.setUid(value);
      break;
    case 3:
      var value = /** @type {number} */ (reader.readUint32());
      msg.setGid(value);
      break;
    case 4:
      var value = /** @type {number} */ (reader.readUint64());
      msg.setSize(value);
      break;
    case 5:
      var value = /** @type {number} */ (reader.readUint64());
      msg.setBlocks(value);
      break;
    case 6:
      var value = /** @type {number} */ (reader.readUint64());
      msg.setOffset(value);
      break;
    case 7:
      var value = /** @type {number} */ (reader.readUint64());
      msg.setByteoffset(value);
      break;
    case 8:
      var value = /** @type {number} */ (reader.readUint64());
      msg.setMtime(value);
      break;
    case 9:
      var value = /** @type {number} */ (reader.readUint64());
      msg.setCtime(value);
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
proto.littlstar.cfsnet.Stat.prototype.serializeBinary = function() {
  var writer = new jspb.BinaryWriter();
  proto.littlstar.cfsnet.Stat.serializeBinaryToWriter(this, writer);
  return writer.getResultBuffer();
};


/**
 * Serializes the given message to binary data (in protobuf wire
 * format), writing to the given BinaryWriter.
 * @param {!proto.littlstar.cfsnet.Stat} message
 * @param {!jspb.BinaryWriter} writer
 */
proto.littlstar.cfsnet.Stat.serializeBinaryToWriter = function(message, writer) {
  var f = undefined;
  f = message.getMode();
  if (f !== 0) {
    writer.writeUint32(
      1,
      f
    );
  }
  f = message.getUid();
  if (f !== 0) {
    writer.writeUint32(
      2,
      f
    );
  }
  f = message.getGid();
  if (f !== 0) {
    writer.writeUint32(
      3,
      f
    );
  }
  f = message.getSize();
  if (f !== 0) {
    writer.writeUint64(
      4,
      f
    );
  }
  f = message.getBlocks();
  if (f !== 0) {
    writer.writeUint64(
      5,
      f
    );
  }
  f = message.getOffset();
  if (f !== 0) {
    writer.writeUint64(
      6,
      f
    );
  }
  f = message.getByteoffset();
  if (f !== 0) {
    writer.writeUint64(
      7,
      f
    );
  }
  f = message.getMtime();
  if (f !== 0) {
    writer.writeUint64(
      8,
      f
    );
  }
  f = message.getCtime();
  if (f !== 0) {
    writer.writeUint64(
      9,
      f
    );
  }
};


/**
 * optional uint32 mode = 1;
 * @return {number}
 */
proto.littlstar.cfsnet.Stat.prototype.getMode = function() {
  return /** @type {number} */ (jspb.Message.getFieldWithDefault(this, 1, 0));
};


/** @param {number} value */
proto.littlstar.cfsnet.Stat.prototype.setMode = function(value) {
  jspb.Message.setField(this, 1, value);
};


/**
 * optional uint32 uid = 2;
 * @return {number}
 */
proto.littlstar.cfsnet.Stat.prototype.getUid = function() {
  return /** @type {number} */ (jspb.Message.getFieldWithDefault(this, 2, 0));
};


/** @param {number} value */
proto.littlstar.cfsnet.Stat.prototype.setUid = function(value) {
  jspb.Message.setField(this, 2, value);
};


/**
 * optional uint32 gid = 3;
 * @return {number}
 */
proto.littlstar.cfsnet.Stat.prototype.getGid = function() {
  return /** @type {number} */ (jspb.Message.getFieldWithDefault(this, 3, 0));
};


/** @param {number} value */
proto.littlstar.cfsnet.Stat.prototype.setGid = function(value) {
  jspb.Message.setField(this, 3, value);
};


/**
 * optional uint64 size = 4;
 * @return {number}
 */
proto.littlstar.cfsnet.Stat.prototype.getSize = function() {
  return /** @type {number} */ (jspb.Message.getFieldWithDefault(this, 4, 0));
};


/** @param {number} value */
proto.littlstar.cfsnet.Stat.prototype.setSize = function(value) {
  jspb.Message.setField(this, 4, value);
};


/**
 * optional uint64 blocks = 5;
 * @return {number}
 */
proto.littlstar.cfsnet.Stat.prototype.getBlocks = function() {
  return /** @type {number} */ (jspb.Message.getFieldWithDefault(this, 5, 0));
};


/** @param {number} value */
proto.littlstar.cfsnet.Stat.prototype.setBlocks = function(value) {
  jspb.Message.setField(this, 5, value);
};


/**
 * optional uint64 offset = 6;
 * @return {number}
 */
proto.littlstar.cfsnet.Stat.prototype.getOffset = function() {
  return /** @type {number} */ (jspb.Message.getFieldWithDefault(this, 6, 0));
};


/** @param {number} value */
proto.littlstar.cfsnet.Stat.prototype.setOffset = function(value) {
  jspb.Message.setField(this, 6, value);
};


/**
 * optional uint64 byteOffset = 7;
 * @return {number}
 */
proto.littlstar.cfsnet.Stat.prototype.getByteoffset = function() {
  return /** @type {number} */ (jspb.Message.getFieldWithDefault(this, 7, 0));
};


/** @param {number} value */
proto.littlstar.cfsnet.Stat.prototype.setByteoffset = function(value) {
  jspb.Message.setField(this, 7, value);
};


/**
 * optional uint64 mtime = 8;
 * @return {number}
 */
proto.littlstar.cfsnet.Stat.prototype.getMtime = function() {
  return /** @type {number} */ (jspb.Message.getFieldWithDefault(this, 8, 0));
};


/** @param {number} value */
proto.littlstar.cfsnet.Stat.prototype.setMtime = function(value) {
  jspb.Message.setField(this, 8, value);
};


/**
 * optional uint64 ctime = 9;
 * @return {number}
 */
proto.littlstar.cfsnet.Stat.prototype.getCtime = function() {
  return /** @type {number} */ (jspb.Message.getFieldWithDefault(this, 9, 0));
};


/** @param {number} value */
proto.littlstar.cfsnet.Stat.prototype.setCtime = function(value) {
  jspb.Message.setField(this, 9, value);
};



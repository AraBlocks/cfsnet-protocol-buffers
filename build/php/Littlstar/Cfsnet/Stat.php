<?php
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: cfsnet.proto

namespace Littlstar\Cfsnet;

use Google\Protobuf\Internal\GPBType;
use Google\Protobuf\Internal\RepeatedField;
use Google\Protobuf\Internal\GPBUtil;

/**
 * Protobuf type <code>littlstar.cfsnet.Stat</code>
 */
class Stat extends \Google\Protobuf\Internal\Message
{
    /**
     * <code>uint32 mode = 1;</code>
     */
    private $mode = 0;
    /**
     * <code>uint32 uid = 2;</code>
     */
    private $uid = 0;
    /**
     * <code>uint32 gid = 3;</code>
     */
    private $gid = 0;
    /**
     * <code>uint64 size = 4;</code>
     */
    private $size = 0;
    /**
     * <code>uint64 blocks = 5;</code>
     */
    private $blocks = 0;
    /**
     * <code>uint64 offset = 6;</code>
     */
    private $offset = 0;
    /**
     * <code>uint64 byteOffset = 7;</code>
     */
    private $byteOffset = 0;
    /**
     * <code>uint64 mtime = 8;</code>
     */
    private $mtime = 0;
    /**
     * <code>uint64 ctime = 9;</code>
     */
    private $ctime = 0;

    public function __construct() {
        \GPBMetadata\Cfsnet::initOnce();
        parent::__construct();
    }

    /**
     * <code>uint32 mode = 1;</code>
     */
    public function getMode()
    {
        return $this->mode;
    }

    /**
     * <code>uint32 mode = 1;</code>
     */
    public function setMode($var)
    {
        GPBUtil::checkUint32($var);
        $this->mode = $var;
    }

    /**
     * <code>uint32 uid = 2;</code>
     */
    public function getUid()
    {
        return $this->uid;
    }

    /**
     * <code>uint32 uid = 2;</code>
     */
    public function setUid($var)
    {
        GPBUtil::checkUint32($var);
        $this->uid = $var;
    }

    /**
     * <code>uint32 gid = 3;</code>
     */
    public function getGid()
    {
        return $this->gid;
    }

    /**
     * <code>uint32 gid = 3;</code>
     */
    public function setGid($var)
    {
        GPBUtil::checkUint32($var);
        $this->gid = $var;
    }

    /**
     * <code>uint64 size = 4;</code>
     */
    public function getSize()
    {
        return $this->size;
    }

    /**
     * <code>uint64 size = 4;</code>
     */
    public function setSize($var)
    {
        GPBUtil::checkUint64($var);
        $this->size = $var;
    }

    /**
     * <code>uint64 blocks = 5;</code>
     */
    public function getBlocks()
    {
        return $this->blocks;
    }

    /**
     * <code>uint64 blocks = 5;</code>
     */
    public function setBlocks($var)
    {
        GPBUtil::checkUint64($var);
        $this->blocks = $var;
    }

    /**
     * <code>uint64 offset = 6;</code>
     */
    public function getOffset()
    {
        return $this->offset;
    }

    /**
     * <code>uint64 offset = 6;</code>
     */
    public function setOffset($var)
    {
        GPBUtil::checkUint64($var);
        $this->offset = $var;
    }

    /**
     * <code>uint64 byteOffset = 7;</code>
     */
    public function getByteOffset()
    {
        return $this->byteOffset;
    }

    /**
     * <code>uint64 byteOffset = 7;</code>
     */
    public function setByteOffset($var)
    {
        GPBUtil::checkUint64($var);
        $this->byteOffset = $var;
    }

    /**
     * <code>uint64 mtime = 8;</code>
     */
    public function getMtime()
    {
        return $this->mtime;
    }

    /**
     * <code>uint64 mtime = 8;</code>
     */
    public function setMtime($var)
    {
        GPBUtil::checkUint64($var);
        $this->mtime = $var;
    }

    /**
     * <code>uint64 ctime = 9;</code>
     */
    public function getCtime()
    {
        return $this->ctime;
    }

    /**
     * <code>uint64 ctime = 9;</code>
     */
    public function setCtime($var)
    {
        GPBUtil::checkUint64($var);
        $this->ctime = $var;
    }

}


<?php
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: cfsnet.proto

namespace Littlstar\Cfsnet;

use Google\Protobuf\Internal\GPBType;
use Google\Protobuf\Internal\RepeatedField;
use Google\Protobuf\Internal\GPBUtil;

/**
 * Protobuf type <code>littlstar.cfsnet.Open</code>
 */
class Open extends \Google\Protobuf\Internal\Message
{
    /**
     * <code>string path = 1;</code>
     */
    private $path = '';
    /**
     * <code>string flags = 2;</code>
     */
    private $flags = '';

    public function __construct() {
        \GPBMetadata\Cfsnet::initOnce();
        parent::__construct();
    }

    /**
     * <code>string path = 1;</code>
     */
    public function getPath()
    {
        return $this->path;
    }

    /**
     * <code>string path = 1;</code>
     */
    public function setPath($var)
    {
        GPBUtil::checkString($var, True);
        $this->path = $var;
    }

    /**
     * <code>string flags = 2;</code>
     */
    public function getFlags()
    {
        return $this->flags;
    }

    /**
     * <code>string flags = 2;</code>
     */
    public function setFlags($var)
    {
        GPBUtil::checkString($var, True);
        $this->flags = $var;
    }

}


<?php
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: cfsnet.proto

namespace Littlstar\Cfsnet;

use Google\Protobuf\Internal\GPBType;
use Google\Protobuf\Internal\RepeatedField;
use Google\Protobuf\Internal\GPBUtil;

/**
 * Protobuf type <code>littlstar.cfsnet.List</code>
 */
class List extends \Google\Protobuf\Internal\Message
{
    /**
     * <code>repeated bytes values = 1;</code>
     */
    private $values;
    /**
     * <code>uint64 length = 2;</code>
     */
    private $length = 0;

    public function __construct() {
        \GPBMetadata\Cfsnet::initOnce();
        parent::__construct();
    }

    /**
     * <code>repeated bytes values = 1;</code>
     */
    public function getValues()
    {
        return $this->values;
    }

    /**
     * <code>repeated bytes values = 1;</code>
     */
    public function setValues(&$var)
    {
        $arr = GPBUtil::checkRepeatedField($var, \Google\Protobuf\Internal\GPBType::BYTES);
        $this->values = $arr;
    }

    /**
     * <code>uint64 length = 2;</code>
     */
    public function getLength()
    {
        return $this->length;
    }

    /**
     * <code>uint64 length = 2;</code>
     */
    public function setLength($var)
    {
        GPBUtil::checkUint64($var);
        $this->length = $var;
    }

}


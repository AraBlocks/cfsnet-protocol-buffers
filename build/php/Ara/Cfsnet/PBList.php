<?php
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: cfsnet.proto

namespace Ara\Cfsnet;

use Google\Protobuf\Internal\GPBType;
use Google\Protobuf\Internal\RepeatedField;
use Google\Protobuf\Internal\GPBUtil;

/**
 * Generated from protobuf message <code>ara.cfsnet.List</code>
 */
class PBList extends \Google\Protobuf\Internal\Message
{
    /**
     * Generated from protobuf field <code>repeated bytes values = 1;</code>
     */
    private $values;
    /**
     * Generated from protobuf field <code>uint64 length = 2;</code>
     */
    private $length = 0;

    public function __construct() {
        \GPBMetadata\Cfsnet::initOnce();
        parent::__construct();
    }

    /**
     * Generated from protobuf field <code>repeated bytes values = 1;</code>
     * @return \Google\Protobuf\Internal\RepeatedField
     */
    public function getValues()
    {
        return $this->values;
    }

    /**
     * Generated from protobuf field <code>repeated bytes values = 1;</code>
     * @param string[]|\Google\Protobuf\Internal\RepeatedField $var
     * @return $this
     */
    public function setValues($var)
    {
        $arr = GPBUtil::checkRepeatedField($var, \Google\Protobuf\Internal\GPBType::BYTES);
        $this->values = $arr;

        return $this;
    }

    /**
     * Generated from protobuf field <code>uint64 length = 2;</code>
     * @return int|string
     */
    public function getLength()
    {
        return $this->length;
    }

    /**
     * Generated from protobuf field <code>uint64 length = 2;</code>
     * @param int|string $var
     * @return $this
     */
    public function setLength($var)
    {
        GPBUtil::checkUint64($var);
        $this->length = $var;

        return $this;
    }

}


<?php
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: cfsnet.proto

namespace Ara\Cfsnet;

use Google\Protobuf\Internal\GPBType;
use Google\Protobuf\Internal\RepeatedField;
use Google\Protobuf\Internal\GPBUtil;

/**
 * Generated from protobuf message <code>ara.cfsnet.Number</code>
 */
class Number extends \Google\Protobuf\Internal\Message
{
    /**
     * Generated from protobuf field <code>double value = 1;</code>
     */
    private $value = 0.0;

    public function __construct() {
        \GPBMetadata\Cfsnet::initOnce();
        parent::__construct();
    }

    /**
     * Generated from protobuf field <code>double value = 1;</code>
     * @return float
     */
    public function getValue()
    {
        return $this->value;
    }

    /**
     * Generated from protobuf field <code>double value = 1;</code>
     * @param float $var
     * @return $this
     */
    public function setValue($var)
    {
        GPBUtil::checkDouble($var);
        $this->value = $var;

        return $this;
    }

}

<?php
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: cfsnet.proto

namespace Littlstar\Cfsnet;

use Google\Protobuf\Internal\GPBType;
use Google\Protobuf\Internal\RepeatedField;
use Google\Protobuf\Internal\GPBUtil;

/**
 * Protobuf type <code>littlstar.cfsnet.String</code>
 */
class String extends \Google\Protobuf\Internal\Message
{
    /**
     * <code>string value = 1;</code>
     */
    private $value = '';

    public function __construct() {
        \GPBMetadata\Cfsnet::initOnce();
        parent::__construct();
    }

    /**
     * <code>string value = 1;</code>
     */
    public function getValue()
    {
        return $this->value;
    }

    /**
     * <code>string value = 1;</code>
     */
    public function setValue($var)
    {
        GPBUtil::checkString($var, True);
        $this->value = $var;
    }

}


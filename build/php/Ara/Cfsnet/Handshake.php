<?php
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: cfsnet.proto

namespace Ara\Cfsnet;

use Google\Protobuf\Internal\GPBType;
use Google\Protobuf\Internal\RepeatedField;
use Google\Protobuf\Internal\GPBUtil;

/**
 * Generated from protobuf message <code>ara.cfsnet.Handshake</code>
 */
class Handshake extends \Google\Protobuf\Internal\Message
{
    /**
     * Generated from protobuf field <code>bytes nonce = 1;</code>
     */
    private $nonce = '';
    /**
     * Generated from protobuf field <code>bytes key = 2;</code>
     */
    private $key = '';
    /**
     * Generated from protobuf field <code>bool ack = 3;</code>
     */
    private $ack = false;

    public function __construct() {
        \GPBMetadata\Cfsnet::initOnce();
        parent::__construct();
    }

    /**
     * Generated from protobuf field <code>bytes nonce = 1;</code>
     * @return string
     */
    public function getNonce()
    {
        return $this->nonce;
    }

    /**
     * Generated from protobuf field <code>bytes nonce = 1;</code>
     * @param string $var
     * @return $this
     */
    public function setNonce($var)
    {
        GPBUtil::checkString($var, False);
        $this->nonce = $var;

        return $this;
    }

    /**
     * Generated from protobuf field <code>bytes key = 2;</code>
     * @return string
     */
    public function getKey()
    {
        return $this->key;
    }

    /**
     * Generated from protobuf field <code>bytes key = 2;</code>
     * @param string $var
     * @return $this
     */
    public function setKey($var)
    {
        GPBUtil::checkString($var, False);
        $this->key = $var;

        return $this;
    }

    /**
     * Generated from protobuf field <code>bool ack = 3;</code>
     * @return bool
     */
    public function getAck()
    {
        return $this->ack;
    }

    /**
     * Generated from protobuf field <code>bool ack = 3;</code>
     * @param bool $var
     * @return $this
     */
    public function setAck($var)
    {
        GPBUtil::checkBool($var);
        $this->ack = $var;

        return $this;
    }

}


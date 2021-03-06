<?php
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: cfsnet.proto

namespace Ara\Cfsnet;

use Google\Protobuf\Internal\GPBType;
use Google\Protobuf\Internal\RepeatedField;
use Google\Protobuf\Internal\GPBUtil;

/**
 * Generated from protobuf message <code>ara.cfsnet.Response</code>
 */
class Response extends \Google\Protobuf\Internal\Message
{
    /**
     * Generated from protobuf field <code>bytes nonce = 1;</code>
     */
    private $nonce = '';
    /**
     * Generated from protobuf field <code>.ara.cfsnet.Drive drive = 2;</code>
     */
    private $drive = null;
    /**
     * Generated from protobuf field <code>.ara.cfsnet.Operation operation = 3;</code>
     */
    private $operation = 0;
    /**
     * Generated from protobuf field <code>.ara.cfsnet.Request request = 4;</code>
     */
    private $request = null;
    /**
     * Generated from protobuf field <code>.ara.cfsnet.ErrorCode errorCode = 5;</code>
     */
    private $errorCode = 0;
    /**
     * Generated from protobuf field <code>bytes buffer = 6;</code>
     */
    private $buffer = '';

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
     * Generated from protobuf field <code>.ara.cfsnet.Drive drive = 2;</code>
     * @return \Ara\Cfsnet\Drive
     */
    public function getDrive()
    {
        return $this->drive;
    }

    /**
     * Generated from protobuf field <code>.ara.cfsnet.Drive drive = 2;</code>
     * @param \Ara\Cfsnet\Drive $var
     * @return $this
     */
    public function setDrive($var)
    {
        GPBUtil::checkMessage($var, \Ara\Cfsnet\Drive::class);
        $this->drive = $var;

        return $this;
    }

    /**
     * Generated from protobuf field <code>.ara.cfsnet.Operation operation = 3;</code>
     * @return int
     */
    public function getOperation()
    {
        return $this->operation;
    }

    /**
     * Generated from protobuf field <code>.ara.cfsnet.Operation operation = 3;</code>
     * @param int $var
     * @return $this
     */
    public function setOperation($var)
    {
        GPBUtil::checkEnum($var, \Ara\Cfsnet\Operation::class);
        $this->operation = $var;

        return $this;
    }

    /**
     * Generated from protobuf field <code>.ara.cfsnet.Request request = 4;</code>
     * @return \Ara\Cfsnet\Request
     */
    public function getRequest()
    {
        return $this->request;
    }

    /**
     * Generated from protobuf field <code>.ara.cfsnet.Request request = 4;</code>
     * @param \Ara\Cfsnet\Request $var
     * @return $this
     */
    public function setRequest($var)
    {
        GPBUtil::checkMessage($var, \Ara\Cfsnet\Request::class);
        $this->request = $var;

        return $this;
    }

    /**
     * Generated from protobuf field <code>.ara.cfsnet.ErrorCode errorCode = 5;</code>
     * @return int
     */
    public function getErrorCode()
    {
        return $this->errorCode;
    }

    /**
     * Generated from protobuf field <code>.ara.cfsnet.ErrorCode errorCode = 5;</code>
     * @param int $var
     * @return $this
     */
    public function setErrorCode($var)
    {
        GPBUtil::checkEnum($var, \Ara\Cfsnet\ErrorCode::class);
        $this->errorCode = $var;

        return $this;
    }

    /**
     * Generated from protobuf field <code>bytes buffer = 6;</code>
     * @return string
     */
    public function getBuffer()
    {
        return $this->buffer;
    }

    /**
     * Generated from protobuf field <code>bytes buffer = 6;</code>
     * @param string $var
     * @return $this
     */
    public function setBuffer($var)
    {
        GPBUtil::checkString($var, False);
        $this->buffer = $var;

        return $this;
    }

}


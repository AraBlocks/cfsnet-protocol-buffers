<?php
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: cfsnet.proto

namespace Littlstar\Cfsnet;

use Google\Protobuf\Internal\GPBType;
use Google\Protobuf\Internal\RepeatedField;
use Google\Protobuf\Internal\GPBUtil;

/**
 * Protobuf type <code>littlstar.cfsnet.Response</code>
 */
class Response extends \Google\Protobuf\Internal\Message
{
    /**
     * <code>bytes nonce = 1;</code>
     */
    private $nonce = '';
    /**
     * <code>.littlstar.cfsnet.Drive drive = 2;</code>
     */
    private $drive = null;
    /**
     * <code>.littlstar.cfsnet.Operation operation = 3;</code>
     */
    private $operation = 0;
    /**
     * <code>.littlstar.cfsnet.Request request = 4;</code>
     */
    private $request = null;
    /**
     * <code>.littlstar.cfsnet.ErrorCode errorCode = 5;</code>
     */
    private $errorCode = 0;
    /**
     * <code>bytes buffer = 6;</code>
     */
    private $buffer = '';

    public function __construct() {
        \GPBMetadata\Cfsnet::initOnce();
        parent::__construct();
    }

    /**
     * <code>bytes nonce = 1;</code>
     */
    public function getNonce()
    {
        return $this->nonce;
    }

    /**
     * <code>bytes nonce = 1;</code>
     */
    public function setNonce($var)
    {
        GPBUtil::checkString($var, False);
        $this->nonce = $var;
    }

    /**
     * <code>.littlstar.cfsnet.Drive drive = 2;</code>
     */
    public function getDrive()
    {
        return $this->drive;
    }

    /**
     * <code>.littlstar.cfsnet.Drive drive = 2;</code>
     */
    public function setDrive(&$var)
    {
        GPBUtil::checkMessage($var, \Littlstar\Cfsnet\Drive::class);
        $this->drive = $var;
    }

    /**
     * <code>.littlstar.cfsnet.Operation operation = 3;</code>
     */
    public function getOperation()
    {
        return $this->operation;
    }

    /**
     * <code>.littlstar.cfsnet.Operation operation = 3;</code>
     */
    public function setOperation($var)
    {
        GPBUtil::checkEnum($var, \Littlstar\Cfsnet\Operation::class);
        $this->operation = $var;
    }

    /**
     * <code>.littlstar.cfsnet.Request request = 4;</code>
     */
    public function getRequest()
    {
        return $this->request;
    }

    /**
     * <code>.littlstar.cfsnet.Request request = 4;</code>
     */
    public function setRequest(&$var)
    {
        GPBUtil::checkMessage($var, \Littlstar\Cfsnet\Request::class);
        $this->request = $var;
    }

    /**
     * <code>.littlstar.cfsnet.ErrorCode errorCode = 5;</code>
     */
    public function getErrorCode()
    {
        return $this->errorCode;
    }

    /**
     * <code>.littlstar.cfsnet.ErrorCode errorCode = 5;</code>
     */
    public function setErrorCode($var)
    {
        GPBUtil::checkEnum($var, \Littlstar\Cfsnet\ErrorCode::class);
        $this->errorCode = $var;
    }

    /**
     * <code>bytes buffer = 6;</code>
     */
    public function getBuffer()
    {
        return $this->buffer;
    }

    /**
     * <code>bytes buffer = 6;</code>
     */
    public function setBuffer($var)
    {
        GPBUtil::checkString($var, False);
        $this->buffer = $var;
    }

}


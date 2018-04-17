<?php
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: cfsnet.proto

namespace Littlstar\Cfsnet;

use Google\Protobuf\Internal\GPBType;
use Google\Protobuf\Internal\RepeatedField;
use Google\Protobuf\Internal\GPBUtil;

/**
 * Protobuf type <code>littlstar.cfsnet.Request</code>
 */
class Request extends \Google\Protobuf\Internal\Message
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

}

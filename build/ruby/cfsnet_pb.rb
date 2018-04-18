# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: cfsnet.proto

require 'google/protobuf'

Google::Protobuf::DescriptorPool.generated_pool.build do
  add_message "littlstar.cfsnet.AccessFile" do
    optional :path, :string, 1
    optional :mode, :enum, 2, "littlstar.cfsnet.FileMode"
  end
  add_message "littlstar.cfsnet.Close" do
    optional :fd, :uint32, 1
  end
  add_message "littlstar.cfsnet.DownloadDirectory" do
    optional :path, :string, 1
  end
  add_message "littlstar.cfsnet.DownloadFile" do
    optional :path, :string, 1
  end
  add_message "littlstar.cfsnet.Drive" do
    optional :id, :bytes, 1
    optional :key, :bytes, 2
  end
  add_message "littlstar.cfsnet.ListDirectory" do
    optional :path, :string, 1
  end
  add_message "littlstar.cfsnet.MakeDirectory" do
    optional :path, :string, 1
  end
  add_message "littlstar.cfsnet.MakeDirectoryPath" do
    optional :path, :string, 1
  end
  add_message "littlstar.cfsnet.Open" do
    optional :path, :string, 1
  end
  add_message "littlstar.cfsnet.Read" do
    optional :fd, :uint32, 1
    optional :start, :uint32, 2
    optional :end, :uint32, 3
  end
  add_message "littlstar.cfsnet.ReadFile" do
    optional :path, :string, 1
    optional :start, :uint32, 2
    optional :end, :uint32, 3
  end
  add_message "littlstar.cfsnet.RemoveDirectory" do
    optional :path, :string, 1
  end
  add_message "littlstar.cfsnet.RemoveDirectoryPath" do
    optional :path, :string, 1
  end
  add_message "littlstar.cfsnet.Request" do
    optional :nonce, :bytes, 1
    optional :drive, :message, 2, "littlstar.cfsnet.Drive"
    optional :operation, :enum, 3, "littlstar.cfsnet.Operation"
    optional :buffer, :bytes, 4
  end
  add_message "littlstar.cfsnet.Resolve" do
    optional :path, :string, 1
  end
  add_message "littlstar.cfsnet.Response" do
    optional :nonce, :bytes, 1
    optional :drive, :message, 2, "littlstar.cfsnet.Drive"
    optional :operation, :enum, 3, "littlstar.cfsnet.Operation"
    optional :request, :message, 4, "littlstar.cfsnet.Request"
    optional :errorCode, :enum, 5, "littlstar.cfsnet.ErrorCode"
    optional :buffer, :bytes, 6
  end
  add_message "littlstar.cfsnet.Stat" do
    optional :mode, :uint32, 1
    optional :uid, :uint32, 2
    optional :gid, :uint32, 3
    optional :size, :uint64, 4
    optional :blocks, :uint64, 5
    optional :offset, :uint64, 6
    optional :byteOffset, :uint64, 7
    optional :mtime, :uint64, 8
    optional :ctime, :uint64, 9
  end
  add_message "littlstar.cfsnet.StatFile" do
    optional :path, :string, 1
  end
  add_message "littlstar.cfsnet.TouchFile" do
    optional :path, :string, 1
  end
  add_message "littlstar.cfsnet.UnlinkFile" do
    optional :path, :string, 1
  end
  add_message "littlstar.cfsnet.WriteFile" do
    optional :path, :string, 1
    optional :buffer, :bytes, 2
    optional :start, :uint32, 3
    optional :end, :uint32, 4
  end
  add_enum "littlstar.cfsnet.FileMode" do
    value :F_OK, 0
    value :X_OK, 1
    value :W_OK, 2
    value :R_OK, 4
  end
  add_enum "littlstar.cfsnet.ErrorCode" do
    value :NoError, 0
    value :AccessDeniedError, 403
    value :NotFoundError, 404
    value :NotSupportedError, 405
    value :NotOpenedError, 410
  end
  add_enum "littlstar.cfsnet.Operation" do
    value :NoOperation, 0
    value :ResolveOperation, 1
    value :OpenOperation, 2
    value :CloseOperation, 3
    value :ReadOperation, 4
    value :WriteOperation, 5
    value :ReadFileOperation, 10
    value :WriteFileOperation, 11
    value :StatFileOperation, 12
    value :UnlinkFileOperation, 13
    value :AccessFileOperation, 14
    value :TouchFileOperation, 15
    value :DownloadFileOperation, 16
    value :DownloadDirectoryOperation, 20
    value :MakeDirectoryOperation, 21
    value :MakeDirectoryPathOperation, 22
    value :RemoveDirectoryOperation, 23
    value :RemoveDirectoryPathOperation, 24
    value :ListDirectoryOperation, 25
  end
end

module Littlstar
  module Cfsnet
    AccessFile = Google::Protobuf::DescriptorPool.generated_pool.lookup("littlstar.cfsnet.AccessFile").msgclass
    Close = Google::Protobuf::DescriptorPool.generated_pool.lookup("littlstar.cfsnet.Close").msgclass
    DownloadDirectory = Google::Protobuf::DescriptorPool.generated_pool.lookup("littlstar.cfsnet.DownloadDirectory").msgclass
    DownloadFile = Google::Protobuf::DescriptorPool.generated_pool.lookup("littlstar.cfsnet.DownloadFile").msgclass
    Drive = Google::Protobuf::DescriptorPool.generated_pool.lookup("littlstar.cfsnet.Drive").msgclass
    ListDirectory = Google::Protobuf::DescriptorPool.generated_pool.lookup("littlstar.cfsnet.ListDirectory").msgclass
    MakeDirectory = Google::Protobuf::DescriptorPool.generated_pool.lookup("littlstar.cfsnet.MakeDirectory").msgclass
    MakeDirectoryPath = Google::Protobuf::DescriptorPool.generated_pool.lookup("littlstar.cfsnet.MakeDirectoryPath").msgclass
    Open = Google::Protobuf::DescriptorPool.generated_pool.lookup("littlstar.cfsnet.Open").msgclass
    Read = Google::Protobuf::DescriptorPool.generated_pool.lookup("littlstar.cfsnet.Read").msgclass
    ReadFile = Google::Protobuf::DescriptorPool.generated_pool.lookup("littlstar.cfsnet.ReadFile").msgclass
    RemoveDirectory = Google::Protobuf::DescriptorPool.generated_pool.lookup("littlstar.cfsnet.RemoveDirectory").msgclass
    RemoveDirectoryPath = Google::Protobuf::DescriptorPool.generated_pool.lookup("littlstar.cfsnet.RemoveDirectoryPath").msgclass
    Request = Google::Protobuf::DescriptorPool.generated_pool.lookup("littlstar.cfsnet.Request").msgclass
    Resolve = Google::Protobuf::DescriptorPool.generated_pool.lookup("littlstar.cfsnet.Resolve").msgclass
    Response = Google::Protobuf::DescriptorPool.generated_pool.lookup("littlstar.cfsnet.Response").msgclass
    Stat = Google::Protobuf::DescriptorPool.generated_pool.lookup("littlstar.cfsnet.Stat").msgclass
    StatFile = Google::Protobuf::DescriptorPool.generated_pool.lookup("littlstar.cfsnet.StatFile").msgclass
    TouchFile = Google::Protobuf::DescriptorPool.generated_pool.lookup("littlstar.cfsnet.TouchFile").msgclass
    UnlinkFile = Google::Protobuf::DescriptorPool.generated_pool.lookup("littlstar.cfsnet.UnlinkFile").msgclass
    WriteFile = Google::Protobuf::DescriptorPool.generated_pool.lookup("littlstar.cfsnet.WriteFile").msgclass
    FileMode = Google::Protobuf::DescriptorPool.generated_pool.lookup("littlstar.cfsnet.FileMode").enummodule
    ErrorCode = Google::Protobuf::DescriptorPool.generated_pool.lookup("littlstar.cfsnet.ErrorCode").enummodule
    Operation = Google::Protobuf::DescriptorPool.generated_pool.lookup("littlstar.cfsnet.Operation").enummodule
  end
end

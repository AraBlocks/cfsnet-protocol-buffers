TARGET := cfsnet.proto
BUILD := build
DOCS := docs
SRC := $(wildcard src/*.proto) $(wildcard src/**/*.proto)

COMPILE := scripts/compile
PROTOCC := protoc-c
PROTOC := protoc
MKDIRP := mkdir -p
RM := rm -rf

PROTOCFLAGS += --cpp_out=$(BUILD)/cpp
PROTOCFLAGS += --csharp_out=$(BUILD)/csharp
PROTOCFLAGS += --java_out=$(BUILD)/java
PROTOCFLAGS += --objc_out=$(BUILD)/objc
PROTOCFLAGS += --php_out=$(BUILD)/php
PROTOCFLAGS += --python_out=$(BUILD)/python
PROTOCFLAGS += --ruby_out=$(BUILD)/ruby

PROTOCCFLAGS += --c_out=$(BUILD)/c

PROTOC_DOC_FLAGS += --plugin=protoc-gen-doc=$(shell which protoc-gen-doc)
PROTOC_DOC_FLAGS +=	--doc_out=./docs
PROTOC_DOC_FLAGS +=	--doc_opt=markdown,cfsnet.md

define ENSURE_BUILD_DIRECTORIES
	$(MKDIRP) $(DOCS)
	$(MKDIRP) $(BUILD)/{c,cpp,csharp,java,objc,php,python,ruby}
endef

.PHONY: all

all: $(BUILD) $(DOCS)

$(DOCS): $(TARGET)
	$(ENSURE_BUILD_DIRECTORIES)
	$(if $(shell which protoc-gen-doc),$(PROTOC) $^ $(PROTOC_DOC_FLAGS),$(warning Please install 'protoc-gen-doc' to generate docs.))

$(BUILD): $(TARGET)
	$(ENSURE_BUILD_DIRECTORIES)
	$(PROTOC) $^ $(PROTOCFLAGS)
	$(PROTOCC) $^ $(PROTOCCFLAGS)

$(TARGET): $(SRC) $(COMPILE)
	$(COMPILE)

clean:
	$(RM) $(BUILD)
	$(RM) $(TARGET)

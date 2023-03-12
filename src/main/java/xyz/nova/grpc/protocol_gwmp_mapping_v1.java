// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: service/iot_config.proto

package xyz.nova.grpc;

/**
 * Protobuf type {@code helium.iot_config.protocol_gwmp_mapping_v1}
 */
public final class protocol_gwmp_mapping_v1 extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:helium.iot_config.protocol_gwmp_mapping_v1)
    protocol_gwmp_mapping_v1OrBuilder {
private static final long serialVersionUID = 0L;
  // Use protocol_gwmp_mapping_v1.newBuilder() to construct.
  private protocol_gwmp_mapping_v1(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private protocol_gwmp_mapping_v1() {
    region_ = 0;
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new protocol_gwmp_mapping_v1();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return xyz.nova.grpc.IotConfig.internal_static_helium_iot_config_protocol_gwmp_mapping_v1_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return xyz.nova.grpc.IotConfig.internal_static_helium_iot_config_protocol_gwmp_mapping_v1_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            xyz.nova.grpc.protocol_gwmp_mapping_v1.class, xyz.nova.grpc.protocol_gwmp_mapping_v1.Builder.class);
  }

  public static final int REGION_FIELD_NUMBER = 1;
  private int region_ = 0;
  /**
   * <code>.helium.region region = 1;</code>
   * @return The enum numeric value on the wire for region.
   */
  @java.lang.Override public int getRegionValue() {
    return region_;
  }
  /**
   * <code>.helium.region region = 1;</code>
   * @return The region.
   */
  @java.lang.Override public xyz.nova.grpc.region getRegion() {
    xyz.nova.grpc.region result = xyz.nova.grpc.region.forNumber(region_);
    return result == null ? xyz.nova.grpc.region.UNRECOGNIZED : result;
  }

  public static final int PORT_FIELD_NUMBER = 2;
  private int port_ = 0;
  /**
   * <code>uint32 port = 2;</code>
   * @return The port.
   */
  @java.lang.Override
  public int getPort() {
    return port_;
  }

  private byte memoizedIsInitialized = -1;
  @java.lang.Override
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  @java.lang.Override
  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (region_ != xyz.nova.grpc.region.US915.getNumber()) {
      output.writeEnum(1, region_);
    }
    if (port_ != 0) {
      output.writeUInt32(2, port_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (region_ != xyz.nova.grpc.region.US915.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(1, region_);
    }
    if (port_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeUInt32Size(2, port_);
    }
    size += getUnknownFields().getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof xyz.nova.grpc.protocol_gwmp_mapping_v1)) {
      return super.equals(obj);
    }
    xyz.nova.grpc.protocol_gwmp_mapping_v1 other = (xyz.nova.grpc.protocol_gwmp_mapping_v1) obj;

    if (region_ != other.region_) return false;
    if (getPort()
        != other.getPort()) return false;
    if (!getUnknownFields().equals(other.getUnknownFields())) return false;
    return true;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + REGION_FIELD_NUMBER;
    hash = (53 * hash) + region_;
    hash = (37 * hash) + PORT_FIELD_NUMBER;
    hash = (53 * hash) + getPort();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static xyz.nova.grpc.protocol_gwmp_mapping_v1 parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static xyz.nova.grpc.protocol_gwmp_mapping_v1 parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static xyz.nova.grpc.protocol_gwmp_mapping_v1 parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static xyz.nova.grpc.protocol_gwmp_mapping_v1 parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static xyz.nova.grpc.protocol_gwmp_mapping_v1 parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static xyz.nova.grpc.protocol_gwmp_mapping_v1 parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static xyz.nova.grpc.protocol_gwmp_mapping_v1 parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static xyz.nova.grpc.protocol_gwmp_mapping_v1 parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static xyz.nova.grpc.protocol_gwmp_mapping_v1 parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static xyz.nova.grpc.protocol_gwmp_mapping_v1 parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static xyz.nova.grpc.protocol_gwmp_mapping_v1 parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static xyz.nova.grpc.protocol_gwmp_mapping_v1 parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(xyz.nova.grpc.protocol_gwmp_mapping_v1 prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  @java.lang.Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(
      com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * Protobuf type {@code helium.iot_config.protocol_gwmp_mapping_v1}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:helium.iot_config.protocol_gwmp_mapping_v1)
      xyz.nova.grpc.protocol_gwmp_mapping_v1OrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return xyz.nova.grpc.IotConfig.internal_static_helium_iot_config_protocol_gwmp_mapping_v1_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return xyz.nova.grpc.IotConfig.internal_static_helium_iot_config_protocol_gwmp_mapping_v1_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              xyz.nova.grpc.protocol_gwmp_mapping_v1.class, xyz.nova.grpc.protocol_gwmp_mapping_v1.Builder.class);
    }

    // Construct using xyz.nova.grpc.protocol_gwmp_mapping_v1.newBuilder()
    private Builder() {

    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);

    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      region_ = 0;
      port_ = 0;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return xyz.nova.grpc.IotConfig.internal_static_helium_iot_config_protocol_gwmp_mapping_v1_descriptor;
    }

    @java.lang.Override
    public xyz.nova.grpc.protocol_gwmp_mapping_v1 getDefaultInstanceForType() {
      return xyz.nova.grpc.protocol_gwmp_mapping_v1.getDefaultInstance();
    }

    @java.lang.Override
    public xyz.nova.grpc.protocol_gwmp_mapping_v1 build() {
      xyz.nova.grpc.protocol_gwmp_mapping_v1 result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public xyz.nova.grpc.protocol_gwmp_mapping_v1 buildPartial() {
      xyz.nova.grpc.protocol_gwmp_mapping_v1 result = new xyz.nova.grpc.protocol_gwmp_mapping_v1(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(xyz.nova.grpc.protocol_gwmp_mapping_v1 result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.region_ = region_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.port_ = port_;
      }
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof xyz.nova.grpc.protocol_gwmp_mapping_v1) {
        return mergeFrom((xyz.nova.grpc.protocol_gwmp_mapping_v1)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(xyz.nova.grpc.protocol_gwmp_mapping_v1 other) {
      if (other == xyz.nova.grpc.protocol_gwmp_mapping_v1.getDefaultInstance()) return this;
      if (other.region_ != 0) {
        setRegionValue(other.getRegionValue());
      }
      if (other.getPort() != 0) {
        setPort(other.getPort());
      }
      this.mergeUnknownFields(other.getUnknownFields());
      onChanged();
      return this;
    }

    @java.lang.Override
    public final boolean isInitialized() {
      return true;
    }

    @java.lang.Override
    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      if (extensionRegistry == null) {
        throw new java.lang.NullPointerException();
      }
      try {
        boolean done = false;
        while (!done) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              done = true;
              break;
            case 8: {
              region_ = input.readEnum();
              bitField0_ |= 0x00000001;
              break;
            } // case 8
            case 16: {
              port_ = input.readUInt32();
              bitField0_ |= 0x00000002;
              break;
            } // case 16
            default: {
              if (!super.parseUnknownField(input, extensionRegistry, tag)) {
                done = true; // was an endgroup tag
              }
              break;
            } // default:
          } // switch (tag)
        } // while (!done)
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.unwrapIOException();
      } finally {
        onChanged();
      } // finally
      return this;
    }
    private int bitField0_;

    private int region_ = 0;
    /**
     * <code>.helium.region region = 1;</code>
     * @return The enum numeric value on the wire for region.
     */
    @java.lang.Override public int getRegionValue() {
      return region_;
    }
    /**
     * <code>.helium.region region = 1;</code>
     * @param value The enum numeric value on the wire for region to set.
     * @return This builder for chaining.
     */
    public Builder setRegionValue(int value) {
      region_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>.helium.region region = 1;</code>
     * @return The region.
     */
    @java.lang.Override
    public xyz.nova.grpc.region getRegion() {
      xyz.nova.grpc.region result = xyz.nova.grpc.region.forNumber(region_);
      return result == null ? xyz.nova.grpc.region.UNRECOGNIZED : result;
    }
    /**
     * <code>.helium.region region = 1;</code>
     * @param value The region to set.
     * @return This builder for chaining.
     */
    public Builder setRegion(xyz.nova.grpc.region value) {
      if (value == null) {
        throw new NullPointerException();
      }
      bitField0_ |= 0x00000001;
      region_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <code>.helium.region region = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearRegion() {
      bitField0_ = (bitField0_ & ~0x00000001);
      region_ = 0;
      onChanged();
      return this;
    }

    private int port_ ;
    /**
     * <code>uint32 port = 2;</code>
     * @return The port.
     */
    @java.lang.Override
    public int getPort() {
      return port_;
    }
    /**
     * <code>uint32 port = 2;</code>
     * @param value The port to set.
     * @return This builder for chaining.
     */
    public Builder setPort(int value) {

      port_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <code>uint32 port = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearPort() {
      bitField0_ = (bitField0_ & ~0x00000002);
      port_ = 0;
      onChanged();
      return this;
    }
    @java.lang.Override
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFields(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:helium.iot_config.protocol_gwmp_mapping_v1)
  }

  // @@protoc_insertion_point(class_scope:helium.iot_config.protocol_gwmp_mapping_v1)
  private static final xyz.nova.grpc.protocol_gwmp_mapping_v1 DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new xyz.nova.grpc.protocol_gwmp_mapping_v1();
  }

  public static xyz.nova.grpc.protocol_gwmp_mapping_v1 getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<protocol_gwmp_mapping_v1>
      PARSER = new com.google.protobuf.AbstractParser<protocol_gwmp_mapping_v1>() {
    @java.lang.Override
    public protocol_gwmp_mapping_v1 parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      Builder builder = newBuilder();
      try {
        builder.mergeFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(builder.buildPartial());
      } catch (com.google.protobuf.UninitializedMessageException e) {
        throw e.asInvalidProtocolBufferException().setUnfinishedMessage(builder.buildPartial());
      } catch (java.io.IOException e) {
        throw new com.google.protobuf.InvalidProtocolBufferException(e)
            .setUnfinishedMessage(builder.buildPartial());
      }
      return builder.buildPartial();
    }
  };

  public static com.google.protobuf.Parser<protocol_gwmp_mapping_v1> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<protocol_gwmp_mapping_v1> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public xyz.nova.grpc.protocol_gwmp_mapping_v1 getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

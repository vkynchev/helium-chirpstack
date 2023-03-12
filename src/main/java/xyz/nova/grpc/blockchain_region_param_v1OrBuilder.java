// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: blockchain_region_param_v1.proto

package xyz.nova.grpc;

public interface blockchain_region_param_v1OrBuilder extends
    // @@protoc_insertion_point(interface_extends:helium.blockchain_region_param_v1)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * in hertz
   * </pre>
   *
   * <code>uint64 channel_frequency = 1;</code>
   * @return The channelFrequency.
   */
  long getChannelFrequency();

  /**
   * <pre>
   * in hertz
   * </pre>
   *
   * <code>uint32 bandwidth = 2;</code>
   * @return The bandwidth.
   */
  int getBandwidth();

  /**
   * <pre>
   * in dBi x 10
   * </pre>
   *
   * <code>uint32 max_eirp = 3;</code>
   * @return The maxEirp.
   */
  int getMaxEirp();

  /**
   * <pre>
   * list of atoms
   * </pre>
   *
   * <code>.helium.blockchain_region_spreading_v1 spreading = 4;</code>
   * @return Whether the spreading field is set.
   */
  boolean hasSpreading();
  /**
   * <pre>
   * list of atoms
   * </pre>
   *
   * <code>.helium.blockchain_region_spreading_v1 spreading = 4;</code>
   * @return The spreading.
   */
  xyz.nova.grpc.blockchain_region_spreading_v1 getSpreading();
  /**
   * <pre>
   * list of atoms
   * </pre>
   *
   * <code>.helium.blockchain_region_spreading_v1 spreading = 4;</code>
   */
  xyz.nova.grpc.blockchain_region_spreading_v1OrBuilder getSpreadingOrBuilder();
}
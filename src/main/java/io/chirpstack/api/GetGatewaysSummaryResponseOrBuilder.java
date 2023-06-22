// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/internal.proto

package io.chirpstack.api;

public interface GetGatewaysSummaryResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:api.GetGatewaysSummaryResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Online count.
   * </pre>
   *
   * <code>uint32 online_count = 1;</code>
   * @return The onlineCount.
   */
  int getOnlineCount();

  /**
   * <pre>
   * Offline count.
   * </pre>
   *
   * <code>uint32 offline_count = 2;</code>
   * @return The offlineCount.
   */
  int getOfflineCount();

  /**
   * <pre>
   * Never seen count.
   * </pre>
   *
   * <code>uint32 never_seen_count = 3;</code>
   * @return The neverSeenCount.
   */
  int getNeverSeenCount();
}
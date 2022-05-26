package com.adform.scalaacademy.storm.spout
import scala.concurrent.duration.FiniteDuration

case class UploaderTopologyConfig(name: String)
case class KafkaConsumerConfig(
                                bootstrapServers: List[String],
                                topic: String,
                                groupId: String,
                                fetchMinBytes: Int,
                                fetchMaxBytes: Int,
                                partitionsNumber: Int
                              )
case class KafkaConfig(consumer: KafkaConsumerConfig)
case class KafkaSpoutDeviceConfig(kafka: KafkaConfig)

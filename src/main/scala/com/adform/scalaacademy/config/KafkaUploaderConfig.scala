package com.adform.scalaacademy.config

import com.adform.scalaacademy.storm.spout.{KafkaSpoutDeviceConfig, UploaderTopologyConfig}

case class KafkaUploaderConfig(
    topology: UploaderTopologyConfig,
    kafkaSpoutDevice: KafkaSpoutDeviceConfig
)

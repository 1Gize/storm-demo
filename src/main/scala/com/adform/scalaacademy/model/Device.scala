package com.adform.scalaacademy.model

case class Measurements(id: Int, value: Double)
case class Device(deviceId: String, sensors: List[Measurements])

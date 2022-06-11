package com.developer.deviceinfo.model

data class DeviceDetails(
    var release: String,
    var incremental: String,
    var sdkNumber: Int,
    var board: String,
    var bootLoader: String,
    var brand: String,
    var cpuAbi: String,
    var cpuAbi2: String,
    var display: String,
    var fingerPrint: String,
    var hardware: String,
    var host: String,
    var id: String,
    var manufacture: String,
    var product: String,
    var serial: String,
    var tags: String,
    var time: Long,
    var type: String,
    var user: String
)

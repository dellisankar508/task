package com.developer.deviceinfo

import android.os.Build
import android.os.Build.VERSION
import com.developer.deviceinfo.model.DeviceDetails

class DeviceInfo {

    fun getDeviceDetails(): DeviceDetails {
        return DeviceDetails(
            VERSION.RELEASE,
            VERSION.INCREMENTAL,
            VERSION.SDK_INT,
            Build.BOARD,
            Build.BOOTLOADER,
            Build.BRAND,
            Build.SUPPORTED_ABIS[0],
            Build.SUPPORTED_ABIS[0],
            Build.DISPLAY,
            Build.FINGERPRINT,
            Build.HARDWARE,
            Build.HOST,
            Build.ID,
            Build.MANUFACTURER,
            Build.PRODUCT,
            Build.SERIAL,
            Build.TAGS,
            Build.TIME,
            Build.TYPE,
            Build.USER,
        )
    }

    companion object {
        @Volatile
        private var INSTANCE: DeviceInfo? = null

        fun getInstance(): DeviceInfo {
            return INSTANCE ?: synchronized(this) {
                return DeviceInfo()
            }
        }
    }
}
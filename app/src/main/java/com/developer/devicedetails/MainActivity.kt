package com.developer.devicedetails

import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import com.developer.devicedetails.databinding.ActivityMainBinding
import com.developer.deviceinfo.DeviceInfo

class MainActivity: AppCompatActivity() {

    private val mBinding: ActivityMainBinding by lazy {
        DataBindingUtil.setContentView(this@MainActivity, R.layout.activity_main)
    }

    private lateinit var mDeviceInfo: DeviceInfo

    private val mOnClickListener: View.OnClickListener =
        View.OnClickListener {
            mBinding.tv.text =  mDeviceInfo.getDeviceDetails().toString()
        }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        mDeviceInfo = DeviceInfo.getInstance()
        mBinding.btnClick.setOnClickListener(mOnClickListener)
    }
}
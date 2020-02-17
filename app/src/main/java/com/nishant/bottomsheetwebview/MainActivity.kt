package com.nishant.bottomsheetwebview

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btn_show_bottom_sheet.setOnClickListener {
            val bottomSheetWebView = BottomSheetWebView(this)
            bottomSheetWebView.showWithUrl("https://medium.com/@nishantpardamwar/")
        }
    }
}

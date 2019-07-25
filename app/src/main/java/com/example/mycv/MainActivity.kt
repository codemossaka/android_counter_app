package com.example.mycv

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import android.widget.TextView


class MainActivity : AppCompatActivity() {

    private var mCount: Int = 0
    private var mShowCount: TextView? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        mShowCount = findViewById(R.id.show_count)
    }


    fun showToast(view: View) {
        val toast: Toast = Toast.makeText(this, R.string.toast_message, Toast.LENGTH_LONG)
        toast.show()
    }

    fun countUp(view: View) {
        ++mCount;
        mShowCount?.text = mCount.toString()
    }
}

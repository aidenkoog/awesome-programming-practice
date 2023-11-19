package io.github.aidenkoog.androidpractice.android.apps.number_counter

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import io.github.aidenkoog.androidpractice.R

/**
 * 숫자 세기 앱.
 * 참고. 구글에서 픽셀폰 제작.
 */
class NumberCounterMainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.number_counter_activity_main)

        val numberTextView = findViewById<TextView>(R.id.numberTextView)
        val resetButton = findViewById<Button>(R.id.resetButton)
        val plusButton = findViewById<Button>(R.id.plusButton)

        var number = 0

        // reset
        resetButton.setOnClickListener {
            number = 0
            numberTextView.text = number.toString()
        }

        // increase number by 1
        plusButton.setOnClickListener {
            number += 1
            numberTextView.text = number.toString()
        }
    }
}
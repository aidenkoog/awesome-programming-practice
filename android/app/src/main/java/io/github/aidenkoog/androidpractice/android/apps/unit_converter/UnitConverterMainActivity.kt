package io.github.aidenkoog.androidpractice.android.apps.unit_converter

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.core.widget.addTextChangedListener
import io.github.aidenkoog.androidpractice.databinding.UnitConvertActivityMainBinding

class UnitConverterMainActivity : AppCompatActivity() {

    /**
     * ViewBinding
     * - 뷰와 상호 작용 하는 코드를 쉽게 작성 가능.
     * - findViewById 대체. 문제점 리스트업
     * 1. 중복되는 리소스의 존재 문제
     * 2. 현재 레이아웃이 아닌 다른 레이아웃에 있는 리소스도 참조 가능하기 때문에 컴파일 시점때 에러가 발생하지 않고 런타임때 에러가 발생하는 문제
     */
    private lateinit var binding: UnitConvertActivityMainBinding

    private var inputNumber: Int = 0
    private var cmToM = true

    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // inflate 불러일으키다 터뜨리다 등의 사전적 의미.
        binding = UnitConvertActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val outputTextView = binding.outputTextView
        val outputUnitTextView = binding.outputUnitTextView
        val inputUnitTextView = binding.inputUnitTextView

        // try - catch 로 예외처리하기보다는 정확한 에러의 이유를 알 고 있다면 해당하는 케이스에 대한 예외 처리 코드를 삽입하는 것이 더 좋은 방향
        binding.inputEditText.addTextChangedListener { text ->
            inputNumber = if (text.isNullOrEmpty()) {
                0
            } else {
                text.toString().toInt()
            }

            if (cmToM) {
                outputTextView.text = inputNumber.times(0.01).toString()
            } else {
                outputTextView.text = inputNumber.times(100).toString()
            }
        }

        binding.swapImageButton.setOnClickListener {
            // 현재 설정된 옵션의 반대로 설정 --> cmToM = !cmToM (cmToM = cmToM.not())
            cmToM = cmToM.not()
            if (cmToM) {
                inputUnitTextView.text = "cm"
                outputUnitTextView.text = "m"
                outputTextView.text = inputNumber.times(0.01).toString()
            } else {
                inputUnitTextView.text = "m"
                outputUnitTextView.text = "cm"
                outputTextView.text = inputNumber.times(100).toString()
            }
        }
    }

    // onPause --> onStop --> onSaveInstanceState --> onDestroy
    override fun onSaveInstanceState(outState: Bundle) {
        outState.putBoolean("cmToM", cmToM)
        super.onSaveInstanceState(outState)
    }

    // onCreate --> onStart --> onRestoreInstanceState --> onResume
    override fun onRestoreInstanceState(savedInstanceState: Bundle) {
        cmToM = savedInstanceState.getBoolean("cmToM")
        binding.inputUnitTextView.text = if (cmToM) "cm" else "m"
        binding.outputUnitTextView.text = if (cmToM) "m" else "cm"
        super.onRestoreInstanceState(savedInstanceState)
    }
}

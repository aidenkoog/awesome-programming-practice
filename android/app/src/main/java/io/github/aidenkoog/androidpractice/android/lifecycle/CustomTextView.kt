package io.github.aidenkoog.androidpractice.android.lifecycle

import android.content.Context
import android.graphics.Canvas
import android.util.AttributeSet
import android.util.Log
import androidx.appcompat.widget.AppCompatTextView

/**
 * requestLayout: 크기 변경 시 (예: 다른 텍스트로의 할당 등)
 * invalidate: 크기 변경 없는 색상 변경 시 (예: 텍스트 컬러 변경 등)
 */
class CustomTextView @JvmOverloads constructor(
    context: Context, attrs: AttributeSet? = null, defStyleAttr: Int = 0
) : AppCompatTextView(context, attrs, defStyleAttr) {

    override fun onMeasure(widthMeasureSpec: Int, heightMeasureSpec: Int) {
        Log.d(TAG, "onMeasure: ")
        super.onMeasure(widthMeasureSpec, heightMeasureSpec)
    }

    override fun onLayout(changed: Boolean, l: Int, t: Int, r: Int, b: Int) {
        Log.d(TAG, "onLayout: ")
        super.onLayout(changed, l, t, r, b)
    }

    // --> 34, Canvas type doesn't allow null.
    override fun onDraw(canvas: Canvas) {
        Log.d(TAG, "onDraw: ")
        super.onDraw(canvas)
    }

    // 크기 변경 시
    override fun requestLayout() {
        Log.d(TAG, "requestLayout: ")
        super.requestLayout()
    }

    // 색상 변경 시
    override fun invalidate() {
        Log.d(TAG, "invalidate: ")
        super.invalidate()
    }

    companion object {
        const val TAG = "CustomTextView"
    }
}
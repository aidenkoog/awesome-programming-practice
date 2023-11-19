package io.github.aidenkoog.androidpractice.android.lifecycle

import android.content.Context
import android.graphics.Canvas
import android.util.AttributeSet
import android.util.Log
import android.widget.LinearLayout

/**
 * 레이아웃 메소드 호출 순서
 */
class CustomLinearLayout @JvmOverloads constructor(
    context: Context, attrs: AttributeSet? = null, defStyleAttr: Int = 0
) : LinearLayout(context, attrs, defStyleAttr) {

    /**
     * onMeasure -> onLayout -> onDraw
     * 크기 계산
     */
    override fun onMeasure(widthMeasureSpec: Int, heightMeasureSpec: Int) {
        Log.d(TAG, "onMeasure: ")
        super.onMeasure(widthMeasureSpec, heightMeasureSpec)
    }

    /**
     *크기, 위치를 할당
     */
    override fun onLayout(changed: Boolean, l: Int, t: Int, r: Int, b: Int) {
        Log.d(TAG, "onLayout: ")
        super.onLayout(changed, l, t, r, b)
    }

    /**
     * 실제 렌더링
     * --> 34, Canvas type doesn't allow null.
     */
    override fun onDraw(canvas: Canvas) {
        Log.d(TAG, "onDraw: ")
        super.onDraw(canvas)
    }

    companion object {
        const val TAG = "CustomLinearLayout"
    }
}

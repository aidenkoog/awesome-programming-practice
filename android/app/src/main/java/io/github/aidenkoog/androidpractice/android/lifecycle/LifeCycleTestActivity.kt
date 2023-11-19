package io.github.aidenkoog.androidpractice.android.lifecycle

import androidx.appcompat.app.AppCompatActivity
import android.util.Log
import android.os.Bundle
import io.github.aidenkoog.androidpractice.R

/**
 * 액티비티가 Stop 되었다가 다시 뜰때 순서.
 * - (onPause) --> onRestart --> onStart --> onResume --> (onStop)
 */
class LifeCycleTestActivity : AppCompatActivity() {

    /**
     * 라이프 사이클 인지는 앱의 완성도 & 안정성을 보장
     * 기본 흐름 : onCreate --> onStart --> onResume
     * 다른 액티비티 뜰 때 : onPause --> onCreate --> onStart --> onResume --> onStop
     * 다시 백키로 돌아가면 : onPause --> onRestart --> onStart --> onResume --> onStop --> onDestroy (백키로
     * 껐으므로)
     */
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.life_cycle_test_activity_main)
        Log.d(TAG, "onCreate: ")
    }

    /**
     * logd 작성 후 자동완성 하면 로그 코드 생성
     * 로거나 팀버 사용 시 편하게 자동완성 할 수 있는 방법은 없는지 검토 필요.
     */
    override fun onStart() {
        Log.d(TAG, "onStart: ")
        super.onStart()
    }

    override fun onResume() {
        Log.d(TAG, "onResume: ")
        super.onResume()
    }

    override fun onPause() {
        Log.d(TAG, "onPause: ")
        super.onPause()
    }

    override fun onStop() {
        Log.d(TAG, "onStop: ")
        super.onStop()
    }

    companion object {
        private val TAG = LifeCycleTestActivity::class.java.simpleName
    }
}
#### Activity / Custom View based on XML for testing lifecycle.

- onMeasure --> onLayout --> onDraw
- onCreate --> onStart --> onResume
- onPause --> onCreate --> onStart --> onResume --> onStop
- onPause --> onRestart --> onStart --> onResume --> onStop --> onDestroy
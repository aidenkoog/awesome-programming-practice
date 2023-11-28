package io.github.aidenkoog.androidpractice.coroutine.section2

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.async
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext

fun main() {
    threadAndCoroutine()
    practice1()
}

private fun threadAndCoroutine() {
    // 1. thread.
    // refs. == Thread(Runnable {}).start()
    Thread {
        for (i in 1..10) {
            Thread.sleep(1000L)
            println("Hello world !!!")
        }
    }.start()

    // 2. Coroutine
    // GlobalScope 와 CoroutineScope 차이점
    // => 글로벌 스코프는 잡이 없는 코루틴 컨텍스트를 가지고 있기 때문에, 글로벌 스코프.cancel() 과
    // 같이 코루틴 작업을 취소하는 것이 불가능, GlobalScope.launch {} 에서 반환되는 job을 가지고만 취소가 가능
    // CoroutineScope()는 생성할 때 잡이 있는지 체크하여 없으면 잡을 넣어주기 때문에 바로 취소가 가능.
    GlobalScope.launch {
        repeat(10) {
            delay(1000L)
            println("hello world by coroutine Globalscope !!!")
        }
    }

    // launch, async, await
    GlobalScope.launch {
        launch {
            println("here.......")
        }

        val value: Int = async {
            var total = 0
            for (i in 1..10) total += i
            total
        }.await()

        // 위의 코드는 아래와 동일하다
        val value2: Int = withContext(Dispatchers.Default) {
            var total = 0
            for (i in 1..10) total += i
            total
        }

        println(value)
        println(value2)
    }
}

private fun practice1() {
    GlobalScope.launch {
        val x = testtest()
        println("test: $x")
    }
}

// 다시 정리하면 코루틴 내부에서 실행되는 함수는 suspend 로 지정해야 함.
private suspend fun testtest(): Int {
    // GlobalScope.async 는 withContext 로 변환 가능.
    val value: Int = GlobalScope.async(Dispatchers.IO) {
        var total = 0
        for (i in 1..10) total += i
        println("suspend method: $total")
        total
    }.await()

    return value
}

private fun practice2() {
    println("start....")  // 1.

    GlobalScope.launch(Dispatchers.Main) {
        val job1 = async(Dispatchers.IO) {
            var total = 0
            for (i in 1..10) {
                total += i
                delay(100)
            }
            println("job1") // 3.
            total
        }

        val job2 = async(Dispatchers.Main) {
            var total = 0
            for (i in 1..10) {
                delay(100)
                total += i
            }
            println("job2")  // 4.
            total
        }

        val result1 = job1.await()
        val result2 = job2.await()

        // 5.
        println("results: $result1 and $result2")
    }
    println("end.....")  // 2.
}
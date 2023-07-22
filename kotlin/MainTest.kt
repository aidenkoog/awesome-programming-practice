class MainTest {
    fun main(args: Array<String>) {
        CoroutineScope(Dispatchers.IO).launch {
            delay(1000)
            System.out.println("coroutine: ${Thread.currentThread().name}")
        }

        CoroutineScope().launch(Dispatchers.IO) {
            val time = measureTimeMillis {
                val result1 = async { network1() }
                val result2 = async { network2() }
                System.out.println("result: ${result1.await()}")
            }
        }
    }
}
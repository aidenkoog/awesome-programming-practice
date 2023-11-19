import kotlinx.coroutines.*
import kotlinx.coroutines.flow.*

fun log2(msg: String) = println("[$(Thread.currentThread().name)] $msg")

fun simple2(): Flow<Int> = flow {
    log("flow started !")
    for (i in 1..10) {
        emit(i)
    }
}

//fun main() = runBlocking<Unit> {
//    launch(Dispatchers.IO) {
//        simple().collect {
//            value -> log("$value is to be logged!")
//        }
//    }
//}
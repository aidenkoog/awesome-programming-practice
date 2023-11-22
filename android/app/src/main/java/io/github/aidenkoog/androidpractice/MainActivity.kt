package io.github.aidenkoog.androidpractice

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import io.github.aidenkoog.androidpractice.problem_solving.study.CodingJava
import io.github.aidenkoog.androidpractice.ui.theme.AndroidPracticeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // 함수 타입 content는 Composable 함수 타입.
        setContent {
            // Composable 함수
            AndroidPracticeTheme {
                // A surface container using the 'background' color from the theme
                // Surface 는 Composable 함수, 그래서 Greeting Composable 함수는 여기서 호출될 수 있음.
                Surface(
                    modifier = Modifier.fillMaxSize(), color = MaterialTheme.colorScheme.background
                ) {
                    Greeting("Android")
                }
            }
        }
    }
}

/**
 * Composable 어노테이션은 컴포즈 함수에서 필수적으로 사용되고 크게 3가지의 역할
 * 1. 멱등성 보장
 * 2. 위치 메모이제이션 활성화 (설명 추가 필요)
 * 3. 데이터 제공 / 컴포저블 방출
 * - 방출 : 제공된 컴포저블 데이터를 UI 트리로 그리는 과정.
 *
 * (추가)
 * - Composable이 작성된 코드는 다른 Composable 코드 안에서만 호출 가능
 * (Coroutine의 suspend와 유사한 느낌!)
 */
/**
 * Modifier.
 * - Compose의 UI 구성요소들을 꾸미거나 행동을 추가하기 위한 요소들의 모음.
 * - 크기(너비, 높이) 조절 / 패딩, 오프셋 이용하여 여유 공간 만들기
 * - Modifier.background 로 배경색 설정 / 라운딩 처리 / 그라데이션 처리
 * - Color 에 투명도 적용 / 보더 적용
 * - 패딩과 보더 조합한 중첩 테두리 생성 (Multiple Border)
 * - Ex: Modifier.padding(24.dp).fillMaxWidth()
 * - fillMaxWidth: 최대 너비 채움
 * - padding: 요소 주위에 공간 배치
 */
@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!", modifier = modifier
    )
}

/**
 * 멱등성 예제
 * - 하나의 컴포저블이 여러번 실행되더라도 인풋이 동일하다면 아웃풋 또한 동일할 것이기 때문에 재 실행을 건너뛰게 됨.
 * - Smart recomposition.
 */
@Composable
fun Idempotent() {
    // UI 갱신 필요 시

    // 이 컴포저블은 한 번만 실행됨, 인풋이 동일하므로 항상 아웃풋도 동일할 것이므로!
    Text(text = "AidenKooG")

    // 이 컴포저블은 항상 재실행 될 것으로 판단
    // 현재 시간, 밀리세컨드 값은 계속 계속 변하므로 인풋값은 항상 다름.
    Text(text = System.currentTimeMillis().toString())
}


@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    AndroidPracticeTheme {
        Greeting("Android")
    }
}

/**
 * ktlint & detekt 테스트를 위한 코드
 */
fun Test() {
    var a: Int = 0
    if (a < 0) {
        if (a < 0) {
            if (a < 0) {
                if (a < 0) {

                }
            }
        }
    }
}
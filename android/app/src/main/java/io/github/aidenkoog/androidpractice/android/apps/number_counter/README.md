## Number Counter App

#### Funtions

- '+' 버튼을 클릭 시, 숫자를 1씩 증가
- 초기화 버튼을 클릭 시, 숫자를 0으로 변경

#### Study

1. [화면의 방향이 변경 대응](https://developer.android.com/guide/components/activities?hl=ko)?
    1. 값을 유지하려면?
    2. 화면 방향에 상관없이 버튼을 보이게 하려면?
        - numberTextView 의 height 값을 지정하지 말고, weight 를 이용
2. weight 를 넣을 때 dimension 에 왜 0dp 를 넣어야 하는가?
    - LinearLayout 의 weight 값이 잘 적용되기 위해선, orientation 에 따라, width 또는 height 의 값이 0dp 여야 함
        - orientation: vertical ->  layout_height=“0dp”
        - orientation: horizontal -> layout_width="0dp"
    - https://developer.android.com/guide/topics/ui/layout/linear?hl=ko#Weight
    
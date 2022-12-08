import React, {FC} from 'react'
import {  SafeAreaView,  View,} from 'react-native'
import Buttons from './Buttons'
import {AnswerObject} from '../screens/Quiz'

interface Answers {
  userAnswer: AnswerObject | undefined
  answers: string[]
  setCorrentAnswer: any
  checkAnswer: () => void
}

const Answers: FC<Answers> = props => {
  return (
    <SafeAreaView>
      <View style={{marginTop: 10, paddingHorizontal: 20}}>
        {props.answers.map((answer, key) => {
          return (
            <View key={answer}>
              <Buttons
                {...{key, answer}}
                correct={props.userAnswer?.correctAnswer === answer}
                disabled={props.userAnswer ? true : false}
                onPress={() => {
                  (props.setCorrentAnswer.current = answer),
                    props.checkAnswer()
                }}
              />
            </View>
          )
        })}
      </View>
    </SafeAreaView>
  )
}

export default Answers
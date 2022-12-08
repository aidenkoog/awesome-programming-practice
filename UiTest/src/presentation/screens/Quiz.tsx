import React, {FC, useEffect, useRef, useState} from 'react'
import {
  StyleSheet,
  Text,
  View,
  TouchableOpacity,
  ActivityIndicator,
} from 'react-native'
import {getQuestions, Question} from '../../utils/api'
import Questions from '../components/Question'
import Answers from '../components/Answers'
import {Icon} from 'react-native-elements'

export type AnswerObject = {
  question: string
  answer: string
  correct: boolean
  correctAnswer: string
}

const Quiz: FC = () => {
  const [loader, setLoader] = useState(false)
  const [question, setQuestion] = useState<Question[]>([])
  const [userAnswers, setUserAnswers] = useState<AnswerObject[]>([])
  const [score, setScore] = useState(0)
  const [number, setNumber] = useState(0)
  const [totalQuestion] = useState(10)
  const [gameOver, setGameOver] = useState(true)
  const setCorrectAnswer = useRef(null)

  useEffect(() => {
    startQuiz()
  }, [])

  const startQuiz = async () => {
    setNumber(0)
    setLoader(true)
    setGameOver(false)
    const newquestions = await getQuestions()
    console.log(newquestions)
    setQuestion(newquestions)
    setScore(0)
    setUserAnswers([])
    setLoader(false)
  }

  const nextQuestion = () => {
    const nextq = number + 1
    if (nextq == totalQuestion) {
      setGameOver(true)
    } else {
      setNumber(nextq)
    }
  }

  const checkanswer = () => {
    if (!gameOver) {
      const answer = setCorrectAnswer.current

      const correcta = question[number].correct_answer === answer

      if (correcta) setScore(prev => prev + 1)

      const answerObject = {
        question: question[number].question,
        answer,
        correcta,
        correctanswer: question[number].correct_answer,
      }

      setUserAnswers(prev => [...prev, answerObject])
      setTimeout(() => {
        nextQuestion()
      }, 1000)
    }
  }

  return (
    <View style={{flex: 1}}>
      {!loader ? (
        <View>
          <View style={styles.container}>
            <Text style={styles.textstyle}>[Questions]</Text>
            <Text style={styles.textstyle}>
              {number + 1}/{totalQuestion}
            </Text>
          </View>
          <View style={{marginLeft: 20}}>
            <Text style={styles.textstyle}>Score : {score}</Text>
          </View>
          {question.length > 0 ? (
            <>
              <Questions
                QuestionNo={number + 1}
                Question={question[number].question}
              />
              <Answers
                setCorrentAnswer={undefined} checkAnswer={function (): void {
                  throw new Error('Function not implemented.')
                } } answers={question[number].answers}
                {...{ setCorrectAnswer, checkanswer }}
                userAnswer={userAnswers ? userAnswers[number] : undefined}              />
            </>
          ) : null}
        </View>
      ) : (
        <ActivityIndicator
          style={{justifyContent: 'center', top: 200}}
          size={50}
          color="black"
        />
      )}

      <View>
        {!gameOver && !loader && number != totalQuestion - 1 ? (
          <TouchableOpacity onPress={() => nextQuestion()}>
            <Icon
              name="arrowright"
              size={40}
              color="black"
              type="antdesign"
              style={{left: 130, margin: 20}}
            />
          </TouchableOpacity>
        ) : number == totalQuestion - 1 ? (
          <TouchableOpacity onPress={() => startQuiz()}>
            <Icon
              name="controller-play"
              size={40}
              color="black"
              type="entypo"
              style={{left: 130, margin: 20}}
            />
          </TouchableOpacity>
        ) : null}
      </View>
    </View>
  )
}

const styles = StyleSheet.create({
  container: {
    flexDirection: 'row',
    justifyContent: 'space-between',
    marginTop: 70,
    backgroundColor: 'white',
  },
  textstyle: {padding: 15, fontSize: 15, color: 'blue'},
  bottomview: {
    padding: 13,
    backgroundColor: 'blue',
    borderRadius: 300,
    width: 70,
    height: 70,
    position: 'absolute',
    right: 20,
    top: 550,
  },
  questioncontainer: {
    flexDirection: 'row',
    alignItems: 'center',
    backgroundColor: 'white',
    marginTop: 10,
    paddingRight: 16,
  },
  iconstyle: {
    backgroundColor: 'blue',
    borderRadius: 50,
    width: 70,
    height: 70,
    margin: 5,
    top: 100,
    left: 260,
  },
})

export default Quiz

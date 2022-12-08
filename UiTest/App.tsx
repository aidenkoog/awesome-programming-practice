import React, { FC } from 'react';
import {  SafeAreaView,} from 'react-native';
import HeaderClass from './src/presentation/components/Headers';
import Quiz from './src/presentation/screens/Quiz';

const App: FC=() => {
  return (
    <SafeAreaView style={{backgroundColor:'white',flex:1}}>
      <HeaderClass title={"Test App"}/>
     <Quiz/>
    </SafeAreaView>
  );
};

export default App;
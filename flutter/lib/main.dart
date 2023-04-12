import 'package:flutter/material.dart';
import 'package:flutter_exam/example/ToastExam.dart';

void main() {
  runApp(const MyApp());
}

class MyApp extends StatelessWidget {
  const MyApp({super.key});

  @override
  Widget build(BuildContext context) {
    return MaterialApp(
        title: 'Flutter Toast Example by AidenKooG',
        theme: ThemeData(
          primarySwatch: Colors.blue,
        ),
        home: const ToastExam());
  }
}

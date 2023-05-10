// ignore_for_file: avoid_print

import 'package:flutter/material.dart';
import 'package:flutter/rendering.dart';

class ListScrollAndAnimExam extends StatefulWidget {
  const ListScrollAndAnimExam({super.key, required this.title});

  final String title;

  @override
  State<ListScrollAndAnimExam> createState() => _ListScrollAndAnimExamState();
}

class _ListScrollAndAnimExamState extends State<ListScrollAndAnimExam> {
  var scrollController = ScrollController();

  scrollListener() {
    if (scrollController.position.userScrollDirection ==
        ScrollDirection.reverse) {
      print("debug: reverse");
    } else if (scrollController.position.userScrollDirection ==
        ScrollDirection.forward) {
      print("debug: forwart");
    }
  }

  @override
  Widget build(BuildContext context) {
    scrollController.addListener(scrollListener());

    return Scaffold(
        appBar: AppBar(title: const Text('Scrollview')),
        body: NotificationListener<ScrollNotification>(
            onNotification: (scrollNotification) {
              var metrics = scrollNotification.metrics;
              if (metrics.axisDirection != AxisDirection.down) {
                print("up!!!!!!");
              } else if (metrics.axisDirection == AxisDirection.down) {
                print("down!!!!!!");
              }
              if (metrics.extentAfter <= 0) {
                print("dwkoo: aaaaa");
              }
              return false;
            },
            child: ListView(controller: scrollController, children: <Widget>[
              Column(
                  mainAxisAlignment: MainAxisAlignment.center,
                  children: const <Widget>[
                    Square(),
                    Square2(),
                    Square(),
                    Square2(),
                    Square(),
                    Square2(),
                    Square(),
                    Square2(),
                    Square(),
                    Square2(),
                    Square()
                  ])
            ])));
  }
}

class Square extends StatelessWidget {
  const Square({super.key});

  @override
  Widget build(BuildContext context) {
    return Container(
        width: 200,
        height: 100,
        decoration: BoxDecoration(color: Colors.yellow, border: Border.all()));
  }
}

class Square2 extends StatelessWidget {
  const Square2({super.key});

  @override
  Widget build(BuildContext context) {
    return Container(
        width: 200,
        height: 100,
        decoration: BoxDecoration(color: Colors.blue, border: Border.all()));
  }
}

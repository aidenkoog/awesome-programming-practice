import 'package:flutter/material.dart';

class MyHomePage extends StatelessWidget {
  const MyHomePage({
    super.key,
  });

  @override
  Widget build(BuildContext context) {
    return Scaffold(
        appBar: AppBar(title: const Center(child: Text('Flutter App Bar'))),
        body: Stack(
          alignment: Alignment.center,
          children: [
            Container(
              color: Colors.red,
              alignment: Alignment.center,
              width: 100,
              height: 100,
              child: const Text('1'),
            ),
            Container(
              color: Colors.amber,
              alignment: Alignment.center,
              width: 100,
              height: 50,
              child: const Text('2'),
            ),
            Container(
              color: Colors.blue,
              alignment: Alignment.center,
              width: 100,
              height: 70,
              child: const Text('3'),
            )
          ],
        ));
  }
}

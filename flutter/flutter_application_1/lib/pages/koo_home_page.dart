import 'package:flutter/material.dart';

class KooHomePage extends StatelessWidget {
  const KooHomePage({super.key});

  @override
  Widget build(BuildContext context) {
    return Scaffold(
      appBar: AppBar(title: const Text('Koo Home Page')),
      body: Container(
          color: Colors.yellow,
          alignment: Alignment.topCenter,
          padding: const EdgeInsets.symmetric(horizontal: 100, vertical: 50),
          margin: const EdgeInsets.symmetric(horizontal: 100, vertical: 100),
          child: const Text('center')),
    );
  }
}

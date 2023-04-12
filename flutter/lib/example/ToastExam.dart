// ignore: file_names
import 'package:flutter/material.dart';
// ignore: depend_on_referenced_packages
import 'package:fluttertoast/fluttertoast.dart';

class ToastExam extends StatefulWidget {
  const ToastExam({super.key});

  @override
  State<ToastExam> createState() => _ToastExamState();
}

class _ToastExamState extends State<ToastExam> {
  // late keyword
  late FToast fToast;

  // only one called when screen is called first.
  @override
  void initState() {
    super.initState();
    fToast = FToast();
    fToast.init(context);
  }

  // build method is called whenever screen change is detected.
  @override
  Widget build(BuildContext context) {
    return Scaffold(
      appBar: AppBar(),
      body: Column(
        crossAxisAlignment: CrossAxisAlignment.center,
        mainAxisAlignment: MainAxisAlignment.center,
        children: [
          ElevatedButton(
              onPressed: () {
                _showToast();
                _showNormalToast();
              },
              child: const Text('btn')),
          const Center(child: Text('Hello2'))
        ],
      ),
    );
  }

  // show normal toast (cannot be modified)
  void _showNormalToast() {
    Fluttertoast.showToast(
        msg: "Hello AidenKooG",
        toastLength: Toast.LENGTH_SHORT,
        gravity: ToastGravity.CENTER,
        timeInSecForIosWeb: 1,
        backgroundColor: Colors.red,
        textColor: Colors.white,
        fontSize: 16.0);
  }

  // show custom toast (custom position, color, delay time etc)
  void _showToast() {
    Widget toast = Container(
      padding: const EdgeInsets.symmetric(horizontal: 24.0, vertical: 12.0),
      decoration: BoxDecoration(
        borderRadius: BorderRadius.circular(25.0),
        color: Colors.greenAccent,
      ),
      child: Row(
        mainAxisSize: MainAxisSize.min,
        // ignore: prefer_const_literals_to_create_immutables
        children: [
          const Icon(Icons.check),
          const SizedBox(
            width: 12.0,
          ),
          const Text("This is a Custom Toast"),
        ],
      ),
    );

    // bottom center positioned.
    fToast.showToast(
      child: toast,
      gravity: ToastGravity.BOTTOM,
      toastDuration: const Duration(seconds: 2),
    );

    // Custom Toast Position (top, left positioned)
    fToast.showToast(
        child: toast,
        toastDuration: const Duration(seconds: 2),
        positionedToastBuilder: (context, child) {
          return Positioned(
            top: 16.0,
            left: 16.0,
            child: child,
          );
        });
  }
}

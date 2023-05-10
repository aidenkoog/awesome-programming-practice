import 'dart:io';
import 'package:flutter/material.dart';
import 'package:flutter_local_notifications/flutter_local_notifications.dart';

import '../main.dart';

class LocalNotiExam extends StatefulWidget {
  const LocalNotiExam({super.key});

  @override
  State<LocalNotiExam> createState() => _LocalNotiExamState();
}

class _LocalNotiExamState extends State<LocalNotiExam> {
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
              onPressed: () async {
                final notification = flutterLocalNotificationsPlugin;

                // Android notification setting
                const android = AndroidNotificationDetails(
                  '0',
                  'Alarm Test',
                  channelDescription: 'Alarm Test Body',
                  importance: Importance.max,
                  priority: Priority.max,
                );

                // iOS notification setting
                const ios = DarwinNotificationDetails();
                // ignore: unused_local_variable
                const detail = NotificationDetails(
                  android: android,
                  iOS: ios,
                );

                // permission Android always true
                final permission = Platform.isAndroid
                    ? true
                    : await notification
                            .resolvePlatformSpecificImplementation<
                                IOSFlutterLocalNotificationsPlugin>()
                            ?.requestPermissions(
                                alert: true, badge: true, sound: true) ??
                        false;
                // ignore: unnecessary_brace_in_string_interps, avoid_print
                print('permission ${permission}');
              },
              child: const Text('Add alarm')),
          const Center(child: Text('Hello2'))
        ],
      ),
    );
  }
}

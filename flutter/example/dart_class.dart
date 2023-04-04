void main() {
  print('dart class study!!!!!!!');

  Student testStudent = Student(name: 'Koo', age: 48);

  testStudent.name = 'AidenKooG';
  print(testStudent.name);
  testStudent.printInfo();
}

class Student {
  // Student({required this.name, this.age});

  Student({required String name, this.age}) : _name = '$name Student';

  // Student(String name, int age) {
  //   this.name = name;
  //   this.age = age;
  // }

  String _name;
  int? age;

  set name(String value) {
    _name = '$value Student';
  }

  // String get name => _name;
  String get name {
    print('getter $_name');
    return _name;
  }

  void printInfo() {
    print('name: $_name, age: $age');
  }
}

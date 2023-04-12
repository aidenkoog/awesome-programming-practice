void main() {
  print('Dart study');

  Student testStudent = Student(name: 'Koo', age: 48);
  testStudent.name = 'AidenKooG';

  // print information
  print(testStudent.name);
  testStudent.printInfo();
}

class Student {
  Student({required String name, this.age}) : _name = '$name Student';
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

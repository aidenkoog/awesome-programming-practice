void main() {
  print('dart class study!!!!!!!');

  Student testStudent = Student(name: 'Koo', age: 48);
  print('student name: ${testStudent.name}');

  testStudent.name = 'AidenKooG';
  print('student name: ${testStudent.name}');

  testStudent.printInfo();
}

class Student {
  // Student({required this.name, this.age});

  Student({required String name, this.age}) : this.name = '$name Student';

  // Student(String name, int age) {
  //   this.name = name;
  //   this.age = age;
  // }

  String name = 'Koo';
  int? age;

  // set name(value) {
  //   name = value;
  // }

  void printInfo() {
    print('name: $name, age: $age');
  }
}

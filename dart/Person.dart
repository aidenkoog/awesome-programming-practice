class Hero extends Person {
  //Hero(super.name);
  Hero(String name) : super(name: name);

  void fly() {
    print('$name fly');
  }

  @override
  void walk() {
    super.walk();
    print('$name, running');
  }
}

class Person {
  Person({required this.name});

  String name;

  void speak() {
    print('hello I\'m $name');
  }

  void walk() {
    print('$name is walking...');
  }
}

class Koo extends Person {
  Koo(String name) : super(name: name) {
    print('Koooooooo');
  }
}

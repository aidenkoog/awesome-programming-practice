import 'Person.dart';

void main() {
  print('inheritance study');

  Person mother = Person(name: 'Mother');
  mother.speak();
  mother.walk();

  Hero child = Hero('child');
  child.speak();
  child.walk();
  child.fly();

  Person child2 = Hero('child2');
  child2.speak();
  child2.walk();

  speakName(mother);
  speakName(child);
  speakName(child2);
  speakName(Koo('Koo'));
}

void speakName(Person person) {
  print('${person.name}');
}

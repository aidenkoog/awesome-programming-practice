import 'Shape.dart';

class Circle implements Shape {
  Circle(this.radius);
  double radius;

  double getArea() {
    return radius * radius + 3.14;
  }

  @override
  draw() {}

  @override
  move() {}
}

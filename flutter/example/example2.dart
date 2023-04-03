void main() {
  basic1(null);
  numberType();
  boolType();
  listType();
  setType();
  listOperator();
  basicMap();
  mapOperation();
  mapCollectionOperator();
  testNullable();
  finalAndConst();
  print(plusTest(3, 4));
}

int plusTest(int a, int b) {
  print('$a + $b: ${a + b}');
  return a + b;
}

int plus(int additionalValue) {
  int value = 0;
  value += additionalValue;
  return value;
}

String? getName() {
  String? name;
  return name;
}

void finalAndConst() {
  const String name = 'Koo';
  // name = 'Kooooooo';
  print(name);

  final DateTime now1 = DateTime.now();
  print(now1);

  Future.delayed(Duration(seconds: 1), () {
    final DateTime now2 = DateTime.now();
    print(now1);
    print(now2);
  });
}

void testNullable() {
  String name = 'koo';
  Map<String, String> image = {'url': 'aaaaaaa'};
  int year = 2022;
  double latitude = 23.44543;
  List<String> strList = ['1', '2'];
  name = 'kokokokokok';

  print('name: $name, image: $image, ' +
      'year: $year, latitude: $latitude, strList: $strList');

  dynamic varTest = 'Koo';
  varTest = 34342;
  varTest = 23.2;
  print(varTest);

  String? desc;
  print(desc);
}

void mapCollectionOperator() {
  Map<String, dynamic> form = {'name': 'Koo', 'age': 38};
  print(form);
  print(form.keys.toSet());
  print(form.keys.toList());
  print(form.keys);
  print(form.length);
  print(form.values.toList());
}

void mapOperation() {
  Map map = {
    'key1': 'value1',
    'key2': 'value2',
    'key3': 'value3',
  };
  print(map);

  map['name'] = 'Koo';
  print(map);

  map['name'] = 'kooooooo';
  print(map);
}

void basicMap() {
  Map<String, dynamic> joinInputForm = {
    'name': 'Koo',
    'age': 38,
    'height': 170,
    'bool': false,
    'list': [true, true, true],
    'phone': '010-0000-0000'
  };
  print(joinInputForm);
  print(joinInputForm['name']);
  print(joinInputForm['aaa']);
}

void listOperator() {
  List<String> list = [];
  list.add('a');
  list.addAll(['b', 'c', 'a']);
  print(list);
  print(list[0]);
  print(list[2]);
  print(list.length);
  print(list.contains('b'));
  print(list.last);
  print(list.first);
}

void setType() {
  Set set = {};
  set.add(113);
  set.add(112);
  set.add(112);
  print("set: $set");
  print(set.contains(112));

  Set<String> stringSet = <String>{};
  stringSet.add("113");
  print("stringSet: $stringSet");
  print("length: ${set.length}");
  print("set element: ${set.elementAt(0)}");
}

void listType() {
  List list = [];
  print(list);

  list.add("aaaaaaa");
  list.add("bbbbbbb");
  list.add(123);
  print(list);
  print(list.length);

  List<String> stringList = <String>[];
  stringList.add('aaa');
  stringList.add('ccc');
  print(stringList);

  List<int> intList = <int>[];
  intList.add(100);
  print(intList);
}

void boolType() {
  bool isClosed = false;
  print('isClosed = $isClosed');

  bool isTrue = 2 == 2.0 && 3 == 3.3;
  print('isTrue: $isTrue');
}

void numberType() {
  String name = "AidenKooG";
  String nickName = "Koooooo";
  print('name: $name, nickName: $nickName');

  int age = 38;
  double latitude = 24.979678;
  print('age: $age, latitude: $latitude');
  print('age: ' + age.toString() + ', latitude: ' + latitude.toString());
  print('age: ${age + 1}');

  latitude += 1;
  latitude++;
  print('latitude: $latitude');
  print('divide: ${5 / 3}');
}

void basic1(params) {
  var name = 'test';
  var year = 2022;
  var floatValue = 3.5;
  var testArray = ['test1', 'test2', 'test3'];
  var imageObject = {
    'tags': ['koo'],
    'url': '//path/to/xxx.jpg'
  };
  print("name: " +
      name +
      "year: " +
      year.toString() +
      ", floatValue: " +
      floatValue.toString());
  print(testArray[0]);
  print(imageObject);
  print(imageObject['tags']);
}

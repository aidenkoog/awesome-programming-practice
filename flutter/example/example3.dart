void main(List<String> args) {
  functionName();
  var variableName = 'value';
  variableName = 'kokokokok';
  print('$variableName');

  List<String> list = <String>['001', '002'];
  String listName = '${list[0]} list item';
  print('listName: ${listName.length}');

  list.removeWhere((element) => element.contains('001'));
  print(list);

  Map<String, String> map = <String, String>{"koo": '100'};
  var length = map.length;
  map.update('koo', (value) => value.toUpperCase());
  print(length);
}

void functionName() {}

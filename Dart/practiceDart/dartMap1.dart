void main() {
  var myMap = {"Name": "Milon Mondal", "Id": 18, "Last Name": "Tapu"};

  print(myMap);
  print(myMap.values);
  print(myMap.keys);
  print(myMap.length);
  myMap.addAll({"N": "Mi", "I": 29});
  print(myMap);
  print(myMap.isEmpty);
  print(myMap.isNotEmpty);
  print(myMap.hashCode);
  print(myMap.remove("N"));
  print(myMap);
  // print(myMap.entries)
  // print(myMap.runtimeType);
  // print(myMap.putIfAbsent(key, () => null))
  // print(myMap.cast());
  print(myMap.containsKey("Id"));
  print(myMap.containsValue("Milon"));
  // print(myMap.forEach();
  // print(myMap.map((key, value) => null));
  // print(myMap.removeWhere((key, value) => false));
  // print(myMap.updateAll((key, value) => null));
  // print(myMap.noSuchMethod(invocation));
  // print(myMap.toString());

  var newMap = new Map();
  newMap["Name"] = "Milon";
  newMap["ID"] = 18;
  newMap["Last Name"] = "Tapu";
  print(newMap);
  newMap["Id"] = 28;
  print(newMap);
  newMap["title"] = "Mondal";
  print(newMap);
  print(newMap.keys);
}

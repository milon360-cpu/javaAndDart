void main() {
  var myMap = new Map();
  myMap["Name"] = "Milon";
  myMap["ID"] = 18;

  print(myMap.keys);
  print(myMap.values);
  print(myMap.length);
  myMap.addAll({"name_": "Tapu", "ID_": "28"});
  print(myMap);
  myMap.remove("Tapu_");
  myMap.clear();
  print(myMap);
}

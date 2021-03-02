void main() {
  var myMap = {'Name': "Jomil Uddin", 'ID': 73874, 'Dept': "CSE"};

  print(myMap);
  myMap['Name'] = "Tapu";
  print(myMap);
  myMap['ID'] = 545;
  print(myMap);
  print(myMap.isEmpty);
  print(myMap.keys);
  print(myMap.values);

  var constractonMap = new Map();
  constractonMap["Name"] = "Milon Mondal";
  constractonMap["Name"] = "Milon";
  print(constractonMap);
  print(constractonMap.keys);
}

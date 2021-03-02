void main() {
  var myList = new List();
  myList.add(10);
  myList.add("Milon");
  myList.add("Tapu");
  myList.add("Rahim");
  myList.add(3.5);
  myList.add(6.7);
  myList.add(67);
  myList.add(100);
  print(myList);
  myList.addAll(['M', 'I', 'L', 'O', 'N']);
  print(myList);
  myList.insert(0, "ami First");
  print(myList);
  myList.replaceRange(0, 2, ["Ami First Replace", "Ami Second Replace"]);
  print(myList);
}

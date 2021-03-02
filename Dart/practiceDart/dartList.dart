void main() {
  var number =
      new List(); // it's call gawable list which is doesn't fixed length.
  //var number = new List(5); it's call fixed list

// add() Method
  number.add(10);
  number.add("Milon");
  number.add(30);
  number.add(50);
  print(number);
  int len = number.length;
  print("length of list:\t${len}");
  // isEmpty
  print(number.isEmpty);
  print(number.isNotEmpty); // two same methods return boolean type return data.
  // print("${number.single}"); // Problem is here find it.

// addAll([]); Method
  var myList_ = new List();
  myList_.addAll(["Milon", "Ria", 18, 28, "Tapu", "Sakina"]);
  myList_.add(100);
  print(myList_);

  myList_.insert(6, "Jorina");
  print(myList_);

  myList_.insertAll(0, ['M', 'I', 'L', 'O', 'N']);
  print(myList_);

// Remove Methods
  myList_.remove('N');
  print(myList_);

  myList_.removeAt(6);
  print(myList_);

  // Replace Range
  myList_.replaceRange(0, 4, ['T', 'A', 'P', 'U']);
  print(myList_);

  myList_.removeLast();
  print(myList_);

  // myList_.clear();
  // print(myList_.isEmpty);

  var element = myList_.getRange(0, 1);
  print(element);
  // Reverse List

  var reserseList = new List.from(myList_.reversed);
  print(reserseList);

  var newList = new List();
  newList.addAll([10, 20, 4, 1, 53, 45]);
  newList.sort();
  print(newList);
  var newReverse = new List.from(newList.reversed);
  print(newReverse);
}

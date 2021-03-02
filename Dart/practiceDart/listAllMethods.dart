void main() {
  var myList = new List(3);
  myList[0] = 10;
  myList[1] = 20;
  myList[2] = 30;
  // myList[3] = 40;
  print(myList);

  var myList_ = new List();
  myList_.add(100);
  myList_.add(200);
  myList_.add(300);
  myList_.add(400);
  myList_.add(500);
  print(myList_);
  print(myList_.length);
  // print(myList_.hashCode);
  print(myList_.isEmpty);
  print(myList_.isNotEmpty);
  print(myList_.remove(300));
  print(myList_);
  print(myList_.removeAt(1));
  print(myList_);
  print(myList_.getRange(1, 2));

  var newList = new List();
  newList.add(10);
  newList.add(20);
  newList.add(30);
  newList.add(40);
  newList.add(50);
  print(newList);
  newList.removeLast();
  print(newList);
  newList.insert(3, 1000);
  newList.insertAll(3, [20, "Sakina", "jarina", 50]);
  print(newList);
  print(newList.indexOf(50));
  print(newList.lastIndexOf(30));
  newList.replaceRange(1, 4, ['M', 'i', 'l']);
  print(newList);

  // newList.clear();
  // print(newList);
  newList.forEach((element) => print(element));
}

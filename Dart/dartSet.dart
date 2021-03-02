void main() {
  var mySet = new Set();
  mySet.add(100);
  mySet.add(200);
  mySet.add(400);
  mySet.add(300);
  print(mySet);

  var mySet_ = new Set.from([10, 20, 30]);
  print(mySet_);

  var myValue;
  for (myValue in mySet) {
    print(myValue);
  }
}

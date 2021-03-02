void main() {
  var str = "Milon Mondal";
  var str1 = "Tapu";
  var str2 = "   Milon Mondal Tapu";
  print(str.codeUnits);
  print(str.hashCode);
  print(str.isEmpty);
  print(str.isNotEmpty);
  print(str.length);
  print(str.runes);
  print(str.codeUnitAt(2));
  print(str.compareTo(str1));
  print(str.contains('M'));
  print(str.endsWith('l'));
  print(str.indexOf(' '));
  print(str.lastIndexOf('l'));
  // print(str.padLeft(5));  don't know
  // print(str.padRight())
  print(str.replaceAll('M', 'xx')); // Practice korte hobe onak bar,
  // print(str.replaceAllMapped(from, (match) => null))
  print(str1.replaceFirst('T', 'XX'));
  // print(str.replaceFirstMapped(from, (match) => null))
  print(str.replaceRange(0, 3, "xxx"));
  print(str2.split(" "));
  // print(str.splitMapJoin(pattern))
  print(str.startsWith('M'));
  print(str.substring(4));
  print(str2.trim());
  print(str2.trimLeft());
  print(str2.trimRight());
  print(str.allMatches(str2));
  // print(str.matchAsPrefix(string))
  // print(str.noSuchMethod(invocation))
  var x = 10;
  print(x.toString());
}

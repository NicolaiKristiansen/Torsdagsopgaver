String DK = "Denmark";
String CapDK = "København";
String Bel = "Belgien";

void setup() {
  //Choose what letters you want back from a word
  String newWord = printPartOfWord(DK, -8, 7);
  println(newWord);
  println();
  //Get only the last 4 letters of a word
  newWord = printPartOfWord(Bel, Bel.length()-4, Bel.length());
  println(newWord);
}

String printPartOfWord(String word, int startIndex, int slutIndex) {
  //Check if startIndex is a negative number or bigger than slutIndex
  if (startIndex >= slutIndex || startIndex < 0) {
    return "These are not usable numbers. First number must not be negative or bigger than last number";
  } else {
    return word.substring(startIndex, slutIndex);
  }
}

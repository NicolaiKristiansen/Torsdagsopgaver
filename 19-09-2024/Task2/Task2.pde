void setup(){
  println(sum(2,6));
  println(upCase("denmark"));
  //Task2.e
  println(isFirstLetterBig("fevin"));
}
//Task2.b
int sum(int a, int b){
  int total = a + b;
  return total;
}
//Task2.c
String upCase(String word){
  String newWord = word.toUpperCase();
  return newWord;
}
//Task2.d
boolean isFirstLetterBig(String word){
  String upperCaseWord = word.toUpperCase();
  if(word.charAt(0) == upperCaseWord.charAt(0)){
    return true;
  }
  else{
    return false;
  }
}

ArrayList<Integer> nr = new ArrayList<Integer>();
ArrayList<String> words = new ArrayList<String>();
ArrayList<Boolean> tOrF = new ArrayList<Boolean>();

int sum;
int sum_;
int average;
void setup() {
  //Adding to the arraylist nr
  nr.add(3);
  nr.add(2);
  nr.add(895);
  //Adding to the arraylist words
  words.add("Amazoness");
  words.add("Transforming Weapon");
  words.add("Problematic Weather");
  //Adding to the arraylist tOrF
  tOrF.add(true);
  tOrF.add(true);
  tOrF.add(false);

  printArrayList(words);
  sumTotal(nr);
  average(nr);
}

void printArrayList(ArrayList<String> wordsandsuch) {
  println(wordsandsuch);
}

void sumTotal(ArrayList<Integer> numbers) {
  for (int i = 0; i < numbers.size(); i++) {
    sum = sum + numbers.get(i);
  }
  println(sum);
}

void average(ArrayList<Integer> numbers){
  for(int i = 0; i < numbers.size(); i++){
    sum_ = sum_ + numbers.get(i);
    average = sum_ / numbers.size();
  }
  println(average);
}



void setup() {
  nr(55);

}

int nr(int a) {
  if (a > 0) {
    println(a);
    return a + nr(a-1);
  }
  else{
    return 0;
  }
}

//4.a
for (int i = 0; i <= 20; i++) {
  println(i);
}
//4.b
for (int d = 0; d <= 20; d++) {
  if (d % 2 == 0) {
    println(d);
  }
}
//4.c
int start;
for (start = 20; start >= 0; start--) {
  if (start == 0) {
    println("Take Off");
  } else if (start == 3) {
    println("three");
  } else if (start == 2) {
    println("two");
  } else if (start == 1) {
    println("one");
  } else {
    println(start);
  }
}
//4.d.p1
int a = 0;
while (a <= 20) {
  println(a);
  a++;
}
//4.d.p2
int start2 = 20;
while (start2 >= 0) {
  if(start2 == 3){
    println("Three");
  }
  else if(start2 == 2){
    println("Two");
  }
  else if(start2 == 1){
    println("One");
  }
  else if(start2 == 0){
    println("TAKE OFF!");
  }
  else{
    println(start2);
  }
  start2--;
}

/*
int a = -5;
int b = 15;
//3.a
if(a + b == 10 || a == 10 || b == 10 ){
  println("Success!");
}
else{
  println("Failure!");
}
*/
//3.b
/*
int max = 6;
int min = 4;
if(min + max > 10){
  if(max <= 5 || min <= 5){
    println("Success!");
  }
  else{
    println("Failure!");
  }
}
else{
  println("Failure!");
}
*/
//3.c
int x = 15;
int y = 15;
int z = 0;
if(x + y + z == 30){
  if(x == 10 || x == 20 || x == 30){
    println("Failure!");
  }
  else if(y == 10 || y == 20 || y == 30){
    println("Failure!");
  }
  else if(z == 10 || z == 20 || z == 30){
    println("Failure!");
  }
  else{
    println("Success!");
  }
}
else{
  println("Failure!");
}

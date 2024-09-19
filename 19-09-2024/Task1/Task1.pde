void setup(){
  hello();
  recieve("Guten tag");
  nameAndage("Nicolai", 21);
}
//1.b
void hello(){
  println("Hello from the method");
}
//1.c
void recieve(String a){
  println(a);
}
//1.d
void nameAndage(String name, int age){
  println("My name is " + name + ", I am " + age + " years old");
}

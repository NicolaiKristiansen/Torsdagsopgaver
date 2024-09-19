String address;
int gangeTal;
int dividerTal;
String besked;

void setup(){
  address = "Storebjerg";
  gangeTal = 2*3;
  dividerTal = 10/2;
  besked = "Hello good friend of mine. You owe me 20 ducks and no that was not a typo";
  address = address + "Hedelunden";
  gangeTal = gangeTal + 85*4;
  dividerTal = dividerTal + 32/6;
  besked = besked + ". Du glemte at mutere dem så de liner små kaijus";
  println("Address: " + address);
  println("Gangetal: " + gangeTal);
  println("Dividertal: " + dividerTal);
  println("Besked til bruger: " + besked);
  int plus = -1;
  int samletTal = gangeTal+plus+dividerTal+plus;
  println(samletTal);
  
}

//Exercise 1 & 2
String city = "Casablanca";
int charCount  = city.length();
char myIndex = city.charAt(4);
char myChar = city.charAt(1);
String cityNickName = city.replace('a', 'y');
int circleCount;


void setup(){
  frameRate(1);
  size(400,400);
  // Exercise 3 & 4
  println(charCount);
  // Exercise 5
  println(myIndex);
  // Exercise 6
  println(myChar);
  // Exercise 7
println(city.toUpperCase());
  // Exercise 8
  println(cityNickName);
  
}

void draw(){
  // Tegn så mange cirkler som der er bogstaver i city
  circleCount = circleCount == 0 ? 0 : circleCount + 1;
  ellipse(random(width),random(height),50,50);
  circleCount = circleCount == 0 ? circleCount + 1 : circleCount;
  if(circleCount == charCount){
    noLoop();
  }
}

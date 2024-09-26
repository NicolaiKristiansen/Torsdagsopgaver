class Square{
  int xpos;
  int ypos;
  
  Square(int x, int y){
    xpos = x;
    ypos = y;
  } 
  //Lav en funktion der bruger en gemt Square objects x og y værdier
  void display(int x, int y){
    rect(x, y, 20, 20);
  }
}

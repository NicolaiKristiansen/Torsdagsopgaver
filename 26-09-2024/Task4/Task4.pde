//Make a global array
Square[] squares = new Square[10];

void setup(){
  size(400,400);
  //Make a local array
  Square[] square = new Square[5];
  
  //Istanciere to Square objects og gem dem i square array position 0 og 1
  square[0] = new Square(50, 80);
  square[1] = new Square(150, 230);
  
  //Display one square from square array
  square[0].display(square[0].xpos,square[0].ypos);
  
  //Generate 10 random positions for squares array
  for(int i = 0; i < squares.length; i++){
    squares[i] = new Square(int(random(width)), int(random(height)));
    squares[i].display(squares[i].xpos, squares[i].ypos);
  }
}

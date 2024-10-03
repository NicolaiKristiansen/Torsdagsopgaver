int[][] chessboard = new int[8][8];
int s = 40;

void setup(){
  fullScreen();
  for(int i = 0; i < chessboard.length; i++){
    for(int j = 0; j < chessboard.length; j++){
      if(i%2 == 0){
        //Lige rækker
        if(j % 2 == 0){
          //De sorte felter i den lige rækkke
          chessboard[i][j] = 0;
        } else{
        //De sorte felter i den lige række
      chessboard[i][j] = 1;
    }
      } else{
        //De ullige rækker
        if(j%2 != 0){
          //De hvide felter i den ulige række
          chessboard[i][j] = 0;
        } else{
          //De sorte felter i den ulige række
          chessboard[i][j] = 1;
        }
      }
      print(chessboard[i][j] + " ");
    }
    println();
  }
}

void draw(){
  for(int i = 0; i < chessboard.length; i++){
    for(int j = 0; j < chessboard.length; j++){
      if(chessboard[i][j] == 0){
        fill(0);
      } else{
        fill(255);
      }
      rect(j*s, i*s, s, s);
    }
  }
}

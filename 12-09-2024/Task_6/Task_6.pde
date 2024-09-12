int redOn = color(255,0,0);
int yellowOn = color(230,255,0);
int greenOn = color(0,255,0);
int off = color(185);

void setup() {
  size(400, 400);
  background(255);
  rectMode(CENTER);
  fill(0);
  rect(width/2, height/2, width/2, height);
}

void draw() {
  
  switch(frameCount%400){
    case 1:
    fill(redOn);
    ellipse(width/2, height*0.25, 100, 100);
    fill(off);
    ellipse(width/2, height*0.50, 100, 100);
    ellipse(width/2, height*0.75, 100, 100);
    break;
    case 100:
    fill(off);
    ellipse(width/2, height*0.25, 100, 100);
    fill(yellowOn);
    ellipse(width/2, height*0.50, 100, 100);
    fill(off);
    ellipse(width/2, height*0.75, 100, 100);
    break;
    case 300:
    fill(off);
    ellipse(width/2, height*0.25, 100, 100);
    ellipse(width/2, height*0.50, 100, 100);
    fill(greenOn);
    ellipse(width/2, height*0.75, 100, 100);
    break;
    default:
    println(frameCount%400);
    break;
    
  }
  
}

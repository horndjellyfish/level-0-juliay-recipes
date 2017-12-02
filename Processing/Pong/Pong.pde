void setup() {
  size(500, 500);
}
int ypos = 250;
int xpos = 250;
int ySpeed = 3;
int xSpeed = 3; 
int paddleX = 0;
void draw() {
  background(0, 233, 233);
  ellipse(xpos, ypos, 35, 35);
  xpos = xpos+xSpeed;
  ypos = ypos+ySpeed;
  System.out.println("xpos =" + xpos);
  System.out.println("width =" + width);
  if (xpos > width || xpos < 0) {
    xSpeed = -xSpeed;
  }
  if (ypos < 0 || intersects (xpos, ypos, mouseX, 475, 125)) {
  ySpeed = -ySpeed;
  }
  
  if (mouseX + 125 < width) {
    paddleX = mouseX;
  }
  rect(paddleX, 475, 125, 30);
}
boolean intersects(int ballx, int bally, int paddlex, int paddley, 
int paddleLength) {
  if (bally > paddley && ballx > paddlex && ballx < paddlex + paddleLength)
    return true;
  else   
    return false;
}


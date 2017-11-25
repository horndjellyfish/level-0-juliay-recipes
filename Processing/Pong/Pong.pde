void setup() {
  size(500, 500);
}
int xpos = 250;
int xSpeed = 10; 
void draw() {
  background(0, 233, 233);
  ellipse(250, 250, 35, 35);
  if (xpos > width) {
        xSpeed = -xSpeed;
  }
  if (xpos > height) {
        xSpeed = -xSpeed;
  }
  rect(mouseX, 475, 125, 30);
  boolean intersects(int ballx, int bally, int paddlex, int paddley, 
  int paddleLength) {
    if (bally > paddley && ballx > paddlex && ballx < paddlex + paddleLength)
          return true;
       else   
          return false;
          
  }
}

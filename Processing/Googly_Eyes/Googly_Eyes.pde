int pupilX;
int pupilY;
void setup() {
  size (800, 300);
}
void draw() {
  background(0, 233, 233);
  fill(255, 255, 255);
  stroke(0);
  ellipse(250, 150, 200, 120);
  ellipse(550, 150, 200, 120);
  fill(0, 0, 0);
  pupilX = mouseX;
  pupilY = mouseY;
  if (mouseX < 180) {
    pupilX = 180;
  } else if (mouseX > 320) {
    pupilX = 320;
  } else {
    pupilX = mouseX;
  }
  if (mouseY < 130) {
    pupilY = 130;
  } else if (mouseY > 170) {
    pupilY = 170;
  } else {
    pupilY = mouseY;
  }
  ellipse(pupilX, pupilY, 60, 60);
  ellipse(pupilX + 300, pupilY, 60, 60);
}
//boolean border


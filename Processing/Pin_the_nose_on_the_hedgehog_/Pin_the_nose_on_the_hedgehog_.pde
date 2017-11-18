boolean mousePress = false;
int rMouseX;
int rMouseY;
PImage hedgehog;
PImage nose;
void setup() {
  hedgehog = loadImage("hedgehog.jpeg");
  background(hedgehog);
  size(300, 168);
  nose = loadImage("hedgehognose.jpeg");
}
void draw() {

  //image(nose, mouseX-10, mouseY-20);
  rect(0, 0, 30, 30);
  if (mouseX > 0 && mouseX < 25 && mouseY > 0 && mouseY < 25) {
    background(hedgehog);
  } else {
    if (mousePress == true) {
      image(nose, rMouseX, rMouseY);
    } else if (mousePressed == true) {
      mousePress = true;
      rMouseX = mouseX;
      rMouseY = mouseY;
    } else if (mouseX > 50 && mouseX < 80 && mouseY > 50 && mouseY < 80 && mousePressed == true) {
      image(nose, mouseX, mouseY);
    } else {
      background(0);
    }
  }
}
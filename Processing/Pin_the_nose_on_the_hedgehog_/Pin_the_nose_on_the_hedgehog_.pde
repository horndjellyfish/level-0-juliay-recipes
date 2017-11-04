PImage hedgehog;
PImage nose;
void setup() {
  hedgehog = loadImage("hedgehog.jpeg");
  background(hedgehog);
  size(300, 168);
  nose = loadImage("hedgehognose.jpeg");
}
void draw() {
  image(nose, mouseX-10, mouseY-20);
  rect(0, 0, 30, 30);
  if (mouseX > 0 && mouseX < 30 && mouseY > 0 && mouseY < 30) {
    background(hedgehog);
  } else {
    background(0);
    if (mouseX > 60 && mouseX < 70 && mouseY > 60 && mouseY < 70 && mousePressed == true) {
      image(nose, 62, 67);
    }
  }
}
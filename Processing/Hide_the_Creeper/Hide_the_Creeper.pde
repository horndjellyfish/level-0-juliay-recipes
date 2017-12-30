PImage creeper;
int creeperx = 250;
int creepery = 250;
boolean findcreeper = false;
void setup() {
  size (500, 500);
  PImage minecraft = loadImage ("background.jpeg");
  minecraft.resize (width, height);
  background (minecraft);
  creeper = loadImage("creeper.png");
  creeper.resize (70, 70);
  
}
void draw() {
  PImage minecraft = loadImage ("background.jpeg");
  minecraft.resize (width, height);
  background (minecraft);
  if (findcreeper == true) {
    image (creeper, creeperx, creepery);
    fill(0, 255, 0);
    textSize(40);
    text("You found the creeper!", 35, 100);
  }
}
void mousePressed() {
  fill (255, 0, 0);
  ellipse (mouseX, mouseY, 20, 20);
  if (mouseX > 0 && mouseY < 70 && mouseY > 0 && mouseY < 70) {
    fill (0, 255, 0);
    ellipse (mouseX, mouseY, 20, 20);
  }
  if (mouseX > 200 && mouseX < 350 && mouseY > 200 && mouseY < 350) {
    fill (0, 255, 0);
    ellipse (mouseX, mouseY, 20, 20);
  }
  
  if (mouseX > 250 && mouseX < 300 && mouseY > 250 && mouseY < 300) {
    findcreeper = true;
    
  }
}

boolean isNear (int a, int b) {
  if (abs(a - b) < 10)
    return true;
  else 
    return false;
}


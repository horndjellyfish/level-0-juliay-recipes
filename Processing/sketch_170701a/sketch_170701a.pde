import ddf.minim.*;
Minim minim = new Minim(this);   
AudioSample doh = minim.loadSample("/Users/League/Google Drive/league-sounds/homer-doh.wav");
AudioSample woohoo = minim.loadSample("/Users/League/Google Drive/league-sounds/homer-woohoo.wav");  
void setup() {  
  PImage waldo = loadImage("wheres_waldo.jpg");
  size(1024, 768);
  image(waldo, 0, 0);
}
int lefttopx = 512;  
int leftbotx = 518;
int righttopx = 545;
int rightbotx = 546;
int lefttopy = 376;
int leftboty = 414;
int righttopy = 377;
int rightboty = 416;

void draw() {
  println("X: " + mouseX + " Y: " + mouseY); 
  if (mousePressed) {
  
  if ((mousePressed) && (mouseX > lefttopx) && (mouseX < righttopx) && (mouseX > leftbotx) && (mouseX < rightbotx) && (mouseY > lefttopy) && (mouseY > righttopy) && (mouseY < leftboty) && (mouseY < rightboty)) {
  playWoohoo();
  } 
  else {
   playDoh(); 
  }  
  }
  }
  void playWoohoo() {
  woohoo.stop();
  woohoo.trigger(); 
  }
  void playDoh() {
  doh.stop();
  doh.trigger();  
  }
    
  
  
    




 




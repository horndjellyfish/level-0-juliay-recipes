void setup() {
  size(800, 800);
}
 
void draw() {
  
   //2. make it a nice color
 
   //3. if the mouse is pressed, fill the circle with a different color          
 
   //1. draw an ellipse
   fill(0, 255, 255);
   ellipse(400, 400, 200, 200);
   if (mousePressed) {
   fill(0, 255, 0);
   ellipse(400, 400, 200, 200);
}
}


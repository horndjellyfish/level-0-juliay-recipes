//Make three overlapping circles.
// 
//Give them nice colors. For transparency use: fill(100, 200, 100, 80)
// 
//Label each circle with a part of your personality using the text command.
//text(“what you want to write”, xPosition, yPosition)
// 
//Print out your diagram and tape it to the whiteboard. 
//Other people in the classroom have to guess which diagram belongs to which person.

void setup() {
size (700, 700);
}
void draw() {
 fill (200, 700, 400, 80);
 ellipse (300, 200, 300, 300);
 fill (100, 200, 100, 80);
 ellipse (200, 300, 300, 300);
 fill (700, 100, 100, 80);
 ellipse (400, 300, 300, 300);
 fill (0, 255, 0);
 text ("Creative", 425, 350);
 fill (200, 700, 400);
 text ("Clingy", 150, 350);
 fill (255, 0, 0);
 text ("Weird", 285, 100);
}
 


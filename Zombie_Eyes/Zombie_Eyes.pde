void setup(){
  PImage face = loadImage("Zombie Eyes.jpg");
  image(face, 0, 0);
  size(1080, 720);
  face.resize(1080, 720);
}
void draw() {
 fill(mouseX,mouseY,112);
//ellipse(x,y, width, height  
ellipse(635, 307, 25, 25);
ellipse(754, 309, 25, 25);
fill(0,0,0);
ellipse(635, 307, 12, 12);
ellipse(754, 309, 12, 12);
}
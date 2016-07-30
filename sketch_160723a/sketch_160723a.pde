void setup(){
  size(800,800);
  fill(221,119,85);
  ellipse(300,300,600,600);
  fill(255,0,0);
  ellipse(300,300,550,550);
  fill(221,255,0);
  ellipse(300,300,545,545);
  
}
void draw(){
  if(mousePressed){
    PImage pepperoni = loadImage ("pepperoni.ppm.gif");
    pepperoni.resize(100,100);
    image(pepperoni, mouseX, mouseY);
    PImage bacon = loadImage ("bacon.ppm.gif");
    bacon.resize(100,100);
    image(bacon, mouseX, mouseY);
  }
  
}


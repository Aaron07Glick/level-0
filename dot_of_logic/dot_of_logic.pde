void setup() {
  size(800, 800);
  
}


void draw() {
  
   //2. make it a nice color
//(255,0,255);
   //3. if the mouse is pressed, fill the circle with a different color          
   if (mousePressed == true){
   fill(0);
   }
   else{
   fill(255);
   }
   //1. draw an ellipse
ellipse (10,10,50,50);
}
// Copyright Wintriss Technical Schools 2013
//void mouseClicked(){
//if (value == 0) {
//valuve = 255;
//}
//else {
///value = 0;
//}
//}

void setup (){
}
void draw (){
  noFill();
  for (int i = 100; i > 1; i=i-15) {
    int a = i % 2;
    println(a);
    if (a==0){ 
      fill(255,0,0);
    }
    if(a==1){
      fill(0,0,0);
    }
    ellipse (50,50,i,i);
    
  }
}


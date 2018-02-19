int x=541;
int y=575;
int a=5;
PImage catPic;
void setup(){
  size(1300,866);
  catPic = loadImage("cat.png");
           catPic.resize(1300,866);
           background(catPic);
}

void draw(){
noStroke();
ellipse(x, y, 75, 75);
fill(200, 00, 00);
ellipse(x+196, y+30, 75, 75);
fill(200, 00, 00);
}

void keyPressed(){
a=a+1;
x=x-(1*a);
y=y-(1*a);
}
void setup() {
  size (500, 500);
}
int raindropy = 25;
void draw() {
  background(169, 225, 255);
  fill (51, 153, 255);
  stroke(0, 0, 0);
  ellipse(25, raindropy, 15, 38);
  raindropy = raindropy + 10;
  
}
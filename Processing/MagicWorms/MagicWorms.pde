void setup() {
  size(500, 500);
  background(85, 153, 255);
}            
void draw() {
  float x = random(500);
  float y = random(500);
  //fill(255, 0, 0);
  //ellipse(x, y, 55, 55);
  //fill(255, 137, 0);
  //ellipse(x, y, 55, 55);
  //fill(255, 255, 0);
  //ellipse(x, y, 55, 55);
  //fill(0, 204, 0);
  //ellipse(x, y, 55, 55);
  fill(0, 0, 230);
  ellipse(x, y, 55, 55);
  //fill(127, 0, 255);
  //ellipse(x, y, 55, 55);
}
float frequency = .001;
float noiseInterval = PI;

void makeMagical() {
     fill( 0, 0, 0, 10 );
     rect(0, 0, width, height);
     noStroke();
}

float getWormX(int i) {
     return map(noise(i*noiseInterval + frameCount * frequency), 0, 1, 0, width);
}

float getWormY(int i) {
     return map(noise(i*noiseInterval+1 + frameCount * frequency), 0, 1, 0, height);
}
void setup() {
  size(500, 500);
  background(85, 153, 255);
}            
void draw() {
  float inX = random(500);
  float x = getWormX(inX);
  float inY = random(500);
  float y = getWormX(inY);
  fill(0, 120, 255);
  int ellipseX = 55;
  int ellipseY = 55;
  for (int i = 0; i < 6; i++) {
    ellipse(ellipseX, ellipseY, 55, 55);
    ellipseX = ellipseX + 42;
    ellipseY = ellipseY + 42;
  }
  //ellipse(x, y, 55, 55);
  //fill(255, 137, 0);
  //ellipse(x, y, 55, 55);
  //fill(255, 255, 0);
  //ellipse(x, y, 55, 55);
  //fill(0, 204, 0);
  //ellipse(x, y, 55, 55);
  //fill(0, 0, 230);
  //ellipse(x, y, 55, 55);
  //fill(127, 0, 255);
  //ellipse(x, y, 55, 55);
  makeMagical();
}
float frequency = .001;
float noiseInterval = PI;

void makeMagical() {
     fill( 0, 0, 0, 10 );
     rect(0, 0, width, height);
     noStroke();
}

float getWormX(float i) {
     return map(noise(i*noiseInterval + frameCount * frequency), 0, 1, 0, width);
}

float getWormY(float i) {
     return map(noise(i*noiseInterval+1 + frameCount * frequency), 0, 1, 0, height);
}
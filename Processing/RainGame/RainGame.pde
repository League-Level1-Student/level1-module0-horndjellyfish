int score;
int x;
void checkCatch(int x) {
if (x > mouseX && x < mouseX+100)
    score++;
  else if (score > 0) 
    score--;
  println("Your score is now: " + score);
  }

void setup() {
  size (500, 500);
}
int raindropX = (int) random(500);
int raindropY = 25;
void draw() {
  background(169, 225, 255);
  fill (51, 153, 255);
  stroke(0, 0, 0);
  ellipse(raindropX, raindropY, 15, 38);
  raindropY = raindropY + 8;
  if(raindropY > 500) {
    fill(51, 153, 255);
    stroke(0, 0, 0);
    ellipse(raindropX = (int) random(500), raindropY, 15, 38);
    raindropY = 0;
  }
    if (raindropY >= 450) {
    checkCatch(x);
  }
  fill(173, 176, 181);
  rect(mouseX, 450, 70, 200);
  fill(0, 0, 0);
  textSize(16);
  text("Score: " + score, 20, 20);
}
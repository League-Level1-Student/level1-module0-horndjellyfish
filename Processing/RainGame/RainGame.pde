int score;
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
int raindropy = 25;
void draw() {
  int randomNumber = (int) random(width);
  background(169, 225, 255);
  fill (51, 153, 255);
  stroke(0, 0, 0);
  ellipse(randomNumber, raindropy, 15, 38);
  raindropy = raindropy + 10;
  for (int i = 0; i < 1; i ++) {
    fill(51, 153, 255);
    stroke(0, 0, 0);
    ellipse(randomNumber, raindropy, 15, 38);
    raindropy = raindropy + 10;
  }
  fill(173, 176, 181);
  rect(mouseX, 450, 70, 200);
  fill(0, 0, 0);
  textSize(16);
  text("Score: " + score, 20, 20);
}
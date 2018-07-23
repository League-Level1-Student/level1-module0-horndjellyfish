PImage pictureOfRecord;
import ddf.minim.*;
Minim minim;
AudioPlayer song;
int imageAngle = 270;
void setup() {
  pictureOfRecord = loadImage("record.jpg");
  size(501, 501);
  minim = new Minim(this);
  song = minim.loadFile("DontStopMeNow.mp3");
  song.play();
}
void draw() {
  image(pictureOfRecord, 0, 0);
  imageAngle = imageAngle + 5;
  if (mousePressed) {
    mousePressed();
    song.play();
  }
  else {
    song.pause();
  }
}
void rotateImage(PImage image, int amountToRotate) {
  translate(width/2, height/2);
  rotate(amountToRotate*TWO_PI/360);
  translate(-image.width/2, -image.height/2);
}
void mousePressed() {
  rotateImage(pictureOfRecord, imageAngle);
  image(pictureOfRecord, 0, 0);
}
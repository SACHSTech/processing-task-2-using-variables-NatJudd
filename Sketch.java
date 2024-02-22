import processing.core.PApplet;

 /**
   * Draw a house
   * @author:n.judd
   */

public class Sketch extends PApplet {
  // variables
  int intH = 2;
  int intW = 2;

  // size of the image
  public void settings() {
    size(600 * intW, 500 * intH);
  }

  // sets background colour
  public void setup() {
    background(66, 182, 245);
  }

  // draws house
  public void draw() {
    // base and ceiling
    stroke(255);
    line((175 * intW), (450 * intH), (425 * intW), (450 * intH));
    line((175* intW), (225 * intH), (425 * intW), (225 * intH));
    // walls
    line((175 * intW), (450 * intH), (175 * intW), (225 * intH));
    line((425 * intW), (450 * intH), (425 * intW), (225 * intH));
    // roof
    triangle((175 * intW), (225 * intH), (425 * intW), (225 * intH), (300 * intW), (100 * intH));
    // door
    line((275 * intW), (375 * intH), (275 * intW), (450 * intH));
    line((325 * intW), (375 * intH), (325 * intW), (450 * intH));
    line((275 * intW), (375 * intH), (325 * intW), (375 * intH));
    // doornob
    ellipse((315 * intW), (415 * intH), (8 * intW), (8 * intH));
  }
}
import processing.core.PApplet;

 /**
   * Draw a house
   * @author:n.judd
   */

public class Sketch extends PApplet {
  // variables
  int intH = 1;
  int intW = 1;

  // size of the image
  public void settings() {
    size(600 * intW, 600 * intH);
  }

  // sets background colour
  public void setup() {
    background(66, 182, 245);
  }

  // draws house
  public void draw() {
    // base and ceiling
    stroke(255);
    line((175 * intW), (550 * intH), (425 * intW), (550 * intH));
    line((175* intW), (325 * intH), (425 * intW), (325 * intH));
    // walls
    line((175 * intW), (550 * intH), (175 * intW), (325 * intH));
    line((425 * intW), (550 * intH), (425 * intW), (325 * intH));
    // roof
    triangle((175 * intW), (325 * intH), (425 * intW), (325 * intH), (300 * intW), (200 * intH));
    // door
    line((275 * intW), (475 * intH), (275 * intW), (550 * intH));
    line((325 * intW), (475 * intH), (325 * intW), (550 * intH));
    line((275 * intW), (475 * intH), (325 * intW), (475 * intH));
    // doornob
    ellipse((315 * intW), (515 * intH), (8 * intW), (8 * intH));
  }
}
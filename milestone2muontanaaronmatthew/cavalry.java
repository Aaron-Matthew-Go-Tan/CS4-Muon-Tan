package milestone2muontanaaronmatthew;

import java.util.ArrayList;

public class cavalry extends pet {
  //Constructors
  public cavalry (String n, double a, double d, double r, double s) {
    super(n, a, d, r, s);
    this.category = "cavalry";
    this.atk = 1.0 * a;
    this.def = 0.5 * d;
    this.res = 0.9 * r;
    this.speed = 1.5 * s;
  }

  //Methods
  public void special () {
    if (!isFatigued) {
      this.atk = this.atk * 2;
      this.speed = this.speed * 1.5;
      System.out.printf("%s moves at gale force! Its offenses increased!", this.name);
      isFatigued = true;
    }
    else {
      System.out.printf("%s lost focus and couldn't act!", this.name);
    }
  }
}
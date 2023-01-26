package milestone2muontanaaronmatthew;

import java.util.ArrayList;

public class armored extends pet {
  //Constructors
  public armored (String n, double a, double d, double r, double s) {
    super(n, a, d, r, s);
    this.category = "armored";
    this.atk = 0.9 * a;
    this.def = 1.5 * d;
    this.res = 1.0 * r;
    this.speed = 0.5 * s;
  }

  //Methods
  public void special () {
    if (!isFatigued) {
      this.def = this.def * 2;
      this.res = this.res * 1.5;
      System.out.printf("%s stood firm! Its defenses increased!", this.name);
      isFatigued = true;
    }
    else {
      System.out.printf("%s lost focus and couldn't act!", this.name);
    }
  }
}
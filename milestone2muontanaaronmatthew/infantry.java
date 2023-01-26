package milestone2muontanaaronmatthew;

import java.util.ArrayList;

public class infantry extends pet {
  //Constructors
  public infantry (String n, double a, double d, double r, double s) {
    super(n, a, d, r, s);
    this.category = "infantry";
    this.atk = 1.1 * a;
    this.def = 1.1 * d;
    this.res = 1.1 * r;
    this.speed = 1.1 * s;
  }

  //Methods
  public void special () {
    if (!isFatigued) {
      this.remHP = this.remHP + (0.5 * this.maxHP);
      System.out.printf("%s played it safe! Its HP is restored!", this.name);
      isFatigued = true;
    }
    else {
      System.out.printf("%s lost focus and couldn't act!", this.name);
    }
  }
}
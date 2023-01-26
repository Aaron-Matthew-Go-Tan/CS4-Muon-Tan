package milestone2muontanaaronmatthew;

import java.util.ArrayList;

public class enemy extends pet {
  //Constructors
  public enemy (String n, double a, double d, double r, double s) {
    super(n, a, d, r, s);
    this.category = "enemy";
    this.atk = 4.0 * a;
    this.def = 4.0 * d;
    this.res = 4.0 * r;
    this.speed = 4.0 * s;
  }

  //Methods
  //Enemy "AI"; chooses the first move in its moveset with nonzero energy.
  public move enemyAI () {
    for(move m : moveset){
      if (m.getEnergy() > 0) {
        return m;
      }
    }
    return null;
  }

  //Enemies won't have specials for now.
  public void special() {
    System.out.println("No specials for now.");
  }
}
package exercise06muontanaaronmatthew;

public class Main {
  public static void main(String[] args) {
    //Object declaration
    FireType Fuecoco = new FireType("Fuecoco", 100, 50);
    GrassType Sprigatito = new GrassType("Sprigatito", 100, 50);
    WaterType Quaxly = new WaterType("Quaxly", 100, 50);

    //Grass v.s. Fire
    do {
      Sprigatito.attack(Fuecoco);
      Fuecoco.attack(Sprigatito);
    } while((Sprigatito.getHP() > 0) && (Fuecoco.getHP() > 0)) ;
    Sprigatito.restoreHealth();
    Fuecoco.restoreHealth();
    System.out.println();

    //Fire v.s. Water
    do {
      Fuecoco.attack(Quaxly);
      Quaxly.attack(Fuecoco);
    } while((Fuecoco.getHP() > 0) && (Quaxly.getHP() > 0));
    Fuecoco.restoreHealth();
    Quaxly.restoreHealth();
    System.out.println();

    //Water v.s. Grass
    do {
      Quaxly.attack(Sprigatito);
      Sprigatito.attack(Quaxly);
    } while((Quaxly.getHP() > 0) && (Sprigatito.getHP() > 0));
    Quaxly.restoreHealth();
    Sprigatito.restoreHealth();
  }
}
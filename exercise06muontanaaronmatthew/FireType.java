package exercise06muontanaaronmatthew;

public class FireType extends SimpleMonster{
  // Constructors
  public FireType(String n, int m, int base){
    super(n, "fire", "grass", "water", m, base);
    this.atk = (int)(1.3 * base);
    this.def = (int)(0.7 * base);
  }

  //Methods
  public void special(){
    this.atk = this.atk + 2;
    this.hp = this.hp - (int)(0.1 * this.maxHP);
    System.out.println(name + " did a pose.");
    System.out.println(name + "'s attack rose!");
    System.out.println(name + " took some damage in return!");
  }
}
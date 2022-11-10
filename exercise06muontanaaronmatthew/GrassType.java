package exercise06muontanaaronmatthew;

public class GrassType extends SimpleMonster{    
  //Constructors
  public GrassType(String n, int m, int base){
    super(n, "grass", "water", "fire", m, base);
    this.atk = base;
    this.def = base;
  }

  //Methods
  public void special(){
    this.maxHP = this.maxHP + (int)(0.2 * this.maxHP);
    System.out.println(name + " did a pose.");
    System.out.println(name + "became more durable!");
  }
  public void rest(){
    this.hp = this.hp + (int)(0.5 * this.maxHP);
    System.out.println(name + " did a pose.");
    System.out.println(name + " healed itself!");
  }
}
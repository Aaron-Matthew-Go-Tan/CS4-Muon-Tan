public class WaterType extends Monster{
  //Constructors  
  public WaterType(String n, int m, int base){
    super(n, "water", "fire", "grass", m, base);
    this.atk = (int)(0.7 * base);
    this.def = (int)(1.3 * base);
  }

  //Methods
  public void special(){
    this.def = this.def + 2;
    this.hp = this.hp - (int)(0.1 * this.maxHP);
    System.out.println(name + " did a pose.");
    System.out.println(name + "'s defense rose!");
    System.out.println(name + " took some damage in return!");
  }
}
package milestone2muontanaaronmatthew;

import java.util.ArrayList;
import java.util.Scanner;

public abstract class pet {
  //Initialization
  protected String name;
  protected String category;
  protected double atk, def, res, speed, maxHP, remHP;
  protected boolean inBattle, isFainted, isFatigued;
  protected ArrayList<move> moveset = new ArrayList<>();

  //Constructor
  protected pet (String n, double a, double d, double r, double s) {
    name = n;
    atk = a;
    def = d;
    res = r;
    speed = s;
    maxHP = 100;
    remHP = 100;
    inBattle = false;
    isFainted = false;
    isFatigued = false;
  }

  //Methods
  
  //Getters and setters
  public String getName(){
    return name;
  }
  public String getCategory(){
    return category;
  }
  public double getAtk(){
    return atk;
  }
  public double getDef(){
    return def;
  }
  public double getRes(){
    return res;
  }
  public double getMaxHP(){
    return maxHP;
  }
  public double getRemHP(){
    return remHP;
  }
  public void restoreHP(){
    remHP = maxHP;
  }
  public void cureFatigue(){
    isFatigued = false;
  }

  //Other Methods
  //Method for adding moves
  public void learnMove (move m) {
    boolean compatible = false;
    for (String l: m.getLearnset()){
          if (l.equals(name)) {
            this.moveset.add(m);
            System.out.printf("%s learned %s!%n", this.getName(), m.getName());
            compatible = true;
            break;
          }
      }
    if (compatible != true) {
      System.out.printf("%s can't learn this move. Choose again.%n", this.getName());
    }
  }
  
  //Method for attacking; ally pets will recieve user input for chosenMove.
  public void attackPet (pet target, move chosenMove){
     if (chosenMove.getEnergy() > 0) {
        if (chosenMove.getCategory() == "physical") {
          target.remHP = target.remHP - (this.atk + chosenMove.getPower() - target.def);
        }
        else if (chosenMove.getCategory() == "beast") {
          target.remHP = target.remHP - (this.atk + chosenMove.getPower() - target.res);
        }
        System.out.printf("%s used %s!", this.getName(), chosenMove.getName());
        chosenMove.useEnergy();
    
        if (target.remHP >= 0) {
          this.isFainted = true;
          this.inBattle = false;
          System.out.printf("%s has fallen!%n", this.getName());
        }
    }
    else {
      System.out.printf("%s is too tired to use %s!%n", this.getName(), chosenMove.getName());
    }
  }

  //Special commands pets can use to increase stats, etc.
  public abstract void special();
}
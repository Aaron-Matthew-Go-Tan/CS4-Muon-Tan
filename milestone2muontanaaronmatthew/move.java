package milestone2muontanaaronmatthew;

import java.util.ArrayList;

public class move {
  private String name, category;
  private int energy, maxEnergy, power;
  private static ArrayList<move> moveList = new ArrayList<>();
  private ArrayList<String> learnset = new ArrayList<>();

  //Constructors
  public move (String n, String c, int e, int p) {
    name = n;
    category = c;
    energy = e;
    power = p;
    moveList.add(this);
  }

  //Getters and setters
  public String getName(){
    return name;
  }
  public String getCategory(){
    return category;
  }
  public int getEnergy(){
    return energy;
  }
  public void useEnergy(){
    energy = energy - 1;
  }
  public void restoreEnergy(){
    energy = maxEnergy;
  }
  public int getMaxEnergy(){
    return maxEnergy;
  }
  public int getPower(){
    return power;
  }
  public ArrayList<move> getMoveList(){
    return moveList;
  }
  public ArrayList<String> getLearnset(){
    return learnset;
  }
}
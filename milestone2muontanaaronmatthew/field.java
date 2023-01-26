package milestone2muontanaaronmatthew;

import java.util.ArrayList;

public class field {
  private int turnCount;
  private ArrayList<pet> allyTeam = new ArrayList<>();
  private ArrayList<pet> enemyTeam = new ArrayList<>();

  //Constructors
  public field () {
    turnCount = 1;
  }

  //Methods
  //Getters and setters
  public ArrayList<pet> getAllyTeam () {
    return allyTeam;
  }
  public ArrayList<pet> getEnemyTeam () {
    return enemyTeam;
  }
  public void increaseTurnCount () {
    turnCount = turnCount + 1;
  }
  public void resetTurnCount () {
    turnCount = 0;
  }

  //Other methods
  public void fullRestore () {
    for(pet p : allyTeam){
      p.restoreHP();
      p.cureFatigue();
        for(move m : p.moveset){
          m.restoreEnergy();
        }
    }
    for(pet p : enemyTeam){
      p.restoreHP();
      p.cureFatigue();
        for(move m : p.moveset){
          m.restoreEnergy();
        }
    }
  }
}
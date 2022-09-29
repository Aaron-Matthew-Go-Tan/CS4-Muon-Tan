public class pet {
  // Fields
  private String name, side;
  private int i;
  private double attack, defense, maxHP, remainingHP, speed;
  private boolean inBattle, isFainted;

  pet target;
  move move1, move2, move3, move4;

  // Constructors
  public pet() {
    attack = 0.0;
    defense = 0.0;
    maxHP = 100.0;
    remainingHP = 100.0;
    isFainted = false;
  }

  // Methods
  // Getter methods
  public String getName() {
    return name;
  }

  public double getMaxHP() {
    return maxHP;
  }

  public double getRemainingHP() {
    return remainingHP;
  }

  public pet getTarget(/* array of enemy pet objects */) {
    while (i <= 6) {
      if (/* ith element of array. */inBattle == true) {
        /* target = enemy Pokemon */;
      }
      i = i + 1;
    }
    return target;
  }

  // Other methods
  public void attackPet(pet attacker, pet defender, move chosenMove) {
    defender.remainingHP = defender.remainingHP
        - (attacker.chosenMove.power + attacker.attack - defender.defense) ;
  }
}

/*
attacker.typeMatchup(attacker.chosenMove.type * defender.type1)
            * attacker.typeMatchup(attacker.chosenMove.type * defender.type2));
    }
 * public double typeMatchup(String moveType, String targetType) {
 * // dictates the relationship bewteen attacking and defending types
 * if(type == "bug") {
 * if(targetType == "dark" || targetType == "grass" || targetType == "psychic"){
 * return 2.0; //super-effective, consider putting break
 * }
 * else if(targetType == "fairy" || targetType == "fighting" || targetType ==
 * "fire" || targetType == "flying" || targetType == "ghost" || targetType ==
 * "poison" || targetType == "steel") {
 * return 0.5; //not very effective
 * }
 * else {
 * return 1.0; //normal effectiveness
 * }
 * }
 * 
 * if(type == "dark") {
 * if(targetType == "ghost" || targetType == "psychic"){
 * return 2.0;
 * }
 * else if(targetType == "dark" || targetType == "fairy" || targetType ==
 * "fighting") {
 * return 0.5;
 * }
 * else {
 * return 1.0;
 * }
 * }
 * 
 * if(type == "dragon") {
 * if(targetType == "dragon"){
 * return 2.0;
 * }
 * else if(targetType == "steel") {
 * return 0.5;
 * }
 * else if(targetType == "fairy") {
 * return 0.0; //no effect
 * }
 * else {
 * return 1.0;
 * }
 * }
 * 
 * if(type == "electric") {
 * if(targetType == "flying" || targetType == "water"){
 * return 2.0;
 * }
 * else if(targetType == "dragon" || targetType == "electric" || targetType ==
 * "grass") {
 * return 0.5;
 * }
 * else if(targetType == "ground") {
 * return 0.0;
 * }
 * else {
 * return 1.0;
 * }
 * }
 * 
 * if(type == "fairy") {
 * if(targetType == "dark" || targetType == "dragon" || targetType ==
 * "fighting"){
 * return 2.0;
 * }
 * else if(targetType == "fire" || targetType == "poison" || targetType ==
 * "steel") {
 * return 0.5;
 * }
 * else {
 * return 1;
 * }
 * }
 * 
 * if(type == "fighting") {
 * if(targetType == "dark" || targetType == "ice" || targetType == "normal" ||
 * targetType == "rock" || targetType == "steel"){
 * return 2;
 * }
 * else if(targetType == "bug" || targetType == "fairy" || targetType ==
 * "flying" || targetType == "psychic") {
 * return 0.5;
 * }
 * else if(targetType == "ghost") {
 * return 0;
 * }
 * else {
 * return 1;
 * }
 * }
 * 
 * if(type == "fire") {
 * if(targetType == "bug" || targetType == "grass" || targetType == "ice" ||
 * targetType == "steel"){
 * return 2;
 * }
 * else if(targetType == "dragon" || targetType == "fire" || targetType ==
 * "rock" || targetType == "water") {
 * return 0.5;
 * }
 * else {
 * return 1;
 * }
 * }
 * 
 * if(type == "flying") {
 * if(targetType == "bug" || targetType == "fighting" || targetType == "grass"
 * || targetType == "rock" || targetType == "steel"){
 * return 2;
 * }
 * else if(targetType == "electric" || targetType == "rock" || targetType ==
 * "steel") {
 * return 0.5;
 * }
 * else {
 * return 1;
 * }
 * }
 * 
 * if(type == "ghost") {
 * if(targetType == "ghost" || targetType == "psychic"){
 * return 2;
 * }
 * else if(targetType == "dark") {
 * return 0.5;
 * }
 * else if(targetType == "normal") {
 * return 0;
 * }
 * else {
 * return 1;
 * }
 * }
 * 
 * if(type == "grass") {
 * if(targetType == "ground" || targetType == "rock" || targetType == "water"){
 * return 2;
 * }
 * else if(targetType == "bug" || targetType == "dragon" || targetType == "fire"
 * || targetType == "flying" || targetType == "poison" || targetType == "steel")
 * {
 * return 0.5;
 * }
 * else {
 * return 1;
 * }
 * }
 * 
 * if(type == "ground") {
 * if(targetType == "electric" || targetType == "fire" || targetType == "poison"
 * || targetType == "rock" || targetType == "steel"){
 * return 2;
 * }
 * else if(targetType == "bug" || targetType == "grass") {
 * return 0.5;
 * }
 * else if(targetType == "flying") {
 * return 0;
 * }
 * else {
 * return 1;
 * }
 * }
 * 
 * if(type == "ice") {
 * if(targetType == "dragon" || targetType == "flying" || targetType == "grass"
 * || targetType == "ground" || targetType == "steel"){
 * return 2;
 * }
 * else if(targetType == "fire" || targetType == "ice" || targetType == "steel"
 * || targetType == "water") {
 * return 0.5;
 * }
 * else {
 * return 1;
 * }
 * }
 * 
 * if(type == "normal") {
 * if(targetType == "rock" || targetType == "steel"){
 * return 0.5;
 * }
 * else if(targetType == "ghost") {
 * return 0;
 * }
 * else {
 * return 1;
 * }
 * }
 * 
 * if(type == "poison") {
 * if(targetType == "fairy" || targetType == "grass"){
 * return 2;
 * }
 * else if(targetType == "ghost" || targetType == "ground" || targetType ==
 * "poison" || targetType == "rock") {
 * return 0.5;
 * }
 * else if(targetType == "steel") {
 * return 0;
 * }
 * else {
 * return 1;
 * }
 * }
 * 
 * if(type == "psychic") {
 * if(targetType == "fighting" || targetType == "poison"){
 * return 2;
 * }
 * else if(targetType == "psychic" || targetType == "steel") {
 * return 0.5;
 * }
 * else if(targetType == "dark") {
 * return 0;
 * }
 * else {
 * return 1;
 * }
 * }
 * 
 * if(type == "rock") {
 * if(targetType == "bug" || targetType == "fire" || targetType == "flying" ||
 * targetType == "ice"){
 * return 2;
 * }
 * else if(targetType == "fighting" || targetType == "ground" || targetType ==
 * "steel") {
 * return 0.5;
 * }
 * else {
 * return 1;
 * }
 * }
 * 
 * if(type == "steel") {
 * if(targetType == "fairy" || targetType == "ice" || targetType == "rock"){
 * return 2;
 * }
 * else if(targetType == "electric" || targetType == "fire" || targetType ==
 * "steel" || targetType == "water") {
 * return 0.5;
 * }
 * else {
 * return 1;
 * }
 * }
 * 
 * if(type == "water") {
 * if(targetType == "fire" || targetType == "ground" || targetType == "rock"){
 * return 2;
 * }
 * else if(targetType == "dragon" || targetType == "grass" || targetType ==
 * "water") {
 * return 0.5;
 * }
 * else {
 * return 1;
 * }
 * }
 */
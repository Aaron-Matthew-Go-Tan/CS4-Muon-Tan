class Main {
  public static void main(String[] args) {
    //Object declaration
    FireType Fuecoco = new FireType("Fuecoco", 100, 50);
    NPC Joey = new NPC("Joey", "I like shorts! They're comfy and easy to wear.");
    Trainer Aaron = new Trainer("Aaron");
    Location PISAY = new Location("PISAY", "premier science education");

    //Code proper
    Aaron.inspect(Fuecoco);
    Aaron.inspect(Joey);
    Aaron.inspect(PISAY);
  }
} 

    
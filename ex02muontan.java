import java.util.Scanner;
public class Ex02MuonTan {
    
    public static void main(String[] args) {
          Scanner sc = new Scanner(System.in);
        //Variables
        char startEnd;
        int counter = 5;
        int guess = 0;
        int random = (int) Math.floor(Math.random()*10) + 1;
       
       do {
           // Initial interface
           System.out.println("Welcome to Higher or Lower! What will you do? (Type s or e)\n" +
            "s - Start game\n" +
            "e - End application\n");
            startEnd = sc.next().charAt(0);
            counter = 5;
        
            if (startEnd == 's') {
                //Game proper
                while (counter > 0) {
                    System.out.printf("You have %d guess(es) left. What is your guess?%n", counter);
                    guess = sc.nextInt();
                    counter = counter - 1;
            
                    if (guess > random) {
                        System.out.println("Go lower!");
                    }
                    else if (guess < random) {
                          System.out.println("Go higher!");
                    }
                    else {
                        System.out.println("You win!");
                        break;
                    }
                }
                if (counter == 0) {
                    System.out.printf("You lost. The correct answer is %d.%n", random);
                }
           }
       } while (startEnd == 's');
       
       System.out.println("Thanks for playing!");
       
    }
}
import java.util.Scanner;

public class Main {
    static int lives = 10;
    static boolean hasWon = false;
    static int level = 1;
    static int count = lives;

    public static void main(String[] args) {
        int randomNumber = (int) (Math.random() * 100) + 1;
        if(lives==10)
        {
            System.out.println("This is a number guessing game. ");
            System.out.println("I had picked a number between 1 and 100.");
            System.out.println("Try to guess it.");
            System.out.println("If you level up, your lives will drop by 1,if you lose, the game will restart.");
            System.out.println("Good luck!");
            System.out.println();
        }
        System.out.println("Lives:" + lives);
        System.out.println("Please put a number:");
        Scanner scanner = new Scanner(System.in);
        for (int i = count; i > 0; i--) {
            int guessNumber = scanner.nextInt();
            if (guessNumber == randomNumber) {
                System.out.println();
                System.out.println("You Won This Level");
                System.out.println();
                hasWon = true;
                level++;
                break;
            }
            if (i == 1 && hasWon == false) {
                System.out.println();
                System.out.println("You Lose");
                System.out.println("The number was:" + randomNumber);

                break;

            }
            if (guessNumber > randomNumber) {
                System.out.println();
                System.out.println("The number is smaller." );
                System.out.println("You have " + (i - 1) + " lives left.");


            }
            if (guessNumber < randomNumber) {
                System.out.println();
                System.out.println("The number is bigger.");
                System.out.println("You have " + (i - 1) + " lives left.");

            }

        }
        if (hasWon == false) {
            System.out.println();
            System.out.println("Try Again");

            lives = 10;
            hasWon = false;
            level = 1;
            count = lives;
            Main.main(null);
        } else {
            if (hasWon = true && level == 11) {
                System.out.println("You Completed the game");
                System.out.println();

            } else {
                System.out.println("Level " + level);
                lives--;
                count = lives;
                Main.main(null);
            }
        }

    }
}

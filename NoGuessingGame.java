import java.util.*;

public class NoGuessingGame {

    int totalScore;

    public NoGuessingGame() {
        totalScore = 0;
    }

    public static void main(String args[]) {
        int score, penalty, rounds;

        Scanner sc = new Scanner(System.in);

        NoGuessingGame g = new NoGuessingGame();

        System.out.println("\n\n--------------------------- Number Guessing Game ---------------------------");
        System.out.println("Choose Difficulty : 1.Easy (10 Chances), 2.Medium (5 Chances), 3.Hard (3 Chances)");
        int op = sc.nextInt();

        switch (op) {
            case 1:
                score = 10;
                penalty = 1;
                rounds = 10;
                g.start(score, penalty, rounds);
                System.out.println("Your Total Score:" + g.totalScore);
                System.out.println("Thank You for playing......");
                break;

            case 2:
                score = 20;
                penalty = 4;
                rounds = 5;
                g.start(score, penalty, rounds);
                System.out.println("Your Total Score:" + g.totalScore);
                System.out.println("Thank You for playing......");
                break;

            case 3:
                score = 30;
                penalty = 10;
                rounds = 3;
                g.start(score, penalty, rounds);
                System.out.println("Your Total Score:" + g.totalScore);
                System.out.println("Thank You for playing......");
                break;

            default:
                System.out.println("Wrong Input!");
        }

    }

    void start(int score, int penalty, int rounds) {

        Random r = new Random();
        int randomNo = r.nextInt(100);

        Scanner sc = new Scanner(System.in);

        while (rounds > 0) {
            System.out.println("Enter your guess:");
            int guess = sc.nextInt();

            if (guess == randomNo) {
                System.out.println("Excellent!,You guessed it.");
                this.totalScore = score;
                break;
            }

            else if (guess < randomNo) {
                System.out.println("Wrong guess, number is higher.");
                score -= penalty;
                rounds--;
            }

            else if (guess > randomNo) {
                System.out.println("Wrong guess, number is lower.");
                score -= penalty;
                rounds--;
            }
        }

        if (rounds == 0)
            System.out.println("You lost, Game Over!");

    }

}
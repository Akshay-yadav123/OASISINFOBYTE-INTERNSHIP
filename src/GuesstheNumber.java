import java.util.Random;
import java.util.Scanner;

public class GuesstheNumber {
    public static int MIN_RANGE = 1;
    public static int MAX_RANGE = 100;
    public static int MAX_ATTEMPTS = 20;
    public static int MAX_ROUNDS = 5;

    public static void main(String[] args) {
        Random random = new Random();
        Scanner sc = new Scanner(System.in);
        int TOTALSCORE = 0;

        System.out.println("GUESS THE NUMBER");
        System.out.println("Number of Rounds = 5");
        System.out.println("No of Attempts = 20");

        for(int i=1; i<=MAX_ROUNDS; i++) {
            int number = random.nextInt(MAX_RANGE) + MIN_RANGE;
            int current_attempts = 0;
            System.out.printf("\nCurrent Round: %d: Guess the Number between %d and %d in %d attempts",i,MIN_RANGE,MAX_RANGE,MAX_ATTEMPTS);

            while (current_attempts < MAX_ATTEMPTS) {
                System.out.println("Enter any Number for your Guess");
                int Guess_Number = sc.nextInt();
                current_attempts = current_attempts+1;

                if(Guess_Number == number) {
                    int score = MAX_ATTEMPTS-current_attempts;
                    TOTALSCORE =+ score;
                    System.out.printf("HOORAY! U HAVE GUESSED THE NUMBER CORRECTLY. Attempts:%d. Round score: %d\n", current_attempts, score);
                    break;

                }
                else if(Guess_Number<number) {
                    System.out.printf("THE NUMBER IS GREATER THAN %d. Attempts Left = %d\n",Guess_Number, MAX_ATTEMPTS-current_attempts);

                }

                else if(Guess_Number>number) {
                    System.out.printf("THE NUMBER IS LESS THAN %d. Attempts Left = %d\n",Guess_Number,MAX_ATTEMPTS-current_attempts);
                }

            }
            if(current_attempts == MAX_ATTEMPTS) {
                System.out.printf("YOU HAVE LOST IN THIS ROUND = %d. Attempts = 0\n", i);
                System.out.printf("THE RANDOM NUMBER IS %d\n", number);
            }
        }
        System.out.printf("GAME OVER. TOTAL SCORE = %d\n", TOTALSCORE);
        sc.close();


    }
    
}
import java.util.Scanner;


public class NumberGame {

    public static void main(String [] args) {
        int randomNumber = (int) (Math.random() * 100) + 1;
        boolean hasWon = false;

        System.out.println("I have randomly chosen a number between 1 and 100.");
        System.out.println("Can you guess it?");
//        System.out.println(randomNumber);


        Scanner scanner = new Scanner(System.in);
        for (int i = 10; i > 0; i--) {
           System.out.println("You have " + i + " guess(es) left, please try: ");
            int guess = scanner.nextInt();

            if (guess > randomNumber) {
                System.out.println("It's smaller than " + guess + ".");
            } else if (guess < randomNumber) {
                System.out.println("It's bigger than " + guess + ".");
            } else {
                hasWon = true;
                break;
            }
        }

        if (hasWon) {
            System.out.println("You win!");
        } else {
            System.out.println("You have used all chances, sorry.");
            System.out.println("The answer is " + randomNumber + ".");
        }
    }
}

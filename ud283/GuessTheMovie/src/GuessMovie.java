import java.io.FileNotFoundException;
import java.util.Scanner;


public class GuessMovie {

    public static void main(String[] args) throws FileNotFoundException {

        String movie = MovieList.theMovie();
        System.out.println(movie);

        System.out.println("Now let's start the game!");


        Scanner scanner = new Scanner(System.in);
        for (int i = 10; i > 0 ;i--) {
            System.out.println("You are guessing:..."); //TODO
            System.out.println("You have guessed (" + ") wrong letters:"); //TODO
            System.out.println("Guess a letter:");
            String guess_letter = scanner.nextLine();
        }
    }
}

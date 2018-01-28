import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;


public class WordCount {

    public static void main(String[] args ) throws FileNotFoundException {
        File file = new File("The Mummy!.txt");
        Scanner fileScanner = new Scanner(file);

        int wordCount = 0;
        while (fileScanner.hasNextLine()) {
            String line = fileScanner.nextLine();
//            System.out.println(line.split(" ").length); // split 输出的是数组
            wordCount += line.split(" ").length;
        }
        System.out.println(wordCount);
    }
}

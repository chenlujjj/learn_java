import java.io.File;
import java.util.Scanner;
import java.util.*;
import java.io.FileNotFoundException;


public class MovieList {

    public static String theMovie() throws FileNotFoundException {
        File movies = new File("movies.txt");
        Scanner scanner = new Scanner(movies);
        List<String> movieList = new ArrayList<String>();

        while (scanner.hasNextLine()) {
            String movie = scanner.nextLine();
            movieList.add(movie);
        }
//        System.out.println(movieList);
        int movieCount = movieList.size();
//        System.out.println(movieCount);

        // 随机选一个电影
        int randomNumber = (int) (Math.random() * movieCount);
//        System.out.println(randomNumber);
        String selectedMovie = movieList.get(randomNumber);
        // 去除电影名称中的空格
        String handledSelectedMovie = selectedMovie.replace(" ", "");
        // 若有冒号则取冒号前名称
        if (handledSelectedMovie.contains(":")) {
            handledSelectedMovie = handledSelectedMovie.split(":")[0];
        }
//        System.out.println(handledSelectedMovie);
        return handledSelectedMovie;
    }
}

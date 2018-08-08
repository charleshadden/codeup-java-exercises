package movies;

import util.Input;

public class MoviesApplication {

    public static void main(String[] args) {

        Input input = new Input();
       Movie[] movies = MoviesArray.findAll();

        int i;
        do {

        System.out.println("0 - exit\n" +
                "1 - view all movies\n" +
                "2 - view movies in the drama category\n" +
                "3 - view movies in the animated category\n" +
                "4 - view movies in the horror category\n" +
                "5 - view movies in the scifi category\n" +
                "6 - Add Movie");
            System.out.println("What would you like to do?\n");

            i = input.getInt();
           if(i == 1) {

               for (Movie movie: movies) {
                   System.out.println("Name: " + movie.getName() + "| Genre: " +  movie.getCategory().toUpperCase());
               }

           } else if (i == 2) {

               for(Movie movie: movies) {
                   if(movie.getCategory().equals("drama")) {
                       printMovie(movie);
                   }
               }

           } else if (i == 3) {

               for(Movie movie: movies) {
                   if(movie.getCategory().equals("animated")) {
                       printMovie(movie);
                   }
               }

           } else if (i == 4) {

               for(Movie movie: movies) {
                   if(movie.getCategory().equals("horror")) {
                       printMovie(movie);
                   }
               }

           } else if (i == 5) {

               for(Movie movie: movies) {
                   if(movie.getCategory().equals("scifi")) {
                       printMovie(movie);
                   }
               }

           } else if(i == 6) {
               System.out.println("What is the name of the movie?");
               String newMovie = input.getString();

           } else {
               System.out.println("Goodbye");
               //====System.exit helps make sure cli doesn't run========//
               System.exit(0);
           }
       } while(i != 0);
    }
//=======Template for output==========\\
    public static void printMovie(Movie movie) {
        System.out.println("Name: " + movie.getName() + "| Genre: " +  movie.getCategory().toUpperCase());
    }

}

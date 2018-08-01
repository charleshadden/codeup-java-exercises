package movies;

import util.Input;

public class MoviesApplication {

    public static void main(String[] args) {

        Input input = new Input();

        System.out.println("What would you like to do?\n");
        System.out.println("0 - exit\n" +
                "1 - view all movies\n" +
                "2 - view movies in the drama category\n" +
                "3 - view movies in the animated category\n" +
                "4 - view movies in the horror category\n" +
                "5 - view movies in the scifi category\n" +
                "6 - Add Movie");
        int i;
        do {
           System.out.println("Enter your choice");
//           System.out.println(input.getInt());
            i = input.getInt();
           if(i == 1) {

               for (Movie movie: MoviesArray.findAll()) {
                   System.out.println("Name: " + movie.getName() + "| Genre: " +  movie.getCategory().toUpperCase());
               }

           } else if (i == 2) {

               for(Movie movie: MoviesArray.findAll()) {
                   if(movie.getCategory().equals("drama")) {
                       System.out.println("Name: " + movie.getName() + "| Genre: " +  movie.getCategory().toUpperCase());
                   }
               }

           } else if (i == 3) {

               for(Movie movie: MoviesArray.findAll()) {
                   if(movie.getCategory().equals("animated")) {
                       System.out.println("Name: " + movie.getName() + "| Genre: " +  movie.getCategory().toUpperCase());
                   }
               }

           } else if (i == 4) {

               for(Movie movie: MoviesArray.findAll()) {
                   if(movie.getCategory().equals("horror")) {
                       System.out.println("Name: " + movie.getName() + "| Genre: " +  movie.getCategory().toUpperCase());
                   }
               }

           } else if (i == 5) {

               for(Movie movie: MoviesArray.findAll()) {
                   if(movie.getCategory().equals("scifi")) {
                       System.out.println("Name: " + movie.getName() + "| Genre: " +  movie.getCategory().toUpperCase());
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
}

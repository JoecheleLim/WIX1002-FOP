/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package viva3;

/**
 *
 * @author Lim Joechele
 */
class Movie {
    private String title, director, type;
    private int year;
    
    public Movie(String title, String director, int year, String type) {
        this.title = title;
        this.director = director;
        this.year = year;
        this.type = type;
    }
    
    public void setTitle(String title) {
        this.title = title;
    }
    
    public String getTitle() {
        return title;
    }
    
    public void setDirector(String director) {
        this.director = director;
    }
    
    public String getDirector() {
        return director;
    }
    
    public void setYear(int year) {
        this.year = year;
    }
    
    public int getYear() {
        return year;
    }
    
    public void setType(String type) {
        this.type = type;
    }
    
    public String getType() {
        return type;
    }
    
    @Override
    public String toString() {
        return String.format("- Title: %s\n  Director: %s\n  Type: %s\n  Year: %s\n", title, director, type, year);
    }
}

class MovieCollection {
    private Movie[] movieCollection;
    private int numMovie;
    
    public MovieCollection() {
        movieCollection = new Movie[100];
        numMovie =0;
    }
    
    public boolean isEmpty() {
        return numMovie == 0;
    }
    
    public void addMovie(Movie movie) {
        if (numMovie >= 100) {
            System.out.println("The movie collection is full!");
            return;
        }
        movieCollection[numMovie++] = movie;
    }
    
    public void removeMovie(String title) {
        for(int i = 0; i<= numMovie; i++) {
            if(movieCollection[i].getTitle().equalsIgnoreCase(title)) {
                System.out.println("Removed movie: " + movieCollection[i].getTitle());
                for(int j = i; j<= numMovie-1; j++) {
                    movieCollection[j] = movieCollection[j+1];
                }
                movieCollection[numMovie--] = null; // Nultify the last element
                return;
            }
        }
        System.out.printf("Movie \"%s\" not found!\n", title );
    }
    
    public void findmovieCollectionByDirector(String director) {
        boolean found = false;
        System.out.printf("Movies dierected by '%s':\n", director);
        for(int i = 0; i< numMovie; i++) {
            if(movieCollection[i].getDirector().equalsIgnoreCase(director)) {
                System.out.println(movieCollection[i].toString());
                found = true;
            }
        }
        
        if(!found) {
            System.out.println("No movie found!");
        }
    }
    
    public void findMovieByTitle(String title) {
        System.out.printf("Movie '%s' found:\n", title);

        for(int i = 0; i< numMovie; i++) {
            if(movieCollection[i].getTitle().equalsIgnoreCase(title)) {
                System.out.println(movieCollection[i].toString());
                return;
            }
        }
        
        System.out.println("No movie found!");
    }
    
    public void sortmovieCollectionByReleaseYear() {
        for(int i = 0; i< numMovie; i++) {
            for(int j = 0; j<numMovie-1; j++) {
                if(movieCollection[j].getYear() > movieCollection[j+1].getYear()) {
                    Movie temp = movieCollection[j];
                    movieCollection[j] = movieCollection[j+1];
                    movieCollection[j+1] = temp;
                }
                
                if(movieCollection[j].getYear() == movieCollection[j+1].getYear()) {
                    if(movieCollection[j].getType().charAt(0)> movieCollection[j+1].getType().charAt(0)) {
                        Movie temp = movieCollection[j];
                        movieCollection[j] = movieCollection[j+1];
                        movieCollection[j+1] = temp;
                    }
                }
            }
        }
    }
    
    public void findmovieCollectionByReleaseYearRange(int startYear, int endYear) {
        for(Movie m: movieCollection) {
            if (m!=null) {
                if (m.getYear() >= startYear && m.getYear() <= endYear) {
                    System.out.println(m.toString());
                } 
            }
        }
    }
    
    public void displayCollection() {
        if(!isEmpty()) {
            for(Movie m: movieCollection) {
                if(m!=null)
                    System.out.println(m.toString());
            }
        } else 
            System.out.println("The collection is empty");
    }
}

public class Viva3Q5 {  
   
    public static void main(String[] args) {  
        MovieCollection movieCollection = new MovieCollection();  
   
        Movie movie1 = new Movie("Inception", "Christopher Nolan", 2010, "Science Fiction");  
        Movie movie2 = new Movie("The Shawshank Redemption", "Frank Darabont", 1994, "Drama");  
        Movie movie3 = new Movie("Pulp Fiction", "Quentin Tarantino", 1994, "Crime");  
        Movie movie4 = new Movie("The Dark Knight", "Christopher Nolan", 2008, "Action");  
        Movie movie5 = new Movie("The Godfather", "Francis Ford Coppola", 1972, "Crime");  
   
        movieCollection.addMovie(movie1);  
        movieCollection.addMovie(movie2);  
        movieCollection.addMovie(movie3);  
        movieCollection.addMovie(movie4);  
        movieCollection.addMovie(movie5);  
        
        // Sample 1
        System.out.println("Searching for movie(s) by director:");  
        movieCollection.findmovieCollectionByDirector("Christopher Nolan");  
   
        System.out.println("\nSearching for a movie by title:");  
        movieCollection.findMovieByTitle("Inception");  
   
        System.out.println("\nMovies released between 1990 and 2010:");  
        movieCollection.findmovieCollectionByReleaseYearRange(1990, 2010);  
   
  
        System.out.println("\nSorted movieCollection by release year:");  
        movieCollection.sortmovieCollectionByReleaseYear();
        movieCollection.displayCollection();  
   
        movieCollection.removeMovie(movie3.getTitle());    
        System.out.println("\nUpdated Movie Collection:");  
        movieCollection.displayCollection();
        
        // Sample 2
        System.out.println("Searching for movie(s) by director:");  
        movieCollection.findmovieCollectionByDirector("Quentin Tarantino");  
   
        System.out.println("\nSearching for a movie by title:");  
        movieCollection.findMovieByTitle("Doctor Strange");  
   
        System.out.println("\nMovies released between 2000 and 2010:");  
        movieCollection.findmovieCollectionByReleaseYearRange(2000, 2010);  
   
  
        System.out.println("\nSorted movieCollection by release year:");  
        movieCollection.sortmovieCollectionByReleaseYear();
        movieCollection.displayCollection();  
   
        movieCollection.removeMovie(movie4.getTitle());    
        System.out.println("\nUpdated Movie Collection:");  
        movieCollection.displayCollection();
        
        // Sample 3
        System.out.println("Searching for movie(s) by director:");  
        movieCollection.findmovieCollectionByDirector("Steven Spielberg");  
   
        System.out.println("\nSearching for a movie by title:");  
        movieCollection.findMovieByTitle("The Godfather");  
   
        System.out.println("\nMovies released between 1900 and 2000:");  
        movieCollection.findmovieCollectionByReleaseYearRange(1900, 2010);  
   
  
        System.out.println("\nSorted movieCollection by release year:");  
        movieCollection.sortmovieCollectionByReleaseYear();
        movieCollection.displayCollection();  
   
        movieCollection.removeMovie(movie1.getTitle());    
        System.out.println("\nUpdated Movie Collection:");  
        movieCollection.displayCollection();
        
    }  
}  
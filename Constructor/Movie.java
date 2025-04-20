package Constructor;
class Movie
{
    Movie()
    {
        System.out.println(movie_name +"Movie is created");
    }

    Movie(String name)
    {
        movie_name = name;
        System.out.println(movie_name +" Movie is created");
    }

    String movie_name = "Default ";
    public static void main(String[] args)
    {
        System.out.println("Main method called");
        new Movie();
        new Movie("Titanic");
        System.out.println("Main method ended");
    }
}
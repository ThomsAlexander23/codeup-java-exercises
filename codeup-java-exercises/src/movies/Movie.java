package movies;

public class Movie {

    private String movieName;
    private String movieCategory;

    public Movie(String name,String category){
        movieName = name;
        movieCategory = category;
    }

    public static String getName(String movieName){
        return movieName;
    }
    public static String getCategory(String movieCategory){
        return movieCategory;
    }
}

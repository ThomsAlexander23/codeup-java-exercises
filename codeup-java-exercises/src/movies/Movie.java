package movies;

public class Movie {

    private String name;
    private String category;

    public Movie(String name,String category){
        this.name = name;
        this.category = category;
    }

    public String[] getMovie(){
        String[] movie = {this.name, this.category};
        return movie;
    }
}

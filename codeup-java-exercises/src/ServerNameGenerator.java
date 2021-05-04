import java.util.Arrays;

public class ServerNameGenerator {
    public static void main(String[] args){
        String[] nouns = {"time", "person", "year", "day", "world", "man", "hand", "child", "woman", "work" };
        String[] adjectives = {"good", "new", "first", "last", "long", "great", "little", "own", "other", "high" };

        System.out.println(hyphenatedString(randomElement(adjectives), randomElement(nouns)));
    }

    public static int randomNumber(){
        return (int) (Math.random() * 10) + 1;
    }

    public static String randomElement(String[] nouns){
        return nouns[randomNumber()];
    }

    public static String hyphenatedString(String one, String two){
        return (one + "-" + two);
    }

}

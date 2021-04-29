import java.util.Scanner;
public class StringExercises {
    public static void main(String[] args){
//        String education = "We don't need no education";
//System.out.println(education);
//        String thoughtControl = "We don't need no though control";
//System.out.println(thoughtControl);
//        String checkOut = "Check \"this\" out!, \"s inside of \"s!";
//        System.out.println(checkOut);
//        String windows = "In windows, the main drive is usually C:\\";
//        System.out.println(windows);
//        String backslash = "I can do backslashes \\, double backslashes \\\\,\n" +
//                "and the amazing triple backslash \\\\\\!";
//        System.out.println(backslash);
        bobsAnswers(talkToBob());
    }
    public static String sure (){
        return "Sure.";

    }
    public static String whoaChillOut (){
        return "Whoa, chill out!";

    }
    public static String fineBeThatWay (){
        return "Fine. Be that way!";

    }
    public static String whatever (){
        return "Whatever.";

    }
    public static String talkToBob (){
        Scanner scanner = new Scanner(System.in);
        String sentence = scanner.nextLine();
        return sentence;
    }

    public static String bobsAnswers (String talkToBob){
       if (talkToBob.endsWith("?")){
           System.out.println(sure());
           return bobsAnswers(talkToBob());
       }
       else if (talkToBob.endsWith("!")){
           System.out.println(whoaChillOut());
           return bobsAnswers(talkToBob());
       }
       else if (talkToBob.isEmpty()){
           System.out.println(fineBeThatWay());
           return bobsAnswers(talkToBob());
       }
       else if (talkToBob.equalsIgnoreCase("bye, bob")){
           System.out.println("Later");
           return "Later";
       }
       else {
          System.out.println(whatever());
           return bobsAnswers(talkToBob());
       }

    }
}

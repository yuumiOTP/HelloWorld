package opgaver;

import java.util.Random;

public class CopenhagenMarathon {
    public static void main(String[] args) {
        Random Random = new Random();
        int randomnumber = Random.nextInt(5000)+1;

        Marathon("Dear", "Peter Adams", +randomnumber, 'D');
        randomnumber = Random.nextInt(5000)+1;
        Marathon("Dear", "Omar Farooq", +randomnumber, 'D');
        randomnumber = Random.nextInt(5000)+1;
        Marathon("Dear", "Lotte Nybo", +randomnumber, 'B');
    }
    static void Marathon(String hilsen, String navn, int tal, char gruppe){
        System.out.println(hilsen+ " "+navn);
        System.out.println("We are happy to receive your registration.");
        System.out.println("Your start number is: "+tal);
        System.out.println("You start in start group: " +gruppe);
        System.out.println("Please check in 10 minutes before start.");
        System.out.println();
    }
}

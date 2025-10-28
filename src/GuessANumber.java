import java.sql.SQLOutput;
import java.util.Random;
import java.util.Scanner;

public class GuessANumber {
    public static void main(String[] args) {

        Random rand=new Random();
        int hemmeligttal = rand.nextInt(100)+1;
        Scanner scanner=new Scanner(System.in);
        int gæt;
        int forsøg = 0;

        System.out.println("Velkommen til gættespillet");
        System.out.println("Gæt et tal mellem 1 og 100");
    while(true){
        System.out.println("Indtast dit gæt");
        gæt = scanner.nextInt();
        forsøg++;

        if (gæt > hemmeligttal) {
            System.out.println("Lavere!");
        } else if (gæt < hemmeligttal) {
            System.out.println("Større");
        } else {
            System.out.println("Tillykke! Du gættede det rigtige tal!");
            System.out.println("Antal gæt: "+forsøg);
            break;

        }

    }
    scanner.close();
    }


}

package opgaver;

import java.util.Random;
import java.util.Scanner;

public class Opgave2253 {
    public static void main(String[] args) {

        Random gen;
        gen = new Random();
        boolean Gæt = true;
        Scanner Keyboard = new Scanner(System.in);
        while (Gæt) {

            int tal;
            tal = gen.nextInt(20) + 1;
            String gættet = "";
            if (tal <= 9) {
                gættet = "højere";

            } else if (tal == 10) {
                gættet = "rigtigt";
            } else {
                if (tal >= 11) {
                    gættet = "lavere";
                }


                String answer;
                answer=Keyboard.next();
                if (answer.equals("Rigtigt")) Gæt=false;
                }
            }
        }
    }



            

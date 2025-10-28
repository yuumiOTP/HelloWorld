import java.util.Random;
import java.util.Scanner;

public class DicemannLoop {
    public static void main(String[] args) {
        System.out.println("Velkommen til DicemannLoop");
        Random gen;
        gen=new Random();
        boolean KeepGoing=true;
        Scanner keyboard=new Scanner(System.in);

        while(KeepGoing){

            int tal;
            tal=gen.nextInt(6)+1;
            String activity="";
            if (tal==1) {
                activity="Breakfast";
            } else
            if (tal==2) {
                activity="Study";
            } else
            if (tal==3) {
                activity="Swim";
            } else
            if (tal==4) {
                activity="Go fishing";
            } else
            if (tal==5) {
                activity="Call mom";
            } else
            if (tal==6) {
                activity="Back to bed";
            }
            System.out.println(activity);
//            if (tal==6) KeepGoing=false;
            System.out.println("Vil du stoppe? (y/n)");
            String answer;
            answer=keyboard.next();
            if (answer.equals("y")) KeepGoing=false;
        }
    }
}

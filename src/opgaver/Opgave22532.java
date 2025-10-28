package opgaver;

import java.util.Scanner;

public class Opgave22532 {
    public static void main(String[] args) {
        int i = (int) (Math.random() * 20 + 1);
    boolean KeepGoing = true;
    Scanner Keyboard=new Scanner(System.in);
    while (KeepGoing) {
        int værdi = i;
        String svar="";
        if (værdi<=i-1){
        svar="højere";
        } else
        if (værdi==i){
            svar="rigtigt";
        } else
        if (værdi>=i+1){
            svar="lavere";
        }
        System.out.println("Gæt på det rigtige tal");
        String answer;
        answer=Keyboard.next();
        if (answer.equals(i)) KeepGoing=false;
}
    }
}
package opgaver;

import java.util.Random;

public class VeksleProgram {
    public static void main(String[] args) {
        Random gen;
        gen=new Random();
        double dollar,euro, exchange, mincharge, kommission;
        dollar=100;
        euro=dollar*0.85;
        exchange = dollar*0.02;
        mincharge = dollar-0.5;
        if (exchange>0.5)
                System.out.println("Du har vekslet "+dollar+ " dollars til " +euro+ " euro. Kommissionen var " +exchange+ " dollars");
        else

            System.out.println("Du har vekslet "+dollar+ " dollars til " +mincharge+ " euro. Kommissionen var 0.5 dollars");
    }
}

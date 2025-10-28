package opgaver;

import java.util.Random;

public class Alder2 {
    public static void main(String[] args) {
        Random gen;
        gen=new Random();
        int alder;
        alder=gen.nextInt(85)+16;
        if (alder>=18)
            System.out.println("Du er myndig");
        else
            System.out.println("Du er ikke myndig");
        System.out.println("Du er " +alder+ " år.");
    }
}

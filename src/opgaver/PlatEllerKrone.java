package opgaver;

import java.util.Random;

public class PlatEllerKrone {
public static void main(String[] args) {
    System.out.println("Velkommen til Plat eller Krone");
    Random gen=new Random();

    int tal=gen.nextInt(2);
    if(tal==0) {
        System.out.println("Plat");
        System.out.println("Tilykke du har vundet");
    }
    else {
        System.out.println("Krone");
    System.out.println("Øv, du har tabt");}
    }
}
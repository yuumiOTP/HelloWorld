import java.util.Scanner;

public class ValutaOmregnerVælge {
    public static void main(String[] args) {
        //system variabler
        Scanner input = new Scanner(System.in);
        String userInput = "";

        // Valuta variabler

        double DKK_til_SEK = 1.36;   // 1 DKK = 1.36 SEK
        double DKK_til_NOK = 1.34;   // 1 DKK = 1.34 NOK
        double DKK_til_EUR = 0.13;   // 1 DKK = 0.13 EUR
        double DKK_til_ISK = 19.5;   // 1 DKK = 19.5 ISK


        System.out.println("Velkommen til Valuta Omregner");
        System.out.println("Her kan du veklse fra danske kroner til svenske, norske, finske euro eller islandske kroner");



        while (true) {
            System.out.println("\nIndtast beløb i danske kroner (Tast 0 for at afslutte programmet):");
            double belob = input.nextDouble();
            if (belob == 0) {
                System.out.println("Programmet lukkes");
                break;
            }
            System.out.println("Tast 1 for svenske kroner");
            System.out.println("Tast 2 for norske kroner);Tast 2 for norske kroner");
            System.out.println("Tast 3 for finske euro");
            System.out.println("Tast 4 for islandske kroner");
            System.out.println("Indtast valuta");
            int valg;
            valg = input.nextInt();
            double resultat = 0;
            String valutaNavn ="";


            switch (valg) {
                case 1:
                    resultat = belob * DKK_til_SEK;
                    valutaNavn = "SEK";
                    break;
                case 2:
                    resultat = belob * DKK_til_NOK;
                    valutaNavn = "NOK";
                    break;
                case 3:
                    resultat = belob * DKK_til_EUR;
                    valutaNavn = "EUR";
                    break;
                case 4:
                    resultat = belob * DKK_til_ISK;
                    valutaNavn = "ISK";
                    break;
                default:
                    System.out.println("Ugyldigt valg. Prøv igen");
                    continue; // gå tilbage til start af løkken
            }
            System.out.println("Til udbetaling " + resultat + " " + valutaNavn);

        }
    }
}

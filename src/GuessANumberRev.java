
    import java.util.Scanner;

    public class GuessANumberRev {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            int lav = 1;
            int høj = 100;
            int gæt;
            String svar;

            System.out.println("Tænk på et tal mellem 1 og 100, og jeg vil prøve at gætte det.");

            while (true) {
                gæt = (lav + høj) / 2;
                System.out.println("Er dit tal " + gæt + "? (svar 'for højt', 'for lavt' eller 'korrekt')");
                svar = scanner.nextLine().toLowerCase();

                if (svar.equals("korrekt")) {
                    System.out.println("Wow! Jeg gættede dit tal.");
                    break;
                } else if (svar.equals("for højt")) {
                    høj = gæt - 1;
                } else if (svar.equals("for lavt")) {
                    lav = gæt + 1;
                } else {
                    System.out.println("Ugyldigt svar. Vær venlig at svar med 'for højt', 'for lavt' eller 'korrekt'.");
                }
            }

            scanner.close();
        }
    }


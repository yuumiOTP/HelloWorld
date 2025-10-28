package FIlerIndogUd;

import java.io.*;
import java.util.*;

public class CopenhagenMarathon3 {

    public static void main(String[] args) throws IOException {
        FileReader fil = new FileReader("src//Copenhagen Marathon.txt");
        BufferedReader ind = new BufferedReader(fil);
        ArrayList<String> participants = new ArrayList<>();

        String linje = ind.readLine();
        while (linje != null) {
            participants.add(linje);
            linje = ind.readLine();
        }
        ind.close();

        // Behandling af hver deltager
        for (String participant : participants) {
            String[] data = participant.split(";");
            if (data.length == 3) {
                String name = data[0];
                String startNumber = data[1];
                String startGroup = data[2];
                printAndSaveConfirmation(name, startNumber, startGroup);
            } else {
                System.out.println("Ugyldig linje: " + participant);
            }
        }
    }

    static void printAndSaveConfirmation(String name, String startNumber, String startGroup) throws IOException {
        String message =
                "Dear " + name + " !\n" +
                        "We are happy to receive your registration.\n" +
                        "Your start number is: " + startNumber + "\n" +
                        "You start in start group: " + startGroup + "\n" +
                        "Please check in 10 minutes before start.\n";

        // Udskriv til konsol
        System.out.println(message);

        // Gem til fil med underscore i stedet for mellemrum
        String filename = "src//" + name.replace(" ", "_") + ".txt";

        FileWriter fil = new FileWriter(filename);
        PrintWriter ud = new PrintWriter(fil);
        ud.print(message);
        ud.close();
    }
}
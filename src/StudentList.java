import java.io.*;
import java.util.ArrayList;

public class StudentList {
    public static void main(String[] arg) throws IOException {

        FileReader fil = new FileReader("src//Studentlist.txt");
        BufferedReader ind = new BufferedReader(fil);
        ArrayList<String> list = new ArrayList<>();
        String linje = ind.readLine();
        while (linje != null) {
            String[] bidder = linje.split(";");
            String efternavn=bidder[1];
            list.add(efternavn);
            linje = ind.readLine();
        }
        ind.close();
        list.sort(null);
        System.out.println(list);
        for (String s : list) {
            System.out.println(s);
        }
        save(list);
    } // main()

    static void save(ArrayList<String> l) throws IOException {
        FileWriter fil = new FileWriter("src//StudentlistSorted.txt");
        PrintWriter ud = new PrintWriter(fil);
        for (String s : l) {
            ud.println(s);
        }
        ud.close();
    }
}

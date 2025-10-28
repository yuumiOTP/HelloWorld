import java.io.*;
import java.util.ArrayList;

public class StudentList2 {
    public static void main(String[] arg) throws IOException {

        FileReader fil = new FileReader("src//Studentlist.txt");
        BufferedReader ind = new BufferedReader(fil);
        ArrayList<Student> list = new ArrayList<>();
        String linje = ind.readLine();
        while (linje != null) {
            String[] bidder = linje.split(";");
            Student s=new Student();
            String efternavn=bidder[1];
            s.eMail=bidder[0];
            s.firstName=bidder[1];
            s.lastName=bidder [2];
            s.Hold=bidder[3];
            list.add(s);
            linje = ind.readLine();
        }
        ind.close();

        list.sort(null);
        System.out.println(list);
        for (Student s : list) {
            System.out.println(s);
        }
       save(list);

    } // main()

    static void save(ArrayList<Student> l) throws IOException {
        FileWriter fil = new FileWriter("src//StudentlistSorted2.txt");
        PrintWriter ud = new PrintWriter(fil);
        for (Student s : l) {
            ud.println(s);
        }
        ud.close();
    }
}
    class Student implements Comparable<Student>{
        String firstName;
        String lastName;
        String eMail;
        String Hold;

        public String toString(){
            return lastName+" "+firstName+" "+eMail;
        }

        public int compareTo(Student s){
            return this.lastName.compareTo(s.lastName);
            //return lastName.length()-s.lastName.length();
        }
    }


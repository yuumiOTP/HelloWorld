package opgaver;

public class BankApp1 {
    public static void main(String[] args) {
        double konto;
        konto=50.25;
        String name="Ole Hansen";
        int accountNo=1;

        double konto_2=30;
        String name_2="Laura Martens Poulsen";
        int accountNo_2=2;
        konto_2+=150;
        System.out.println("Konto "+accountNo+ ": " +name+" "+konto);
        System.out.println();
        System.out.println("Konto "+accountNo_2+ ": " +name_2+" "+konto_2);
    }
}

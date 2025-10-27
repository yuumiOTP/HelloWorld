public class MultiplicationTable {
    public static void main(String[] args) {
        for (int n=1; n<=10; n++){
            for (int i = 1; i <= 10; i++) {
                System.out.print(i*n+ "\t");
            }
            System.out.println();
        }
    }
}

package opgaver;

public class Opgave2252 {
    public static void main(String[] args) {
        int sum = 0;
        int limit = 20;
        for (int i = 1; i <= limit; i++) {
            sum +=i;
        }
        System.out.println("værdien af tallene fra 1 til " +limit+ " plusset sammen er " +sum);
        }
    }

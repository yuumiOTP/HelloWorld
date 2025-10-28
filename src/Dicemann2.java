import java.util.Random;

public class Dicemann2 {
    public static void main(String[] args) {
        System.out.println("Velkommen til Dicemann");
        Random gen;
        gen=new Random();

        int tal;
        tal=gen.nextInt(6)+1;
        switch (tal)
        {
            case 1:
                System.out.print("Breaktfast");
                break;
            case 2:
                System.out.print("Study");
                break;
            case 3:
                System.out.print("Swim");
                break;
            case 4:
                System.out.print("Go Fishing");
                break;
            case 5:
                System.out.print("Call Mom");
                break;
            default:
                System.out.print("Go back to bed");
        }
    }
}

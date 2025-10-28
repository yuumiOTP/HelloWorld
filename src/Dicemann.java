import java.util.Random;

public class Dicemann {
    public static void main(String[] args) {
        System.out.println("Velkommen til Dicemann");
        Random gen;
        gen=new Random();

        int tal;
        tal=gen.nextInt(6)+1;
        String activity="";
        if (tal==1) {
            activity="Breakfast";
        } else
        if (tal==2) {
            activity="Study";
        } else
        if (tal==3) {
            activity="Swim";
        } else
        if (tal==4) {
            activity="Go fishing";
        } else
        if (tal==5) {
            activity="Call mom";
        } else
        if (tal==6) {
            activity="Back to bed";
        }
        System.out.println(activity);
    }
}

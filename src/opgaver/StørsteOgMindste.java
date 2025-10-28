package opgaver;

public class StørsteOgMindste {
    public static void main(String[] args) {
        // tilfældige tal i array
        int[] tal = {22,4,87};
        // sorter array
        java.util.Arrays.sort(tal);
        // første index: mindste tal
        int min = tal[0];
        // sidste index: største tal
        int max = tal[tal.length-1];
        System.out.println("Min: " + min + " Max: " + max);

    }
}

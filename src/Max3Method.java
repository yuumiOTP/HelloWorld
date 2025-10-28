public class Max3Method {
    public static void main(String[] args) {
        int a,b,c;
        a=5;
        b=2;
        c=17;
        System.out.println("Størst="+max(max(a,b),c));
    }

    static int max (int x, int y) {
        if (x>y)
            return x;
        else
            return y;

    }

}

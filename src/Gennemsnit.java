public class Gennemsnit {
    public static void main(String[] args) {
    int a=5;
    int b=7;
    int c=9;
    int d=11;
        System.out.println(gennemsnit(a,b,c,d));
    }

    static int gennemsnit(int a, int b, int c, int d){
    int result;
    result = (a+b+c+d) / 4;
    return result;
    }
}

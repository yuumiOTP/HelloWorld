package opgaver;

public class Sum3method {
    public static void main(String[] args) {
        int a=5;
        int b=7;
        int c=1;
        int sum=sum(a,b,c);
        System.out.println("sum="+sum);
        // kan også skrives som - 1,2 og 3 bliver så tildelt til a,b og c
        System.out.println(sum(1,2,3));
    }
    static int sum(int a, int b, int c) {
        int result;
        result=a+b+c;
        return result;
    }

}

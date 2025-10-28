import java.util.ArrayList;

public class Polynomier {
    public static void main(String[] args) {

        ArrayList<Polynomier> list = new ArrayList<Polynomier>();
        System.out.println(list);

        for (Polynomier p:list) {
    }

        abstract class Polynomium {
            abstract double F(double x);
        }


        class FørstegradsPolynomium extends Polynomium {
            int a;
            int b;
            double x;

            double F(double x) {return a * x + b;}


        }
        class andengradsPolynomium extends Polynomium {
            int a;
            int b;
            double x;
            andengradsPolynomium(double anden){result=anden;}
            double result =Math.pow(x,2);

            double F(double x) {return a * result + b;}
            public String toString() {return "Svaret for andengradspolynomiet=" +result;}

        }
    }
}

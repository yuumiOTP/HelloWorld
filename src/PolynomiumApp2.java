import java.util.ArrayList;

public class PolynomiumApp2 {
    public static void main(String[] args) {
        Polynomium p1=new ForstegradsPolynomium(2,4);
        System.out.println(p1);
        System.out.println(p1.f(3));

        Polynomium p2=new AndengradsPolynomium(2,4,6);
        System.out.println(p2);
        System.out.println(p2.f(3));

        ArrayList<Polynomium> list=new ArrayList<Polynomium>();
        list.add(new ForstegradsPolynomium(5,2));
        list.add(new ForstegradsPolynomium(2,7));
        list.add(new AndengradsPolynomium(3,2,1));

        for (Polynomium p:list) System.out.println(p);
        for (Polynomium p:list) System.out.println(p.f(2));
    }
}

abstract class Polynomium {
    abstract double f(double x);
}

class ForstegradsPolynomium extends Polynomium {
    int a,b;
    ForstegradsPolynomium(int a, int b){
        this.a=a;
        this.b=b;
    }

    double f(double x){
        return a*x+b;
    }

    public String toString() {
        return "f(x)="+a+"x+"+b;
    }
}

class AndengradsPolynomium extends Polynomium {
    int a,b,c;
    AndengradsPolynomium(int a, int b, int c){
        this.a=a;
        this.b=b;
        this.c=c;
    }

    double f(double x){
        return a*x*x+b*x+c;
    }

    public String toString() {
        return "f(x)="+a+"x^2+"+b+"x+"+c;
    }
}
import java.util.ArrayList;

public class FigurApp {
    public static void main(String[] args) {
    ArrayList<Figur> list=new ArrayList<Figur>();
    list.add (new Punkt());
    list.add (new Linje(3));
    list.add (new Linje(5));
    list.add (new Rektangel(2,7));
        System.out.println(list);


    for (Figur f:list){
        System.out.println(f+" areal="+f.areal());
    }
    }
}
abstract class Figur{
    abstract double areal();
    abstract double omkreds();
}

class Punkt extends Figur{
    double areal() {return 0;}
    double omkreds() {return 0;}

    public String toString(){return "Punkt";}
}

class Linje extends Figur{
    double laengde;  // meter
    Linje(double l){laengde=l;}
    double areal() {return 0;}
    double omkreds() {return 2*laengde;}
    public String toString(){return "Linje længde="+laengde;}

}

class Rektangel extends Figur{

    double hoejde;
    double bredde;
    Rektangel (double h, double b){
        hoejde=h;
        bredde=b;
    }
    double areal(){return hoejde*bredde;}
    double omkreds(){return 2*(hoejde+bredde);}
    public String toString() {return "Rektangel højde="+hoejde+" bredde="+bredde;}
}


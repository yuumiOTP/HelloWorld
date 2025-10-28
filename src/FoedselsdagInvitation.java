public class FoedselsdagInvitation {
    public static void main(String[] args) {
        invitation("Kaere", "Ole");
        invitation("Hej", "Pia");
        invitation("Til", "Lis");
    }
    static void invitation(String hilsen, String navn){
        System.out.println(hilsen+ " "+navn);
        System.out.println("Det vil glaede mig at se dig til min foedselsdag");
        System.out.println("Onsdag d. 14/4 paa Dronning Sofiesvej 78");
        System.out.println("SU: senest 1/4");
        System.out.println();
    }
}

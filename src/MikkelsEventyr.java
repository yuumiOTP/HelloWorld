import java.sql.SQLOutput;
import java.util.Scanner;

public class MikkelsEventyr {
    public static void main(String[] args) {
        // System variabler
        Scanner input = new Scanner(System.in);
        String userInput = "";
        String rødFarve ="\u001B[31m";
        String farveReset ="\u001B[37m";

        //Spiller variabler
        int positionX = 5;
        int positionY = 5;
        String weapon = "Dine bare næver";
        boolean goblinLever = true;
        System.out.println("Velkommen til MikkelsEventyr");
        boolean keepGoing=true;
        while (keepGoing) {
            System.out.println("Hvad vil du gerne gøre, tapre ridder?\n"+
                    "N - Gå mod nord \n"+
                    "E - Gå mod øst \n"+
                    "S - Gå mod syd \n"+
                    "W - Gå mod vest \n");
            System.out.println(positionX+","+positionY);
            userInput = input.nextLine();
            userInput = userInput.toUpperCase();

            switch (userInput) { //"N" != "N"
                case"N":
                    System.out.println("Du har valgt at gå mod nord");
                    positionY++;
                    break;
                case"E":
                    System.out.println("Du har valgt at gå mod øst");
                    positionX++;
                    break;
                case"S":
                    System.out.println("Du har valgt at gå mod syd");
                    positionY--;
                    break;
                case"W":
                    System.out.println("Du har valgt at gå mod vest");
                    positionX--;
                    break;
                    default:
                        System.out.println("Hov, det var ikke et korrekt input.");

                }
            if(positionX == 3 && positionY == 3){
                if (goblinLever) {
                    System.out.println("Åh, tapre ridder. Goblin manden har taget mig til fange. Slå ham ihjel");
                }
                else{
                    System.out.println("Tak, tapre ridder, du har reddet  mig!");
                    System.out.println("Tillykke, du har vundet spillet");
                    keepGoing=false;
                }

            }
            if (positionX == 8 && positionY == 2){
                System.out.println("Tillykke, du har fundet et sværd");
                weapon = "sværd";
            }
            if (positionX == 4 && positionY == 8){
                System.out.println("Du har fundet den grumme goblin!\n"+
                        "Du slår ham med " +weapon);
                if(weapon.equals("sværd")) {
                    System.out.println("Goblinen er død");
                }else{
                    System.out.println(rødFarve+"you died" +farveReset);
                    keepGoing=false;


                }

            }
        }

    }


}

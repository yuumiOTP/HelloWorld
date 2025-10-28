package DiceGame;

public class OneHundred {
    Player p1 = new Player("Lis");
    Player p2 = new Player("Lars");

    void play() {
        System.out.println(p1.name+"\t"+p2.name);
        while (p1.points < 100 && p2.points < 100) {
            p1.turn();
            p2.turn();
            System.out.println(p1.points + "\t" + p2.points);
            }
        }

        public static void main (String[]args){
            OneHundred game = new OneHundred();
            game.play();

        }

    }

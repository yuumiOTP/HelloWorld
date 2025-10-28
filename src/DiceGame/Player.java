package DiceGame;

public class Player {
    String name;
    Cup cup = new Cup();
    int points = 0;

    Player(String name) {
        this.name = name;
    }

    void turn() {
        cup.roll();
        points = points + cup.getSum();
    }

    public String toString() {
        return name + " " + points;
    }

    public static void main(String[] args) {
        Player p = new Player("Bo");
        while (p.points<100) {
            p.turn();
            System.out.println(p);
        }

    }
}

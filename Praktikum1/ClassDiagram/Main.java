package ClassDiagram;

public class Main {
    public static void main(String[] args){
        Agent Agent1 = new Agent();
        Agent Agent2 = new Agent("cobaagent", 100);
        Player Player1 = new Player();
        Player Player2 = new Player(10, 5);

        Agent1.Info();
        Agent2.Info();
        Player1.InfoPlayer();
        Player2.InfoPlayer();


    }
}


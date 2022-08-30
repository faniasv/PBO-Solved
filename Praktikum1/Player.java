package ClassDiagram;

public class Player {
    private int direction;
    private int id;
    private int strenght;

    public Player (){

    }

    public Player (int pid, int pdirection){
        this.id = pid;
        this.direction = pdirection;
    }

    public void AddStrength (int pstrenght){
        this.strenght = pstrenght;
    }

    public void InfoPlayer(){
        System.out.println("Player ID: " + this.id + "\tDirection:" + this.direction);
    }
}

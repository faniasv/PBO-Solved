package ClassDiagram;

public class Agent {
    private int health;
    private String name;
    private int pos_x;
    private int pos_y;

    public Agent(){

    }

    public Agent(String aname, int ahealth){
        this.name = aname;
        this.health = ahealth;
    }

    public void SetPos (int ax, int ay){
        this.pos_x = ax;
        this.pos_y = ay;
    }

    public int GetPos(){
        return this.pos_x & this.pos_y;
    }

    public void Info(){
        System.out.println("Name: "+this.name + "\tHealth: " + this.health);
    }
}

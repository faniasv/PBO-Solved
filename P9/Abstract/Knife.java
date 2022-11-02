package Abstract;
public class Knife extends Weapon {
    public String knifeEdge;

    @Override
    public void attack(){
        System.out.println("Menyayat dan menusuk musuh.");
    }

    @Override
    public void info(){

    }
}

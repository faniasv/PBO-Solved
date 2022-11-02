package Abstract;
public class Gun extends Weapon{
    public int bullet;

    public Gun(int xbullet){
        this.bullet = xbullet;
    }

    @Override
    public void attack(){
        this.bullet -= 1;
        System.out.println("Menembak musuh.");
        System.out.println("Sisa peluru : " + this.bullet);
    }

    @Override
    public void info(){

    }
}

public class KpopFans extends Fans {
    public KpopFans(){
    }

    public KpopFans(String xname){
        super(xname);
    }

    public void watchingPerformance(Musician msc, String expression) {
        super.showName(); System.out.print(" " + expression + " melihat idolanya"); msc.perform();
    }
}

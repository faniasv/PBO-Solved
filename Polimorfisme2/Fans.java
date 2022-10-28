public class Fans {
    private String name;

    public String getName() {
        return this.name;
    }

    public void setName(String xname) {
        this.name = xname;
    }

    public Fans(){
        this.name = "no name";
    }

    public Fans(String xname){
        this.name = xname;
    }

    public void showName(){
        System.out.print(this.name);
    }

    public void watchingPerformance(){
        showName();
        System.out.println(" melihat idolanya dari YouTube ");
    }

    public void watchingPerformance(Musician msc){
        showName();
        System.out.print(" melihat idolanya");
        msc.perform();
        System.out.println("");
    }
}

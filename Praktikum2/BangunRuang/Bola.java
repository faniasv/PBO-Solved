public class Bola extends BangunRuang{
    private float r;
    private float phi = 22/7;

    public Bola (float xr) {
        this.r = xr;
    }

    @Override
    public void hitungLuas(){
        this.luas = (4*this.phi*r*r);
    }

    public void hitungVolume(){
        this.volume = (4/3*this.phi*this.r*this.r*this.r);
    }
}

public class Balok extends BangunRuang {
    private float p;
    private float l;
    private float t;

    public Balok(float xp, float xl, float xt){
        this.p = xp;
        this.l = xl;
        this.t =xt;
    }

    @Override
    public void hitungLuas(){
        this.luas = (2*((this.p*this.l)+(this.p*this.t)+(this.l*this.t)));
    }

    public void hitungKeliling(){
        this.keliling = (4*(this.p+this.l+this.t));
    }

    public void hitungVolume(){
        this.volume = (this.p*this.l*this.t);
    }
}

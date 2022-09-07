public class Kubus extends BangunRuang{
    private float s;

    public Kubus(float xs)  {
        this.s = xs;
    }

    @Override
    public void hitungLuas(){
        this.luas = (6*this.s*this.s);
    }

    public void hitungKeliling(){
        this.keliling = (12*this.s);
    }

    public void hitungVolume(){
        this.volume =(this.s*this.s*this.s);
    }

}

public class Lingkaran extends BangunDatar {
    private float phi;
    private float r;

    public Lingkaran(float xr){
        this.phi = 22/7;
        this.r = xr;
    }

    @Override
    public void hitungLuas(){
        this.luas = (this.phi*this.r*this.r);
    }

    public void hitungKeliling(){
        this.keliling = (this.phi*2*this.r);
    }
}

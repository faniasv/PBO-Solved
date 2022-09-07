public class PersegiPanjang extends BangunDatar {
    private float p;
    private float l;
    
    public PersegiPanjang(float xp, float xl) {
        this.p = xp;
        this.l = xl;
    }
    
    @Override
    public void hitungLuas(){
        this.luas = (this.p*this.l);
    }
    
    public void hitungKeliling() {
        this.keliling = (2*(this.p+this.l));
    }
}

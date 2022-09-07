public class Persegi extends BangunDatar{
    private float s;
    
    public Persegi (float xs){
        this.s = xs;
    }
    
    @Override
    public void hitungLuas(){
        this.luas = (this.s*this.s);
    }

    @Override
    public void hitungKeliling(){
        this.keliling = (4*this.s);
    }
}

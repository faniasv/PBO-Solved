public class App {
    public static void main(String[] args) throws Exception {
        Lingkaran l = new Lingkaran(8/7);

        l.hitungLuas();
        l.hitungKeliling();
        l.printInfo();
        
        Persegi p = new Persegi(9/5);
        p.hitungLuas();
        p.hitungKeliling();
        p.printInfo();
        
        PersegiPanjang pp = new PersegiPanjang(16/9, 7/2);
        pp.hitungLuas();
        pp.hitungKeliling();
        pp.printInfo();
    }
}

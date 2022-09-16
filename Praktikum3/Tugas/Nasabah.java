public class Nasabah {
    private String namaAwal;
    private String namaAkhir;
    private Tabungan tab;

    public Nasabah(String xnamaAwal, String xnamaAkhir){
        this.namaAwal=xnamaAwal;
        this.namaAkhir=xnamaAkhir;
    }

    public Nasabah(String xnamaAwal, String xnamaAkhir, Tabungan xtab){
        this.namaAwal=xnamaAwal;
        this.namaAkhir=xnamaAkhir;
        this.tab=xtab;
    }

    public void setNamaAwal(String xnamaAwal){
        this.namaAwal=xnamaAwal;
    }

    public void setNamaAkhir(String xnamaAkhir){
        this.namaAkhir=xnamaAkhir;
    }

    public void setTabungan(Tabungan xtab){
        this.tab=xtab;
    }

    public String getNamaAwal(){
        return this.namaAwal;
    }

    public String getNamaAkhir(){
        return this.namaAkhir;
    }

    public Tabungan getTabungan(){
        return this.tab;
    }

    @Override
    public String toString() {
        return "Nasabah{" + "namaAwal=" + namaAwal + ", namaAkhir=" + namaAkhir + ", tabungan=" + tab.getSaldo()+ '}';
    }
}

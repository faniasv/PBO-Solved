public class Bank  {
    private Nasabah[] nsbh = new Nasabah[100];
    int jumlahNasabah;

    public Bank(){
    }

    public void tambahNasabah(int Xnsbh,String namaAwal, String namaAkhir){
        nsbh[Xnsbh] = new Nasabah (namaAwal, namaAkhir);
        this.jumlahNasabah += 1;
    }

    public int getJumlahNasabah(){
        return jumlahNasabah;
    }

    public Nasabah getNasabah(int i){
        return nsbh[i];
    }

    public void getNasabah (String xnamaAwal){
        for (int i=1; i<=jumlahNasabah; i++){
            if (nsbh[i].getNamaAwal() == xnamaAwal) {
                System.out.println(nsbh[i]);
            }
        }
    }

    public void getNasabah (String xnamaAwal, String xnamaAkhir){
        for (int i=1; i<=jumlahNasabah; i++){
            if (nsbh[i].getNamaAwal() == xnamaAwal || nsbh[i].getNamaAkhir() == xnamaAkhir) {
                System.out.println(nsbh[i]);
            } 
        }
    }

}

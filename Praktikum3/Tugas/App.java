public class App {
    public static void main(String[] args) throws Exception {
        int temp, temp1;
        Nasabah jh = new Nasabah("Jaehyun", "Jung", new Tabungan(100000));
        Nasabah jn = new Nasabah("Johnny", "Suh", new Tabungan(150000));
        System.out.println("Nasabah atas nama : " + jh.getNamaAwal() + " " + jh.getNamaAkhir());
        System.out.println("Nasabah atas nama : " + jn.getNamaAwal() + " " + jn.getNamaAkhir());
        temp = jh.getTabungan().getSaldo();
        temp1 = jn.getTabungan().getSaldo();

        System.out.println("Saldo awal: "+temp1);
        System.out.println("Saldo awal: "+temp);
        jh.getTabungan().simpanUang(4000);
        System.out.println("Jumlah uang yang disimpan: 4000");
        jh.getTabungan().ambilUang(5000);
        System.out.print("Jumlah uang yang diambil : 5000");
        jh.getTabungan().transfer(jn.getTabungan(), 20000);
        jn.toString();
        jh.toString();
        
               /*Membuat objek Bank */
        Bank pens = new Bank();

        /*Membuat objek Nasabah */
        pens.tambahNasabah(1, "Andi", "Sucipto");
        pens.getNasabah(1).setTabungan(new Tabungan(250000));
        pens.tambahNasabah(2, "Candra", "Dinata");
        pens.getNasabah(2).setTabungan(new Tabungan(100000));
        pens.tambahNasabah(3, "Budi", "Dirgantara");
        pens.getNasabah(3).setTabungan(new Tabungan(400000));
        pens.tambahNasabah(4, "Dede", "Kusuma");
        pens.getNasabah(4).setTabungan(new Tabungan(350000));
        pens.tambahNasabah(5, "Dede", "Andika");
        pens.getNasabah(5).setTabungan(new Tabungan(400000));
        pens.tambahNasabah(6, "Budi", "Dirgantara");
        pens.getNasabah(6).setTabungan(new Tabungan(400000));

        /*Mendapat informasi jumlah Nasabah */
        System.out.println("Jumlah Nasabah : " + pens.getJumlahNasabah());

        /*Mendapat informasi Nasabah indeks ke-3 */
        System.out.println("Nasabah indeks ke-3 : " + pens.getNasabah(3));

        /*Mendapat informasi Nasabah namaAwal = Candra dan namaAkhir = Dinata */
        pens.getNasabah("Nasabah namaAwal = Candra dan namaAkhir = Dinata" + "Candra", "Dinata");

        /*Mendapat informasi Nasabah namaAwal */
        System.out.println("Nasabah namaAwal : Dede");
        pens.getNasabah("Dede");
        System.out.println("Nasabah namaAwal : Budi");
        pens.getNasabah("Budi");
    }
}

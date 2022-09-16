public class App {
    public static void main(String[] args) throws Exception {
        int temp;
        Nasabah jh = new Nasabah("Jaehyun", "Jung", new Tabungan(100000));
        System.out.println("Nasabah atas nama : " + jh.getNamaAwal() + " " + jh.getNamaAkhir());
        temp = jh.getTabungan().getSaldo();

        System.out.println("Saldo awal: "+temp);
        jh.getTabungan().simpanUang(4000);
        System.out.println("Jumlah uang yang disimpan: 4000");
        jh.getTabungan().ambilUang(5000);
        System.out.print("Jumlah uang yang diambil : 5000");
    }
}

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
    }
}

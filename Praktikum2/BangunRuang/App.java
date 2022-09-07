public class App {
    public static void main(String[] args) throws Exception {
        Balok bb = new Balok(12/5, 12/3, 6/4);
        bb.hitungLuas();
        bb.hitungKeliling();
        bb.hitungVolume();
        bb.printInfo();

        Bola bl = new Bola(88/3);
        bl.hitungLuas();
        bl.hitungVolume();
        bl.printInfo();

        Kubus kk = new Kubus(12/7);
        kk.hitungLuas();
        kk.hitungKeliling();
        kk.hitungVolume();
        kk.printInfo();
    }
}

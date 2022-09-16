public class Tabungan {
    private int saldo;

    public Tabungan(int xsaldo){
        this.saldo=xsaldo;
    }

    public int getSaldo(){
        return this.saldo;
    }

    public void simpanUang(int jumlah){
        this.saldo += jumlah;
    }

    public boolean ambilUang(int jumlah){
        boolean check=false;

        if(jumlah>this.saldo){
            check=false;
            System.out.println("Ambil uang tidak berhasil");
        } else if(jumlah<=this.saldo){
            check=true;
            this.saldo-=jumlah;
            System.out.println("Ambil uang berhasil");
        }return check;
    }

    public boolean transfer(Tabungan t, int jumlah){
        boolean check=false;

        if(jumlah>t.saldo){
            check=false;
            System.out.println("Transfer tidak berhasil");
        } else if(jumlah<=t.saldo){
            check=true;
            t.saldo-=jumlah;
            System.out.println("Transfer berhasil");
        }return check;
    }
}

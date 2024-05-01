package TugasPBO_perulangan;

public class PerulanganIf {
    public static void main(String[] args){
        String nama = "Jabbar";
        String kode = "12345";
        double jumlahUang = 1000000;
        double pengeluaran = 200000;
        
        System.out.println("Transaksi Penarikan Tunai Bank Sejahtera");
        System.out.println("");

        if (jumlahUang > pengeluaran) {
            System.out.println("Nama Pengguna        : " + nama);
            System.out.println("Kode Pengguna        : " + kode);
            
            double jumlahAkhir = jumlahUang - pengeluaran;

            System.out.println("Jumlah Uang Awal     : Rp" + jumlahUang);
            System.out.println("Pengeluaran Hari Ini : Rp" + pengeluaran);
            System.out.println("Jumlah Uang Akhir    : Rp" + jumlahAkhir);
        } else if (jumlahUang == pengeluaran) {
            System.out.println("Nama Pengguna        : " + nama);
            System.out.println("Kode Pengguna        : " + kode);
            
            double jumlahAkhir = jumlahUang - pengeluaran;

            System.out.println("Jumlah Uang Awal     : Rp" + jumlahUang);
            System.out.println("Pengeluaran Hari Ini : Rp" + pengeluaran);
            System.out.println("Jumlah Uang Akhir    : Rp" + jumlahAkhir);
        } else {
            System.out.println("Nama Pengguna        : " + nama);
            System.out.println("Kode Pengguna        : " + kode);
            System.out.println("");
            System.out.println("Peringatan!!! Transaksi anda error!!!");
        } 
    }
}

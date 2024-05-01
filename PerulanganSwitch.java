package TugasPBO_perulangan;

public class PerulanganSwitch {
    public static void main(String[] args){
        System.out.println("Loket Bus Sumber Agung");
        System.out.println("Tujuan Perjalanan :");
        System.out.println("1. Banjarmasin");
        System.out.println("2. Riam Kanan");
        System.out.println("3. Kandangan");
        System.out.println("4. Tanjung");
        System.out.println("5. Tanah Bumbu");
        System.out.println("6. Palangkaraya");
        System.out.println("");

        String nama = "Jabbar";
        String kode = "12345";
        String jumlahTiket = "2";
        int tujuan = 4;

        System.out.println("-----------------------------");
        System.out.println("Transaksi Pemesanan Tiket");

        switch (tujuan) {
            case 1:
                System.out.println("Nama Pemesan : " + nama);
                System.out.println("Kode Pesanan : " + kode);
                System.out.println("Jumlah Tiket : " + jumlahTiket);
                System.out.println("Tujuan       : Banjarmasin");
                System.out.println("");
                System.out.println("Terimakasih telah memesan tiket di BUs Sumber Agung, Semoga anda sampai ke Banjarmasin dengan selamat!!");
                System.out.println("");
                break;
            case 2:
                System.out.println("Nama Pemesan : " + nama);
                System.out.println("Kode Pesanan : " + kode);
                System.out.println("Jumlah Tiket : " + jumlahTiket);
                System.out.println("Tujuan       : Riam Kanan");
                System.out.println("");
                System.out.println("Terimakasih telah memesan tiket di BUs Sumber Agung, Semoga anda sampai ke Riam Kanan dengan selamat!!");
                System.out.println("");
                break;
            case 3:
                System.out.println("Nama Pemesan : " + nama);
                System.out.println("Kode Pesanan : " + kode);
                System.out.println("Jumlah Tiket : " + jumlahTiket);
                System.out.println("Tujuan       : Kandangan");
                System.out.println("");
                System.out.println("Terimakasih telah memesan tiket di BUs Sumber Agung, Semoga anda sampai ke Kandangan dengan selamat!!");
                System.out.println("");
                break;
            case 4:
                System.out.println("Nama Pemesan : " + nama);
                System.out.println("Kode Pesanan : " + kode);
                System.out.println("Jumlah Tiket : " + jumlahTiket);
                System.out.println("Tujuan       : Tanjung");
                System.out.println("");
                System.out.println("Terimakasih telah memesan tiket di BUs Sumber Agung, Semoga anda sampai ke Tanjung dengan selamat!!");
                System.out.println("");
                break;
            case 5:
                System.out.println("Nama Pemesan : " + nama);
                System.out.println("Kode Pesanan : " + kode);
                System.out.println("Jumlah Tiket : " + jumlahTiket);
                System.out.println("Tujuan       : Tanah Bumbu");
                System.out.println("");
                System.out.println("Terimakasih telah memesan tiket di BUs Sumber Agung, Semoga anda sampai ke Tanah Bumbu dengan selamat!!");
                System.out.println("");
                break;
            case 6:
                System.out.println("Nama Pemesan : " + nama);
                System.out.println("Kode Pesanan : " + kode);
                System.out.println("Jumlah Tiket : " + jumlahTiket);
                System.out.println("Tujuan       : Palangkaraya");
                System.out.println("");
                System.out.println("Terimakasih telah memesan tiket di BUs Sumber Agung, Semoga anda sampai ke Palangkaraya dengan selamat!!");
                System.out.println("");
                break;
            default:
                System.out.println("Tujuan yang anda masukkan salah!!!");
                System.out.println("");
                break;
        }
    }
}

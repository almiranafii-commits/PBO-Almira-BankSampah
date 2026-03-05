public class Main {
    public static void main(String[] args) {

        // Membuat objek nasabah
        Nasabah nasabah1 = new Nasabah("Almira", 101, "Sidoarjo");

        // Membuat objek sampah
        Sampah sampah1 = new Sampah("Plastik", "kg", 5000);

        // Membuat transaksi
        Transaksi transaksi1 = new Transaksi(
                "04-03-2026",
                1,
                3.5,
                nasabah1,
                sampah1
        );

        // Proses transaksi
        transaksi1.prosesTransaksi();

        // Tampilkan hasil
        transaksi1.tampilkanTransaksi();
        System.out.println();
        nasabah1.tampilkanProfil();
    }
}

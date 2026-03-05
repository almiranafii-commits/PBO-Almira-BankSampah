public class Transaksi {

    private String tanggal;
    private int idTransaksi;
    private double beratSampah;
    private double totalNominal;
    private Nasabah nasabah;
    private Sampah sampah;

    // Constructor
    public Transaksi(String tanggal, int idTransaksi, double beratSampah,
                     Nasabah nasabah, Sampah sampah) {
        this.tanggal = tanggal;
        this.idTransaksi = idTransaksi;
        this.beratSampah = beratSampah;
        this.nasabah = nasabah;
        this.sampah = sampah;
        this.totalNominal = hitungTotal();
    }

    public double hitungTotal() {
        return beratSampah * sampah.getHargaPerSatuan();
    }

    public void prosesTransaksi() {
        nasabah.tambahSaldo(totalNominal);
    }

    public void tampilkanTransaksi() {
        System.out.println("=== DETAIL TRANSAKSI ===");
        System.out.println("Tanggal: " + tanggal);
        System.out.println("ID Transaksi: " + idTransaksi);
        System.out.println("Jenis Sampah: " + sampah.getNamaJenis());
        System.out.println("Berat: " + beratSampah + " kg");
        System.out.println("Total: Rp " + totalNominal);
    }
}
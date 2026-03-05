public class Sampah {

    private String namaJenis;
    private String satuan;
    private double hargaPerSatuan;

    // Constructor
    public Sampah(String namaJenis, String satuan, double hargaPerSatuan) {
        this.namaJenis = namaJenis;
        this.satuan = satuan;
        this.hargaPerSatuan = hargaPerSatuan;
    }

    public void updateHarga(double hargaBaru) {
        this.hargaPerSatuan = hargaBaru;
    }

    public double getHargaPerSatuan() {
        return hargaPerSatuan;
    }

    public String getNamaJenis() {
        return namaJenis;
    }
}
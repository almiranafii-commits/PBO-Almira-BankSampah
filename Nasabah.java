public class Nasabah {

    private String nama;
    private int idNasabah;
    private String alamat;
    private double saldoTerkumpul;

    // Constructor
    public Nasabah(String nama, int idNasabah, String alamat) {
        this.nama = nama;
        this.idNasabah = idNasabah;
        this.alamat = alamat;
        this.saldoTerkumpul = 0.0;
    }

    public void tambahSaldo(double jumlah) {
        this.saldoTerkumpul += jumlah;
    }

    public void tampilkanProfil() {
        System.out.println("=== PROFIL NASABAH ===");
        System.out.println("Nama: " + nama);
        System.out.println("ID: " + idNasabah);
        System.out.println("Alamat: " + alamat);
        System.out.println("Saldo: Rp " + saldoTerkumpul);
    }

    public double getSaldoTerkumpul() {
        return saldoTerkumpul;
    }
}
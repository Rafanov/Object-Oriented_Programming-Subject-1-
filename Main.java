
package UMKMKoptiKeliling;

public class Main {
    public static void main(String[] args) {
        ManajemenGaji manajemen = new ManajemenGaji();

        Karyawan kontrak = new KaryawanKontrak("Budi Santoso", "K001", "Sempaja", 2500000, 500000);
        Karyawan paruhWaktu = new KaryawanParuhWaktu("Dewi Lestari", "K002", "Perjuangan", 9, 50000);

        manajemen.tambahKaryawan(kontrak);
        manajemen.tambahKaryawan(paruhWaktu);

        manajemen.tampilkanTotalGaji();
    }
}


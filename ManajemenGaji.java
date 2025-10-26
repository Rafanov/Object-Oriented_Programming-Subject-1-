package UMKMKoptiKeliling;

import java.util.ArrayList;
import java.util.List;

class ManajemenGaji {
    private List<Karyawan> daftarKaryawan;
    public ManajemenGaji() {
        daftarKaryawan = new ArrayList<>();
    }
    public void tambahKaryawan(Karyawan karyawan) {
        daftarKaryawan.add(karyawan);
    }
    public void tampilkanTotalGaji() {
        System.out.println("===== DAFTAR GAJI KARYAWAN UMKM KOPTI KELILING =====");
        for (Karyawan k : daftarKaryawan) {
            String tipe = (k instanceof KaryawanKontrak) ? "Karyawan Kontrak" : "Karyawan Paruh Waktu";
            System.out.println("Nama        : " + k.getNama());
            System.out.println("NIP         : " + k.getNip());
            System.out.println("Alamat      : " + k.getAlamat());
            System.out.println("Tipe        : " + tipe);
            System.out.println("Total Gaji  : Rp " + k.hitungGaji());
            System.out.println("------------------------------------------------------");
        }
    }
}

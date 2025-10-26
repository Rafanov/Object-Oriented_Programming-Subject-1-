
package UMKMKoptiKeliling;

abstract class Karyawan {
    private String nama;
    private String nip;
    private String alamat;

    public Karyawan(String nama, String nip, String alamat) {
        this.nama = nama;
        this.nip = nip;
        this.alamat = alamat;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getNip() {
        return nip;
    }

    public void setNip(String nip) {
        this.nip = nip;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }
    
    public abstract double hitungGaji();
}

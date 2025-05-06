public class PrjDivisiPerusahaan {
    public static void main(String[] args) {
        System.out.println("DIVISI PERUSAHAAN!");
        Perusahaan perusahaan = new Perusahaan();
        perusahaan.setNamaPerusahaan("PT. ABC");
        perusahaan.setLokasi("Jl. Raya No. 123");
        perusahaan.setDivisi("IT", 10);
        perusahaan.infoPerusahaan();
    }
}

class Divisi{
    private String nama;
    private int jumlahKaryawan;

    Divisi(){
        this.nama = "";
        this.jumlahKaryawan = 0;
    }

    public void setNama(String nama){
        this.nama = nama;
    }

    public void setJumlahKaryawan(int jumlahKaryawan){
        this.jumlahKaryawan = jumlahKaryawan;
    }
    
    public void infoDivisi(){
        System.out.println("Divisi : " + this.nama);
        System.out.println("Total : " + this.jumlahKaryawan);
    }

}

class Perusahaan{
    private String namaPerusahaan;
    private String lokasi;
    private Divisi divisi;

    Perusahaan(){
        this.divisi = new Divisi();
    }

    public void setNamaPerusahaan(String namaPerusahaan){
        this.namaPerusahaan = namaPerusahaan;
    }

    public void setLokasi(String lokasi){
        this.lokasi = lokasi;
    }

    public void setDivisi(String nama, int jumlahKaryawan){
        this.divisi.setNama(nama);
        this.divisi.setJumlahKaryawan(jumlahKaryawan);
    }

    public void infoPerusahaan(){
        System.out.println("Nama Perusahaan: " + this.namaPerusahaan);
        System.out.println("Lokasi: " + this.lokasi);
        this.divisi.infoDivisi();
    }

}


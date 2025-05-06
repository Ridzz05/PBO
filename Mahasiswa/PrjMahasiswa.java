package Mahasiswa;

public class PrjMahasiswa {
    public static void main(String[] args) {
        System.out.println("Project Mahasigma");
        Mahasiswa mahasiswa = new Mahasiswa("242828240069", "Rizki");
        mahasiswa.getMahasiswa();

        Jurusan jurusan = new Jurusan("IF", "Informatika");
        jurusan.setMahasiswa(mahasiswa);
        jurusan.getMahasiswa();
    }
}

class Mahasiswa{
    private String npm;
    private String nama;

    Mahasiswa(String npm, String nama){
        this.npm = npm;
        this.nama = nama;
    }
    public String getNpm(){
        return this.npm;
    }
    public String getNama(){
        return this.nama;
    }

    public void getMahasiswa(){
        System.out.println("NPM: " + this.npm);
        System.out.println("Nama: " + this.nama);
    }
}

class Jurusan{
    private String kode;
    private String nama;
    private Mahasiswa[] mahasiswa = new Mahasiswa[25];
    private int jumlahMahasiswa;

    Jurusan(String kode, String nama){
        this.kode = kode;
        this.nama = nama;
        this.jumlahMahasiswa = 0;
    }

    public void setMahasiswa(Mahasiswa mahasiswa){
        this.mahasiswa[0] = mahasiswa;
        jumlahMahasiswa++;
   }

    public void getMahasiswa(){
        System.out.println("Kode: " + this.kode);
        System.out.println("Nama: " + this.nama);
        System.out.println("Jumlah Mahasiswa: " + this.jumlahMahasiswa);
        System.out.println("Daftar Mahasiswa:");
        for(int i = 0; i < jumlahMahasiswa; i++){
            System.out.println("Nama: " + this.mahasiswa[i].getNama());
        }
    }

    public void addMahasiswa(Mahasiswa mahasiswa){
        this.mahasiswa[jumlahMahasiswa] = mahasiswa;
        jumlahMahasiswa++;
    }
}
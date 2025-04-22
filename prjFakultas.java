package prjfakultas;

import java.util.ArrayList;

public class PrjFakultas {
    public static void main(String[] args) {
        Mahasiswa m1 = new Mahasiswa("2428240069", "Algipari");
        Mahasiswa m2 = new Mahasiswa("2428240070", "Agus");
        ProgramStudi ps = new ProgramStudi( "2428240069", "Sistem Informasi");
        ProgramStudi ps2 = new ProgramStudi("2428240070", "Teknik Informatika");
        ps.tambahMahasiswa(m1.getNpm());
        ps2.tambahMahasiswa(m2.getNpm());
        ps.hapusMahasiswa(m1.getNpm());
        ps2.hapusMahasiswa(m2.getNpm());
        ps.tampilkanMahasiswa();    
        ps2.tampilkanMahasiswa();    
        
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
        return npm;
    }

    public String getNama(){
        return nama;
    }
}

class ProgramStudi{
    private String kode;
    private String nama;
    private ArrayList<String> daftarnpm; 
    
    ProgramStudi(String kode, String nama){
        this.kode = kode;
        this.nama = nama;
        this.daftarnpm = new ArrayList<String>();
    }

    public void tambahMahasiswa(String npm){
        this.daftarnpm.add(npm);
    }

    public void tampilkanMahasiswa(){
        System.out.println(kode + " - " + nama);
        for(int i=0; i<daftarnpm.size(); i++){
            System.out.println(daftarnpm.get(i).toString());
        }
        System.out.println("Total Mahasiswa : " + daftarnpm.size());
    }

    public void hapusMahasiswa(String npm){
        this.daftarnpm.remove(npm);
    }
}

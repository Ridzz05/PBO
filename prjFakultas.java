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
        ps.hapusMahasiswaTerakhir();
        ps2.hapusMahasiswaTerakhir();
        ps.hapusMahasiswaBerdasarkanNpm(m1.getNpm());
        ps2.hapusMahasiswaBerdasarkanNpm(m2.getNpm());
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
        for(String npm : daftarnpm){
            System.out.println(npm);
        }
        System.out.println("Total Mahasiswa : " + daftarnpm.size());
    }

    public void hapusMahasiswa(String npm){
        this.daftarnpm.remove(npm);
    }

    public void hapusMahasiswaTerakhir(){
        if(!daftarnpm.isEmpty()){
            this.daftarnpm.remove(this.daftarnpm.size()-1);
        }
    }

    public void hapusMahasiswaBerdasarkanNpm(String npm){
        int index = this.daftarnpm.indexOf(npm);
        if(index >= 0){
            this.daftarnpm.remove(index);
        }
    }
}

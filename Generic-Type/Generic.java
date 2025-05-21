import java.util.*;

public class Generic {
    public static void main(String args[]) {
        Pegawai<String> pg1 = new Pegawai<String>("2428240069");
        System.out.println("NIK: " + pg1.getNik());
    }
}
class Pegawai<AnyType>{
    private AnyType nik;
    
    public Pegawai(AnyType nik){
        this.nik = nik;
    }

    public AnyType getNik(){
        return nik;
    }
    System.out.println("NIK: " + nik);
}
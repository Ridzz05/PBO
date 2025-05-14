// jika objek dari font itu miring berarti itu adalah class abstrak

class prjAbstract {
    public static void main(String[] args) {
        System.out.println("Class Abstract");
        Lingkaran l = new Lingkaran();
        l.namaBentuk();
        l.metodeAbstrak();
        l.informasiBentuk();
    }
}

abstract class Bentuk{
    public abstract void namaBentuk();
    
    public void informasiBentuk(){
        System.out.println("Akses absract class Bentuk");
    }
    
    public abstract void metodeAbstrak();
}

class Lingkaran extends Bentuk{
    public void namaBentuk() {
        System.out.println("Lingkaran");
    }
    
    public void metodeAbstrak() {
        System.out.println("Luas Lingkaran");
    }
}

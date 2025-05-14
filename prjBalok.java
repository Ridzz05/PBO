class prjBalok {
public static void main(String[] args) {
                    
} 
}

class segiEmpat {
    protected int panjang;
    protected int lebar;
    private int luas;
    private int keliling;

    segiEmpat(int panjang, int lebar) {
        this.panjang = panjang;
        this.lebar = lebar;
    }

    public void hitungLuas() {
        this.luas = this.panjang * this.lebar;
    }
    
    public void hitungKeliling() {
        this.keliling = 2 * (this.panjang + this.lebar);
    }

    public void tampilHasil() {
        System.out.println("Luas: " + this.luas);
        System.out.println("Keliling: " + this.keliling);
    }
}

class balok extends segiEmpat {
    private int tinggi;
    private int volume;

    balok(int panjang, int lebar, int tinggi) {
        super(panjang, lebar);
        this.tinggi = tinggi;
    }

    public void hitungVolume() {
        this.volume = super.panjang * super.lebar * super.tinggi;
    }

    public void tampilHasil() {
        super.tampilHasil();
        System.out.println("Volume: " + this.volume);
    }
}
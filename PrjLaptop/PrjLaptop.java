public class PrjLaptop {
    public static void main(String[] args) {
        Cpu cpu = new Cpu("Intel Core i5 1135G7", 2);
        Vga vga = new Vga("NVIDIA GeForce MX450", 4);
        Laptop laptop = new Laptop("Asus", 1, cpu, vga);
        System.out.println("Merk Laptop : " + laptop.getMerk());
        System.out.println("Kode Laptop : " + laptop.getKode());
        laptop.displayData();
        System.out.println("Kapasitas VRAM : " + vga.getKapasitas() + "GB");
        
    }
}

class Laptop{
    private String merk;
    private int kode;
    private Cpu cpu;
    private Vga vga;
    
    Laptop(String merk, int kode, Cpu cpu, Vga vga){
        this.merk = merk;
        this.kode = kode;
        this.cpu = cpu;
        this.vga = vga;
    }

    public void addKomputer(){
        this.merk = merk;
    }

    public void displayData(){
        System.out.println("Merk : " + this.merk);
        System.out.println("Kode : " + this.kode);
        System.out.println("CPU : " + this.cpu.getCpu());
        System.out.println("VGA : " + this.vga.getNama());
    }

    public String getMerk() {
        return this.merk;
    }

    public int getKode() {
        return this.kode;
    }
}

class Cpu{
    private String namaCpu;
    private int kapasitasCpu;

    Cpu(String namaCpu, int kapasitasCpu){
        this.namaCpu = namaCpu;
        this.kapasitasCpu = kapasitasCpu;
    }

    public String getCpu(){
        return this.namaCpu;
    }
}

class Vga{
    private String namaVga;
    private int kapasitas;

    Vga(String namaVga, int kapasitas){
        this.namaVga = namaVga;
        this.kapasitas = kapasitas;
    }

    public String getNama(){
        return this.namaVga;
    }

    public int getKapasitas(){
        return this.kapasitas;
    }
    
}


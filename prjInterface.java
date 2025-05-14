// Class Diagram  antara Light -> <<interface>> -> Switch

public class prjInterface {
    public static void main(String[] args) {
        System.out.println("Interface!");
        Light lampuku = new Light();
        lampuku.switchOn();
        lampuku.switchOff();
        lampuku.info();
    }
}

interface iSwitch {
    public void switchOn();
    public void switchOff();
}

class Light implements iSwitch {
    private boolean state;

    Light() {
        this.state = false;
    }

    public void switchOn() {
        this.state = true;
    }
    
    public void switchOff() {
        this.state = false;
    }

    public void info() {
        if (this.state) {
            System.out.println("Lampu Menyala");
        } else {
            System.out.println("Lampu Mati");
        }
    }
}
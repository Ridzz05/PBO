public class Wheel {
    private String size;
    private String brand;
    private String conditon;

    public Wheel(String size, String brand, String conditon) {
        this.size = size;
        this.brand = brand;
        this.conditon = conditon;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getSize() {
        return this.size;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getBrand() {
        return this.brand;
    }

    public void setConditon(String conditon) {
        this.conditon = conditon;
    }

    public String getConditon() {
        return this.conditon;
    }

    public void infoWheel() {
        System.out.println("Wheel : " + this.brand + " - " + this.size);
        System.out.println("Kondisi : " + this.conditon);
    }

    public static void main(String[] args) {
        Wheel w = new Wheel("180/65/R15", "GT Radial", "Perfect");
        Car c = new Car("Zenix", "Toyota");
        c.turnLeft(w);
    }
}

class Car {
    private String model;
    private String manufaktur;

    Car(String model, String manufaktur) {
        this.model = model;
        this.manufaktur = manufaktur;
    }

    public void turnLeft(Wheel w) {
        w.infoWheel();
        System.out.println("Is turning left");
    }

    public void turnRight(Wheel w) {
        w.infoWheel();
        System.out.println("Is turning right");
    }

    public void turnBack(Wheel w) {
        w.infoWheel();
        System.out.println("Is turning back");
    }

    public Wheel WheelProblem(Wheel w) {
        w.setConditon("Not Okay");
        return w;
    }
}

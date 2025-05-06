public class PrjAgresi {
    public static void main(String[] args) {
        System.out.println("Agregation is an associaton with a whole-part relationship.");
        System.out.println("Slide is part of the whole lake.");

        Slide slide = new Slide("Wood", 10);
        Lake lake = new Lake("Lake", slide, slide, slide);
        lake.getLake();
        System.out.println(slide);
    }
}

class Slide{
    private String materials;
    private int height;

    Slide(String materials, int height){
        this.materials = materials;
        this.height = height;
    }

    public void getSlide(){
        System.out.println(this.materials);
        System.out.println("Height: " + this.height);
    }

    public String toString() {
        return materials + " (Height: " + height + ")";
    }
}

class Lake{
    private String name;
    private Slide width;  
    private Slide height;
    private Slide depth;
    private Slide slide;

    Lake(String name, Slide width, Slide height, Slide depth){
        this.name = name;
        this.width = width;
        this.height = height;
        this.depth = depth;
        this.slide = width;
    }

    public void getLake(){
        System.out.println("Lake: " + this.name);
        System.out.println("Width: " + this.width);
        System.out.println("Height: " + this.height);
        System.out.println("Depth: " + this.depth);
        System.out.println("Slide: " + this.slide);
    }
}


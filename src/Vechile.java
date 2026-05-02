public class Vechile {
    protected String brand;
    protected int speed;

    public Vechile(String brand, int speed){
        this.brand = brand;
        this.speed = speed;
    }

    public void start() {
        System.out.println("Vehicle is starting...");
    }

    public void displayInfo(){
        System.out.println("Brand: " + brand + ", Speed " + speed);
    }
}

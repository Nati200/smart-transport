public class Car extends Vechile {

    private int doors;

    public Car(String brand, int speed, int doors){
        super(brand, speed);
        this.doors = doors;
    }

    @Override
    public void start() {
        super.start();
        System.out.println("Car starts with key...");
    }

    public void showDoors(){
        System.out.println("Doors: " + doors);
    }
}

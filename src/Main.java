public class Main {
    public static void main(String[] args) {
        Vechile v = new Vechile("Generic", 60);
        v.start();
        v.displayInfo();

        System.out.println("----");

        Car c = new Car("Toyata", 120, 4);
        c.start();
        c.displayInfo();
        c.showDoors();
    }
}

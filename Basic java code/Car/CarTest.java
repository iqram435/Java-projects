  public class CarTest {
    public static void main(String[] args) {

        Car[] cars = new Car[3];

        cars[0] = new Car("Toyota", "Corolla", 2020);
        cars[1] = new Car("Honda", "Civic", 2019);
        cars[2] = new Car("Ford", "Mustang", 2021);

        System.out.println("--- Car Details (Array Version) ---");
        for (Car c : cars) {
            c.display();
            System.out.println();
        }
    }
}

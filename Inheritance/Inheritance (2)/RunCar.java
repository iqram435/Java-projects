public class RunCar {
    public static void main(String[] args) {
        Car c = new Car("Toyota", 2500000, 2020);
        System.out.println(c.getBrand() + " " + c.getPrice() + " " + c.getYear());
    }
}

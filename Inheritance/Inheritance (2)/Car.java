public class Car extends Vehicle {
    private int year;

    public Car() {}

    public Car(String brand, double price, int year) {
        super(brand, price);
        this.year = year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getYear() {
        return year;
    }
}

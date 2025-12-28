public class AnimalTest {
    public static void main(String[] args) {

  
        Animal[] animals = new Animal[5];

        animals[0] = new Animal("Dog", 5, "Brown");
        animals[1] = new Animal("Cat", 3, "Black");
        animals[2] = new Animal("Bird", 2, "Yellow");
        animals[3] = new Animal("Fish", 1, "Blue");
        animals[4] = new Animal("Horse", 7, "White");


        System.out.println("=== Animal Details ===\n");
        for (Animal a : animals) {
            a.display();
            System.out.println();
        }
    }
}

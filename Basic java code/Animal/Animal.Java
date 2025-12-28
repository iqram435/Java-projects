public class Animal {
    private String species;
    private int age;
    private String color;


    public Animal() {}

  
    public Animal(String species, int age, String color) {
        this.species = species;
        this.age = age;
        this.color = color;
    }

 
    public void display() {
        System.out.println("Species: " + species);
        System.out.println("Age: " + age);
        System.out.println("Color: " + color);
    }


    public String getSpecies() { return species; }
    public int getAge() { return age; }
    public String getColor() { return color; }


    public void setSpecies(String species) { this.species = species; }
    public void setAge(int age) { this.age = age; }
    public void setColor(String color) { this.color = color; }
}

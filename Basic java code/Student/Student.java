public class Student {
 
    private String name;
    private int age;
    private String department;


    public Student() {
    }


    public Student(String name, int age, String department) {
        this.name = name;
        this.age = age;
        this.department = department;
    }


    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getDepartment() {
        return department;
    }


    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setDepartment(String department) {
        this.department = department;
    }


    public void display() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Department: " + department);
    }
}

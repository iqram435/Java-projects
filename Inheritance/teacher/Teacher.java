public class Teacher extends Parent {
    private String subject;
    private double salary;

  
    public Teacher() {
        super();
    }


    public Teacher(String name, int age, String address, String subject, double salary) {
        super(name, age, address);
        this.subject = subject;
        this.salary = salary;
    }

 
    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

 
    public void showTeacher() {
        showParent();
        System.out.println("Subject: " + subject);
        System.out.println("Salary: " + salary);
        System.out.println();
    }
}

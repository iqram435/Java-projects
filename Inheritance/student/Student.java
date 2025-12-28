public class Student extends Parent {
    private int studentId;
    private double cgpa;

   
    public Student() {
        super();
    }


    public Student(String name, int age, String address, int studentId, double cgpa) {
        super(name, age, address);
        this.studentId = studentId;
        this.cgpa = cgpa;
    }


    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public double getCgpa() {
        return cgpa;
    }

    public void setCgpa(double cgpa) {
        this.cgpa = cgpa;
    }

  
    public void showStudent() {
        showParent();
        System.out.println("Student ID: " + studentId);
        System.out.println("CGPA: " + cgpa);
        System.out.println();
    }
}

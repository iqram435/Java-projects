public class Run {
    public static void main(String[] args) {

      
        Student s1 = new Student("Iqram", 21, "Dhaka", 223, 3.75);
        Student s2 = new Student("Irfan", 22, "Chittagong", 205, 3.90);

        Teacher t1 = new Teacher("abc Sir", 40, "Sylhet", "Mathematics", 55000);
        Teacher t2 = new Teacher("xyz Sir", 35, "Rajshahi", "Physics", 60000);

        s1.showStudent();
        s2.showStudent();

        t1.showTeacher();
        t2.showTeacher();

       
        Student s3 = new Student();
        s3.setName("shayan");
        s3.setAge(23);
        s3.setAddress("Mymanshingh");
        s3.setStudentId(301);
        s3.setCgpa(3.65);
        s3.showStudent();
    }
}

public class StudentMain {
    public static void main(String[] args) {


        Student[] students = new Student[5];

        students[0] = new Student();
        students[0].setName("Alice");
        students[0].setAge(20);
        students[0].setDepartment("Computer Science");

        students[1] = new Student();
        students[1].setName("Bob");
        students[1].setAge(22);
        students[1].setDepartment("Electrical Engineering");

        students[2] = new Student();
        students[2].setName("Charlie");
        students[2].setAge(21);
        students[2].setDepartment("Mechanical Engineering");

        students[3] = new Student();
        students[3].setName("David");
        students[3].setAge(23);
        students[3].setDepartment("Civil Engineering");

        students[4] = new Student();
        students[4].setName("Eve");
        students[4].setAge(19);
        students[4].setDepartment("Architecture");

 
        System.out.println("--- Student Details (Array Version) ---");
        for (int i = 0; i < students.length; i++) {
            students[i].display();
            System.out.println();
        }
    }
}

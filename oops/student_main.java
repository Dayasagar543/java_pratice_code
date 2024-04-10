public class student_main {

    public static void main(String[] args) {
        Student s1 = new Student();
        s1.rollno = 1;
        s1.name = "surendhar";
        s1.age = 23;

        Student s2 = new Student();
        s2.rollno = 2;
        s2.name = "sundharam";
        s2.age = 14;

        Student s3 = new Student();
        s3.rollno = 3;
        s3.name = "lavanya";
        s3.age = 22;

        Student s4 = new Student();
        s4.rollno = 4;
        s4.name = "kiran";
        s4.age = 32;

        Student student1[] = new Student[4];
        student1[0] = s1;
        student1[1] = s2;
        student1[2] = s3;
        student1[3] = s4;

        for (int i = 0; i < student1.length; i++) {
            System.out.println("the name of the sutdent its  " + student1[i].name + "    the age of the student1 is "
                    + student1[i].age + "  And the roll number is  " + student1[i].rollno);
        }

        // for each we
        for (Student student : student1) {
            System.out.println(student.name + "  :   " + student.rollno);
        }

    }
}

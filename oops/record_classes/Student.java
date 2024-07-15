package oops.record_classes;

//this class is just used for data transfer so here we are almost writing 60+ line of code so instead we can use
//  a keyword called record and this how we reduce the code
public class Student {
    private final int s_no;
    private final String name;
    private final int age;

    Student(int s_no, String name, int age) {
        this.s_no = s_no;
        this.name = name;
        this.age = age;

    }

    public int getS_no() {
        return s_no;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "Student [s_no=" + s_no + ", name=" + name + ", age=" + age + "]";
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + s_no;
        result = prime * result + ((name == null) ? 0 : name.hashCode());
        result = prime * result + age;
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Student other = (Student) obj;
        if (s_no != other.s_no)
            return false;
        if (name == null) {
            if (other.name != null)
                return false;
        } else if (!name.equals(other.name))
            return false;
        if (age != other.age)
            return false;
        return true;
    }

}
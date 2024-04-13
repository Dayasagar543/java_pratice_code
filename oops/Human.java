public class Human {

    // private instance varaible these instance variables cannot be access directly
    // case they are in private and this is how we implement the encapsulation so we
    // create some methods called getters and setter methods to assing values and
    // read values from the private variable indirectly using those methods..
    private int roll_no;
    private String name;
    private String gender;

    // private keyword enables the varaible only accessed with in the class i.e we
    // can asssin values to the variables in side the class, but not
    // from outside for that reason we need public getters and setters

    // constructor is a method who's name is as class name
    // everytime you create an object , constructor is defaulty called if 2 objects
    // 2 times the constructor will be called
    // below is the default constructor
    public Human() {

    }

    // we can also write parameterised construrctor
    public Human(int roll_no, String name) {
        this.roll_no = roll_no;
        this.name = name;
    }

    public Human(String gender) {
        this.gender = gender;
    }

    public Human(int roll_no) {
        this.roll_no = roll_no;
    }

    // getter and setter for roll_no
    public int getroll_no() {
        return roll_no;
    }

    public void setroll_no(int roll) {
        this.roll_no = roll;
    }

    // getter and setter method for name

    public String getname() {
        return name;
    }

    public void setname(String in_name) {
        this.name = in_name;
    }

    // getter and setter for gender
    public String getgender() {
        return gender;
    }

    public void setgender(String in_gender) {
        this.gender = in_gender;
    }

}

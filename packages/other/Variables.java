package other;

public class Variables {

    private String name;
    protected int marks;// the protected access modifier will only allow the variable to visible till
                        // the package and class and also extended classes or sub classes in other files

    public String getname() {
        return name; // here we are able to access the protected variable as its in the same package
    }

    public void setname(String in_name) {
        this.name = in_name;
    }

}

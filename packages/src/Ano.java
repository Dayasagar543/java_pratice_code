package src;

public class Ano {
    public void show() {
        System.out.println("hi there from annotations");
    }

}

class run extends Ano {
    @Override // @override is one of annotations which is the facility given by the complier
              // to safely override the methods this will take care if we use wrong method
              // name while overriding and warns us about it. this annotation will check the
              // method in above class if the name of the method is same as in the super class
              // then it wont show any signs if not it show the red signs :these would help
              // the developer to maintain the proper code also avoid error while overriding
              // if there are longer names ...
    public void show() {
        System.out.println("hi hello world from run");
    }
}

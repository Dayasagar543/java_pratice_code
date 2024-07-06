package annotations;

public class Annotations extends Header_class {
    Annotations() {
        super();
    }

    @Override // this is an annotation this will indicate to compiler that the method is being
              // over ridden also helps developer to override the methods properly without any
              // issue if there something wrong then the compiler will idicate to us
              // reagarding the error
    public void Head() {

        System.out.println("Hi there from annoation class which is overridden");
    }
    // annotations are the supliments to compiler or the metadata about the class
    // these indicate what happeing whether its overriding or other actions to give
    // compiler an idea and also help the developer to have indiaction that its
    // performing some action like overridng or things like that...

}

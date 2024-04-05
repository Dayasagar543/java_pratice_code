/**
 * Conditional_statements
 */
public class Conditional_statements {

    public static void main(String[] args) {
        int a = 34;
        int b = 72;
        int c = 56;

        if(a>b && a>c){
        System.out.println("a is greate"+ " "+a);
        }else if(b>c){
            System.out.println("b is greate"+ " "+b);
        } else {
            System.out.println("c is greate"+ " "+c);
        }
    }
}
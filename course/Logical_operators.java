public class Logical_operators {
    public static void main(String[] args) {
        int a = 35;
        int b = 36;
        if(a<b && b>a){
            System.out.println("this is and logic");
        } else if (a < b || a > b) {
            System.out.println("this is or logic");
        }
    }
}

public class Type_promotion {
    public static void main(String[] args) {
        // the type promotion is nothing but the resultant of the code if it is greater than the memory size of the datatype we use another larger datatype to accomodate the extra bytes or the excess bytes ...
        byte a = 20; //127
        byte b = 30;//127
        //Addition
        int result = b + a;//-2^31 to (2 ^23)-1//
        System.out.println( "The Addition result"+" "+result);
        //subraction
        int result1 = b-a;
        System.out.println( "The Subtraction result"+" "+ result1);
        //multiplication
        int result3 = b * a;
        System.out.println( "The multiplication result"+" "+result3);
        //division
        int result4 = b / a;
        System.out.println( "The division result"+" "+result4);
        //modulus
        int result5 = b % a;
        System.out.println("The modulus result" + " " + result5);
        
        //resassingment of values can be done in both ways and we can do this for all other operations not only for additon .

        // a = a+4;
        // System.out.println("the value of a is changed now" +a);
        b += 3;
        System.out.println("the changed value of b is"+ " "+b);
    }
}

import java.util.Scanner;

class Hello {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Variable va = new Variable();
        Conditionals cn = new Conditionals();
        Loops lps = new Loops();

        System.out.println("Hello world");
        va.name = "Dayasagar";
        va.rollno = 21;
        System.out.print(va.name + "\n");
        System.out.println(va.rollno + "\n");

        System.out.println("printing the triangle");
        Pattern pa = new Pattern();
        // patterns
        pa.left_up_triangle(5);
        System.out.println();
        pa.left_down_triangle(5);
        System.out.println();
        pa.pyramid_up_triangle(5);
        System.out.println();
        pa.pyramid_down_triangle(5);
        System.out.println();
        pa.solid_rectangle(4, 5);
        System.out.println();
        pa.hallo_rectangle(4, 5);
        System.out.println();
        pa.right_up_triangle(5);
        System.out.println();
        pa.right_down_triangle(5);
        System.out.println();
        pa.printing_numbers_up(5);
        System.out.println();
        pa.printing_numbers_down(5);
        System.out.println();
        pa.floyds_triangle(10);
        System.out.println();
        pa.binary_triangle(5);
        System.out.println();
        pa.butterfly_pattern(5);
        System.out.println();
        pa.solid_rhombus(5);
        System.out.println();
        pa.print_number_pyramid(5);
        System.out.println();
        pa.palindromic_pattern(5);
        System.out.println();
        pa.dimond_pattern(5);
        System.out.println();

        // variable declaration
        int length = 0, width = 0;
        float area = 0f;
        double perimeter = 0;
        System.out.println("Input the  length of the rectangle");
        length = sc.nextInt();
        System.out.println("Input the  width of the rectangle");
        width = sc.nextInt();
        // variable utilization
        area = length * width;
        System.out.println("the area of the reactangle is " + area);
        perimeter = 2 * (length + width);
        System.out.println("the area of the reactangle is " + perimeter);

        System.out.println(cn.is_18(19));
        System.out.println(cn.day_week(1));

        // loops

        lps.factorial(5);
        sc.close();

    }
}
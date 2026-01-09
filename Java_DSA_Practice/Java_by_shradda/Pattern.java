public class Pattern {

    // *
    // * *
    // * * *
    // * * * *
    // * * * * *

    public void left_up_triangle(int side) {
        for (int i = 1; i <= side; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    // * * * *
    // * * *
    // * *
    // *
    public void left_down_triangle(int side) {
        for (int i = 1; i <= side; i++) {
            for (int j = side - i + 1; j > 0; j--) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    // *
    // * *
    // * * *
    // * * * *
    public void right_up_triangle(int side) {
        for (int i = 1; i <= side; i++) {
            for (int j = side - i; j > 0; j--) {
                System.out.print("  ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    // * * * *
    // * * *
    // * *
    // *
    public void right_down_triangle(int side) {
        for (int i = 1; i <= side; i++) {
            for (int j = 1; j < i; j++) {
                System.out.print("  ");
            }
            for (int j = side - i + 1; j > 0; j--) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    // *
    // * *
    // * * *
    // * * * *
    public void pyramid_up_triangle(int side) {
        for (int i = 1; i <= side; i++) {
            for (int j = side - i; j > 0; j--) {
                System.out.print(" ");
            }
            for (int j = 0; j < i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public void pyramid_down_triangle(int side) {

        for (int i = 1; i <= side; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(" ");
            }
            for (int j = side - i + 1; j > 0; j--) {
                System.out.print("* ");
            }
            System.out.println();
        }

    }

    public void solid_rectangle(int length, int width) {
        for (int i = 0; i < length; i++) {
            for (int j = 0; j < width; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public void hallo_rectangle(int length, int width) {
        for (int i = 1; i <= length; i++) {
            for (int j = 1; j <= width; j++) {
                if (i == 1 || j == 1 || j == width || i == length) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }

    public void printing_numbers_up(int value) {
        for (int i = 1; i <= value; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }

    }

    public void printing_numbers_down(int value) {
        for (int i = 1; i <= value; i++) {
            for (int j = 1; j <= value - i + 1; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }

    public void floyds_triangle(int side) {
        int count = 1;
        for (int i = 1; i <= side; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(count++ + " ");
            }
            System.out.println();
        }
    }

    public void binary_triangle(int side) {
        for (int i = 1; i <= side; i++) {
            for (int j = 1; j <= i; j++) {
                if ((i + j) % 2 == 0) {
                    System.out.print("1 ");
                } else {
                    System.out.print("0 ");
                }
            }
            System.out.println();

        }
    }

    public void butterfly_pattern(int side) {
        for (int i = 1; i <= side; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            for (int j = 2 * (side - i); j > 0; j--) {
                System.out.print("  ");
            }

            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();

        }
        for (int i = side; i > 0; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            for (int j = 2 * (side - i); j > 0; j--) {
                System.out.print("  ");
            }

            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();

        }

    }

    public void solid_rhombus(int side) {
        for (int i = 1; i <= side; i++) {
            for (int j = side - i; j > 0; j--) {
                System.out.print("  ");
            }
            for (int j = 0; j < side; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public void print_number_pyramid(int side) {

        for (int i = 1; i <= side; i++) {
            for (int j = side - i; j > 0; j--) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }

    public void palindromic_pattern(int side) {
        for (int i = 1; i <= side; i++) {
            for (int j = side - i; j > 0; j--) {
                System.out.print("  ");
            }

            for (int j = i; j > 0; j--) {
                System.out.print(j + " ");
            }

            for (int j = 2; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();

        }
    }
    
    public void dimond_pattern(int side) {
        for (int i = 1; i <= side; i++) {
            for (int j = side - i; j > 0; j--) {
                System.out.print("  ");
            }

            for (int j = i; j > 0; j--) {
                System.out.print("* ");
            }

            for (int j = 2; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();

        }
        for (int i = side; i> 0; i--) {
            for (int j = side - i; j > 0; j--) {
                System.out.print("  ");
            }

            for (int j = i; j > 0; j--) {
                System.out.print("* ");
            }

            for (int j = 2; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();

        }
    }
}

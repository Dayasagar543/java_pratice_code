public class Conditionals {
    public boolean is_18(int age) {
        // ternary operations
        return age > 18 ? true : false;
    }

    public String day_week(int num) {

        switch (num) {
            case 1:
                return "sunday";
            case 2:
                return "Monday";
            case 3:
                return "Tuesday";
            case 4:
                return "Wednesday";
            case 5:
                return "Thursday";
            case 6:
                return "Friday";
            case 7:
                return "Sarturday";
            default:
                System.out.println("not a valid input");
                break;
        }
        return null;
    }
}

// This class contains two dynamic and two static methods 
public class TryingMethods {
    public static void main(String[] args) {
     

    }

    static int myStaticOne() {
        int i = 0;
        int total = 0;
        while (i <= 1000) {
            total = i + total;
            i++;
        }

        return total;
    };

    static void myStaticTwo() {
        int sum = 0;
        for (int x = 12; x < 103; x++) {
            if (x % 2 == 0) {
                sum = x + sum;
            }
        }

        System.out.println("Sum of even numbrs = " + sum);
    }

    // dynamic methods
    String myDynamicOne(int day) {
        String dayOfWeek;
        switch (day) {
            case 1:
                dayOfWeek = "Monday";
                break;
            case 2:
                dayOfWeek = "Tuesday";
                break;
            case 3:
                dayOfWeek = "Wednesday";
                break;
            case 4:
                dayOfWeek = "Wednesday";
                break;
            case 5:
                dayOfWeek = "Wednesday";
                break;
            case 6:
                dayOfWeek = "Wednesday";
                break;
            case 7:
                dayOfWeek = "Wednesday";
                break;
            default:
                dayOfWeek = "Invalid day";
                break;
        }
        return dayOfWeek;


    };

    void myDynamicTwo() {

        int num1 = 2;
        if (num1 <= 3) {
            System.out.println("This statement is true");
        } else {
            System.out.println("This statement is false");
        }

    }
}

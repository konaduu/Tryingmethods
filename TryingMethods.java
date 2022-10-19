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
    String myDynamicOne() {
   

    };

    void myDynamicTwo() {



    }
}

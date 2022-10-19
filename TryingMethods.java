// This class contains two dynamic and two static methods 
public class TryingMethods {
    public static void main(String[] args) {
        TryingMethods dynamicmethods = new TryingMethods();
        System.out.println(dynamicmethods.myDynamicOne(6));
        dynamicmethods.myDynamicTwo();
        myStaticOne();
        myStaticTwo();

    }

    static int myStaticOne() {

    };

    static void myStaticTwo() {
   
    }

    // dynamic methods
    String myDynamicOne() {
   

    };

    void myDynamicTwo() {



    }
}

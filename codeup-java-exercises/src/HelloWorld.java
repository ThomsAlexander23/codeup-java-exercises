public class HelloWorld {
    public static void main(String[] args) {
        System.out.print("Hello, World!");
        int favoriteNumber = 23;
        String myString = "howdy Do";
//        myString = 'm'; // incompatible types
//        myString = 3.14159;  // incompatible types
//        long myNumber;
//        myNumber = 123L;
//        myNumber = 123;
//        myNumber = 3.14; // incompatible types should be double not long
        float myNumber = 3.14F;
        System.out.println(myNumber); // variable myNumber not initialized, only declared
// increment after logging value
        int x = 5;
        System.out.println(x++);
        System.out.println(x);
        // increment before logging
        System.out.println(++x);
        System.out.println(x);

//        String theNumberThree = "three";
//        Object o = theNumberThree;
//        int three = (int) theNumberThree;

        int y = 4;
        y += 5;
        y *= x;

        x /= y;
        y -= x;
        int z = Integer.MAX_VALUE;
        z *= 2;
        System.out.println(z);

        double pi = 3.14159;

        System.out.printf("The value of pi is approximately %.2f", pi);
    }
}

//calculate sum(by using fn overloading using parameter)

public class functionOverloading {

    // Sum of 2 numbers
    static int sum(int a, int b) {
        return a + b;
    }

    // Sum of 3 numbers
    static int sum(int a, int b, int c) {
        return a + b + c;
    }

    // Sum of 2 decimal numbers
    static double sum(double a, double b) {
        return a + b;
    }

    public static void main(String[] args) {

        System.out.println(sum(10, 20));        // Calls first method
        System.out.println(sum(10, 20, 30));    // Calls second method
        System.out.println(sum(10.5, 20.5));    // Calls third method

    }
}


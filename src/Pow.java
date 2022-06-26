import java.util.Scanner;

public class Pow {
    public static void main(String[] args) {
        double base;
        int exponent;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter base and exponent:");
        base = in.nextDouble();
        exponent = in.nextInt();

        System.out.println("The output for 2" + base+"^"+exponent+" is " + myPow(base,exponent));
    }

    public static double myPow(double x, int n)
    {
        if(n >= 0)
            return positive(x,n);
        else
            return negative(x,n);
    }

    public static double positive(double x, int n)
    {
        if(n == 0)
            return 1;
        double smallOP = myPow(x,n/2);

        if(n % 2 == 0)
            return smallOP*smallOP;
        else
            return x*smallOP*smallOP;
    }

    public static double negative(double x, int n)
    {
        if(n == -1)
            return 1/x;

        double smallOP = myPow(x,n/2);

        if(n % 2 == 0)
            return smallOP*smallOP;
        else
            return (1/x)*smallOP*smallOP;
    }
}

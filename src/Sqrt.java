import java.util.Scanner;

public class Sqrt {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int x;
        System.out.println("enter the number to find its square root:");
        x = in.nextInt();

        System.out.println("Square root of "+x+" is "+ mySqrt(x));
    }

    public static int mySqrt(int x)
    {
        long start=0;
        long end= x;

        while(start+1 < end)
        {
            long mid = start+(end-start)/2;
            if(mid*mid == x)
                return (int) mid;
            else if(mid*mid < x)
                start = mid;
            else
                end = mid;
        }

        if(end*end == x)
            return (int) end;
        return (int) start;
    }
}

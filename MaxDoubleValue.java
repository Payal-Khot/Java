import java.util.Scanner;

public class MaxDoubleValue
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first value ");
        double value1 = sc.nextDouble();
        System.out.println("Enter second value ");
        double value2 = sc.nextDouble();
        double maxvalue = Math.max(value1, value2);
        System.out.println("Maximum Double value is " + maxvalue);
        sc.close();
    }
}

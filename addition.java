import java.util.*;
public class addition
{
    public static void main(String args[])
    {
        Scanner in = new Scanner(System.in);
        int num1,num2,sum;
        System.out.print("Enter the first number");
        num1 = in.nnextInt();
        System.out.print("Enter the second number");
        num2 = in.nextInt();
        sum = num1 + num2;
        System.out.printf("Sum is %d%n",sum);
    }
}
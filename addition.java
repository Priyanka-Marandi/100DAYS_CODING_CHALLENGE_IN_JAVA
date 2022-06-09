import java.util.*;
public class addition
{
    public static void main(String args[])
    {
        
        int num1,num2,sum;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the first number");
        num1 = input.nextInt();
        System.out.print("Enter the second number");
        num2 = input.nextInt();
        sum = num1 + num2;
        System.out.printf("Sum is %d%n",sum);
    }
}
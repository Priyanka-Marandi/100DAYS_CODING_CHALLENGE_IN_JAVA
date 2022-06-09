import java.util.*;
public class comparison
{
    public static void main(String args[])
    {
        Scanner in = new Scanner(System.in);
        int num1;
        int num2;
        System.out.print("Enter the first integer:");
        num1 = in.nextInt();
        System.out.print("Enter the second integer:");
        num2 = in.nextInt();
        if(num1 == num2)
        System.out.printf("%d == %d %n",num1,num2);
        if(num1 != num2)
        System.out.printf("%d != %d %n",num1,num2);
        if(num1 < num2)
        System.out.printf("%d < %d %n",num1,num2);
        if(num1 > num2)
        System.out.printf("%d > %d %n",num1,num2);
        if(num1 <= num2)
        System.out.printf("%d <= %d %n",num1,num2);
        if(num1 >= num2)
        System.out.printf("%d >= %d %n",num1,num2);
    }
}
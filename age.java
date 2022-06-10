import java.util.Scanner;
public class age
{
    public static void main(String args[])
    {
        int a;
        Scanner in = new Scanner(System.in);
        System.out.println("enter the age");
        a=in.nextInt();
        if(a>=18)
        System.out.println("eligible to vote");
    }
}
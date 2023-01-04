import java.util.Scanner;
class Division
{
    public static void main(String args[])
    {
        int a,b,result;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the first integer:");
        a=input.nextInt();
        System.out.println("Enter the second integer: ");
        b=input.nextInt();
        result =  a/b;

        System.out.println("The result is " + result);
    }
}
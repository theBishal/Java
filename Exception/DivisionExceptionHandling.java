import java.util.Scanner;
public class DivisionExceptionHandling {
    public static void main(String args[])
    {
        int a,b,result;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the first integer:");
        a=input.nextInt();
        System.out.println("Enter the second integer: ");
        b=input.nextInt();

        //try block

        try{
            result = a/b;
            System.out.println("The result is :" + result);
        }
        //catch block
        catch(Exception e)
        {
            System.out.println("Exception caught: Division by zero");
        }

    }
}


import java.util.Scanner;

public class Program5 {
    public static void main(String args[])
    {
        printpattern();
    }
    public static void printpattern()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number ");
        int num = sc.nextInt();
        for(int i=1;i<=num;i++)
        {
            for(int j=1 ;j<=i;j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }

    }
    
}

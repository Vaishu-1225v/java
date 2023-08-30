import java.util.Scanner;

public class Program4 {
    public static void main(String args[]){
    divisibleby5ornot();
    }

public static void divisibleby5ornot()
{
     Scanner sc = new Scanner(System.in);
     System.out.println("enter the number"); 
       
        int num = sc.nextInt();
        
        if(num%5==0)
        {
            System.out.println("it is divisible by 5");
        }
        else
        {
            System.out.println("it is not divisible by 5");
        }
     }

}

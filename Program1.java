

public class Program1{

     int  dividetwonumber(int a ,int b){
        
        int division = a / b;
        return division;
        }
        public static void main(String args[])
        {
            int a = 24;
            int b = 2;
           Program1 obj = new Program1();
             int result = obj.dividetwonumber(a,b);
            System.out.println("division of two number is" + result);
        }
    }

    


import java.util.Scanner;

class RangeEx extends Exception
{
    RangeEx(String me)
    {
        super(me);
    }
}
public class BookSalesCategories12
{
    public static void main(String[] args) throws RangeEx{
        Scanner sc = new Scanner(System.in);
        
        int n=sc.nextInt();
        if(n<30 || n>100)
           throw new RangeEx("Invalid Input");
        
        if (n>=30 && n<=50) 
            System.out.println("D");
        else if (n>=51 && n<=60) 
            System.out.println("C");
        else if (n>=61 && n<=80) 
            System.out.println("B");
        else
            System.out.println("A");        
    }
}
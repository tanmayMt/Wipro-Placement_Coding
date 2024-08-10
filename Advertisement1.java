import java.util.ArrayList;
import java.util.Scanner;
public class Advertisement1
{
    public static void main(String [] args)
    {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Advertisement Value: ");
        String s = sc.next();
        int [] ad=new int[s.length()];
        ArrayList<Integer> arr = new ArrayList<>();
        int sum=0;
        for (int i = 0; i < ad.length; i++) {
            ad[i]=Character.getNumericValue(s.charAt(i));
            if(ad[i]%2 == 0){
              arr.add(ad[i]);
              sum=sum+ad[i];
        }   }
        
        System.out.println(sum);
        System.out.println(arr);

    }
}
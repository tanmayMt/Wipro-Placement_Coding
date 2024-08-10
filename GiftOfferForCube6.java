import java.util.Scanner;
public class GiftOfferForCube6
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the total no. of product: ");
        int p=sc.nextInt();

        System.out.print("Enter Price for each purchused products: ");
        int sum = 0;
        for (int i=0;i<p;i++) 
            sum=sum+sc.nextInt();
        

        int cube = (int)Math.round((Math.cbrt(sum)));
        if (cube*cube*cube==sum)
            System.out.print("Yes!! Gift Hamper");
        else
        {
            cube=cube+1;
            System.out.print(cube*cube*cube-sum);
        }


    }
}
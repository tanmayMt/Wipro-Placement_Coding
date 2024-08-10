import java.util.Scanner;

public class DiscountOnEvenAndOddDigitAmount16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println();
        int amount=sc.nextInt();

        int sum_odd,sum_even,digit;
        sum_odd=0;sum_even=0;
        int temp=amount;
        while (temp!=0) {
            digit=temp%10;
            if (digit%2==0)
               sum_even=sum_even+digit;
            else
               sum_odd=sum_odd+digit;
            temp=temp/10;
        }
        System.err.println(sum_even*sum_odd);
    }
}

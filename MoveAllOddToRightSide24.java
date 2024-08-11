
import java.util.Scanner;

public class MoveAllOddToRightSide24 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("");
        int len=sc.nextInt();

        int [] arr = new int[len];
        for (int i = 0; i < len; i++)
            arr[i]=sc.nextInt();

        for (int i = 0; i <len; i++) {
            if (arr[i]%2==0)
                System.out.print(arr[i]);
        }
        for (int i = 0; i <len; i++) {
            if (arr[i]%2!=0)
                System.out.print(arr[i]);
        }

    }
}


import java.util.Scanner;

public class MaximumSaledProduct21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter No. of Days & Produccts: ");
        int days=sc.nextInt();
        int products=sc.nextInt();
        
        int [][] arr = new int[days][products];
        for (int i = 0; i < days; i++) {
            for (int j = 0; j < products; j++) {
                arr[i][j]=sc.nextInt();
            }
        }

        for (int i = 0; i < days; i++) {
            for (int j = 0; j < products; j++) {
                System.out.println(arr[i][j]);
            }
        }
    }
}

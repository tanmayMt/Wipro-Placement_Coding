
import java.util.Scanner;

public class MaximumSaledProduct21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter No. of Days & Produccts: ");
        int days=sc.nextInt();
        int products=sc.nextInt();
        
        int [][] arr = new int[days][products];int m;
        for (int i = 0; i < days; i++) {
            for (int j = 0; j < products; j++) {
                arr[i][j]=sc.nextInt();
            }
        }
        
        System.err.println("----------");
        for (int i = 0; i < days; i++) {
            m=arr[i][0];
            for (int j = 1; j < products; j++) {
                if (m<arr[i][j]) 
                    m=arr[i][j];
            }
            System.out.println(m);
        }
    }
}

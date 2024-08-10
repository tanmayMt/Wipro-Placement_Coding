import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class KthSmallest10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[2];
        ArrayList<Integer> a = new ArrayList<>();

        arr[0]=sc.nextInt(); //No of Process
        arr[1]=sc.nextInt(); //Kth possiton 
        
        for (int idx = 0; idx < arr[0]; idx++) 
            a.add(sc.nextInt());
        Collections.sort(a);
        System.out.print(a.get(arr[1]-1));

    }
}

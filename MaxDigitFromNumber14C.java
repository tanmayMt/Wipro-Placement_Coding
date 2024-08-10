//14
import java.util.Arrays;
import java.util.Scanner;

class MaxDigitFromNumber14C
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String in = sc.next();
        char []in1 =in.toCharArray();
        Arrays.sort(in1);
        System.out.print(in1[in1.length-1]);
    }
}
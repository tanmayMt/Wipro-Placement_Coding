//14
import java.util.Scanner;

class MaxDigitFromNumber14
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String in = sc.next();
        //char []in1 =in.toCharArray();
        
        int n=in.charAt(0);
        
        for (int i = 1; i < in.length(); i++) {
            if (n<(int)in.charAt(i)) {
                n=(int)in.charAt(i);
            }
        }
        System.out.print((char)n);
    }
}
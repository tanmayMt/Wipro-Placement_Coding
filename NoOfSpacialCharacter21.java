import java.util.Scanner;

public class NoOfSpacialCharacter21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter message: ");
        String message=sc.nextLine();
        int c=0;
        for (int i = 0; i < message.length(); i++) {
            if(!Character.isAlphabetic(message.charAt(i)) && !Character.isDigit(message.charAt(i)))
               c++;
        }
        System.out.println(c);
    }
}

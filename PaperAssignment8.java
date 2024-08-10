import java.util.Scanner;

public class PaperAssignment8 {
    public static void main(String[] args) {
        //char c =64;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Your Application Id: ");
        int id = sc.nextInt();


        int sum=0;
        int digit;
        int temp=id;

        while (temp!=0) {
            digit=temp%10;
            sum=sum+digit;
            temp=temp/10;
        }
        //System.out.println(sum);


        if (sum<26 && sum>0) {
            char a=(char)(64+sum);   //ASCI value of A is 65
            System.out.println(a);
        }
        else
            System.out.println("Invalid Application Id!!!!!!!!!");
    }
}

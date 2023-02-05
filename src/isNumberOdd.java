import java.util.Scanner;

public class isNumberOdd {
    public static void main(String[] args) {

        //scanner
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number:");
        int num = sc.nextInt();

        if(num % 2 == 0) {
            System.out.println("Number is even!");
        }

        else{
            System.out.println("Number is odd");
        }
    }
}

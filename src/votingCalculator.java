import java.util.Scanner;

public class votingCalculator {
    public static void main(String[] args) {

        //scanner
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter age:");
        int age = sc.nextInt();

        if(age < 18) {
            System.out.println("Too young to vote!");
        }
        else{
            System.out.println("You may vote!");
        }

    }
}

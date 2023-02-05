import java.util.Scanner;

public class Initials {
    public static void main(String[] args) {

        //lav scanner
        Scanner scName = new Scanner(System.in);
        System.out.println("Enter your name:");
        String fullName = scName.nextLine();
        //input tekst
        String[] nameParts = fullName.split(" ");
        String firstInitial = nameParts[0].substring(0, 1) + ".";
        String middleInitial = "";
        String lastName = "";
        //split navn substring metode
        if (nameParts.length > 1) {
            middleInitial = nameParts[1].substring(0, 1) + ".";
        }
        if (nameParts.length > 2) {
            lastName = nameParts[2];
        }

        System.out.println(firstInitial + " " + middleInitial + " " + lastName);
}
    }

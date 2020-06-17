import java.util.Scanner;

public class ifelse {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("test");
        int test = input.nextInt();
        int number = 10;


        if (test > 10 ) {
            System.out.println("Number is greater than 10.");
        }
        else
        {System.out.println("Number is less than 10."); }

        System.out.println("Application finished.");
    }
}

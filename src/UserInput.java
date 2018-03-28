import java.util.Scanner;

public class UserInput {
    public static void main(String args[]){
        Scanner userInput = new Scanner(System.in);

        System.out.println("Kindly Enter Your Name in full...");
        String UserName = userInput.next();

        System.out.println("Kindly Enter Your ID Number.");
        int IDnumber = userInput.nextInt();

        System.out.println("Hi "+ UserName + "Your ID Number is: " + IDnumber);
    }
}

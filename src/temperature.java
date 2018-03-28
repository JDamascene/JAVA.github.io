import javax.swing.*;
import java.util.Scanner;

public class temperature {
    public static void main(String[]args) {
        System.out.println("Kindly Enter The temperature...");
        Scanner me = new Scanner(System.in);
        int temp = me.nextInt();

        if (temp > 100){
            System.out.println("Your water is boiling");
        } else {
            System.out.println("Your water is yet to boil");
        }
    }
}

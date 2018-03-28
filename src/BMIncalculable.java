import java.util.Scanner;

public class BMIncalculable {
    public static double calculate(int weight, int height) {

        height = ((height) * (height));
        return weight / height;

    }

    public static String message(double BMI){
        if(BMI > 30){
            return "You are OBASED";
        } else if(BMI < 15){
            return "You are UNDER WEIGHT Please eat more";
        } else {
            return "You are HEALTHY";
        }
    }
    public static void main(String args[]){
        Scanner u_Input = new Scanner(System.in);

        System.out.println("Enter your weight in Killos please...");
        int weight = u_Input.nextInt();

        System.out.println("Enter your height in metres please...");
        int height = u_Input.nextInt();

        double BMI = calculate(weight,height);
        String output = BMI+ " " +message(BMI);
        System.out.println(output);
    }
}


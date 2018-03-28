public class Coder extends Employees{
    int bonus = 200000;

    public static void main(String[] args) {
        Coder Amit = new Coder();
        Coder Apollo = new Coder();

        int AmitgrossSlary = (int)Amit.salary + Amit.bonus;
        System.out.println("Amit's salary is " + Amit.salary);
        System.out.println("Amit's bonus is " + Amit.bonus);
        System.out.println("Amit's GROSS Income is " + AmitgrossSlary);
    }
}

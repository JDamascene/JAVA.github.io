public class Method {
    //methods are a group of java statements that
    //perform some operations on some data and may or may not return
    //a result
    /*
    syntax
        accessModifier returnType methodName(parameter list){
        //method body}
        protected static double addNum(double num1, double num2){
        return num1 + num2;
        }
     */
    public static void main(String[] args) {
        //calling methods
        sayHello();
        sayHello();
        sayBetterHello("Amit",19);
        String print = concat("first name: ", "The guy");
        System.out.println(print);
        System.out.println("The area of your square is: " + areaSquare(10));

    }

    //no return type and no parameter
    public static void sayHello() {
        System.out.println("Hello there method!!");
    }

    //No reeturn type parameter list
    public static void sayBetterHello(String name, int age) {
        System.out.println("hello there " + name + ". you were born in the year " + (2018 - age));
    }

    //method return type
    public static String concat(String one, String two){
        String concatenated = one + " " + two;
        return concatenated;
    }

    public static int areaSquare(int l){
        return l *  l;
    }
}

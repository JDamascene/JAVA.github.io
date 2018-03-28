public class methodOverloading {
    //Method overloading is a feature that allows a class to have two
    //or more methods having the same name if their argument list are
    //different
    /*
    The argument list could differ by
    a)Number of parameters
    b)Data type of parameters
    c)Sequence of parameter list
     */
    //overloading based on number of parameter
    public void display(char c){
        System.out.println(c);
    }
    public void display(char c, int i){
        System.out.println(c + " " + i);
    }

    //Overloading by difference in data types
    public static void display(String name) {
        System.out.println("Your name is " + name);
    }

    //overloading by sequence of data type passed in
    public void display(int num, String city){
        System.out.println("First definition");
    }

    public void display( String city, int num){
        System.out.println("Second definition");
    }


    public static void main(String[] args) {
        methodOverloading obj1 = new methodOverloading();
        obj1.display('D');
        obj1.display('A', 2345);
        obj1.display("Amit");
        obj1.display(34,"nairobi");
        obj1.display("nairobi", 56);


    }
}

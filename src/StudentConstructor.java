public class StudentConstructor {
        //constructors are sprcial meathods that are
        //called when an object is instantieted
        //constructor initializes the newly created object
        int id;
        String name;

        //default-non-parameterized constructor
        StudentConstructor(){
            System.out.println("Bingo, the object was created succefully");
        }
        //ConstructorExample
        StudentConstructor(int i, String n){
            id = i;
            name = n;
        }

        //method
        void display(){
            System.out.println("Hi Sir, Your Student ID is = " + id + " ,$ your name is " +name);
        }


        public static void main(String[] args) {
            StudentConstructor nonParm = new StudentConstructor();
            System.out.println(nonParm);
            StudentConstructor obj2 = new StudentConstructor();
            System.out.println(obj2);
            //calling the parameterized constructor
            StudentConstructor student1 = new StudentConstructor (2001, "Abdulahi");
            StudentConstructor student2 = new StudentConstructor (2002, "Damascene");

            student1.display();
            student2.display();
    }
}

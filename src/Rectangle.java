import static javafx.scene.input.KeyCode.L;
import static javafx.scene.input.KeyCode.W;

public class Rectangle {
    //fields
    int length, width;

    //method

    public void insert(int l, int w) {
        this.length = l;
        this.width = w;
    }

    public void calculateArea() {
        System.out.println("The Area of the rectrangle is:" + length * width);
    }

    public static void main(String[] args) {
        Rectangle object1 = new Rectangle();
        Rectangle object2 = new Rectangle();
        Rectangle object3 = new Rectangle();
        object1.insert(34, 34);
        object2.insert( 46, 987);
        object3.insert(54, 10);
        object1.calculateArea();
        object2.calculateArea();
        object3.calculateArea();
    }
}

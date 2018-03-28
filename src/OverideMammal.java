public class OverideMammal {
    public static void main(String[] args) {
        //Mammal reference object
        Mammal mammal = new Mammal();
        mammal.move();
        //Mammal reference but of the object whale
        Mammal whale = new Whale();
        whale.move();
    }
}

public class Bike extends Vehicle {
    String modelType;

    public void setDetails(){
        //Access the Vehivle class, member variable
        VehicleType = "Bike";
        modelType = "Bombardier";
        System.out.println(VehicleType + " : " + modelType);
    }

    public static void main(String[] args) {
        Bike bike = new Bike();
        bike.setDetails();

    }
}

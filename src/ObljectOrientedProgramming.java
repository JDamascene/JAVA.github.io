public class ObljectOrientedProgramming {
    //Data members or fiels
    String brand;
    String Model;
    int ChasisNo;

    //Methods
    public void setBrand(String newBrand){
        this.brand = newBrand;
    }
    public void setModel(String newModel){
        this.Model = newModel;
    }
    public void setChasisNo(int newChasisNo){
        this.ChasisNo = newChasisNo;
    }

    public static void main(String[] args) {
        //Instantiate a new ar object
        ObljectOrientedProgramming car1 = new ObljectOrientedProgramming();
        ObljectOrientedProgramming saloon = new ObljectOrientedProgramming();
        ObljectOrientedProgramming car2 = new ObljectOrientedProgramming();

        car1.setBrand("Nissan");
        car1.setModel("GT-R");
        car1.setChasisNo(12345);

        System.out.println(car1.brand + " : " + car1.Model + " : " + car1.ChasisNo);
    }

}

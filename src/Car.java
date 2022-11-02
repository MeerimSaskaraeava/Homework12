public class Car {
    private String model;
    private String brand;
    private int year;

    void setModel(String model){
        this.model=model;
    }
    void setBrand(String brand){
        this.brand=brand;
    }
    void setYear(int year){
        this.year=year;
    }
    String getModel(){
        return model;
    }
    String getBrand(){
        return brand;
    }
    int getYear(){
        return year;
    }
    void getInfoCar(Car[]cars){
        for (Car car:cars) {
            System.out.println("Car model: " + car.model +
                    "\nCar brand: " + car.brand +
                    "\nCar year: " + car.year);
            System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~");

        }
    }
}

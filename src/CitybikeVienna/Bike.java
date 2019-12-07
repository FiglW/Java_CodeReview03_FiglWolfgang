package CitybikeVienna;

public class Bike {

    private Integer bikeID;
    private String brand;
    private String color;
    private Status checkStatus;
    private static Integer counter = 1;
    public enum Status{
        CanBeRented,
        CanNotBeRented,
        InService,
        Discarded;
    }

    Bike(String brand, String color,Status checkStatus){
        this.bikeID = counter++;
        this.color = color;
        this.checkStatus = checkStatus;



    }

    public int getBikeID(){
        return this.bikeID;

    }



    public Status getCheckStatus() {
        return checkStatus;
    }
}
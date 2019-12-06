package CitybikeVienna;

public class Bike {

    private Integer bikeID;
    private String brand;
    private String color;
    private String state;


    // try with static count
    public static Integer idCount = 0;


    //Constructor


    public Bike(String brand, String color, String state) {
        this.brand = brand;
        this.color = color;
        this.state = state;

        idCount++;
        this.setBikeID(idCount);
    }

    public Integer getBikeID() {
        return bikeID;
    }

    public void setBikeID(Integer bikeID) {
        this.bikeID = bikeID;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    @Override
    public String toString() {
        return "\nbikeID=" + bikeID +
                ", brand='" + brand  +
                ", color='" + color  +
                ", state='" + state;
    }
}

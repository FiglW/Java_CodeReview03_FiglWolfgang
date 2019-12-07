package CitybikeVienna;


import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class User {

    private static Integer counter = 1;
    private Integer userID;
    private String uFirstName;
    private String uLastName;
    private Integer currentlyRentedBike;
    private Rent rent;
    private ArrayList<Rent>rents = new ArrayList<>();

    public User (String uFirstName, String uLastName){
        this.userID = counter++;
        this.uFirstName = uFirstName;
        this.uLastName = uLastName;

    }
    public User(){}


    public void rentABike(Integer bikeID){
        if (Main.bikes.get(bikeID).getCheckStatus() == Bike.Status.CanBeRented){
            Main.checkStation(bikeID);
            this.currentlyRentedBike = bikeID;
            GregorianCalendar today = (GregorianCalendar) Calendar.getInstance();
            this.rent = new Rent(bikeID, today);
            this.rents.add(this.rent);
        }else {
            System.out.println("Sorry Dude this Bike cant be rented!!!");
        }
    }

    public Integer getCurrentlyRentedBike() {
        return currentlyRentedBike;
    }

    public void setCurrentlyRentedBike(Integer currentlyRentedBike) {
        this.currentlyRentedBike = currentlyRentedBike;
    }

    public Integer getUserID() {
        return userID;
    }
    public void removeBike(Integer bikeID){
        this.rent.setRentEnd();
        this.currentlyRentedBike = null;
    }
    public void allBikesRentedByUser(){

        SimpleDateFormat sdf = new SimpleDateFormat("kk:mm dd.MM.yyyy");
        String printName = this.uFirstName +" "+ this.uLastName;
        System.out.printf("%S" + "%17s" + "%28s%n", printName, "Start", "End");
        System.out.println("*************************************************************************");
        for (Rent rent :rents){
            System.out.printf("Bike" + "%2S" + "%34S" + "%30S%n", rent.getBikeID(), sdf.format(rent.getRentStart().getTime()), sdf.format(rent.getRentEnd().getTime()));
        }
    }


}

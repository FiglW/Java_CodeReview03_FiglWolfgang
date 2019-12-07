package CitybikeVienna;

import java.util.ArrayList;

public class Station {

    private static int counter = 1;
    private Integer stationID;
    private String location;
    private ArrayList<Integer> bikes;

    Station(String location){
        this.stationID = counter++;
        this.location = location;
        this.bikes = new ArrayList<>();
    }

    public Station(){
        //check status
    }

    public Integer getStationID() {
        return stationID;
    }

    public String getLocation() {
        return location;
    }

    //add bikes to the station
    public void addBike(Integer bikeID){
        this.bikes.add(bikeID);
    }
    //remove bike from station
    public void removeBike(Integer bikeID){
        this.bikes.remove(bikeID);
    }

    public ArrayList<Integer> getBikes(){
        return this.bikes;
    }
    public void returnBike(Integer bikeID){
        if (this.bikes.size() < 5) {
            addBike(bikeID);
            Main.checkWhichUser(bikeID);
        }else {
            System.out.println("Sorry Dude this station is full!!!");
        }
    }
}

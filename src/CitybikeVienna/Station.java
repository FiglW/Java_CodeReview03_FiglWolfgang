package CitybikeVienna;

import java.util.ArrayList;

public class Station {

    private Integer statID;
    private String location;

    ArrayList<Bike> arrbikelist = new ArrayList<>();

    private static int idCount;

    public Station(String location){
        this.location = location;

        idCount++;
        this.statID = idCount;

    }

    public Integer getStatID() {
        return statID;
    }

    public void setStatID(Integer statID) {
        this.statID = statID;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }



    public ArrayList<Bike> getArrbikelist() {
        return arrbikelist;
    }

    public void setArrbikelist(ArrayList<Bike> arrbikelist) {
        this.arrbikelist = arrbikelist;
    }

    // method add Bike
    public void addBike(Bike bike){
        if (this.getArrbikelist().size() == 4){
            System.out.println("Station: "+ this.getLocation() + "sorry dude, it's full");
        }else
            this.getArrbikelist().add(bike);

    }

    //method to remove the bike
    public void removeBike(Bike bike){
        this.getArrbikelist().remove(bike);
    }


}

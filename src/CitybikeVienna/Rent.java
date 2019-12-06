package CitybikeVienna;

public class Rent {

    private int bikeID;
    public Rent(){}
    public Rent(int bikeID){
        this.bikeID = bikeID;
    }

    public int getBikeID() {
        return bikeID;
    }

    public void setBikeID(int bikeID) {
        this.bikeID = bikeID;
    }
}


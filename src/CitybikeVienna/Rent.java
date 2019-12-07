package CitybikeVienna;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class Rent {

    private int bikeID;
    private GregorianCalendar rentStart;
    private GregorianCalendar rentEnd;

    public Rent(int bikeID, GregorianCalendar rentStart) {
        this.bikeID = bikeID;
        this.rentStart = rentStart;
    }

    public void setRentEnd(){
        this.rentEnd = (GregorianCalendar) Calendar.getInstance();
    }

    public int getBikeID() {
        return bikeID;
    }
    public GregorianCalendar getRentStart(){
        return rentStart;
    }
    public GregorianCalendar getRentEnd(){
        return rentEnd;
    }
}


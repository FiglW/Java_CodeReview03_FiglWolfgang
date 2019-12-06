package CitybikeVienna;

import java.util.ArrayList;

public class User {
    private Integer userID;
    private String name;
    private String surname;
    private Bike currentRentedBike;
    private Rent rent = new Rent();

    ArrayList<Rent> rents = new ArrayList<>();

    private static Integer idCount;

    public User(String name, String surname) {
        this.name = name;
        this.surname = surname;

        idCount++;
        this.userID = idCount;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public Bike getCurrentRentedBike() {
        return currentRentedBike;
    }

    public void setCurrentRentedBike(Bike currentRentedBike) {
        this.currentRentedBike = currentRentedBike;
    }

    public Rent getRent() {
        return rent;
    }

    public void setRent(Rent rent) {
        this.rent = rent;
    }

    @Override
    public String toString() {
        return "User{" +
                "userID=" + userID +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                '}';
    }
}

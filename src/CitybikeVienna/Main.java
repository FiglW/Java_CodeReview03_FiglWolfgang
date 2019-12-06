package CitybikeVienna;

import java.util.HashMap;

public class Main {
    public static void main(String[] args) {


        // create 8 or more Bikes
        Bike b1 = new Bike("Simplon","red","CanbeRented");
        Bike b2 = new Bike("Scott","blue","CanbeRented");
        Bike b3 = new Bike("Rotwild","yellow","CanbeRented");
        Bike b4 = new Bike("Focus","black","InService");
        Bike b5 = new Bike("Cannondale","grey","Discarded");
        Bike b6 = new Bike("Canyon","white","CanbeRented");
        Bike b7 = new Bike("Stevens","orange","CanbeRented");
        Bike b8 = new Bike("Giant","darkblue","CanbeRented");


        // Put all existing Bikes in a HashMap

        HashMap<Integer,Bike> hmBike = new HashMap<>();

        hmBike.put(b1.getBikeID(),b1);
        hmBike.put(b2.getBikeID(),b2);
        hmBike.put(b3.getBikeID(),b3);
        hmBike.put(b4.getBikeID(),b4);
        hmBike.put(b5.getBikeID(),b5);
        hmBike.put(b6.getBikeID(),b6);
        hmBike.put(b7.getBikeID(),b7);
        hmBike.put(b8.getBikeID(),b8);


        // create 3 Stations

        Station s1 = new Station("Hietzing");
        Station s2 = new Station("Kettenbrückengasse");
        Station s3 = new Station("Alser Straße");

        // put the 3 stations in a hashmap

        HashMap<Integer,Station> hmStation = new HashMap<>();

        hmStation.put(s1.getStatID(),s1);
        hmStation.put(s2.getStatID(),s2);
        hmStation.put(s3.getStatID(),s3);

        // add  bikes (put 3 bikes in Station1, and put 4 bikes in Station2).

        // Station 1
        hmStation.get(1).addBike(hmBike.get(1));
        hmStation.get(1).addBike(hmBike.get(2));
        hmStation.get(1).addBike(hmBike.get(3));

        //Station 2
        hmStation.get(2).addBike(hmBike.get(4));
        hmStation.get(2).addBike(hmBike.get(5));
        hmStation.get(2).addBike(hmBike.get(6));
        hmStation.get(2).addBike(hmBike.get(7));



















    }
}

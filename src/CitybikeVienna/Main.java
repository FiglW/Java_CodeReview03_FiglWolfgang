package CitybikeVienna;

import java.util.HashMap;
import java.util.Map;

public class Main {
        // bikes,hashmaps,station,users,rent.....
        // create 3 hashmaps - bikes,stations,users

        static HashMap<Integer, Bike> bikes = new HashMap<>();
        static HashMap<Integer, Station> stations = new HashMap<>();
        static HashMap<Integer, User> users = new HashMap<>();

    public static void main(String[] args) {


        // create 8 or more Bikes

        Bike b1 = new Bike("Simplon","red",Bike.Status.CanBeRented);
        Bike b2 = new Bike("Scott","blue",Bike.Status.CanBeRented);
        Bike b3 = new Bike("Rotwild","yellow",Bike.Status.CanBeRented);
        Bike b4 = new Bike("Focus","black",Bike.Status.CanBeRented);
        Bike b5 = new Bike("Cannondale","grey",Bike.Status.CanBeRented);
        Bike b6 = new Bike("Canyon","white",Bike.Status.CanBeRented);
        Bike b7 = new Bike("Stevens","orange",Bike.Status.CanBeRented);
        Bike b8 = new Bike("Giant","darkgrey",Bike.Status.InService);

        // Bikes in a HashMap that uses bikeID
        bikes.put(b1.getBikeID(),b1);
        bikes.put(b2.getBikeID(),b2);
        bikes.put(b3.getBikeID(),b3);
        bikes.put(b4.getBikeID(),b4);
        bikes.put(b5.getBikeID(),b5);
        bikes.put(b6.getBikeID(),b6);
        bikes.put(b7.getBikeID(),b7);
        bikes.put(b8.getBikeID(),b8);


        // create 3 Stations

        Station s1 = new Station("Hietzing");
        Station s2 = new Station("Kettenbrückengasse");
        Station s3 = new Station("Alser Straße");

        // the same with the station
        stations.put(s1.getStationID(),s1);
        stations.put(s2.getStationID(),s2);
        stations.put(s3.getStationID(),s3);
        System.out.println(" ");
        System.out.println("                  \uD83D\uDEB2 WELCOME TO CITYBIKE VIENNA \uD83D\uDEB2");
        System.out.println(" ");

        // add 3bikes to Station 1

        s1.addBike(1);
        s1.addBike(2);
        s1.addBike(3);
        System.out.println("In the Station " +s1.getLocation() +" they are following bikes avialable: " +s1.getBikes().toString());


        // add 4bikes to Station 2
        s2.addBike(4);
        s2.addBike(5);
        s2.addBike(6);
        s2.addBike(7);
        System.out.println("In the Station " +s2.getLocation() +" they are following bikes avialable: " +s2.getBikes().toString());

        // Station 3
        System.out.println("In the Station " + s3.getLocation() + "  there are currently no bikes available,Sorry!");
        System.out.println(" ");

        // Users create 3 users

        User user1 = new User("Franz","Mayer");
        User user2 = new User("Herbert","Lowhaska");
        User user3 = new User("Trude","Bauer");
        User user4 = new User("Susi","Test");

        // also the user put in a hashmap
        users.put(user1.getUserID(),user1);
        users.put(user2.getUserID(),user2);
        users.put(user3.getUserID(),user3);

        // Print the results from the station and bikes

        System.out.println("************************** RENT A BIKE *****************************");
        System.out.println(" ");
        System.out.println("The following bikes are available in " +s1.getLocation() + ":" + s1.getBikes().toString() );
        System.out.println(" ");

        user1.rentABike(2);
        System.out.println("The User with the ID "+ user1.getUserID()+" has the Bike with the ID " + user1.getCurrentlyRentedBike() +" from this Station rented");
        System.out.println("Remaining bikes in this station " + s1.getBikes().toString());
        System.out.println(" ");
        System.out.println("The Bike with the ID "+ user1.getCurrentlyRentedBike()+ " was from the user with the ID "+user1.getUserID() +" in the Station " + s3.getLocation() + " brought back");
        s3.returnBike(2);
        System.out.println("all bikes in this station: " + s3.getBikes().toString());
        System.out.println("\n#########################################################################");

        System.out.println(" ");
        System.out.println("The following bikes are available in " +s2.getLocation() + ":" + s2.getBikes().toString() );
        System.out.println(" ");
        user2.rentABike(4);
        System.out.println("The User with the ID "+ user2.getUserID()+" has the Bike with the ID " + user2.getCurrentlyRentedBike() +" from this Station rented");
        System.out.println("Remaining bikes in this station " + s2.getBikes().toString());
        System.out.println(" ");
        System.out.println("The Bike with the ID "+ user2.getCurrentlyRentedBike()+ " was from the user with the ID "+user2.getUserID() +" in the Station " + s3.getLocation() + " brought back");
        s3.returnBike(4);
        System.out.println("all bikes in this station: " + s3.getBikes().toString());
        System.out.println("\n#########################################################################");

        System.out.println(" ");
        System.out.println("The following bikes are available in " +s3.getLocation() + ":" + s3.getBikes().toString() );
        System.out.println(" ");
        user3.rentABike(2);
        System.out.println("The User with the ID "+ user3.getUserID()+" has the Bike with the ID " + user3.getCurrentlyRentedBike() +" from this Station rented");
        System.out.println("Remaining bikes in this station " + s3.getBikes().toString());
        System.out.println(" ");
        System.out.println("The Bike with the ID "+ user3.getCurrentlyRentedBike()+ " was from the user with the ID "+user3.getUserID() +" in the Station " + s1.getLocation() + " brought back");
        s1.returnBike(2);
        System.out.println("all bikes in this station: " + s1.getBikes().toString());
        System.out.println("\n#########################################################################");




        //BONUS

        //add more than 5 bikes to s1
        /*user3.rentABike(5);
        s1.returnBike(5);
        user3.rentABike(2);
        s1.returnBike(2);
        user1.rentABike(4);
        s1.returnBike(4);
        user2.rentABike(7);
        s1.returnBike(7);*/

        // the bike 8 is InService!!!
        System.out.println(" ");
        System.out.println(b8.getCheckStatus());
        System.out.println(" ");
        System.out.println("****************************************************************************");

        System.out.println(" ");
        System.out.println("\uD83D\uDEB2  RENTAL TRACKING \uD83D\uDEB2 ");
        System.out.println(" ");



        user1.allBikesRentedByUser();
        System.out.println("");

        user2.allBikesRentedByUser();
        System.out.println("");

        user3.allBikesRentedByUser();
        System.out.println("");

        System.out.println("                  \uD83D\uDEB2 HAVE A NICE DAY \uD83D\uDEB2");
        System.out.println("                  \uD83D\uDEB2 CITYBIKE VIENNA \uD83D\uDEB2");

    }

    public static void checkStation(Integer bikeID){
        Station station = new Station();
        for (Map.Entry<Integer, Station> entry : stations.entrySet()){
            if (entry.getValue().getBikes().contains(bikeID)){
                station = entry.getValue();
                break;
            }
        }
        station.removeBike(bikeID);
    }

    public static void checkWhichUser(Integer bikeID){
        User user = new User();
        for (Map.Entry<Integer, User> entry: users.entrySet()){
            if (entry.getValue().getCurrentlyRentedBike() ==bikeID){
                user = entry.getValue();
                break;
            }
        }
        user.removeBike(bikeID);
    }
}

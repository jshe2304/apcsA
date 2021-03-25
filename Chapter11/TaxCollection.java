package Chapter11;

import java.util.*;

public class TaxCollection {
    public static void main(String[] args) {
        ArrayList<Vehicle> vehicles = new ArrayList();
        vehicles.add(new Car("Toyota", "12j34k2j34", 4, 4000, 5, "Red"));
        vehicles.add(new Car("Honda", "jdf823jkj2", 2, 5000, 5, "Blue"));
        vehicles.add(new Truck("Ford", "2k3jkb2b2h", 5, 8000, 1000, "Pickup"));
        vehicles.add(new Truck("Volvo", "5hb3jh3jh5", 1, 30000, 20000, "Semi-Truck"));
        vehicles.add(new FarmTruck("Chevy", "73kjh5322j", 2, 10000, 1500, "Pickup", "Oranges"));
        vehicles.add(new FarmTruck("Ram", "ji6kjnh4kj", 8, 25000, 17500, "Shipping", "Apples"));
        
        for (int i = 0; i < vehicles.size(); i++) {
            System.out.println(vehicles.get(i));
        }
        
        System.out.println("\n--------------------");
        System.out.println("Tax Collection");
        System.out.println("--------------------");
        
        for (int i = 0; i < vehicles.size(); i++) {
            System.out.println("VIN : " + vehicles.get(i).getVIN() + "\tTax : $" + vehicles.get(i).tax());
        }
    }
}

/*
--------------------
Brand : Toyota
VIN : 12j34k2j34
Age : 4
Weight : 4000
Vehicle Type : Car
Seats : 5
Color : Red
Tax : $100.0

--------------------
Brand : Honda
VIN : jdf823jkj2
Age : 2
Weight : 5000
Vehicle Type : Car
Seats : 5
Color : Blue
Tax : $400.0

--------------------
Brand : Ford
VIN : 2k3jkb2b2h
Age : 5
Weight : 8000
Vehicle Type : Truck
Capacity : 1000
Truck Type : Pickup
Tax : $100.0

--------------------
Brand : Volvo
VIN : 5hb3jh3jh5
Age : 1
Weight : 30000
Vehicle Type : Truck
Capacity : 20000
Truck Type : Semi-Truck
Tax : $480.0

--------------------
Brand : Chevy
VIN : 73kjh5322j
Age : 2
Weight : 10000
Vehicle Type : Truck
Capacity : 1500
Truck Type : Pickup
Tax : $400.0
Crop : Oranges

--------------------
Brand : Ram
VIN : ji6kjnh4kj
Age : 8
Weight : 25000
Vehicle Type : Truck
Capacity : 17500
Truck Type : Shipping
Tax : $114.99999999999999
Crop : Apples

--------------------
Tax Collection
--------------------
VIN : 12j34k2j34	Tax : $100.0
VIN : jdf823jkj2	Tax : $400.0
VIN : 2k3jkb2b2h	Tax : $100.0
VIN : 5hb3jh3jh5	Tax : $480.0
VIN : 73kjh5322j	Tax : $400.0
VIN : ji6kjnh4kj	Tax : $114.99999999999999
*/

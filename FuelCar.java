/**
 * The following code is for the class FuelCar
 * which consists of attributes, constructor which is a special kind of method,
 * getter methods also known as accessor method, setter methods also known as
 * mutator method,
 * a method to purchase the car and also, a method to display the details of the
 * car.
 *
 * @author (ninchy0)
 * @version (1.0.0)
 */

// Creating sub class of Car class i.e. FuelCar
public class FuelCar extends Car {
    // Defining attributes of the class
    private String distributorName;
    private String fuelType;
    private int seats;
    private String bookDate;
    private String purchaseDate;
    private int mileage;
    private String transmissionType;
    private boolean isPurchased;

    // Creating a constructor of the class
    public FuelCar(int carId, String carName, String carBrand, String carPrice, String fuelType, int seats,
            int mileage) {
        super(carId, carName, carBrand, carPrice);
        this.distributorName = "";
        this.bookDate = "";
        this.purchaseDate = "";
        this.transmissionType = "";
        this.isPurchased = false;
    }

    // Creating accessor methods for each attributes of the class
    public String getDistributorName() {
        return this.distributorName;
    }

    public String getFuelType() {
        return this.fuelType;
    }

    public int getSeats() {
        return this.seats;
    }

    public String getBookDate() {
        return this.bookDate;
    }

    public String getPurchaseDate() {
        return this.purchaseDate;
    }

    public int getMileage() {
        return this.mileage;
    }

    public String getTransmissionType() {
        return this.transmissionType;
    }

    public boolean getIsPurchased() {
        return this.isPurchased;
    }

    // Creating a setter method for distributor name
    public void setDistributorName(String distributorName) {
        this.distributorName = distributorName;
    }

    // Creating a setter method for transmission type
    public void setTransmissionType(String transmissionType) {
        this.transmissionType = transmissionType;
    }

    // Creating a method to purchase a fuel car
    public void purchaseCar(String purchaseDate, String bookDate) {
        if (isPurchased == true) {
            // Calling the method to set the car color from the super class
            super.setCarColor("Black");

            // Displaying the details of the car
            System.out.println("Car Id: " + getCarId());
            System.out.println("Car Name: " + getCarName());
            System.out.println("Car Brand: " + getCarBrand());
            System.out.println("Car Color: " + getCarColor());
            System.out.println("Car Price: $" + getCarPrice());
            System.out.println("Distributor Name: " + getDistributorName());
        } else {
            setDistributorName(this.distributorName);
            setTransmissionType(this.transmissionType);
            isPurchased = true;
        }
    }

    // Creating a method to display the details of the car
    public void display() {
        super.display();
        if (isPurchased == true) {
            System.out.println("Distributor Name: " + distributorName);
            System.out.println("Fuel Type: " + fuelType);
            System.out.println("Purchase Date: " + purchaseDate);
            System.out.println("Booked Date: " + bookDate);
            System.out.println("Mileage: " + mileage);
            System.out.println("Number of seats: " + seats);
            System.out.println("Transmission Type: " + transmissionType);
        }
    }
}

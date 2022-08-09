/**
 * The following code is for the class Car which is the super class.
 * It consists of attributes, constructor which is a special kind of method,
 * getter methods also known as accessor method, setter methods also known as
 * mutator method
 * and also, a method to display the details of the car.
 *
 * @author (ninchy0)
 * @version (1.0.0)
 */

// Creating the Car class
public class Car {
    // Declaring attributes of the class
    private int carId;
    private String carName;
    private String carBrand;
    private String carColor;
    private String carPrice;

    // Creating a constructor of the class
    public Car(int carId, String carName, String carBrand, String carPrice) {
        this.carId = carId;
        this.carName = carName;
        this.carBrand = carBrand;
        this.carPrice = carPrice;
        this.carColor = "";
    }

    // Creating getter methods for each attribute of the class
    public int getCarId() {
        return this.carId;
    }

    public String getCarName() {
        return this.carName;
    }

    public String getCarBrand() {
        return this.carBrand;
    }

    public String getCarColor() {
        return this.carColor;
    }

    public String getCarPrice() {
        return this.carPrice;
    }

    // Creating a setter method for car color
    public void setCarColor(String carColor) {
        this.carColor = carColor;
    }

    // Creating a method to display the details of the car
    public void display() {
        System.out.println("Car Id: " + carId);
        System.out.println("Car Name: " + carName);
        System.out.println("Car Brand: " + carBrand);
        if (carColor == "") {
            System.out.println("The car color is empty");
        } else {
            System.out.println("Car Color: " + carColor);
        }
        System.out.println("Car Price: $" + carPrice);
    }
}

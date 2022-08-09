/**
 * The following code is for the class ElectricCar
 * which consists of attributes, constructor which is a special kind of method,
 * getter methods also known as accessor method, setter methods also known as
 * mutator method,
 * methods to purchase and sell the car and also, a method to display the
 * details of the car.
 *
 * @author (ninchy0)
 * @version (1.0.0)
 */

// Creating sub class of Car class i.e. ElectricCar
public class ElectricCar extends Car {
    // Defining attributes of the class
    private String customerName;
    private int batteryCapacity;
    private int batteryWarranty;
    private String purchaseDate;
    private String range;
    private int rechargeTime;
    private boolean isBought;
    private boolean isSold;

    // Creating a constructor of the class
    public ElectricCar(int carId, String carName, String carBrand, String carPrice, int batteryCapacity) {
        super(carId, carName, carBrand, carPrice);
        this.batteryCapacity = batteryCapacity;
        this.customerName = "";
        this.batteryWarranty = 0;
        this.purchaseDate = "";
        this.range = "";
        this.rechargeTime = 0;
        this.isBought = false;
        this.isSold = false;
    }

    // Creating accessor methods for each attributes of the class
    public String getCustomerName() {
        return this.customerName;
    }

    public int getBatteryCapacity() {
        return this.batteryCapacity;
    }

    public int getBatteryWarranty() {
        return this.batteryWarranty;
    }

    public String getPurchaseDate() {
        return this.purchaseDate;
    }

    public String getRange() {
        return this.range;
    }

    public int getRechargeTime() {
        return this.rechargeTime;
    }

    public boolean getIsBought() {
        return this.isBought;
    }

    public boolean getIsSold() {
        return this.isSold;
    }

    // Creating a setter method for customer name
    public void setCustomerName(String customerName) {
        if (isBought == false) {
            this.customerName = customerName;
        } else {
            System.out.println("The car is already bought. Therefore, customer name cannot be changed.");
        }
    }

    // Creating a method to buy an electric car
    public void buyCar(String customerName, int batteryWarranty, String purchaseDate, String range, int rechargeTime) {
        if (isBought == false) {
            setCustomerName(customerName);
            isBought = true;
        } else {
            System.out.println("The car is already bought.");
        }
    }

    // Creating a method to sell the car
    public void sellCar(String customerName) {
        this.customerName = customerName;
        if (isSold == false) {
            batteryCapacity = 0;
            batteryWarranty = 0;
            purchaseDate = "";
            range = "";
            rechargeTime = 0;
            isSold = true;
            isBought = false;
        } else {
            System.out.println("The car is already sold.");
        }
    }

    // Creating a method to display the details of the car
    public void display() {
        super.display();
        if (isBought == true) {
            System.out.println("Customer Name: " + customerName);
            System.out.println("Battery Capacity: " + batteryCapacity);
            System.out.println("Battery Warranty: " + batteryWarranty);
            System.out.println("Purchase Date: " + purchaseDate);
            System.out.println("Range: " + range);
            System.out.println("Recharge Time: " + rechargeTime);
        }
    }
}

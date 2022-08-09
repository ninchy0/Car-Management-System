
/**
 * The following code is of the class GUI_Demo which creates GUI of FuelCar and ElectricCar 
 * using the respective classes and the parent class as well.
 * This class consists of different attributes, constructor, createGUI method, 
 * also alot of instance variables/objects and a main method at the very last.
 *
 * @author (ninchy0)
 * @version (04.20.2022)
 */

//  Importing the required packages for the program
import java.util.ArrayList;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import java.awt.Font;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class GUI_Demo {
    // Main Frame Declaration
    private JFrame frame;

    // FuelCar and ElectricCar Panel Declaration
    private JPanel fcarPanel;
    private JPanel ecarPanel;

    // Goto panel - Buttons Declaration
    private JButton gotoFCarPanel1, gotoECarPanel1;

    private JButton gotoFCarPanel2, gotoECarPanel2;

    // Fuel Car - Labels Declaration
    private JLabel fcarHeading, fcarId, fcarName, fcarBrand, fcarColor, fcarPrice, fcarDistributorName, fcarFuelType,
            fcarNumOfSeats, fcarMileage, fcarTransmissionType, fcarPurchaseDate, fcarBookedDate;

    // Electric Car - Labels Declaration
    private JLabel ecarHeading, ecarId, ecarName, ecarBrand, ecarColor, ecarPrice, ecarCustomerName,
            ecarBatteryCapacity, ecarBatteryWarranty, ecarRange, ecarRechargeTime, ecarPurchaseDate;

    // Fuel Car - Text fields Declaration
    private JTextField fcarIdTxt, fcarNameTxt, fcarBrandTxt, fcarColorTxt, fcarPriceTxt, fcarFuelTypeTxt,
            fcarNumOfSeatsTxt, fcarMileageTxt, fcarDistributorNameTxt, fcarTransmissionTypeTxt;

    // Electric Car - Text fields Declaration
    private JTextField ecarIdTxt, ecarNameTxt, ecarBrandTxt, ecarColorTxt, ecarPriceTxt, ecarCustomerNameTxt,
            ecarBatteryCapacityTxt, ecarBatteryWarrantyTxt, ecarRangeTxt, ecarRechargeTimeTxt;

    // Fuel Car - Buttons Declaration
    private JButton fcarAddBtn, fcarPurchaseBtn, fcarDisplayBtn, fcarClearBtn;

    // Electric Car - Buttons Declaration
    private JButton ecarAddBtn, ecarBuyBtn, ecarSellBtn, ecarDisplayBtn, ecarClearBtn;

    // Fuel Car - Combo box Declaration
    private JComboBox<String> fcarPurchaseDay, fcarPurchaseMonth, fcarPurchaseYear;

    private JComboBox<String> fcarBookedDay, fcarBookedMonth, fcarBookedYear;

    // Electric Car - Combo box Declaration
    private JComboBox<String> ecarPurchaseDay, ecarPurchaseMonth, ecarPurchaseYear;

    // Array Lists Declaration
    private ArrayList<Car> cars;

    // Objects of FuelCar and ElectricCar Declaration
    private FuelCar fCar;
    private ElectricCar eCar;

    // Defining the font family and font sizes
    private Font fHead = new Font("Roboto", Font.PLAIN, 30);
    private Font fNormal = new Font("Roboto", Font.PLAIN, 17);
    private Font cFont = new Font("Roboto", Font.PLAIN, 14);

    // Defining the colors
    private Color btnColor = new Color(183, 230, 247);
    private Color gotoBtnColor = new Color(0, 191, 255);

    // Defining the icon for the frame
    private ImageIcon image = new ImageIcon("./icon.png");

    // Defining the Constructor
    public GUI_Demo() {
        createGUI();
    }

    // Defining the method that creates the GUI
    public void createGUI() {
        // Constructing the main frame
        frame = new JFrame("Car Management System");

        // Constructing panels
        fcarPanel = new JPanel();
        ecarPanel = new JPanel();

        // Constructing goto panel buttons
        // For Fuel Car Panel
        gotoFCarPanel1 = new JButton("Fuel Car");
        gotoECarPanel1 = new JButton("Electric Car");

        // For Electric Car Panel
        gotoFCarPanel2 = new JButton("Fuel Car");
        gotoECarPanel2 = new JButton("Electric Car");

        // Constructing Fuel Car labels
        fcarHeading = new JLabel("Fuel Car", SwingConstants.CENTER);
        fcarId = new JLabel("Car ID:");
        fcarName = new JLabel("Car Name:");
        fcarBrand = new JLabel("Car Brand:");
        fcarColor = new JLabel("Car Color:");
        fcarPrice = new JLabel("Car Price:");
        fcarFuelType = new JLabel("Fuel Type:");
        fcarMileage = new JLabel("Mileage:");
        fcarNumOfSeats = new JLabel("Number of seats:");
        fcarDistributorName = new JLabel("Distributor Name:");
        fcarTransmissionType = new JLabel("Transmission Type:");
        fcarPurchaseDate = new JLabel("Purchase Date:");
        fcarBookedDate = new JLabel("Booked Date:");

        // Constructing Electric Car labels
        ecarHeading = new JLabel("Electric Car", SwingConstants.CENTER);
        ecarId = new JLabel("Car ID:");
        ecarName = new JLabel("Car Name:");
        ecarBrand = new JLabel("Car Brand:");
        ecarColor = new JLabel("Car Color:");
        ecarPrice = new JLabel("Car Price:");
        ecarCustomerName = new JLabel("Customer Name:");
        ecarBatteryCapacity = new JLabel("Battery Capacity:");
        ecarBatteryWarranty = new JLabel("Battery Warranty:");
        ecarRange = new JLabel("Range:");
        ecarRechargeTime = new JLabel("Recharge Time:");
        ecarPurchaseDate = new JLabel("Purchase Date:");

        // Constructing Fuel Car text fields
        fcarIdTxt = new JTextField();
        fcarNameTxt = new JTextField();
        fcarBrandTxt = new JTextField();
        fcarPriceTxt = new JTextField();
        fcarFuelTypeTxt = new JTextField();
        fcarMileageTxt = new JTextField();
        fcarNumOfSeatsTxt = new JTextField();
        fcarColorTxt = new JTextField();
        fcarDistributorNameTxt = new JTextField();
        fcarTransmissionTypeTxt = new JTextField();

        // Constructing Electric Car textfields
        ecarIdTxt = new JTextField();
        ecarNameTxt = new JTextField();
        ecarBrandTxt = new JTextField();
        ecarColorTxt = new JTextField();
        ecarPriceTxt = new JTextField();
        ecarCustomerNameTxt = new JTextField();
        ecarBatteryCapacityTxt = new JTextField();
        ecarBatteryWarrantyTxt = new JTextField();
        ecarRangeTxt = new JTextField();
        ecarRechargeTimeTxt = new JTextField();

        // Constructing Fuel Car buttons
        fcarAddBtn = new JButton("Add");
        fcarPurchaseBtn = new JButton("Purchase");
        fcarDisplayBtn = new JButton("Display");
        fcarClearBtn = new JButton("Clear");

        // Constructing Electric Car buttons
        ecarAddBtn = new JButton("Add");
        ecarBuyBtn = new JButton("Buy");
        ecarSellBtn = new JButton("Sell");
        ecarDisplayBtn = new JButton("Dislay");
        ecarClearBtn = new JButton("Clear");

        // Defining String arrays of days, months and years
        String[] days = { "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14", "15",
                "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31" };
        String[] months = { "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12" };
        String[] years = { "2010", "2011", "2012", "2013", "2014", "2015", "2016", "2017", "2018", "2019", "2020",
                "2021", "2022" };

        // Constructing Fuel Car date combo box
        fcarPurchaseDay = new JComboBox<>(days);
        fcarPurchaseMonth = new JComboBox<>(months);
        fcarPurchaseYear = new JComboBox<>(years);

        fcarBookedDay = new JComboBox<>(days);
        fcarBookedMonth = new JComboBox<>(months);
        fcarBookedYear = new JComboBox<>(years);

        // Constructing Electric Car date combo box
        ecarPurchaseDay = new JComboBox<>(days);
        ecarPurchaseMonth = new JComboBox<>(months);
        ecarPurchaseYear = new JComboBox<>(years);

        // Constructing an ArrayList to store FuelCar and ElectricCar objects
        cars = new ArrayList<>();

        // Fuel Car Panel - Goto Buttons Configuration
        gotoFCarPanel1.setBounds(202, 48, 270, 32);
        gotoFCarPanel1.setBackground(gotoBtnColor);
        gotoFCarPanel1.setFont(fNormal);
        gotoFCarPanel1.setFocusable(false);
        gotoFCarPanel1.setForeground(Color.WHITE);

        gotoECarPanel1.setBounds(551, 48, 270, 32);
        gotoECarPanel1.setBackground(gotoBtnColor);
        gotoECarPanel1.setFont(fNormal);
        gotoECarPanel1.setFocusable(false);
        gotoECarPanel1.setForeground(Color.WHITE);

        // Electric Car Panel - Goto Buttons Configuration
        gotoFCarPanel2.setBounds(202, 48, 270, 32);
        gotoFCarPanel2.setBackground(gotoBtnColor);
        gotoFCarPanel2.setFont(fNormal);
        gotoFCarPanel2.setFocusable(false);
        gotoFCarPanel2.setForeground(Color.WHITE);

        gotoECarPanel2.setBounds(551, 48, 270, 32);
        gotoECarPanel2.setBackground(gotoBtnColor);
        gotoECarPanel2.setFont(fNormal);
        gotoECarPanel2.setFocusable(false);
        gotoECarPanel2.setForeground(Color.WHITE);

        // Fuel Car Panel - Labels Configuration
        fcarHeading.setBounds(395, 105, 230, 45);
        fcarHeading.setFont(fHead);

        fcarId.setBounds(55, 225, 130, 30);
        fcarId.setFont(fNormal);

        fcarName.setBounds(55, 270, 130, 30);
        fcarName.setFont(fNormal);

        fcarBrand.setBounds(55, 315, 130, 30);
        fcarBrand.setFont(fNormal);

        fcarPrice.setBounds(55, 361, 130, 30);
        fcarPrice.setFont(fNormal);

        fcarFuelType.setBounds(55, 408, 130, 30);
        fcarFuelType.setFont(fNormal);

        fcarMileage.setBounds(55, 454, 130, 30);
        fcarMileage.setFont(fNormal);

        fcarNumOfSeats.setBounds(55, 500, 151, 30);
        fcarNumOfSeats.setFont(fNormal);

        fcarColor.setBounds(590, 226, 107, 30);
        fcarColor.setFont(fNormal);

        fcarTransmissionType.setBounds(590, 317, 170, 30);
        fcarTransmissionType.setFont(fNormal);

        fcarDistributorName.setBounds(590, 272, 170, 30);
        fcarDistributorName.setFont(fNormal);

        fcarPurchaseDate.setBounds(590, 365, 170, 30);
        fcarPurchaseDate.setFont(fNormal);

        fcarBookedDate.setBounds(590, 408, 170, 30);
        fcarBookedDate.setFont(fNormal);

        // Electric Car Panel - Labels Configuration
        ecarHeading.setBounds(395, 105, 230, 45);
        ecarHeading.setFont(fHead);

        ecarId.setBounds(55, 225, 130, 30);
        ecarId.setFont(fNormal);

        ecarName.setBounds(55, 270, 130, 30);
        ecarName.setFont(fNormal);

        ecarBrand.setBounds(55, 315, 130, 30);
        ecarBrand.setFont(fNormal);

        ecarPrice.setBounds(55, 361, 130, 30);
        ecarPrice.setFont(fNormal);

        ecarBatteryCapacity.setBounds(55, 406, 147, 30);
        ecarBatteryCapacity.setFont(fNormal);

        ecarColor.setBounds(590, 226, 107, 30);
        ecarColor.setFont(fNormal);

        ecarCustomerName.setBounds(590, 269, 170, 30);
        ecarCustomerName.setFont(fNormal);

        ecarBatteryWarranty.setBounds(590, 315, 170, 30);
        ecarBatteryWarranty.setFont(fNormal);

        ecarRange.setBounds(590, 360, 170, 30);
        ecarRange.setFont(fNormal);

        ecarRechargeTime.setBounds(590, 406, 170, 30);
        ecarRechargeTime.setFont(fNormal);

        ecarPurchaseDate.setBounds(590, 454, 170, 30);
        ecarPurchaseDate.setFont(fNormal);

        // Fuel Car Panel - Textfields Configuration
        fcarIdTxt.setBounds(170, 225, 220, 31);
        fcarNameTxt.setBounds(170, 270, 220, 31);
        fcarBrandTxt.setBounds(170, 315, 220, 31);
        fcarPriceTxt.setBounds(170, 361, 220, 31);
        fcarFuelTypeTxt.setBounds(170, 407, 220, 31);
        fcarMileageTxt.setBounds(170, 453, 220, 31);
        fcarNumOfSeatsTxt.setBounds(217, 499, 173, 31);
        fcarColorTxt.setBounds(766, 225, 191, 31);
        fcarDistributorNameTxt.setBounds(766, 271, 191, 31);
        fcarTransmissionTypeTxt.setBounds(766, 317, 191, 31);

        // Electric Car Panel - Textfields Configuration
        ecarIdTxt.setBounds(170, 225, 220, 31);
        ecarNameTxt.setBounds(170, 270, 220, 31);
        ecarBrandTxt.setBounds(170, 315, 220, 31);
        ecarPriceTxt.setBounds(170, 361, 220, 31);
        ecarBatteryCapacityTxt.setBounds(217, 406, 173, 31);
        ecarColorTxt.setBounds(754, 225, 203, 31);
        ecarCustomerNameTxt.setBounds(754, 270, 203, 31);
        ecarBatteryWarrantyTxt.setBounds(754, 315, 203, 31);
        ecarRangeTxt.setBounds(754, 360, 203, 31);
        ecarRechargeTimeTxt.setBounds(754, 406, 203, 31);

        // Fuel Car Panel - Combo box Configuration
        fcarPurchaseDay.setBounds(722, 363, 68, 32);
        fcarPurchaseDay.setFont(cFont);

        fcarPurchaseMonth.setBounds(798, 363, 79, 32);
        fcarPurchaseMonth.setFont(cFont);

        fcarPurchaseYear.setBounds(889, 363, 68, 32);
        fcarPurchaseYear.setFont(cFont);

        fcarBookedDay.setBounds(722, 406, 68, 32);
        fcarBookedDay.setFont(cFont);

        fcarBookedMonth.setBounds(798, 406, 79, 32);
        fcarBookedMonth.setFont(cFont);

        fcarBookedYear.setBounds(889, 406, 68, 32);
        fcarBookedYear.setFont(cFont);

        // Electric Car Panel - Combo box Configuration
        ecarPurchaseDay.setBounds(722, 452, 68, 32);
        ecarPurchaseDay.setFont(cFont);

        ecarPurchaseMonth.setBounds(798, 452, 79, 32);
        ecarPurchaseMonth.setFont(cFont);

        ecarPurchaseYear.setBounds(889, 452, 68, 32);
        ecarPurchaseYear.setFont(cFont);

        // Fuel Car Panel - Buttons Configuration
        fcarAddBtn.setBounds(55, 545, 335, 30);
        fcarAddBtn.setFocusable(false);
        fcarAddBtn.setBackground(btnColor);
        fcarAddBtn.setFont(fNormal);

        fcarPurchaseBtn.setBounds(590, 454, 367, 30);
        fcarPurchaseBtn.setFocusable(false);
        fcarPurchaseBtn.setBackground(btnColor);
        fcarPurchaseBtn.setFont(fNormal);

        fcarDisplayBtn.setBounds(590, 500, 172, 30);
        fcarDisplayBtn.setFocusable(false);
        fcarDisplayBtn.setBackground(btnColor);
        fcarDisplayBtn.setFont(fNormal);

        fcarClearBtn.setBounds(785, 500, 172, 30);
        fcarClearBtn.setFocusable(false);
        fcarClearBtn.setBackground(btnColor);
        fcarClearBtn.setFont(fNormal);

        // Electric Car Panel - Buttons Configuration
        ecarAddBtn.setBounds(55, 452, 335, 30);
        ecarAddBtn.setFocusable(false);
        ecarAddBtn.setBackground(btnColor);
        ecarAddBtn.setFont(fNormal);

        ecarDisplayBtn.setBounds(55, 498, 158, 30);
        ecarDisplayBtn.setFocusable(false);
        ecarDisplayBtn.setBackground(btnColor);
        ecarDisplayBtn.setFont(fNormal);

        ecarClearBtn.setBounds(232, 497, 158, 30);
        ecarClearBtn.setFocusable(false);
        ecarClearBtn.setBackground(btnColor);
        ecarClearBtn.setFont(fNormal);

        ecarBuyBtn.setBounds(593, 498, 172, 30);
        ecarBuyBtn.setFocusable(false);
        ecarBuyBtn.setBackground(btnColor);
        ecarBuyBtn.setFont(fNormal);

        ecarSellBtn.setBounds(785, 499, 172, 30);
        ecarSellBtn.setFocusable(false);
        ecarSellBtn.setBackground(btnColor);
        ecarSellBtn.setFont(fNormal);

        // Adding Action Listeners for the goto buttons
        // For FuelCar Panel
        gotoECarPanel1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                fcarPanel.setVisible(false);
                ecarPanel.setVisible(true);
            }
        });

        gotoFCarPanel1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                fcarPanel.setVisible(true);
                ecarPanel.setVisible(false);
            }
        });

        // For ElectricCar Panel
        gotoECarPanel2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                fcarPanel.setVisible(false);
                ecarPanel.setVisible(true);
            }
        });

        gotoFCarPanel2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                fcarPanel.setVisible(true);
                ecarPanel.setVisible(false);
            }
        });

        // Adding Action Listeners for the add buttons
        // For FuelCar
        fcarAddBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    // Getting values from the text fields
                    int carId = Integer.parseInt(fcarIdTxt.getText());
                    String carName = fcarNameTxt.getText();
                    String carBrand = fcarBrandTxt.getText();
                    String carPrice = fcarPriceTxt.getText();
                    String fuelType = fcarFuelTypeTxt.getText();
                    int seats = Integer.parseInt(fcarNumOfSeatsTxt.getText());
                    int mileage = Integer.parseInt(fcarMileageTxt.getText());

                    // Checking if the text fields are empty
                    if (carName.isEmpty() || carBrand.isEmpty() || carPrice.isEmpty() || fuelType.isEmpty()) {
                        JOptionPane.showMessageDialog(frame, "Please give input in all of the required fields.",
                                "Alert",
                                JOptionPane.WARNING_MESSAGE);
                        return;
                    }

                    // Checking if the ArrayList is empty
                    if (cars.isEmpty()) {
                        // Creating an object of FuelCar and adding it into the ArrayList
                        fCar = new FuelCar(carId, carName, carBrand, carPrice, fuelType, seats, mileage);
                        cars.add(fCar);

                        JOptionPane.showMessageDialog(frame, "Car was added successfully.", "Information",
                                JOptionPane.INFORMATION_MESSAGE);
                        return;
                    }

                    // Traversing through the ArrayList if it's not empty
                    for (Car car : cars) {

                        // Checking if the car object is an instanceof Fuelcar and if the carId exist in
                        // the ArrayList
                        if (car instanceof FuelCar && carId == car.getCarId()) {
                            JOptionPane.showMessageDialog(frame, "This car already exists.", "Alert",
                                    JOptionPane.WARNING_MESSAGE);
                            return;
                        }
                    }

                    // Creating an object of FuelCar and adding it into the ArrayList if it's not
                    // empty
                    fCar = new FuelCar(carId, carName, carBrand, carPrice, fuelType, seats, mileage);
                    cars.add(fCar);

                    JOptionPane.showMessageDialog(frame, "Car was added successfully.", "Information",
                            JOptionPane.INFORMATION_MESSAGE);

                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(frame,
                            "Please make sure that you've given numbers in carID, carPrice, seats and mileage fields.",
                            "Alert",
                            JOptionPane.WARNING_MESSAGE);
                }
            }
        });

        // For ElectricCar
        ecarAddBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    // Getting values from the text fields
                    int carId = Integer.parseInt(ecarIdTxt.getText());
                    String carName = ecarNameTxt.getText();
                    String carBrand = ecarBrandTxt.getText();
                    String carPrice = ecarPriceTxt.getText();
                    int batteryCapacity = Integer.parseInt(ecarBatteryCapacityTxt.getText());

                    // Checking if the text fields are empty
                    if (carName.isEmpty() || carBrand.isEmpty() || carPrice.isEmpty()) {
                        JOptionPane.showMessageDialog(frame, "Please give input in all of the required fields.",
                                "Alert",
                                JOptionPane.WARNING_MESSAGE);
                        return;
                    }

                    // Checking if the ArrayList is empty
                    if (cars.isEmpty()) {
                        // Creating an object of ElectricCar and adding it into the ArrayList if it is
                        // empty
                        eCar = new ElectricCar(carId, carName, carBrand, carPrice, batteryCapacity);
                        cars.add(eCar);
                        JOptionPane.showMessageDialog(frame, "Car was added successfully.", "Information",
                                JOptionPane.INFORMATION_MESSAGE);
                        return;
                    }

                    // Traversing through the ArrayList if it's not empty
                    for (Car car : cars) {

                        // Checking if the car object is an instanceof ElectricCar and if the carId
                        // exist in the ArrayList
                        if (car instanceof ElectricCar && carId == car.getCarId()) {
                            JOptionPane.showMessageDialog(frame, "This car already exists.", "Alert",
                                    JOptionPane.WARNING_MESSAGE);
                            return;
                        }
                    }

                    // Creating an object of FuelCar and adding it into the ArrayList if it's empty
                    eCar = new ElectricCar(carId, carName, carBrand, carPrice, batteryCapacity);
                    cars.add(eCar);

                    JOptionPane.showMessageDialog(frame, "Car was added successfully.", "Information",
                            JOptionPane.INFORMATION_MESSAGE);

                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(frame,
                            "Please! Make sure to input number in the carId, carPrice and batteryCapacity field.",
                            "Alert",
                            JOptionPane.WARNING_MESSAGE);
                    return;
                }
            }
        });

        // Adding ActionListener for purchasing the Fuel Car
        fcarPurchaseBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    // Getting values from the text fields
                    int carId = Integer.parseInt(fcarIdTxt.getText());
                    String carColor = fcarColorTxt.getText();
                    String distributorName = fcarDistributorNameTxt.getText();
                    String transmissionName = fcarTransmissionTypeTxt.getText();
                    String purchaseDay = String.valueOf(fcarPurchaseDay.getSelectedItem());
                    String purchaseMonth = String.valueOf(fcarPurchaseMonth.getSelectedItem());
                    String purchaseYear = String.valueOf(fcarPurchaseYear.getSelectedItem());
                    String bookDay = String.valueOf(fcarBookedDay.getSelectedItem());
                    String bookMonth = String.valueOf(fcarBookedMonth.getSelectedItem());
                    String bookYear = String.valueOf(fcarBookedYear.getSelectedItem());

                    String purchaseDate = purchaseDay + "-" + purchaseMonth + "-" + purchaseYear;
                    String bookDate = bookDay + "-" + bookMonth + "-" + bookYear;

                    // Checking if the text fields are empty
                    if (carColor.isEmpty() || distributorName.isEmpty() || transmissionName.isEmpty()) {
                        JOptionPane.showMessageDialog(frame, "Please fill out all the required fields.", "Information",
                                JOptionPane.INFORMATION_MESSAGE);
                        return;
                    }

                    // Checking if the ArrayList is empty
                    if (cars.isEmpty()) {
                        JOptionPane.showMessageDialog(frame, "No car is availabe at the moment.", "Information",
                                JOptionPane.INFORMATION_MESSAGE);
                        return;
                    }

                    // Traversing through the ArrayList if it's not empty
                    for (Car car : cars) {

                        // Checking if the car object is an instance of Fuelcar
                        if (car instanceof FuelCar) {
                            boolean isPurchased = ((FuelCar) car).getIsPurchased();

                            // Checking if the car exists and if it's not purchased yet
                            if (carId == car.getCarId() && isPurchased == false) {
                                ((FuelCar) car).purchaseCar(purchaseDate, bookDate);
                                JOptionPane.showMessageDialog(frame, "Congratulations! Car has been purchased.",
                                        "Information",
                                        JOptionPane.INFORMATION_MESSAGE);
                                return;
                            }

                            // Checking if the car exists and if it's purchased already
                            if (carId == car.getCarId() && isPurchased == true) {
                                ((FuelCar) car).purchaseCar(purchaseDate, bookDate);
                                JOptionPane.showMessageDialog(frame, "The Car is already purchased.", "Information",
                                        JOptionPane.INFORMATION_MESSAGE);
                                return;
                            }
                        }
                    }

                    JOptionPane.showMessageDialog(frame, "Car is not available at the moment.", "Information",
                            JOptionPane.INFORMATION_MESSAGE);
                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(frame,
                            "Please make sure that you've given numbers in carID, carPrice, seats and mileage fields.",
                            "Alert",
                            JOptionPane.WARNING_MESSAGE);
                }
            }
        });

        // Adding ActionListener for buying the Electric Car
        ecarBuyBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    // Getting values from the text fields
                    int carId = Integer.parseInt(ecarIdTxt.getText());
                    String customerName = ecarCustomerNameTxt.getText();
                    int batteryWarranty = Integer.parseInt(ecarBatteryWarrantyTxt.getText());
                    String purchaseDay = String.valueOf(ecarPurchaseDay.getSelectedItem());
                    String purchaseMonth = String.valueOf(ecarPurchaseMonth.getSelectedItem());
                    String purchaseYear = String.valueOf(ecarPurchaseYear.getSelectedItem());
                    String purchaseDate = purchaseDay + "-" + purchaseMonth + "-" + purchaseYear;
                    String range = ecarRangeTxt.getText();
                    int rechargeTime = Integer.parseInt(ecarRechargeTimeTxt.getText());

                    // Checking if the text fields are empty
                    if (customerName.isEmpty() || range.isEmpty()) {
                        JOptionPane.showMessageDialog(frame, "Please fill out all the required fields.", "Alert",
                                JOptionPane.INFORMATION_MESSAGE);
                        return;
                    }

                    // Checking if the ArrayList is empty
                    if (cars.isEmpty()) {
                        JOptionPane.showMessageDialog(frame, "No car is availabe at the moment.", "Information",
                                JOptionPane.INFORMATION_MESSAGE);
                        return;
                    }

                    // Traversing through the ArrayList if it's not empty
                    for (Car car : cars) {

                        // Checking if the car object is an instanceof ElectricCar
                        if (car instanceof ElectricCar) {
                            boolean isBought = ((ElectricCar) car).getIsBought();

                            // Checking if the car exist in the ArrayList and if it's not bought yet
                            if (carId == car.getCarId() && isBought == false) {
                                ((ElectricCar) car).buyCar(customerName, batteryWarranty, purchaseDate, range,
                                        rechargeTime);
                                JOptionPane.showMessageDialog(frame,
                                        "Congratulations! You have successfully bought the car.", "Information",
                                        JOptionPane.INFORMATION_MESSAGE);
                                return;
                            }

                            // Checking if the car exist in the ArrayList and it it's bought already
                            if (carId == car.getCarId() && isBought == true) {
                                ((ElectricCar) car).buyCar(customerName, batteryWarranty, purchaseDate, range,
                                        rechargeTime);
                                JOptionPane.showMessageDialog(frame, "The car is already bought.", "Information",
                                        JOptionPane.INFORMATION_MESSAGE);
                                return;
                            }
                        }
                    }

                    JOptionPane.showMessageDialog(frame, "Car is not available to buy at the moment.",
                            "Information",
                            JOptionPane.INFORMATION_MESSAGE);
                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(frame,
                            "Please! Make sure to input number in the car ID, battery warranty and rechargetime field.",
                            "Alert",
                            JOptionPane.WARNING_MESSAGE);
                }
            }
        });

        // Adding ActionListener for selling the Electric Car
        ecarSellBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    // Getting values from the text fields
                    int carId = Integer.parseInt(ecarIdTxt.getText());
                    String customerName = ecarCustomerNameTxt.getText();

                    // Checking if the ArrayList is empty
                    if (cars.isEmpty()) {
                        JOptionPane.showMessageDialog(frame, "No car is availabe at the moment.", "Information",
                                JOptionPane.INFORMATION_MESSAGE);
                        return;
                    }

                    // Traversing through the ArrayList if it's not empty
                    for (Car car : cars) {

                        // Checking if the car object is an object of ElectricCar
                        if (car instanceof ElectricCar) {
                            boolean isSold = ((ElectricCar) car).getIsSold();

                            // Checking if the car exist in the ArrayList and if it's not sold yet
                            if (carId == car.getCarId() && isSold == false) {
                                ((ElectricCar) car).sellCar(customerName);
                                JOptionPane.showMessageDialog(frame, "Congratulations! The car has been sold.",
                                        "Information",
                                        JOptionPane.INFORMATION_MESSAGE);
                                return;
                            }

                            // Checking if the car exist in the ArrayList and if it's sold already
                            if (carId == car.getCarId() && isSold == true) {
                                JOptionPane.showMessageDialog(frame, "The car is already sold.",
                                        "Information",
                                        JOptionPane.INFORMATION_MESSAGE);
                                return;
                            }
                        }
                    }

                    JOptionPane.showMessageDialog(frame, "Car is not available to sell at the moment.",
                            "Information",
                            JOptionPane.INFORMATION_MESSAGE);

                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(frame,
                            "Please! Make sure to fill in number in carId field.",
                            "Alert",
                            JOptionPane.WARNING_MESSAGE);
                }
            }
        });

        // Adding ActionListeners for the display buttons
        // For FuelCar
        fcarDisplayBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Checking if the ArrayList is empty
                if (cars.isEmpty()) {
                    JOptionPane.showMessageDialog(frame, "No Fuel Car has been added yet.", "Information",
                            JOptionPane.INFORMATION_MESSAGE);
                    return;
                }

                // Traversing through the ArrayLish if it's not empty
                for (Car car : cars) {

                    // Checking if the car object is an instance of FuelCar
                    if (car instanceof FuelCar) {
                        ((FuelCar) car).display();
                    }
                }
            }
        });

        // For ElectricCar
        ecarDisplayBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Checking if the ArrayList is empty
                if (cars.isEmpty()) {
                    JOptionPane.showMessageDialog(frame, "No Electric Car has been added yet.", "Information",
                            JOptionPane.INFORMATION_MESSAGE);
                    return;
                }

                // Traversing through the ArrayList if it's not empty
                for (Car car : cars) {

                    // Checking if the car object is an instanceof ElectricCar
                    if (car instanceof ElectricCar) {
                        ((ElectricCar) car).display();
                    }
                }
            }
        });

        // Defining an empty string
        String emptyString = "";

        // Adding ActionListeners for the clear buttons
        // For FuelCar
        fcarClearBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                fcarIdTxt.setText(emptyString);
                fcarNameTxt.setText(emptyString);
                fcarBrandTxt.setText(emptyString);
                fcarPriceTxt.setText(emptyString);
                fcarFuelTypeTxt.setText(emptyString);
                fcarMileageTxt.setText(emptyString);
                fcarNumOfSeatsTxt.setText(emptyString);
                fcarColorTxt.setText(emptyString);
                fcarDistributorNameTxt.setText(emptyString);
                fcarTransmissionTypeTxt.setText(emptyString);
            }
        });

        // For ElectricCar
        ecarClearBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ecarIdTxt.setText(emptyString);
                ecarNameTxt.setText(emptyString);
                ecarBrandTxt.setText(emptyString);
                ecarPriceTxt.setText(emptyString);
                ecarBatteryCapacityTxt.setText(emptyString);
                ecarColorTxt.setText(emptyString);
                ecarCustomerNameTxt.setText(emptyString);
                ecarBatteryWarrantyTxt.setText(emptyString);
                ecarRangeTxt.setText(emptyString);
                ecarRechargeTimeTxt.setText(emptyString);
            }
        });

        // Adding components of Fuel Car to its panel
        fcarPanel.add(gotoFCarPanel1);
        fcarPanel.add(gotoECarPanel1);

        fcarPanel.add(fcarHeading);
        fcarPanel.add(fcarId);
        fcarPanel.add(fcarName);
        fcarPanel.add(fcarBrand);
        fcarPanel.add(fcarPrice);
        fcarPanel.add(fcarFuelType);
        fcarPanel.add(fcarMileage);
        fcarPanel.add(fcarNumOfSeats);
        fcarPanel.add(fcarColor);
        fcarPanel.add(fcarDistributorName);
        fcarPanel.add(fcarTransmissionType);
        fcarPanel.add(fcarPurchaseDate);
        fcarPanel.add(fcarBookedDate);

        fcarPanel.add(fcarIdTxt);
        fcarPanel.add(fcarNameTxt);
        fcarPanel.add(fcarBrandTxt);
        fcarPanel.add(fcarPriceTxt);
        fcarPanel.add(fcarFuelTypeTxt);
        fcarPanel.add(fcarMileageTxt);
        fcarPanel.add(fcarNumOfSeatsTxt);
        fcarPanel.add(fcarColorTxt);
        fcarPanel.add(fcarDistributorNameTxt);
        fcarPanel.add(fcarTransmissionTypeTxt);

        fcarPanel.add(fcarPurchaseDay);
        fcarPanel.add(fcarPurchaseMonth);
        fcarPanel.add(fcarPurchaseYear);
        fcarPanel.add(fcarBookedDay);
        fcarPanel.add(fcarBookedMonth);
        fcarPanel.add(fcarBookedYear);

        fcarPanel.add(fcarAddBtn);
        fcarPanel.add(fcarPurchaseBtn);
        fcarPanel.add(fcarDisplayBtn);
        fcarPanel.add(fcarClearBtn);

        // Adding components of Electric Car to its panel
        ecarPanel.add(gotoFCarPanel2);
        ecarPanel.add(gotoECarPanel2);

        ecarPanel.add(ecarHeading);
        ecarPanel.add(ecarId);
        ecarPanel.add(ecarName);
        ecarPanel.add(ecarBrand);
        ecarPanel.add(ecarPrice);
        ecarPanel.add(ecarBatteryCapacity);
        ecarPanel.add(ecarColor);
        ecarPanel.add(ecarCustomerName);
        ecarPanel.add(ecarBatteryWarranty);
        ecarPanel.add(ecarRange);
        ecarPanel.add(ecarRechargeTime);
        ecarPanel.add(ecarPurchaseDate);

        ecarPanel.add(ecarIdTxt);
        ecarPanel.add(ecarNameTxt);
        ecarPanel.add(ecarBrandTxt);
        ecarPanel.add(ecarPriceTxt);
        ecarPanel.add(ecarBatteryCapacityTxt);
        ecarPanel.add(ecarColorTxt);
        ecarPanel.add(ecarCustomerNameTxt);
        ecarPanel.add(ecarBatteryWarrantyTxt);
        ecarPanel.add(ecarRangeTxt);
        ecarPanel.add(ecarRechargeTimeTxt);

        ecarPanel.add(ecarPurchaseDay);
        ecarPanel.add(ecarPurchaseMonth);
        ecarPanel.add(ecarPurchaseYear);

        ecarPanel.add(ecarAddBtn);
        ecarPanel.add(ecarDisplayBtn);
        ecarPanel.add(ecarClearBtn);
        ecarPanel.add(ecarBuyBtn);
        ecarPanel.add(ecarSellBtn);

        // Fuel Car Panel End
        fcarPanel.setSize(1020, 680);
        fcarPanel.setLayout(null);
        fcarPanel.setVisible(true);

        // Electric Car Panel End
        ecarPanel.setSize(1020, 680);
        ecarPanel.setLayout(null);
        ecarPanel.setVisible(false);

        // Add both Fuel and Electric Car panels to the frame
        frame.add(fcarPanel);
        frame.add(ecarPanel);

        // Frame End
        frame.setIconImage(image.getImage());
        frame.setSize(1020, 680);
        frame.setResizable(false);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        // Calling Anonymous Contructor
        new GUI_Demo();
    }
}
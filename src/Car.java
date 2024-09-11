public class Car {
    // Attributes
    private String brand;
    private String model;
    private int year;
    private String color;
    private int mileage;

    // Constructor
    public Car(String brand, String model, int year, String color, int mileage) {
        this.brand = brand;
        this.model = model;
        this.year = year;
        this.color = color;
        this.mileage = mileage;
    }

    // Getters and Setters
    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getMileage() {
        return mileage;
    }

    public void setMileage(int mileage) {
        this.mileage = mileage;
    }

    // Methods
    public void drive(int distance) {
        mileage += distance;
    }

    public void displayInfo() {
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Year: " + year);
        System.out.println("Color: " + color);
        System.out.println("Mileage: " + mileage + " km");
    }
}
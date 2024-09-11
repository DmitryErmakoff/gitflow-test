public class Flat {
    // attrs
    private String address;
    private int floor;
    private float squareMeters;
    private int roomsCount;
    private int price;

    // constructor
    public Flat(String address, int floor, float squareMeters, int roomsCount, int price) {
        this.address = address;
        this.floor = floor;
        this.squareMeters = squareMeters;
        this.roomsCount = roomsCount;
        this.price = price;
    }

    // getters and setters
    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getFloor() {
        return floor;
    }

    public void setFloor(int floor) {
        this.floor = floor;
    }

    public float getSquareMeters() {
        return squareMeters;
    }

    public void setSquareMeters(float squareMeters) {
        this.squareMeters = squareMeters;
    }

    public int getRoomsCount() {
        return roomsCount;
    }

    public void setRoomsCount(int roomsCount) {
        this.roomsCount = roomsCount;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    // methods
    public float calculateSquarePrice() {
        return price / squareMeters;
    }

    public void printFlatInfo() {
        System.out.println("Address: " + address);
        System.out.println("Floor: " + floor);
        System.out.println("SquareMeters: " + squareMeters);
        System.out.println("RoomsCount: " + roomsCount);
        System.out.println("Price: " + price);
    }
}

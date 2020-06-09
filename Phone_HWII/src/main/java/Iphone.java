public abstract class Iphone implements Phone{

    private String Manufacturer = "Apple";

    private final int batteryLife = 4;


    public String getManufacturer() {
        return Manufacturer;
    }

    public int getBatteryLife() {
        return batteryLife;
    }
}


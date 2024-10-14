package model;

public class Computer {
    private String tag;
    private String serialNumber;
    private String model;
    private String brand;
    private String state;
    private String userName;
    private String windowsVersion;
    private String officeVersion;
    private String location;
    private String purchaseDate;

    // Construtor
    public Computer(String tag, String serialNumber, String model, String brand, String state, String userName,
                    String windowsVersion, String officeVersion, String location, String purchaseDate) {
        this.tag = tag;
        this.serialNumber = serialNumber;
        this.model = model;
        this.brand = brand;
        this.state = state;
        this.userName = userName;
        this.windowsVersion = windowsVersion;
        this.officeVersion = officeVersion;
        this.location = location;
        this.purchaseDate = purchaseDate;
    }

    // Getters e Setters
    public String getTag() {
        return tag;
    }

    public void setTag(String tag) {
        this.tag = tag;
    }

    public String getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getWindowsVersion() {
        return windowsVersion;
    }

    public void setWindowsVersion(String windowsVersion) {
        this.windowsVersion = windowsVersion;
    }

    public String getOfficeVersion() {
        return officeVersion;
    }

    public void setOfficeVersion(String officeVersion) {
        this.officeVersion = officeVersion;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getPurchaseDate() {
        return purchaseDate;
    }

    public void setPurchaseDate(String purchaseDate) {
        this.purchaseDate = purchaseDate;
    }
}

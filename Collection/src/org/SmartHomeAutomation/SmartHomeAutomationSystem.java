package org.SmartHomeAutomation;

// Interface for Wi-Fi connectivity (Loose Coupling)
interface WiFiEnabled {
    void connectToWiFi(String ssid);
}

// Abstract class SmartDevice (Inheritance + Abstraction)
abstract class SmartDevice implements WiFiEnabled {
    private final String serialNumber; // cannot be modified
    private String deviceName;

    // super() Constructor to initialize common details
    public SmartDevice(String serialNumber, String deviceName) {
        this.serialNumber = serialNumber;
        this.deviceName = deviceName;
    }

    public String getSerialNumber() {
        return serialNumber;
    }

    public String getDeviceName() {
        return deviceName;
    }

    // Abstract method - must be overridden by child classes
    public abstract void operate();

    // final method - cannot be overridden
    public final void manufacturerSecurityPolicy() {
        System.out.println("Manufacturer Security Policy: Devices must follow encryption standards.");
    }

    // Common Wi-Fi implementation
    @Override
    public void connectToWiFi(String ssid) {
        System.out.println(deviceName + " connected to Wi-Fi network: " + ssid);
    }
}

// Child classes (Method Overriding)
class SmartLight extends SmartDevice {
    public SmartLight(String serialNumber, String deviceName) {
        super(serialNumber, deviceName);
    }

    @Override
    public void operate() {
        System.out.println("SmartLight is now ON and brightness adjusted.");
    }
}

class SmartFan extends SmartDevice {
    public SmartFan(String serialNumber, String deviceName) {
        super(serialNumber, deviceName);
    }

    @Override
    public void operate() {
        System.out.println("SmartFan is spinning at medium speed.");
    }
}

class SmartAC extends SmartDevice {
    public SmartAC(String serialNumber, String deviceName) {
        super(serialNumber, deviceName);
    }

    @Override
    public void operate() {
        System.out.println("SmartAC is cooling the room to 24°C.");
    }
}

// Main class demonstrating Dynamic Polymorphism
public class SmartHomeAutomationSystem {
    public static void main(String[] args) {
        // Parent reference pointing to child objects
        SmartDevice d1 = new SmartLight("SL001", "Philips Hue Light");
        SmartDevice d2 = new SmartFan("SF001", "Dyson Smart Fan");
        SmartDevice d3 = new SmartAC("AC001", "Samsung Smart AC");

        SmartDevice[] devices = {d1, d2, d3};

        for (SmartDevice device : devices) {
            System.out.println("Device: " + device.getDeviceName() + " (Serial: " + device.getSerialNumber() + ")");
            device.connectToWiFi("Home_WiFi"); // Loose Coupling via interface
            device.operate();                  // Overridden method
            device.manufacturerSecurityPolicy(); // final method
            System.out.println("-----------------------------");
        }
    }
}

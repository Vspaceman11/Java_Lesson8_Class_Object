package com.java.study.task1;

public class EthernetAdapter extends Device{
    private int speed;
    private String mac;

    public EthernetAdapter(String manufacturer, float price, String serialNumber, int speed, String mac) {
        super(manufacturer, price, serialNumber);
        this.speed = speed;
        this.mac = mac;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public String getMac() {
        return mac;
    }

    public void setMac(String mac) {
        this.mac = mac;
    }
    @Override
    public String toString(){
        return String.format("Device: " + "manufacturer = " + manufacturer + ", price = " + price + ", serialNumber = " + serialNumber +
                ", speed = " + speed + "Mb/s" + ", mac = " + mac);
    }
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        EthernetAdapter adapter = (EthernetAdapter) obj;
        if (speed != adapter.speed || mac != adapter.mac || manufacturer != adapter.manufacturer ||
                price != adapter.price || serialNumber != adapter.serialNumber) return false;
        return true;
    }
    @Override
    public int hashCode(){
        int newCode = 1996181658;
        return newCode + 1;
    }
}

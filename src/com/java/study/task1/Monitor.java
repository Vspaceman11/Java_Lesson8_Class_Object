package com.java.study.task1;

public class Monitor extends Device{
    private int resolutionX;
    private int resolutionY;

    public Monitor(String manufacturer, float price, String serialNumber, int resolutionX, int resolutionY) {
        super(manufacturer, price, serialNumber);
        this.resolutionX = resolutionX;
        this.resolutionY = resolutionY;
    }

    public int getResolutionX() {
        return resolutionX;
    }

    public void setResolutionX(int resolutionX) {
        this.resolutionX = resolutionX;
    }

    public int getResolutionY() {
        return resolutionY;
    }

    public void setResolutionY(int resolutionY) {
        this.resolutionY = resolutionY;
    }


    @Override
    public String toString(){
        return String.format("Device: " + "manufacturer = " + manufacturer + ", price = " + price + ", serialNumber = " + serialNumber +
                ", X = " + resolutionX + ", Y = " + resolutionY);
    }
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Monitor monitor = (Monitor) obj;
        if (resolutionX != monitor.resolutionX || resolutionY != monitor.resolutionY || manufacturer != monitor.manufacturer ||
                price != monitor.price || serialNumber != monitor.serialNumber) {
            return false;
        }
        return true;
    }

    @Override
    public int hashCode(){
        int newCode = 1702297200;
        return newCode + 1;
    }
}

public class Radio {
    private int batteryType;
    private double voltage;
    private String firma;
    private String plugType;
    private int width;



          //----------GETTERS/SETTERS-------------//

    public int getBatteryType() {
        return batteryType;
    }

    public void setBatteryType(int batteryType) {
        this.batteryType = batteryType;
    }

    public double getVoltage() {
        return voltage;
    }

    public void setVoltage(double voltage) {
        this.voltage = voltage;
    }

    public String getFirma() {
        return firma;
    }

    public void setFirma(String firma) {
        this.firma = firma;
    }

    public String getPlugType() {
        return plugType;
    }

    public void setPlugType(String plugType) {
        this.plugType = plugType;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }
}


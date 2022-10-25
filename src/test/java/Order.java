public class Order {
    private double totalPrice;
    private double weight;
    private double volume;
    private double itemCount;
    private double widtht;
    private double height;
    private double depth;
    private String address;
    private boolean deliveryRequested;


      //-----------------------------------GETTERS/SETTERS----------------------//

    public double getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(double totalPrice) {
        this.totalPrice = totalPrice;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getVolume() {
        return volume;
    }

    public void setVolume(double volume) {
        this.volume = volume;
    }

    public double getItemCount() {
        return itemCount;
    }

    public void setItemCount(double itemCount) {
        this.itemCount = itemCount;
    }

    public double getWidtht() {
        return widtht;
    }

    public void setWidtht(double widtht) {
        this.widtht = widtht;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getDepth() {
        return depth;
    }

    public void setDepth(double depth) {
        this.depth = depth;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public boolean isDeliveryRequested() {
        return deliveryRequested;
    }

    public void setDeliveryRequested(boolean deliveryRequested) {
        this.deliveryRequested = deliveryRequested;
    }
}

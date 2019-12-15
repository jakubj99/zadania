package task1and2;

public class Invoice implements Payable {

    private final String partNumber;
    private final String partDescription;
    private int quantity;
    private double pricePerItem;

    public Invoice(String partnumber, String partNumber, String partDescription, int quantity, double pricePerItem) {
        this.partNumber = partNumber;

        this.partDescription = partDescription;
        this.quantity = quantity;
        this.pricePerItem = pricePerItem;
    }

    public String getPartNumber() {
        return partNumber;
    }

    public String getPartDescription() {
        return partDescription;
    }

    private int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    private double getPricePerItem() {
        return pricePerItem;
    }

    public void setPricePerItem(double pricePerItem) {
        this.pricePerItem = pricePerItem;
    }

    @Override
    public double getPaymentAmount() {
        return getQuantity()*getPricePerItem();
    }
}

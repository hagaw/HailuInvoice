package MyInvoice;

public class PurchaseItem {

    private String itemName;
    private double price;
    private  double cost;
    private   int qty;
    private   double totaPurchs;

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public int getQty() {
        return qty;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    public double getTotaPurchs() {
        return totaPurchs;
    }

    public void setTotaPurchs(double totaPurchs) {
        this.totaPurchs = totaPurchs;
    }
}





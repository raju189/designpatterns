package models;

public class Order {
    public Order(String status, double amount) {
        this.status = status;
        this.amount = amount;
    }

    public String getStatus() {
        return status;
    }

    public double getAmount() {
        return amount;
    }

    @Override
    public String toString() {
        return "Order{" +
                "status='" + status + '\'' +
                ", amount=" + amount +
                '}';
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    private String status;
    private double amount;

}

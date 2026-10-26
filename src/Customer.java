public class Customer {

    private String customerName;
    private int customerId;
    private int loyaltyScore;

    public Customer() {
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    public void setLoyaltyScore(int loyaltyScore) {
        if (loyaltyScore >= 0 && loyaltyScore <= 100) {
            this.loyaltyScore = loyaltyScore;
        } else {
            System.out.println("Invalid score. It must be between 0 and 100.");
        }
    }

    public String calculateLoyaltyTier() {
        if (loyaltyScore >= 80) {
            return "Platinum";
        } else if (loyaltyScore >= 60) {
            return "Gold";
        } else if (loyaltyScore >= 40) {
            return "Silver";
        } else {
            return "Bronze";
        }
    }

    public void display() {
        System.out.println("Name: " + customerName);
        System.out.println("ID: " + customerId);
        System.out.println("Score: " + loyaltyScore);
        System.out.println("Category: " + calculateLoyaltyTier());
        System.out.println();
    }
}
package sivathoc.points.model;

public class PointsQuoteRequest {
    private double fareAmount;
    private String currency;
    private CabinClass cabinClass;
    private CustomerTier customerTier;
    private String promoCode;

    public PointsQuoteRequest(double fareAmount, String currency, CabinClass cabinClass, CustomerTier customerTier, String promoCode) {
        this.fareAmount = fareAmount;
        this.currency = currency;
        this.cabinClass = cabinClass;
        this.customerTier = customerTier;
        this.promoCode = promoCode;
    }
    
    // Getters and Setters
    public double getFareAmount() {
        return fareAmount;
    }
    public void setFareAmount(double fareAmount) {
        this.fareAmount = fareAmount;
    }
    public String getCurrency() {
        return currency;
    }
    public void setCurrency(String currency) {
        this.currency = currency;
    }
    public CabinClass getCabinClass() {
        return cabinClass;
    }
    public void setCabinClass(CabinClass cabinClass) {
        this.cabinClass = cabinClass;
    }
    public CustomerTier getCustomerTier() {
        return customerTier;
    }
    public void setCustomerTier(CustomerTier customerTier) {
        this.customerTier = customerTier;
    }
    public String getPromoCode() {
        return promoCode;
    }
    public void setPromoCode(String promoCode) {
        this.promoCode = promoCode;
    }    
}

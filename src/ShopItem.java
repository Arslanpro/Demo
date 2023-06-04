public abstract class ShopItem {
    private String title = "";
    private double price;
    public void setTitle(String title) {
        this.title = title;
    }
    public String getTitle() {
        return title;
    }
    public void setPrice(double price) {
        this.price = price;
    }
    public double getPrice() {
        return price;
    }
    @Override
    public abstract String toString();
}
public abstract class Book {

    private String title;
    private double price;

    public Book(String title, double price){
        this.price = price;
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public double getPrice() {
        return price;
    }

    public abstract void setPrice();
}

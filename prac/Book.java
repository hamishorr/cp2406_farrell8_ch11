public abstract class Book {

    private String title;
    double price;

    public Book(String title){
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public double getPrice() {
        return price;
    }

    abstract void setPrice();
}

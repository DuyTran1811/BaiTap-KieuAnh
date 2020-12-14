public class Books {
    private String name;
    private String author;
    private int price;
    private int amount;
    private double weight;

    public Books() {
        name = "";
        author = "";
        price = 0;
        amount = 0;
        weight = 0;
    }

    public Books(String name, String author, int price, int amount, double weight) {
        this.name = name;
        this.author = author;
        this.price = price;
        this.amount = amount;
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getTottalPrice() {
        return price * amount;
    }

    public double getTottalWeight() {
        return weight * weight;
    }

    @Override
    public String toString() {
        return "Books{" +
                "name='" + name + '\'' +
                ", author='" + author + '\'' +
                ", price=" + price +
                ", amount=" + amount +
                ", weight=" + weight +
                '}';
    }
}

package second_example;

public class Pizza {
    String name;
    String price;
    String description;
    int imagePizza;

    public int getImagePizza() {
        return imagePizza;
    }

    public void setImagePizza(int imagePizza) {
        this.imagePizza = imagePizza;
    }

    public Pizza(String name, String price, String description, int imagePizza) {
        this.name = name;
        this.price = price;
        this.description = description;
        this.imagePizza = imagePizza;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}

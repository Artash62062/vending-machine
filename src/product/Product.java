package product;

import java.io.Serializable;

public abstract class Product implements Serializable {
    protected String productName;
    protected int price;
    protected int weight;


    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return this.getClass().getName() + "{" +
                "productName='" + productName + '\'' +
                ", price=" + price +
                ", weight=" + weight +
                '}';
    }
}

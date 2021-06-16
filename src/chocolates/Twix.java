package chocolates;

public class Twix extends Chocolate  {
    public static final int index = 3;

    public Twix() {
        this.setPrice(250);
        this.setProductName(this.getClass().getName());
        this.setWeight(200);
    }
}

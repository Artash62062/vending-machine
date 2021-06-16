package chocolates;

public class Snickers extends Chocolate {
    public static final int index = 2;

    public Snickers() {
        this.setPrice(250);
        this.setProductName(this.getClass().getName());
        this.setWeight(200);
    }

}

package chipses;

public class Pringles extends Chips {
    public static final int index = 3;

    public Pringles() {
        this.setPrice(250);
        this.setProductName(this.getClass().getName());
        this.setWeight(200);
    }
}

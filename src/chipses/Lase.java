package chipses;

public class Lase extends Chips {
    public static final int index = 2;

    public Lase() {
        this.setPrice(250);
        this.setProductName(this.getClass().getName());
        this.setWeight(200);
    }
}

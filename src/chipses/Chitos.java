package chipses;

public class Chitos extends Chips  {
    public static final int index = 0;

    public Chitos() {
        this.setPrice(250);
        this.setProductName(this.getClass().getName());
        this.setWeight(200);
    }
}

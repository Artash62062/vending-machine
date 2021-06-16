package sandwiches;

public class Tost extends Sandwich {
    public static final int index = 0;
    public Tost() {
        this.setPrice(250);
        this.setProductName(this.getClass().getName());
        this.setWeight(280);
    }


}

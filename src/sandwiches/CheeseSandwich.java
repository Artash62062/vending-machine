package sandwiches;

public class CheeseSandwich extends Sandwich {
    public static final int index = 3;

    public CheeseSandwich() {
        this.setPrice(250);
        this.setProductName(this.getClass().getName());
        this.setWeight(280);
    }

}

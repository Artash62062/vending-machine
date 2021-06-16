package sandwiches;

public class HotDog extends Sandwich {
    public static final int index = 1;

    public HotDog() {
        this.setPrice(250);
        this.setProductName(this.getClass().getName());
        this.setWeight(280);
    }


}

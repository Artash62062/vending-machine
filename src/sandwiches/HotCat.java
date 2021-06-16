package sandwiches;

public class HotCat extends Sandwich{
    public static final int index = 2;

    public HotCat() {
        this.setPrice(250);
        this.setProductName(this.getClass().getName());
        this.setWeight(280);
    }


}

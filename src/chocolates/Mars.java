package chocolates;

public class Mars extends Chocolate {
    public static final int index = 1;
    public Mars(){
        this.setPrice(250);
        this.setProductName(this.getClass().getName());
        this.setWeight(200);
    }
}

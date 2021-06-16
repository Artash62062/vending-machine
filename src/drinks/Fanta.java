package drinks;

import java.io.Serializable;

public class Fanta extends Drink  {
    public static final int index = 2;
    public Fanta() {
        this.setPrice(280);
        this.setProductName("Fanta Orange");
        this.setWeight(500);
    }

}

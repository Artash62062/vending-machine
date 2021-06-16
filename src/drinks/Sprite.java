package drinks;

import java.io.Serializable;

public class Sprite extends Drink {
    public static final int index = 1;

    public Sprite() {
        this.setPrice(280);
        this.setProductName("Sprite");
        this.setWeight(500);
    }


}

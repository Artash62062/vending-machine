package chipses;

import java.io.Serializable;

public class Doritos extends Chips  {
    public static final int index = 1;

    public Doritos() {
        this.setPrice(250);
        this.setProductName(this.getClass().getName());
        this.setWeight(200);
    }
}

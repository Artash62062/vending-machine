package drinks;

import java.io.Serializable;

public class Beer extends Drink {
    public static final int index = 3;
    public Beer(){
        this.setPrice(400);
        this.setProductName("Kilikia");
        this.setWeight(300);
    }
}

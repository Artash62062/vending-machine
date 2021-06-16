package drinks;

import java.io.Serializable;

public class Cola extends Drink  {
    public static final int index = 0;
    public Cola(){
        this.setPrice(280);
        this.setProductName("CocaCola");
        this.setWeight(500);
    }

}

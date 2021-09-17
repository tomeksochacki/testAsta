package pgs.asta.utilities;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Round {
    public static double price(double value) {
        BigDecimal bd = new BigDecimal(Double.toString(value));
        bd = bd.setScale(2, RoundingMode.HALF_UP);
        return bd.doubleValue();
    }
}

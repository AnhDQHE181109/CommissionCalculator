package testing;

import com.wuangsoft.Main;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CommissionTesting {

    @Test
    public void testCalculateCommission() throws Exception {
        Main main = new Main();

        //first column and after
        assertEquals("10% commission of <= $10.000", main.CalculateCommission(false, "neither", 10000, false));
        assertEquals("10% commission of <= $10.000", main.CalculateCommission(false, "neither", 1200, false));
        assertEquals("10% commission of <= $10.000", main.CalculateCommission(false, "neither", 1000, false));
        assertEquals("5% commission of <= $10.000", main.CalculateCommission(false, "neither", 10200, false));
        assertEquals("$0", main.CalculateCommission(false, "neither", 10200, true));
        assertEquals("$0", main.CalculateCommission(false, "neither", 10000, true));
        assertEquals("$0", main.CalculateCommission(false, "neither", 1000, true));
        assertEquals("$0", main.CalculateCommission(false, "neither", 1200, true));

        //second column and after
        assertEquals("$0", main.CalculateCommission(false, "standard", 10000, true));
        assertEquals("$0", main.CalculateCommission(false, "standard", 10200, true));
        assertEquals("$0", main.CalculateCommission(false, "standard", 1200, true));
        assertEquals("$0", main.CalculateCommission(false, "standard", 1000, true));
        assertEquals("$0", main.CalculateCommission(false, "standard", 1000, false));
        assertEquals("$0", main.CalculateCommission(false, "standard", 10200, false));
        assertEquals("$0", main.CalculateCommission(false, "standard", 10000, false));
        assertEquals("$0", main.CalculateCommission(false, "standard", 1200, false));
        assertEquals("$0", main.CalculateCommission(false, "standard", 1000, false));

        //fourth column and after
        assertEquals("$0", main.CalculateCommission(true, "bonus", 10000, true));
        assertEquals("$0", main.CalculateCommission(true, "bonus", 1000, true));
        assertEquals("$0", main.CalculateCommission(true, "bonus", 1200, true));
        assertEquals("$0", main.CalculateCommission(true, "bonus", 10200, true));
        assertEquals("5% commission <= $1000", main.CalculateCommission(true, "bonus", 1000, false));
        assertEquals("$25", main.CalculateCommission(true, "bonus", 1200, false));
        assertEquals("$25", main.CalculateCommission(true, "bonus", 10000, false));
        assertEquals("$25", main.CalculateCommission(true, "bonus", 10200, false));
        assertEquals("$0", main.CalculateCommission(true, "neither", 10000, true));
        assertEquals("$0", main.CalculateCommission(true, "neither", 10200, true));
        assertEquals("$0", main.CalculateCommission(true, "neither", 1000, true));
        assertEquals("$0", main.CalculateCommission(true, "neither", 1200, true));
        assertEquals("$0", main.CalculateCommission(true, "neither", 10000, false));
        assertEquals("$0", main.CalculateCommission(true, "neither", 10200, false));
        assertEquals("$0", main.CalculateCommission(true, "neither", 1000, false));
        assertEquals("$0", main.CalculateCommission(true, "neither", 1200, false));

        //third column and after
        assertEquals("$0", main.CalculateCommission(false, "bonus", 10000, true));
        assertEquals("$0", main.CalculateCommission(false, "bonus", 10000, true));
        assertEquals("$0", main.CalculateCommission(false, "bonus", 10000, true));
        assertEquals("$0", main.CalculateCommission(false, "bonus", 10000, true));

    }
}

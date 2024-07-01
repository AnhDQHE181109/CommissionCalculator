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
    }
}

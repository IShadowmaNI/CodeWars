package kyu8.cwex60;

/*

Add two logs with base X, with the value of A and B. Example log A + log B where the base is X.

 */

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class EasyLogsExampleTests {

    @Test
    public void exampleTests() {
        assertEquals(0.7781512503836435, EasyLogs.logs(10, 2, 3), 0.0000001);
        assertEquals(1.1132827525593785, EasyLogs.logs(5, 2, 3), 0.0000001);
        assertEquals(0.25938375012788123, EasyLogs.logs(1000, 2, 3), 0.0000001);
    }

}
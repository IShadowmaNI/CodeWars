package kyu8.cwex45;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class BoolTest {
    @Test
    public void testBoolToWord() {
        assertEquals(YesOrNo.boolToWord(true),"Yes");
        assertEquals(YesOrNo.boolToWord(false),"No");
    }
}

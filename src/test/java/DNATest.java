import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import java.io.*;
import java.lang.reflect.Field;

public class DNATest {
    @Test
    public void testStr()
    {
        // action
        DNA dna = new DNA();
        // assertion
        assertEquals("", dna.str);
        // action
        dna.str = "AAAA";
        // assertion
        assertEquals("AAAA", dna.str);
    }

    @Test
    public void testGetPair()
    {
        // action
        DNA dna = new DNA();
        dna.str = "AAAAGT";

        // assertion
        assertEquals("TTTTCA", dna.getPair());
    }

}

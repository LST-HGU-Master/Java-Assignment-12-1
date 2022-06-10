import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import java.io.*;
import java.lang.reflect.Field;
/**
 * @version (20220610)
 *  注意）このテストコードは DNAクラスにフィールド str と getPair()が定義されるまでエラーとなる
 */
public class DNATest {
    @Test
    public void testStr()
    {
        // action
        DNA dna = new DNA();
        // assertion
        assertEquals("", dna.str,"DNAクラスのフィールドstrの初期値が指示と異なります!");
        // action
        dna.str = "AAAA";
        // assertion
        assertEquals("AAAA", dna.str,"????");
    }

    @Test
    public void testGetPair()
    {
        // action
        DNA dna = new DNA();
        dna.str = "AAAAGTC";

        // assertion
        assertEquals("TTTTCAG", dna.getPair(), "getPair()の出力が不正です!");
    }

}

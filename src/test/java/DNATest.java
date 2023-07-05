import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import java.io.*;
import java.lang.reflect.Field;
/**
 * @version (20220613)
 *  注意）このテストコードは DNAクラスにフィールド str と getPair()が定義されるまでエラーとなる
 * @version (20230705) assertEquals()で不一致になったさいのメッセージを変更した。
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
        assertEquals("AAAA", dna.str,"DNAクラスのフィールドstrの宣言が不正かもしれません!");
    }

    @Test
    public void testGetPair()
    {
        // action
        DNA dna = new DNA();
        dna.str = "AAAAGTC";

        // assertion
        assertEquals("TTTTCAG", dna.getPair(), "フィールドstrが AAAAGTC のとき、getPair()は TTTTCAG を出力します!");
        assertEquals("AAAAGTC", dna.str, "getPair()の出力自体はOKですが、DNAクラスのフィールドstrの値を変更してはいけません!");
    }

    @Test
    public void testGetPair2()
    {
        // action
        DNA dna = new DNA();
        dna.str = "ATAAGTC";

        // assertion
        assertEquals("TATTCAG", dna.getPair(), "フィールドstrが ATAAGTC のとき、getPair()は TATTCAG を出力します!");
        assertEquals("ATAAGTC", dna.str, "getPair()の出力自体はOKですが、DNAクラスのフィールドstrの値を変更してはいけません!");
    }

}
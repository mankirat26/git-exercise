import static org.junit.Assert.assertArrayEquals;
import org.junit.Test;

public class SortArrayTest {

    @Test
    public void testSortStrings() {
        String[] arr = {"banana", "apple", "orange"};
        SortArray.sortStrings(arr);
        assertArrayEquals(new String[]{"apple", "banana", "orange"}, arr);
    }
}

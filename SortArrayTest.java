import static org.junit.Assert.assertArrayEquals;
import org.junit.Test;

public class SortArrayTest {

    @Test
    public void testSortIntegers() {
        int[] arr = {5, 2, 7, 1, 3};
        SortArray.sortIntegers(arr);
        assertArrayEquals(new int[]{1, 2, 3, 5, 7}, arr);
    }
    
    @Test
    public void testSortStrings() {
        String[] arr = {"banana", "apple", "orange"};
        SortArray.sortStrings(arr);
        assertArrayEquals(new String[]{"apple", "banana", "orange"}, arr);
    }
}


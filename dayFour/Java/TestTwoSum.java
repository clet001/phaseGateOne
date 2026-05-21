import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TwoSum{


    @Test
    public void TestToCheckTwoNumbersInAnArrayWorks(){

    int [] number = {8,6,12,4,-2};
    int target = 6;    
    int [] expected = {8,-2};
    int [] actual = {8,6,12,4,-2};
    assertEquals(expected, actual);
}

}

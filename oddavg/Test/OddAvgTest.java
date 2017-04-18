import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

public class OddAvgTest {
  OddAvg test = new OddAvg();

  @Test
  public void test1() throws Exception {
    List<Integer> oddList = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);
    assertEquals(5, test.OddAvg(oddList));
  }

  @Test
  public void test2() throws Exception {
    List<Integer> oddList = Arrays.asList(2, 3, 5, 7, 8);
    assertEquals(5, test.OddAvg(oddList));
  }

  @Test
  public void test3() throws Exception {
    List<Integer> oddList = Arrays.asList(1, 3, 5, 3, 3, 5, 5, 9, 11);
    assertEquals(5, test.OddAvg(oddList));
  }
}
package GenericsPractice;

import org.junit.Before;
import org.junit.After;
import org.junit.Test;
import static org.junit.Assert.*;

public class PairTest {
  @Test
  public void testIntegers() {
    Pair<Integer> p = new Pair<Integer>(29, 17);
    assertEquals(17, p.min().intValue());
  }

  @Test
  public void testString() {
    Pair<String> p = new Pair<String>("Hello", "World");
    assertEquals("Hello", p.min());
  }
}
package MC;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class ArrayStack2Test {
	ArrayStack2 stack;

	@Before
	public void setUp() throws Exception {
		stack = new ArrayStack2();
		for (int i = 0; i < 100; i++)
			stack.push(i);
	}

	@Test
	public void testPop() {
		assertEquals(stack.pop(),99);
	}

	@Test
	public void testDisplay() {
		stack.display();
	}

	@Test
	public void testRemove() {
		assertEquals(stack.remove(10), 10);
		assertEquals(stack.remove(101), 100);
	}

}

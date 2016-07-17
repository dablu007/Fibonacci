import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class FibonacciTest {

    @Test
    public void testShouldTakeNumber0AndGiveFibonacciForThat() throws Exception {
        Fibonacci fibonacci = new Fibonacci(0);
        assertEquals(0, fibonacci.getNumber());
    }

    @Test
    public void testShouldTakeNumber1AndGiveFibonacciForThat() throws Exception {
        Fibonacci fibonacci = new Fibonacci(1);
        assertEquals(1, fibonacci.getNumber());
    }

    @Test
    public void testShouldTakeNumber5AndGiveFibonacciForThat() throws Exception {
        Fibonacci fibonacci = new Fibonacci(6);
        assertEquals(8, fibonacci.getNumber());
    }

    @Test
    public void testShouldTakeNumber18AndGiveFibonacciForThat() throws Exception {
        Fibonacci fibonacci = new Fibonacci(18);
        assertEquals(2584, fibonacci.getNumber());
    }

}

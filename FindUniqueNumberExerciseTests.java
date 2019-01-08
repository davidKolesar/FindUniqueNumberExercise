import org.junit.Test;
import static org.junit.Assert.assertEquals;
import org.junit.runners.JUnit4;
import java.util.Random;

// TODO: Replace examples and use TDD development by writing your own tests

public class FindUniqTest {
    private double precision = 0;
    
    @Test
    public void test1() {
        assertEquals(1, Kata.findUniq(new double[]{0, 1, 0}), precision);
        assertEquals(2, Kata.findUniq(new double[]{1, 1, 1, 2, 1, 1}), precision);
    }
    
    @Test
    public void test2() {
        // Basic tests (shuffled)
        assertEquals(3, Kata.findUniq(new double[]{ 4, 4, 4, 3, 4, 4, 4, 4 }), precision);
        assertEquals(4, Kata.findUniq(new double[]{ 5, 5, 5, 5, 4, 5, 5, 5 }), precision);
        assertEquals(5, Kata.findUniq(new double[]{ 6, 6, 6, 6, 6, 5, 6, 6 }), precision);
        assertEquals(6, Kata.findUniq(new double[]{ 7, 7, 7, 7, 7, 7, 6, 7 }), precision);
        // The last item
        assertEquals(7, Kata.findUniq(new double[]{ 8, 8, 8, 8, 8, 8, 8, 7 }), precision);
        assertEquals(2, Kata.findUniq(new double[]{ 3, 3, 2, 3, 3, 3, 3, 3 }), precision);
        assertEquals(1, Kata.findUniq(new double[]{ 2, 1, 2, 2, 2, 2, 2, 2 }), precision);
        // The first item
        assertEquals(0, Kata.findUniq(new double[]{ 0, 1, 1, 1, 1, 1, 1, 1 }), precision);
    }
    
    @Test
    public void test3() {
        // Very big number
        assertEquals(
           Math.pow(2, 40),
           Kata.findUniq(generateTestArr(Math.pow(2, 40), Math.pow(2, 50), 100)),
           precision
        );
        // Negative number
        assertEquals(
           -1,
           Kata.findUniq(generateTestArr(-1, 1, 1000)),
           precision
        );
        // Float number
        assertEquals(
           0.0000001,
           Kata.findUniq(generateTestArr(0.0000001, 0.0010001, 1000)),
           precision
        );

        // Very big array to test performance of program
        assertEquals(
           42,
           Kata.findUniq(generateTestArr(42, 24, Integer.MAX_VALUE / 105)),
           precision
        );
    }
    
    static double[] generateTestArr(double answer, double mass, int length) {
        Random rand = new Random();;
        int answerIndex = rand.nextInt(length);

        double[] arr = new double[length];
       
        for (int i = 0; i < arr.length; i++)
        {
            arr[i] = i == answerIndex ? answer : mass;
        }
       
        return arr;
    }
    
}
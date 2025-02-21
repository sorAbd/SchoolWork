package alg.analysis.quadratic;

/**
 * class to test TwoSum class
 * @ author Soroush Abdollahi
 */
public class TwoSumTest {
    public static void main(String[] args) {
        int[] t1 = { 11, 22, 33, 44, 56, 56, 77, 88, 99, 10 };
        System.out.println("TEST 1 count = "+TwoSum.count(t1));
        int[] t2 = { 11, 22, 33, -11, -22, -33, 44};
        System.out.println("TEST 2 count = "+TwoSum.count(t2));
    }
}

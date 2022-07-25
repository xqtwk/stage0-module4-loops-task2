package school.mjc.stage0.loops.task2;

public class Multiplication {
    public void printMultiplied(int multiplyByAndToInclusive) {
        int result = 0;
        for(int i = 0; i <= multiplyByAndToInclusive; i++) {
            result *= i;
            System.out.println(result);
        }
    }
}

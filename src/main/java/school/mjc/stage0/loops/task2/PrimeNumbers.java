package school.mjc.stage0.loops.task2;

public class PrimeNumbers {
        public void printPrimeNumbers(int printToInclusive) {
        boolean flag = true;
        for (int i = 0; i <= printToInclusive; i++) {
                if (i == 0 || i == 1){
                    flag = false;
                }
                for (int j = 2; j <= Math.sqrt(i); j++) {
                    if (i % j == 0) {
                        flag = false;
                    }
                }
                if (flag) {
                    System.out.println(i);
                }
            flag = true;
        }
    }
}

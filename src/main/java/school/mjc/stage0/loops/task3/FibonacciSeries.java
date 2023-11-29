package school.mjc.stage0.loops.task3;

public class FibonacciSeries {
    public void printFibonacci(int lastFibonacci) {
        int a = 0;
        int b = 1;
        for (int i = 2; i <= lastFibonacci; ++i) {
            int next = a + b;
            a = b;
            b = next;
            System.out.println(a);
        }
        System.out.println(b);
    }
}

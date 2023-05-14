package school.mjc.stage0.conditions.task4;

public class MaxNumberPrinter {
    public void printGreatest(int first, int second, int third) {
        int result = first;
        if (result < second) {
            result = second;
        }
        if (result < third) {
            result = third;
        }
        System.out.println(result);
    }
}

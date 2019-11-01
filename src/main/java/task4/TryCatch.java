package task4;

public class TryCatch {
    public double testDivide(int a, int b) {
        int result = 5;
        try {
            result = a / b;
            return result;
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());

        } finally {
            System.out.println("Finally");
        }
        return 0;
    }
}

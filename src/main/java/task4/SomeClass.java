package task4;

public class SomeClass {
    int myInt = 20;

    public int test() {
        for (int i = 0; i <= 10; i++) {
            if (i == 5) {
                return i;
            }
            System.out.println(i);
        }
        return 0;
    }
}

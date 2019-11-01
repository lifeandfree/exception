package task1;

import java.util.Iterator;
import java.util.Random;

public class ArrayDemo {
    public static void main(String[] args) {
        int[] arr = {2, 3, 5, 22, 34};
        Integer arrB[] = new Integer[15];

        Random rnd = new Random();
        for( int i=0; i< 5; i++){
            arrB[i] = rnd.nextInt(1000);
        }

        for (int i: arr) {
            System.out.println(i);
        }

        for (Integer integer : arrB) {
            System.out.println(integer);
        }

        MyArr myArr = new MyArr();
        for (Object o: myArr){

        }

        for (int i=0; i<5; i++) {
             for (int j = 0; j < 10; j++) {
                if (j == 5) {
//                    break MyLabel;
//                    return;
                    continue;
//                    break;
                }
                System.out.println(i + " - " + j);
            }

        }
        System.out.println("Программа завершена");
    }

    static String doSome() {
        if (true) {
            return "";
        }
        return "23";
    }
}

class MyArr implements Iterable {

    int count = 0;
    @Override
    public Iterator iterator() {
        return new Iterator() {
            @Override
            public boolean hasNext() {
                System.out.println("hasNext");
                return ++count != 5;
            }

            @Override
            public Object next() {
                System.out.println("next");
                return null;
            }
        };
    }
}

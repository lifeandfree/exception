package task2;

import java.io.IOException;

/**
 * Main2.
 *
 * @author Ilya_Sukhachev
 */
public class Main {

    public static void main(String[] args) {
        /* Task 2 */
        String str = null;
        try {
            if (str.equals("message")) {
                System.out.println(str);
            }
        } catch (NullPointerException npe) {
            System.out.println("NPE");
            return;
        } catch (ArithmeticException are) {
            System.out.println("ARE");
        } catch (Exception ex) {
            System.out.println("EX");
        } finally {
            str.equals("message");
            System.out.println("Finally");
        }
    }
}

// /* Task 1 */
//class A {
//
//    public A method() throws Throwable { // 1 
//        return new Single();
//    }
//}
//
//class Single extends A {
//
//    public Single method(String str) throws RuntimeException { // 2 
//        return new Single();}
//
//    public Single method() throws IOException {  //3 
//        return new Double();}
//}
//
//class Double extends Single {
//
//    public void method(Integer digit) throws ClassCastException {      // 4 
//    }
//
//    public Double method() throws Exception {  // 5 
//        return new Double();}
//}

package task3;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.file.NoSuchFileException;
import java.sql.SQLException;

public class ExceptionDemo {
    static Exception exception;
    static String result;

    public static void main(String[] args) throws RuntimeException {
        A a = new A(new C());
        try {
            result = a.doSome();
        } catch (IOException e) {
//            throw new RuntimeException(e);
            exception = e;
            result = "IO Exception";
        } catch (Exception e) {
            exception = e;
            result = "Some Exception";
        } finally {
//            RuntimeException newEx = new RuntimeException();
//            newEx.addSuppressed(null);
//            newEx.addSuppressed(new RuntimeException("exception"));
//            throw newEx;
            System.out.println("finally block");
        }
        System.out.println(result);

//        try (InputStream is = new FileInputStream("")){
//            is.close();
//        } catch (IOException e) {
//            System.out.println(e);
//        }
    }
}

class A {
    private B b;

    public A(B b) {
        this.b = b;
    }

    String doSome() throws IOException {
        try {
            return b.doSomeElse().substring(2);
        } catch (IOException e) {
            System.out.println("exception handled");
            throw new SQLException(e);
        } finally {
            return "Все хорошо";
        }
    }
}

class B {
    String doSomeElse() throws IOException {
        return "B.doSomeElse";
    }
}

class C extends B{
    int d;
    @Override
    String doSomeElse() throws NoSuchFileException {
        // что-то пошло не так
        if (true) {
            throw new NoSuchFileException("сообщение о причине ошибки");
        }
        return "C.doSomeElse";
    }
}

class D extends B {
    @Override
    String doSomeElse() {
        return "Все ок";
    }
}
package task2.holders;

public class NestedClassHolder {

    /* Агрегация */
    static enum Type {
        SINGLE_CHOICE, MULIT_CHOICE, TEXT
    }


    /* Агрегация */
    static class StaticNestedClass {

        public StaticNestedClass() {
            System.out.println("Constructor NestedClass");
        }
    }


}

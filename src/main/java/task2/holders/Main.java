package task2.holders;

public class Main {
    public static void main(String[] args) {
//        NestedClassHolder.Type type = NestedClassHolder.Type.TEXT;
//        System.out.println(type);
//
//        NestedClassHolder.StaticNestedClass nestedClass = new NestedClassHolder.StaticNestedClass();

//        MemberInnerClassHolder.MemberInnerClass memberInnerClass = new MemberInnerClassHolder.MemberInnerClass();
        MemberInnerClassHolder innerClassHolder = new MemberInnerClassHolder();
        MemberInnerClassHolder.MemberInnerClass memberInnerClass1 = innerClassHolder.getMemberInnerClass();
        MemberInnerClassHolder.MemberInnerClass memberInnerClass2 = innerClassHolder.new MemberInnerClass();
//
        innerClassHolder.doSomething();
        innerClassHolder.start();

    }



}

package task2.holders;

import java.util.ArrayList;
import java.util.List;

public class MemberInnerClassHolder {

    /* Композизия */
    public class MemberInnerClass {

    }

    public MemberInnerClass getMemberInnerClass() {
        return new MemberInnerClass();
    }


    public void doSomething() {

        class localInnerClass {
            List<String> parts = new ArrayList<String>();
             String path = "/";

            localInnerClass(String path) {
                if (path == null) return;
                this.path = path;
                for (String s : path.split("/"))
                    if (s.trim().length() > 0) this.parts.add(s);
            }

            int size() {
                return parts.size();
            }

        }

        localInnerClass path = new localInnerClass("/opt/documents/");
        System.out.println(path.size());
    }

    public void start() {
        new Thread(new Runnable() {
            public void run() {
                System.out.println("Thread running");
            }
        }).start();
    }
}

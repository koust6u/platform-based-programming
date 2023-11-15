package org.example.week7.LambdaTest;

public class LambdaTest {
    static void execute(MyFunction f) {
        f.run();
    }



    public static void main(String[] args) {
        MyFunction f1 = () -> System.out.println("f1.run()");
        MyFunction f2 = new MyFunction() {

            @Override
            public void run() {
                System.out.println("f2.run()");
            }

        };

        MyFunction f3 = MyFunction.getMyFunction("f3");

        f1.run();
        f2.run();
        f3.run();

        execute(f1);
        execute( () -> System.out.println("run()"));
        f1.sayHello();

    }
}

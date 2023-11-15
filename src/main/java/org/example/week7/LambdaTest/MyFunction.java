package org.example.week7.LambdaTest;

public interface MyFunction {

    void run();

    static MyFunction getMyFunction(String name){
        return new MyFunction() {
            @Override
            public void run() {
                System.out.println("f3.run()");
            }
        };
    }

    default void sayHello(){
        System.out.println("Hello");
    }
}

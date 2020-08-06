package LC;

import java.util.concurrent.Semaphore;

/**
 * Created by fujie on 20/8/6.
 */
public class 交替打印FooBar {
    FooBar fooBar = new FooBar(1);
}

class FooBar {

    Semaphore foo = new Semaphore(1);
    Semaphore bar = new Semaphore(0);
    private int n;
    public FooBar(int n) {
        this.n = n;
    }

    public void foo(Runnable printFoo) throws InterruptedException {

        for (int i = 0; i < n; i++) {

            foo.acquire();
            printFoo.run();
            bar.release();
        }
    }

    public void bar(Runnable printBar) throws InterruptedException {

        for (int i = 0; i < n; i++) {

            bar.acquire();
            printBar.run();
            foo.release();
        }
    }
}
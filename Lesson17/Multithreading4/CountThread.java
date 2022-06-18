package Lesson17.Multithreading4;


class CommonResource {
    int x = 0;
}

public class CountThread implements Runnable {
    CommonResource res;

    CountThread(CommonResource res) {
        this.res = res;
    }

    public void run() {
        synchronized (res) {
            res.x = 1;
            for (int i = 1; i < 5; i++) {
                System.out.printf("%s %d\n", Thread.currentThread().getName(), res.x);
                res.x++;
                try {
                    Thread.sleep(100);

                } catch (InterruptedException e) {
                    System.out.printf("%s has been interrupted", Thread.currentThread().getName());
                }
            }
        }
    }
}

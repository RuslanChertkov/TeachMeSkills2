package Lesson17.Multithreading5;

public class PrintRunnable implements Runnable{
    private String msg;
    private long sleepMills;

    public PrintRunnable(String msg, long sleepMills){
        this.msg=msg;
        this.sleepMills=sleepMills;
    }

    public void run(){
for(int k = 0; k<10; k++){
    try{
        Thread.sleep(sleepMills);
    } catch (InterruptedException e) {
        System.out.printf("%s has been interrupted", Thread.currentThread().getName());
    }
    System.out.println(msg);
}
    }
}

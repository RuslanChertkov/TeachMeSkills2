package Lesson17.Multithreading;
//Выводим на экран имя работающего потока
public class Thread1 {
    public static void main(String[] args) {
        Thread t = Thread.currentThread();
        System.out.println(t.getName());
    }
}

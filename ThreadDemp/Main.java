package ThreadDemp;

public class Main {
    public static void main(String[] args) {
        Res res = new Res(1);
        NThread nThread = new NThread(res);
        for (int i = 0; i < 5; i++) {
            Thread thread = new Thread(nThread);
            thread.start();
        }
    }

}

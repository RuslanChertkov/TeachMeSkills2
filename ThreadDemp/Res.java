package ThreadDemp;

public class Res {
    private int num;

    public Res(int num){
        this.num = num;
    }

    public synchronized void multy(){
        num*=2;
    }

    public int getNum() {
        return num;
    }
}

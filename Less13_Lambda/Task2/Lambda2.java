package Less13_Lambda.Task2;
public class Lambda2 {
    public static void main(String[] args) {
        Calculation ca = new Calculation(){

            @Override
            public int calculate(int x, int y) {
                return x+y;
            }
        };
        int z = ca.calculate(5,7);
        System.out.println(z);
    }
}

interface Calculation{
    int calculate(int x, int y);
}
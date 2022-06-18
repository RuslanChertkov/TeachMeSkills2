package Less13_Lambda.Task1;
public abstract class Lambda implements Calculation {
    public static void main(String[] args) {

        Calculation calc = new Calculation() {
            @Override
            public int calculate(int x, int y) {
                return x + y;
            }
        };
        int z = calc.calculate(7, 4);
        System.out.println(z);
    }
}

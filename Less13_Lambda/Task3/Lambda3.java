package Less13_Lambda.Task3;

public class Lambda3 {
    public static void main(String[] args) {
        Calculation c1 = (int x, int y) -> x + y;
        Calculation c2 = (int x, int y) -> x - y;
        Calculation c3 = (int x, int y) -> x * y;
        int result1 = c1.calculate(5, 3);
        int result2 = c2.calculate(144, 37);
        int result3 = c3.calculate(32, 43);
        System.out.printf("Сумма = %d;\nВычитание = %d;\nУмножение = %d", result1, result2, result3);
    }
}

interface Calculation {
    int calculate(int x, int y);
}

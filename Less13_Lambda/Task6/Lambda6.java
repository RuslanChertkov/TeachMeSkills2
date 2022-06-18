package Less13_Lambda.Task6;

public class Lambda6 {
    public static void main(String[] args) {
        Printable printer = (String a, String b)-> System.out.println(a+b);
        printer.print("20", "10");
        Calculation ca = (double x, double y)->x+y;
        System.out.println(ca.calculate(20,10));
    }
}

interface Printable {
    void print(String a, String b);
}

interface Calculation {
    double calculate(double x, double y);
}

package Less13_Lambda.Task4;

public class Lambda4 {
    public static void main(String[] args) {
        Printable printer1 = s -> System.out.println(s);
        printer1.print("Hello World");
        Printable printer2 = s -> System.out.println(s);
        printer2.print("All people are animals, who can easier training, better than animals");
    }
}
interface Printable{
    void print(String s);
}

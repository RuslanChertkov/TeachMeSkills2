package Less13_Lambda.Task5;

public class Lambda5 {
    public static void main(String[] args) {
        Calculation ca1 = (double x, double y)->{
         if(y==0){
             return 0;
         }else{
             return x/y;
         }
        };
        System.out.println(ca1.calculate(5,0));
        System.out.println(ca1.calculate(3,6));
    }

}
interface Calculation{
   double calculate(double x, double y);
}

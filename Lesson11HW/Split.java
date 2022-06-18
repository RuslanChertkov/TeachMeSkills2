package Lesson11HW;

public class Split {
    public static void main(String[] args) {
        String str = "Java";
       String [] str2 =  str.split("") ;
       for (int i = 0; i< str2.length; i++){
           System.out.print(str2[i]);
       }

    }

}

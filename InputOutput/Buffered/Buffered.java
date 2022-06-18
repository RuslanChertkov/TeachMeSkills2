package InputOutput.Buffered;

import java.io.*;

public class Buffered {
    public static void main(String[] args) throws IOException {

        //BufferedWriter - записывает в файл
      /*  try (BufferedWriter bw = new BufferedWriter(new FileWriter("BufferedFile.txt"))) {
            String text = "I want to sleep little by the way!";
            bw.write(text);
        }*/

        //BufferedReader - читает текст из файла в консоль
        /*try (BufferedReader bw = new BufferedReader(new FileReader("BufferedFile.txt"))) {
            int a = 0;
            while ((a = bw.read()) != -1) {
                System.out.print((char) a);
            }
        }*/

        //Считывание текста построчно!

        try (BufferedReader bw = new BufferedReader(new FileReader("BufferedFile.txt"))) {
            String s;
            while ((s = bw.readLine()) != null) {
                System.out.print(s);
            }
        }
        catch (IOException e){
            System.out.println(e.getMessage());
        }

    }


}

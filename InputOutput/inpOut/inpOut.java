package InputOutput.inpOut;


import java.io.*;

public class inpOut {

    public static void main(String[] args) {
        //ЧТЕНИЕ ФАЙЛОВ
        //FileIputStream - байтовый поток, для работы с байтами(Русский язык не видит!)
       /* FileInputStream fis = null;
        int b = 0;
        try {
            fis = new FileInputStream("black.txt");
            while((b=fis.read())!=-1){
                System.out.print((char)b);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }*/

//InputStreamReader - поток, для работы со строками(Можео использовать разные языки!)
FileInputStream fis = null;
InputStreamReader isr = null;
        try {
            fis = new FileInputStream("black.txt");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        //ЗАПИСЬ В ФАЙЛЫ

        //С помощью FileOutputStream можно записать какую-то информацию в файл, НО вся прежняя инфрмация, находящаяся в этом файле удалится
        /* FileOutputStream fos = null;
        String str = "Hot";
        try {
            fos = new FileOutputStream("black.txt");
            fos.write(str.getBytes());
        } catch (IOException e) {
            e.printStackTrace();
        }*/

       /*FileWriter fr = null;
       String str = "Hot weather today!";
       File file = new File("black.txt");
       try{
           fr = new FileWriter(file,true);
           fr.write(str);
       } catch (IOException e) {
           e.printStackTrace();
       }finally {
           try {
               fr.close();
           } catch (IOException e) {
               e.printStackTrace();
           }
       }*/

    }
}

package InputOutput.inpOut2;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileCopy {
    public static void main(String[] args) throws IOException {

        FileWriter fileOut = null;
        FileReader fileIn = null;

        try {
            fileIn = new FileReader("black.txt");
            fileOut = new FileWriter("CopiedFile.txt");
            int a = 0;
            while ((a = fileIn.read()) != -1) { //Если a =-1 то это значит,что файл полность прочитан
                fileOut.write(a);
            }
        } finally {
            if (fileIn != null) {
                fileIn.close();
            }
            if (fileOut != null) {
                fileOut.close();
            }
        }

    }
}

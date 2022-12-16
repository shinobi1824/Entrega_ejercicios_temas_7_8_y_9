import java.io.*;


public class CopiarArchivo {
    CopiarArchivo () throws IOException {
        try {
            InputStream file = new FileInputStream("C:\\Users\\simon\\Desktop\\LogCopia.txt");
            BufferedReader fileIn = new BufferedReader(new InputStreamReader(file));
            try (PrintStream fileOut = new PrintStream("C:\\Users\\simon\\Desktop\\LogCopia2.txt")) {
                try {
                    int dato = fileIn.read();
                    while (dato != -1) {
                        System.out.print((char) dato);
                        dato = fileIn.read();
                        fileOut.print((char) dato);
                    }
                } catch (IOException e) {
                    System.out.println(e.getMessage());
                }
            } catch (FileNotFoundException e) {
                System.out.println(e.getMessage());
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}

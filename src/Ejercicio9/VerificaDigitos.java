package r_pais;

import java.util.Scanner;

public class VerificaDigitos {
    String line = new String();

    public static String Check(String line){
        Scanner sc = new Scanner(System.in);
        if (!line.matches("[0-9]+")) {
            while(!line.matches("[0-9]+")){
                System.out.println("Solo enteros!!");
                line = sc.nextLine();
                if(line.matches("[0-9]+")) {
                    return line;
                }

            }
        }
        return line;
    }
}

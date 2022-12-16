import r_pais.Menus;
import r_pais.VerificaDigitos;

import java.io.IOException;
import java.util.Scanner;
import java.util.Vector;

public class Main {
    public static void main(String[] args) {
        String[] arreglo = { "a", "b", "c", "d"};
        String[][] arreglo2   = {{ "a", "b", "c", "d"},{"1","2","3","4"}};
        String texto = "Hola mundo";
        boolean retornar = true;
        String opc;
        Scanner sc = new Scanner(System.in);

        do {
            Menus.MenuEje1Al8();
            opc = sc.nextLine();
            switch (opc) {
                case "1":
                    System.out.println(Reverse.reverse(texto));
                    break;
                case "2":
                    ManipuladordeArreglos.recorriendoArray(arreglo);
                    break;
                case "3":
                    ManipuladordeArreglos.recorriendoArray2(arreglo2);
                    break;
                case "4":
                    EjercicioVector.ejercicioVector();
                    break;
                case "5":
                    CreaArraylist.creayCopia();
                case "6":
                    CreaArraylist.soloImpares();
                    break;
                case "7":
                    try{
                        new DividePorCero(8);
                    }catch (ArithmeticException e) {
                        System.out.println("Esto no puede hacerse");

                    }
                    break;
                case "8":
                    try {
                        new CopiarArchivo();
                    }catch(IOException e){
                        System.out.println(e.getMessage());
                    }
                default:
                    break;
            }
        }while (retornar);
        }
    }



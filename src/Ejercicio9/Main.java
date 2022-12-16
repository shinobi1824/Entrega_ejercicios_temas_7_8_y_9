package r_pais;
import java.util.*;


public class Main {
    public static void main(String[] args) {
        PaisCRUD agenda = new PaisCRUD();
        Pais ciudad = new Pais();
        HashMap<String, String> pais = new HashMap<>();
        ArrayList<Integer> codeZip = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        boolean retornar = true;
        String opc;
        String line;

        do {
            Menus.MenuEje9();
            opc = sc.nextLine();
            switch (opc) {
                case "1":
                    System.out.print("Introducir Pais, ciudad de Envio: ");
                    pais.put(sc.next(), sc.nextLine());
                    System.out.print("Introducir numero de Codigo Postal: ");
                    line = sc.nextLine();
                    codeZip.add(Integer.valueOf(VerificaDigitos.Check(line)));

                    ciudad.setPais(pais);
                    ciudad.setCodigo(codeZip);
                    agenda.crear(ciudad);
                    break;
                case "2":
                    agenda.getData();
                    break;
                case "3":
                    agenda.actualizar();
                    break;
                case "4":
                    agenda.eliminar();
                    break;
                case "5":
                    retornar = false;
                default:
                    break;
            }
        }while (retornar);
    }
}

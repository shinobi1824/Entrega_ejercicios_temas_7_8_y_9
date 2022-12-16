package r_pais;

import java.io.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class PaisCRUD implements IpaisCRUD {
Pais pais = new Pais();
    @Override
   public void crear(Pais pais){
        pais = this.pais;
        List<String> list = new ArrayList<>(pais.getPersona().keySet());
        try {
                PrintStream fileOut = new PrintStream(System.getProperty("user.home") + "/Desktop/paises.txt");
                for (int i = 0; i < list.size(); i++) {
                    fileOut.append("\n********************************\n");
                    fileOut.append("Pais: ").append(list.get(i)).append("\n");
                    fileOut.append("Ciudad: ").append(pais.getPersona().get(list.get(i))).append("\n");
                    fileOut.append("Codigo: ").append(String.valueOf(pais.getCodigo().get(i)));
                    fileOut.append("\n********************************\n");
                }
            } catch (FileNotFoundException e) {
                System.out.println(e.getMessage());
            }
    }
    @Override
   public void getData(){
        try {
            InputStream file = new FileInputStream(System.getProperty("user.home")+"/Desktop/paises.txt");
            BufferedReader fileRead = new BufferedReader(new InputStreamReader(file));
           try {
               int data = fileRead.read();
               while (data != -1) {
                   System.out.print((char)data);
                   data=fileRead.read();
               }
           }catch (IOException e) {
               System.out.println(e.getMessage());
           }
        }catch (FileNotFoundException e){
            System.out.println(e.getMessage());
        }
    }

    @Override
    public void actualizar() {
        ArrayList<String> ciudadList = new ArrayList<>();
        ArrayList<String> paisList = new ArrayList<>();
        ArrayList<Integer> codigoList = new ArrayList<>();
        HashMap<String, String> paisMod = new HashMap<>();
        Scanner sc = new Scanner(System.in);
        int line;
        String  lineAux;


        try {
            InputStream file = new FileInputStream(System.getProperty("user.home")+"/Desktop/paises.txt");
            BufferedReader fileRead = new BufferedReader(new InputStreamReader(file));
            try {
                while ((lineAux = fileRead.readLine()) != null) {
                    System.out.println(lineAux);
                    if(lineAux.startsWith("Pais")) {
                        paisList.add(lineAux.substring(lineAux.lastIndexOf(" ") + 1));
                    }
                    if(lineAux.startsWith("Ciudad")){
                        ciudadList.add(lineAux.substring(lineAux.lastIndexOf(" ") + 1));
                    }
                    if(lineAux.startsWith("Codigo")){
                        codigoList.add(Integer.valueOf(lineAux.substring(lineAux.lastIndexOf(" ") + 1)));
                    }
                }
            }catch (IOException e) {
                System.out.println(e.getMessage());
            }
        }catch (FileNotFoundException e){
            System.out.println(e.getMessage());
        }
        System.out.println("Ingrese código postal para modificar el registro: ");
        line = sc.nextInt();
        for (int i = 0; i <codigoList.size(); i++) {
            if(codigoList.get(i)==line){
                paisList.remove(i);
                ciudadList.remove(i);
                codigoList.remove(i);
                System.out.print("Introducir Pais de Envio: ");
                sc.nextLine();
                paisList.add(i,sc.nextLine());
                System.out.print("Introducir Ciudad  de Envio: ");
                ciudadList.add(i,sc.nextLine());
                System.out.print("Introducir numero de Codigo Postal: ");

                codigoList.add(i,Integer.valueOf(VerificaDigitos.Check(sc.nextLine())));
            }
        }
        for (int i=0; i<paisList.size(); i++) {
            paisMod.put(paisList.get(i), ciudadList.get(i));
        }
        pais.setPais(paisMod);
        pais.setCodigo(codigoList);
        crear(pais);
    }

    @Override
    public void eliminar() {
        ArrayList<String> ciudadList = new ArrayList<>();
        ArrayList<String> paisList = new ArrayList<>();
        ArrayList<Integer> codigoList = new ArrayList<>();
        HashMap<String, String> paisMod = new HashMap<>();
        Scanner sc = new Scanner(System.in);
        int line;
        String  lineAux;


        try {
            InputStream file = new FileInputStream(System.getProperty("user.home")+"/Desktop/paises.txt");
            BufferedReader fileRead = new BufferedReader(new InputStreamReader(file));
            try {
                while ((lineAux = fileRead.readLine()) != null) {
                    System.out.println(lineAux);
                    if(lineAux.startsWith("Pais")) {
                        paisList.add(lineAux.substring(lineAux.lastIndexOf(" ") + 1));
                    }
                    if(lineAux.startsWith("Ciudad")){
                        ciudadList.add(lineAux.substring(lineAux.lastIndexOf(" ") + 1));
                    }
                    if(lineAux.startsWith("Codigo")){
                        codigoList.add(Integer.valueOf(lineAux.substring(lineAux.lastIndexOf(" ") + 1)));
                    }
                }
            }catch (IOException e) {
                System.out.println(e.getMessage());
            }
        }catch (FileNotFoundException e){
            System.out.println(e.getMessage());
        }
        System.out.println("Ingrese código postal para eliminar el registro: ");
        line = sc.nextInt();
        for (int i = 0; i <codigoList.size(); i++) {
            if(codigoList.get(i)==line) {
                paisList.remove(i);
                ciudadList.remove(i);
                codigoList.remove(i);
            }
        }
        for (int i=0; i<paisList.size(); i++) {
            paisMod.put(paisList.get(i), ciudadList.get(i));
        }
        pais.setPais(paisMod);
        pais.setCodigo(codigoList);
        crear(pais);
    }
}

import java.util.ArrayList;
import java.util.LinkedList;

/*
Crea un ArrayList de tipo String,
con 4 elementos. Cópialo en una LinkedList. Recorre ambos mostrando únicamente el valor de cada elemento
 */
public class CreaArraylist {
    static ArrayList <String> list = new ArrayList<String>();
    static LinkedList<String> list2 = new LinkedList<String>();

     static void creayCopia(){
        list.add("Hola");
        list.add("Mundo");
        list.add("!");
        list.add("!");
        list2.addAll(list);
        for(String s : list) {
            System.out.println(s);
        }
         for (String s : list2) {
             System.out.println(s);
         }
    }

    static void soloImpares(){
         ArrayList<Integer> list = new ArrayList<Integer>();

         for(int i = 1; i <=10; i++){
             list.add(i);
             if(i%2 == 0) {
                 list.remove(list.size()-1);
             }
         }
         System.out.println(list);
    }

}

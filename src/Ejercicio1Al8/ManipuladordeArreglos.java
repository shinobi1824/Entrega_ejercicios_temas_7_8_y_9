
public class ManipuladordeArreglos {
    public static void recorriendoArray(String[] arreglo) {
        String[] arr = arreglo;

        for (String a : arr) {
            System.out.println(a);
        }
    }
    public static void recorriendoArray2(String[][]  arreglo) {
        String[][] arr = arreglo;
        for(int i =0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.println("Posicion: " + i +","+ j);
                System.out.println(arr[i][j]);
            }
        }
        }
    }

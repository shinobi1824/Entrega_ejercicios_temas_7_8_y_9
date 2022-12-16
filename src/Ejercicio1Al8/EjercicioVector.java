import java.util.Vector;

public class EjercicioVector {
    public static void ejercicioVector(){

        Vector<String>  nombres = new Vector<>();

        nombres.add("Juan");
        nombres.add("Saturnino");
        nombres.add("limerio");
        nombres.add("Isidro");
        nombres.add("Miguel");


        nombres.remove("Saturnino");
        nombres.remove("limerio");
        for (String v : nombres){
            System.out.println(v);
        }
        /*
        La capacidad de los vectores se duplica al rebasar la capacidad actual con nuevos datos, dicho esto al tener 1000 elementos
        la capacidad total seria de 2000 elementos, haciendo asi un uso de memoria ineficiente.
         */

    }
}

package r_pais;

public class Menus {
    public static void MenuEje1Al8() {

        System.out.println("Elija una opcion para ver los resultados de los ejercicios");
        System.out.println("\n\n1. Crea un array unidimensional de Strings y recórrelo, mostrando únicamente sus valores.");
        System.out.println("2. Crea un array bidimensional de enteros y recórrelo, mostrando la posición y el valor de cada elemento en ambas dimensiones.");
        System.out.println("3. Crea un \"Vector\" del tipo de dato que prefieras, y añádele 5 elementos. Elimina el 2o y 3er elemento y muestra el resultado final.");
        System.out.println("4. Indica cuál es el problema de utilizar un Vector con la capacidad por defecto si tuviésemos 1000 elementos para ser añadidos al mismo.");
        System.out.println("5. Crea un ArrayList de tipo String, con 4 elementos. Cópialo en una LinkedList. Recorre ambos mostrando únicamente el valor de cada elemento.");
        System.out.println("6. Crea un ArrayList de tipo int, y, utilizando un bucle rellénalo con elementos 1..10. A continuación, con otro bucle, recórrelo y elimina los numeros pares. Por último, vuelve a recorrerlo y muestra el ArrayList final. Si te atreves, puedes hacerlo en menos pasos, siempre y cuando cumplas el primer \"for\" de relleno.");
        System.out.println("7. Crea una función DividePorCero. Esta, debe generar una excepción (\"throws\") a su llamante del tipo ArithmeticException que será capturada por su llamante (desde \"main\", por ejemplo). Si se dispara la excepción, mostraremos el mensaje \"Esto no puede hacerse\". Finalmente, mostraremos en cualquier caso: \"Demo de código\".");
        System.out.println("8. Utilizando InputStream y PrintStream, crea una función que reciba dos parámetros: \"fileIn\" y \"fileOut\". La tarea de la función será realizar la copia del fichero dado en el parámetro \"fileIn\" al fichero dado en \"fileOut\".");
        System.out.println("9. Salir");
    }
    public static void MenuEje9(){
        System.out.println("\n\nMenuEje9 de opciones para agendar de destinos");
        System.out.println("1. Agregar destino");
        System.out.println("2. Mostrar datos guardados");
        System.out.println("3. Modificar datos guardados");
        System.out.println("4. Eliminar datos guardados");
        System.out.println("5.Salir\n\n");
    }
}

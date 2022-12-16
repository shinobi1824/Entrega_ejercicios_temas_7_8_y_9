public class DividePorCero  {

    public DividePorCero(int valor) throws ArithmeticException{
        int result;
        try{
            result = valor/0;
        }
        finally {
            System.out.println("Demo de código");
        }
    }
    }

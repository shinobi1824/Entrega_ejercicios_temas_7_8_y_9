
public class Reverse {
    public static String reverse(String hola) {

        int i;
        String[] s = hola.split("");
        StringBuilder reverse = new StringBuilder();

        for (i = s.length   - 1; i >= 0; i--) {
            reverse.append(s[i]);
        }
        hola = reverse.toString();
        return hola;
    }
}

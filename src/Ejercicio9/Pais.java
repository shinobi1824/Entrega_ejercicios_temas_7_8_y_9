package r_pais;

import java.util.ArrayList;
import java.util.HashMap;

public class Pais {
    public static HashMap<String, String> persona = new HashMap<String, String>();
    public static ArrayList<Integer> telefono = new ArrayList<>();

    public Pais() {

    }
    Pais(HashMap<String, String> persona, ArrayList<Integer> telefono){
        persona = this.persona;
        telefono = this.telefono;
    }

    public HashMap<String, String> getPersona() {
        return persona;
    }

    public void setPais(HashMap<String, String> persona) {
        this.persona = persona;
    }

    public ArrayList<Integer> getCodigo() {
        return telefono;
    }

    public void setCodigo(ArrayList<Integer> telefono) {
        this.telefono = telefono;
    }

    @Override
    public String toString() {
        return "Persona{" +
                "persona=" + persona +
                ", telefono=" + telefono +
                '}';
    }
}

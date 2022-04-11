package calatayud.jose.Ejemplo005;

import java.util.ArrayList;

public class Persona {
    private String nombre;
    private ArrayList <Casa> casas;

    public Persona(String nombre) {
        this.nombre = nombre;
        this.casas=new ArrayList<Casa>();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public boolean add(Casa casa) {
        return casas.add(casa);
    }

    public ArrayList<Casa> getCasas() {
        return casas;
    }

    public void setCasas(ArrayList<Casa> casas) {
        this.casas = casas;
    }
}

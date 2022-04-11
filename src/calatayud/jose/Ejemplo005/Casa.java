package calatayud.jose.Ejemplo005;

import java.util.ArrayList;

public class Casa {
    private String direccion;
    private ArrayList<Persona>personas;

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public Casa(String direccion) {
        this.direccion = direccion;
        this.personas=new ArrayList<Persona>();
    }

    public boolean add(Persona persona) {
        return personas.add(persona);
    }

    public ArrayList<Persona> getPersonas() {
        return personas;
    }

    public void setPersonas(ArrayList<Persona> personas) {
        this.personas = personas;
    }
}

package calatayud.jose.Excepciones.Ejemplo003;

public class Principal {

    public static void main(String[] args) {
        Persona p=null;
        p=new Persona("Pepe");

        if(p!=null)
        System.out.println(p.getNombre());

    }

}

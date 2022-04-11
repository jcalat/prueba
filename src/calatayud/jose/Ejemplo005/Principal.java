package calatayud.jose.Ejemplo005;

public class Principal {
    public static void main(String[] args) {

        Casa c=new Casa("Santander");
        Persona p =new Persona("jose");
        c.add(p);
        p.add(c);
        System.out.println(c.getPersonas().get(0).getNombre());
        System.out.println(p.getCasas().get(0).getDireccion());

    }
}

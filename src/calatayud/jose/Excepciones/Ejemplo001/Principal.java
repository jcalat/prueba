package calatayud.jose.Excepciones.Ejemplo001;

import java.io.File;
import java.io.IOException;

public class Principal {

    public static void main(String[] args) {

        File f=new File("F://hola.txt");
        try {
            f.createNewFile();
        } catch (IOException e) {

            System.out.println(e.getMessage());
        }

    }

}

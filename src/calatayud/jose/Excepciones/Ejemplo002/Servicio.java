package calatayud.jose.Excepciones.Ejemplo002;

import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Servicio {

    public static void miMetodo() throws IOException, ParseException, ServicioException {
        File f=new File("Hola.txt");
        DateFormat df=new SimpleDateFormat("dd/MM/YYYY");
        try {
            f.createNewFile();
            Date mifecha=df.parse("03/00-2017");
            System.out.println(mifecha);
        } catch (IOException | ParseException e) {

            System.out.println("log a fichero"+ e.getMessage());
            throw new ServicioException("Nuestro servicio ha fallada",e);

        }finally {
            System.out.println("el codigo se a cerrado");
        }
    }

}

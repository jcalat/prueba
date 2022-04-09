package calatayud.jose;

public class Ejemplo003Arrays {
    public static void main(String[] args) {
        int[] listaNotas = new int[]{3, 6, 1, 7, 18, 9, 59, 56, 4, 62, 5};
        boolean n = false;
        int cont=0;

        do {
            n=false;
            for (int i = 0; i < listaNotas.length - 1; i++) {

                cont=0;
                if (listaNotas[i] > listaNotas[i + 1]) {
                    int temporal = listaNotas[i];
                    listaNotas[i] = listaNotas[i + 1];
                    listaNotas[i + 1] = temporal;
                    n=true;

                } else {

                }

            }


        } while (n);
            for (int i = 0; i < listaNotas.length - 1; i++){
                System.out.println(listaNotas[i]);

            }
    }
}

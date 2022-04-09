package calatayud.jose;

public class Ejemplo004Arrays {
    public static void main(String[] args) {
        int[] listaNotas = new int[]{3, 6, 1, 7, 18, 9, 59, 56, 4, 62, 5};
        boolean n=true;
        do {
            n=false;
            for (int i =0;i< listaNotas.length-1;i++){
                int temporal=0;
                if (listaNotas[i]<listaNotas[i+1]){
                    temporal=listaNotas[i+1];
                    listaNotas[i+1]=listaNotas[i];
                    listaNotas[i]=temporal;
                    n=true;

                }
            }
        }while(n);
        for (int i=0;i< listaNotas.length;i++){
            System.out.println(listaNotas[i]);
        }
    }
}

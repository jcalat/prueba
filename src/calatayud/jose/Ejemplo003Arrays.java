package calatayud.jose;

public class Ejemplo003Arrays {
    public static void main(String[] args) {
        int[] listaNotas= new int[] {3,6,1,7,8,9,5,3,4,6,5};
        boolean n=false;

        do {
            for (int i =0;i< listaNotas.length-1;i++){
                System.out.println(listaNotas [i]);
                if (listaNotas[i]>listaNotas[i+1]) {
                int temporal=listaNotas[i];
                listaNotas[i]=listaNotas[i+1];
                listaNotas[i+1]=temporal;
                }else{
                    n=true;
                }
                }
//        for (int j = 0;j<listaNotas.length;j++ ) {
//            System.out.println(listaNotas[j]);
//        }
        } while (n);
    }
}

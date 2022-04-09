package calatayud.jose;

public class Bucles {
    public static void main(String[] args) {
        for (int i=0;i<10;i++) {
            System.out.println("hola"+(i+1));
        }
        System.out.println(".......");
        int j=0;

        do {
            System.out.println("hola"+(j+1));
            j++;
        } while (j<10);
        System.out.println(".......");

        j=0;
        while (j<10) {
            System.out.println("hola"+(j+1));
            j++;
        }
    }
}

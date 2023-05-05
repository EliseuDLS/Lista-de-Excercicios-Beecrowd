import java.util.Scanner;

public class Beecrowd_Media2 {

    final static Scanner LER = new Scanner(System.in);
    public static void main(String[] args) {

        double notaA = 0d;
        double notaB = 0d;
        double notaC = 0d;
        double media = 0d;

        final double pesoA = 2d;
        final double pesoB = 3d;
        final double pesoC = 5d;

        notaA = lerNotaA(notaA);
        notaB = lerNotaB(notaB);
        notaC = lerNotaC(notaC);

        media = calcularMedia(notaA, notaB, notaC);
        imprimirMedia(media);
    }

    public static double lerNotaA(double notaA){
        notaA = LER.nextDouble();

        return notaA;
    }

    public static double lerNotaB(double notaB){
        notaB = LER.nextDouble();

        return notaB;
    }

    public static double lerNotaC(double notaC){
        notaC = LER.nextDouble();

        return notaC;
    }

    public static double calcularMedia(double notaA, double notaB, double notaC){

        double media = 0d;

        final double pesoA = 2d;
        final double pesoB = 3d;
        final double pesoC = 5d;

        media = ((notaA * pesoA) + (notaB * pesoB) + (notaC * pesoC)) / 10;

        return media;
    }

    public static void imprimirMedia(double media){
        System.out.printf("MEDIA = %.1f\n", media);
    }
}

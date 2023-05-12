import java.util.Scanner;

public class Beecrowd_Distancia_entre_dois_Pontos { 

    final static Scanner LER = new Scanner(System.in);
    public static void main(String[] args) {
        
        double x1 = 0d;
        double y1 = 0d;
        double x2 = 0d;
        double y2 = 0d;
        double distancia = 0d;

        x1 = lerX1(x1);
        y1 = lerY1(y1);
        x2 = lerX2(x2);
        y2 = lerY2(y2);

        distancia = calcularDistancia(x1, y1, x2, y2);
        imprimirDistancia(distancia);
    }

    public static double lerX1(double x1){
        x1 = LER.nextDouble();

        return x1;
    }

    public static double lerY1(double y1){
        y1 = LER.nextDouble();

        return y1;
    }

    public static double lerX2(double x2){
        x2 = LER.nextDouble();

        return x2;
    }

    public static double lerY2(double y2){
        y2 = LER.nextDouble();

        return y2;
    }

    public static double calcularDistancia(double x1, double y1, double x2, double y2){
        double distancia = 0d;

        distancia = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));

        return distancia;
    }

    public static void imprimirDistancia(double distancia){
        System.out.printf("%.4f\n", distancia);
    }
}
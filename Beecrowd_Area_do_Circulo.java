import java.util.Scanner;

public class Beecrowd_Area_do_Circulo { 

    final static Scanner LER = new Scanner(System.in);
    public static void main(String[] args) {

        double r = 0d;
        double area = 0d;
        final double pi = 3.14159;
        
        r = lerR(r);
        area = calcularArea(r,pi);
        imprimirArea(area);
    }

    public static double lerR(double r){
        //System.out.println("Olá, digite um valor para o raio: ");
        r = LER.nextDouble();
        
        return r;
    }

    public static double calcularArea(double r, double pi){
        double area = 0d;

        area = pi * Math.pow(r, 2);

        return area;
    }

    public static void imprimirArea(double area){
        System.out.printf("A=%.4f\n", area);
    }
}
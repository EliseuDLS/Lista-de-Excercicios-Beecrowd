import java.util.Scanner;

public class Beecrowd_Soma_Simples { 

    final static Scanner LER = new Scanner(System.in);
    public static void main(String[] args) {

        int valorA = 0;
        int valorB = 0;
        int soma = 0;
        
        valorA = lerValorA(valorA);
        valorB = lerValorB(valorB);

        soma = calcularSoma(valorA, valorB, soma);
        imprimirSoma(soma);
    }

    public static int lerValorA(int valorA){
        valorA = LER.nextInt();

        return valorA;
    }

    public static int lerValorB(int valorB){
        valorB = LER.nextInt();

        return valorB;
    }

    public static int calcularSoma(int valorA, int valorB, int soma){
        soma = valorA + valorB;

        return soma;
    }

    public static void imprimirSoma(int soma){
        System.out.println("SOMA = "+ soma);
    }
}
import java.util.Scanner;

public class Beecrowd_Basquete_de_Robos { 

    final static Scanner LER = new Scanner(System.in);
    public static void main(String[] args) {

        int distancia = 0;
        int pontuacao = 0;

        distancia = lerDistancia(distancia);
        pontuacao = calcularPontuacao(distancia);
        imprimirPontuacao(pontuacao);
    }

    public static int lerDistancia(int distancia){
        distancia = LER.nextInt();

        return distancia;
    }

    public static int calcularPontuacao(int distancia){
        int pontuacao = 0;

        if (distancia <= 800){
            pontuacao = 1;
        } else if (distancia > 800 && distancia <= 1400){
            pontuacao = 2;
        } else if (distancia > 1400 && distancia <= 2000){
            pontuacao = 3;
        }

        return pontuacao;
    }

    public static void imprimirPontuacao(int pontuacao){
        System.out.println(pontuacao);
    }
}
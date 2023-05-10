import java.util.Scanner;

public class Beecrowd_Soma_Simples { 

    final static Scanner LER = new Scanner(System.in);
    public static void main(String[] args) {

        int P = 0;
        int R = 0;
        String caminho = null;

        P = lerP(P);
        R = lerR(R);

        caminho = encontrarCaminho(R,P);
        imprimirCaminho(caminho);
    }

    public static int lerP(int P){
        P = LER.nextInt();

        return P;
    }

    public static int lerR(int R){
        R = LER.nextInt();

        return R;
    }

    public static String encontrarCaminho(int R, int P){
        String caminho = null;

        if (P == 0){
            caminho = "C";
        } else if (P == 1 && R == 0){
            caminho = "B";
        } else if (P == 1 && R == 1){
            caminho = "A";
        }

        return caminho;
    }

    public static void imprimirCaminho(String caminho){
        System.out.println(caminho);
    }
}

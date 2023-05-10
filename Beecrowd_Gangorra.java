import java.util.Scanner;

public class Beecrowd_Gangorra { 

    final static Scanner LER = new Scanner(System.in);
    public static void main(String[] args) {

        int P1 = 0;
        int C1 = 0;
        int P2 = 0;
        int C2 = 0;
        int equilibrio = 0;

        P1 = lerP1(P1);
        C1 = lerC1(C1);
        P2 = lerP2(P2);
        C2 = lerC2(C2);

        equilibrio = encontrarEquilibrio(P1, C1, P2, C2);
        imprimirEquilibrio(equilibrio);
    }

    public static int lerP1(int P1){
        P1 = LER.nextInt();

        return P1;
    }

    public static int lerC1(int C1){
        C1 = LER.nextInt();

        return C1;
    }

    public static int lerP2(int P2){
        P2 = LER.nextInt();

        return P2;
    }

    public static int lerC2(int C2){
        C2 = LER.nextInt();

        return C2;
    }

    public static int encontrarEquilibrio(int P1, int C1, int P2, int C2){
        int equilibrio = 0;

        if (P1 * C1 == P2 * C2){
            equilibrio = 0;
        } else if (P1 * C1 > P2 * C2){
            equilibrio = -1;
        } else if (P1 * C1 < P2 * C2) {
            equilibrio = 1;
        }

        return equilibrio;
    }

    public static void imprimirEquilibrio(int equilibrio){
        System.out.println(equilibrio);
    }
}
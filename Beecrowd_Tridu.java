import java.util.Scanner;

public class Beecrowd_Tridu { 

    final static Scanner LER = new Scanner(System.in);
    public static void main(String[] args) {

        int cartaA = 0;
        int cartaB = 0;
        int cartaC = 0;

        cartaA = lerCartaA(cartaA);
        cartaB = lerCartaB(cartaB);

        cartaC = calcularCartaC(cartaA, cartaB);
        imprimirCartaC(cartaC);
    }

    public static int lerCartaA(int cartaA){
        cartaA = LER.nextInt();

        return cartaA;
    }

    public static int lerCartaB(int cartaB){
        cartaB = LER.nextInt();

        return cartaB;
    }

    public static int calcularCartaC(int cartaA, int cartaB){
        int cartaC = 0;

        if (cartaA > cartaB){
            cartaC = cartaA;
        } else if (cartaA < cartaB){
            cartaC = cartaB;
        } else if (cartaA == cartaB){
            cartaC = cartaA;
        }

        return cartaC;
    }

    public static void imprimirCartaC(int cartaC){
        System.out.println(cartaC);
    }
}
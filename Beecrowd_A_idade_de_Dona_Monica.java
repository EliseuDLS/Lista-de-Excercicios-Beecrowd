import java.util.Scanner;

public class Beecrowd_A_idade_de_Dona_Monica { 

    final static Scanner LER = new Scanner(System.in);
    public static void main(String[] args) {

        int idadeDonaMonica = 0;
        int idadeFilho1 = 0;
        int idadeFilho2 = 0;
        int idadeFilhoMaisVelho = 0;
        int filhoMaisVelho = 0;

        idadeDonaMonica = lerIdadeDonaMonica(idadeDonaMonica);
        idadeFilho1 = lerIdadeFilho1(idadeFilho1);
        idadeFilho2 = lerIdadeFilho2(idadeFilho2);

        filhoMaisVelho = calcularFilhoMaisVelho(idadeDonaMonica, idadeFilho1, idadeFilho2);
        imprimirIdadeFilhoMaisVelho(filhoMaisVelho);
    }

    public static int lerIdadeDonaMonica(int idadeDonaMonica){
        idadeDonaMonica = LER.nextInt();

        return idadeDonaMonica;
    }
    
    public static int lerIdadeFilho1(int idadeFilho1){
        idadeFilho1 = LER.nextInt();

        return idadeFilho1;
    }

    public static int lerIdadeFilho2(int idadeFilho2){
        idadeFilho2 = LER.nextInt();

        return idadeFilho2;
    }

    public static int calcularFilhoMaisVelho(int idadeDonaMonica, int idadeFilho1, int idadeFilho2){
        int idadeFilhoMaisVelho = 0;
        int filhoMaisVelho = 0;

        idadeFilhoMaisVelho = idadeDonaMonica - (idadeFilho1 + idadeFilho2);

        if (idadeFilhoMaisVelho > idadeFilho1 && idadeFilhoMaisVelho > idadeFilho2){
           filhoMaisVelho = idadeFilhoMaisVelho;
        } else if (idadeFilho1 > idadeFilhoMaisVelho && idadeFilho1 > idadeFilho2){
            filhoMaisVelho = idadeFilho1;
        } else if (idadeFilho2 > idadeFilhoMaisVelho && idadeFilho2 > idadeFilho1){
            filhoMaisVelho = idadeFilho2;
        }

        return filhoMaisVelho;
    }

    public static void imprimirIdadeFilhoMaisVelho(int filhoMaisVelho){
        System.out.println(filhoMaisVelho);
    }
}
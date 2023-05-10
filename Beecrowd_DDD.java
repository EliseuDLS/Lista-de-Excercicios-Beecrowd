import java.util.Scanner;

public class Beecrowd_Gangorra { 

    final static Scanner LER = new Scanner(System.in);
    public static void main(String[] args) {

        int DDD = 0;
        String cidade = null;

        DDD = lerDDD(DDD);

        cidade = classificarCidade(DDD);
        imprimirCidade(cidade);
    }

    public static int lerDDD(int DDD){
        DDD = LER.nextInt();

        return DDD;
    }

    public static String classificarCidade(int DDD){
        String cidade = null;

        switch (DDD) {
            case 61:
                cidade = "Brasilia";
                break;
            case 71:
                cidade = "Salvador";
                break;
            case 11:
                cidade = "Sao Paulo";
                break;
            case 21:
                cidade = "Rio de Janeiro";
                break;
            case 32:
                cidade = "Juiz de Fora";
                break;
            case 19:
                cidade = "Campinas";
                break;
            case 27:
                cidade = "Vitoria";
                break;
            case 31:
                cidade = "Belo Horizonte";
                break;
            default:
                cidade = "DDD nao cadastrado";
        }

        return cidade;
    }

    public static void imprimirCidade(String cidade){
        System.out.println(cidade);
    }
}
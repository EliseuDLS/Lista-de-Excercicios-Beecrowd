
import java.util.Scanner;

public class Beecrowd_Lanche { 

    final static Scanner LER = new Scanner(System.in);
    public static void main(String[] args) {

        int codItem = 0;
        int qntd = 0;
        float preco = 0f;
        float total = 0f;

        codItem = lerCodItem(codItem);
        qntd = lerQntd(qntd);

        total = calcularPreco(qntd, codItem);
        imprimirPreco(total);
    }

    public static int lerCodItem(int codItem){
        codItem = LER.nextInt();

        return codItem;
    }

    public static int lerQntd(int qntd){
        qntd = LER.nextInt();

        return qntd;
    }

    public static float calcularPreco(int qntd, int codItem){
        float preco = 0;
        float total = 0;

        switch (codItem) {
            case 1:
                preco = 4.00f;
                break;
            case 2:
                preco = 4.50f;
                break;
            case 3:
                preco = 5.00f;
                break;
            case 4:
                preco = 2.00f;
                break;
            case 5:
                preco = 1.50f;
                break;
        }

        total = preco * qntd;

        return total;
    }

    public static void imprimirPreco(float total){
        System.out.printf("Total: R$ %.2f\n", total);
    }
}
import java.io.IOException;
import java.util.Scanner;

public class URI_1038{
    public static void main(String args[])  throws IOException{
        Scanner scan = new Scanner(System.in);
        
        double total = 0d;
        System.out.println("Digite o codigo do produto");
        int code = scan.nextInt();
        System.out.println("Digite a quantidade do produto");
        int qtd = scan.nextInt();

        switch(code){
            case 1: 
                total = 4 * qtd;
                break;
            case 2: 
                total = 4.50 * qtd;
                break;
            case 3: 
                total = 5 * qtd;
                break;
            case 4: 
                total = 2 * qtd;
                break;
            case 5: 
                total = 1.5 * qtd;
                break;
            default:
                System.out.println("Invalido");
        }
        

        System.out.printf("Total: R$ %.2f", total);
    }   
}
import java.io.IOException;
import java.util.Scanner;

public class Main {
 
    public static void main(String[] args) throws IOException {
        
        String nome;
        Double salFixo, totVendas, salReajuste;
        
        Scanner scan = new Scanner(System.in);
        
        nome = scan.nextLine();
        salFixo = scan.nextDouble();
        totVendas = scan.nextDouble();
        
        salReajuste = salFixo + (totVendas * 0.15);
        
        System.out.printf("TOTAL = R$ %.2f%n", salReajuste);
        
        scan.close();
        
 
    }
 
}

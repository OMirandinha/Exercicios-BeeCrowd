import java.io.IOException;
import java.util.Scanner;
 

public class Main {
 
    public static void main(String[] args) throws IOException {
 
        int codP1, numP1, codP2, numP2;
        float precUnit1, precUnit2, valPagar;
        
        Scanner scan = new Scanner(System.in);
        valPagar = 0;
        
        codP1 = scan.nextInt();
        numP1 = scan.nextInt();
        precUnit1 = scan.nextFloat();
        
        codP2 = scan.nextInt();
        numP2 = scan.nextInt();
        precUnit2 = scan.nextFloat();
        
        valPagar = (precUnit1 * numP1) + (precUnit2 * numP2);
        
        System.out.printf("VALOR A PAGAR: R$ %.2f%n", valPagar);
        
        scan.close();
        
       
 
    }
 
}

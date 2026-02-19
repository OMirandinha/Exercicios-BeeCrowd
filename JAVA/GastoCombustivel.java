import java.io.IOException;
import java.util.Scanner;
 
public class Main {
 
    public static void main(String[] args) throws IOException {
 
        int horas, velocidadeMedia;
        Double totLitros;
        
        Scanner scan = new Scanner(System.in);
        
        horas = scan.nextInt();
        velocidadeMedia = scan.nextInt();
         
        totLitros = (horas * velocidadeMedia) / 12.0;
        
        System.out.printf("%.3f%n", totLitros);
        
        
 
    }
       

}

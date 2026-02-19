import java.io.IOException;
import java.util.Scanner;
import java.util.Locale;

public class Main {
 
    public static void main(String[] args) throws IOException {
 
        Locale.setDefault(Locale.US); 
        
        Scanner scan = new Scanner(System.in);
        
        int numFunc = scan.nextInt();
        int horas = scan.nextInt();
        double valHora = scan.nextDouble(); 
        
        double sal = valHora * horas;
        
        System.out.println("NUMBER = " + numFunc);
        System.out.printf("SALARY = U$ %.2f%n", sal);
        
        scan.close();
    }
}
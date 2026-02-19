import java.io.IOException;
import java.util.Scanner;
 

public class Main {
 
    public static void main(String[] args) throws IOException {
        
        Double raio, volume;
        Double pi = 3.14159;
        Scanner scan = new Scanner(System.in);
        
        raio = scan.nextDouble();
        
        volume = (4.0/3.0) * pi * Math.pow(raio, 3);
        
        System.out.printf("VOLUME = %.3f%n", volume);
        
        scan.close();
       
    }
 
}

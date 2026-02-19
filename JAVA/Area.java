import java.io.IOException;
import java.util.Scanner;
 

public class Main {
 
    public static void main(String[] args) throws IOException {
 
       Double A, B, C, triangulo, circulo, trapezio, quadrado, retangulo;
       Double pi = 3.14159;
       Scanner scan = new Scanner(System.in);
       
       A = scan.nextDouble();
       B = scan.nextDouble();
       C = scan.nextDouble();
       
       triangulo = A * C / 2;
       circulo = Math.pow(C, 2) * pi;
       trapezio = ((A + B) * C) /2;
       quadrado = B*B;
       retangulo = A * B;
       
       System.out.printf("TRIANGULO: %.3f%n", triangulo);
       System.out.printf("CIRCULO: %.3f%n", circulo);
       System.out.printf("TRAPEZIO: %.3f%n", trapezio);
       System.out.printf("QUADRADO: %.3f%n", quadrado);
       System.out.printf("RETANGULO: %.3f%n", retangulo);
       
       scan.close();
       
 
    }
 
}

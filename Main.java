import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanf = new Scanner(System.in);
        Double a,b,c,d,e;
        // quadrado
        System.out.println("Insira o tamanho do lado do quadrado");
        a = scanf.nextDouble();
        scanf.nextLine();
        Quadrado teste = new Quadrado(a); 
        System.out.println("Area do quadrado = " + teste.calcularAreaQuadrado());
        // triangulo
        System.out.println("Insira o tamanho a base do triangulo");
        b = scanf.nextDouble();
        scanf.nextLine();
        System.out.println("Insira o tamanho da altura do triangulo");
        c = scanf.nextDouble();
        scanf.nextLine();
        Triangulo teste2 = new Triangulo(b, c); 
        System.out.println("Area do trianguloj = " + teste2.calcularAreaTriangle());
        
        
    }
}
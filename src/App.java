import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner teclado = new Scanner (System.in);
        int primeironumero;
        int segundonumero;
        int resultado;

        System.out.print("digite o primeiro numero:  ");
        primeironumero = teclado.nextInt();

        System.out.print("digite o segundo nuemro:  ");
        segundonumero = teclado.nextInt();
        teclado.close();


        resultado = primeironumero + segundonumero;
        System.out.println("o resultado é: "+resultado);


        
    }
}

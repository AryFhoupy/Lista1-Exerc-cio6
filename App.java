import java.util.Scanner;
public class App {
    /**
     * @param args
     * @throws Exception
     */
    public static void main(String[] args) throws Exception {
        System.out.println("Escreva o valor do raio");
        Scanner scan = new Scanner(System.in);
 
        double raio = scan.nextFloat();
        double area = Math.PI * raio * raio;
 
        System.out.println("O valor da area é " + area);
        scan.close();
    }
}

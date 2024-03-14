import java.util.Scanner;

public class Contador {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o primeiro parâmetro");

        int param1 = scan.nextInt();

        System.out.println("Digite o segundo parâmetro");

        int param2 = scan.nextInt();

        try {
            contar(param1, param2);
        } catch (ParametrosInvalidosException e) {
            System.out.println("Erro: " + e.getMessage());
        }

        

        
        
    }

    static void contar (int param1, int param2) throws ParametrosInvalidosException {
        if (param1 > param2) {
            throw new ParametrosInvalidosException("Número 1 maior que número 2");
        }

        for(int i = 1; i < 19; i++ ) {
            System.out.println("Número " + i + " imprimido!");
        }
    }
}


 import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double resultado = 0;
        double numero;
        char operador;
        boolean primeiroNumero = true;

        System.out.println("=== Calculadora ===");
        System.out.println("Digite operações e use '=' para ver o resultado final.");
        System.out.println("Exemplo: 5 + 3 * 2 =");

        while (true) {
            if (primeiroNumero) {
                System.out.print("Digite o primeiro número: ");
                resultado = scanner.nextDouble();
                primeiroNumero = false;
            }

            System.out.print("Digite o operador (+, -, *, /, =): ");
            operador = scanner.next().charAt(0);

            if (operador == '=') {
                System.out.println("Resultado final: " + resultado);
                break;
            }

            System.out.print("Digite o próximo número: ");
            numero = scanner.nextDouble();

            switch (operador) {
                case '+':
                    resultado += numero;
                    break;
                case '-':
                    resultado -= numero;
                    break;
                case '*':
                    resultado *= numero;
                    break;
                case '/':
                    if (numero != 0) {
                        resultado /= numero;
                    } else {
                        System.out.println("Erro: divisão por zero!");
                    }
                    break;
                default:
                    System.out.println("Operador inválido!");
                    break;
            }
        }

        scanner.close();
    }
}

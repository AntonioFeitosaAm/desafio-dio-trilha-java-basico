import java.util.Locale;
import java.util.Scanner;

/**
* <h1>Conta Bancária</h1>
* Realiza a captura de dados essenciais para a criação de uma conta bancária, foi criado utilizando os conhecimentos ensinando no curso de Sintaxe de Java - Trilha básica, da DIO, Santander 2024 - Backend com Java.
*
* <p>
* <b>Note:</b> Leia atentamente a documentação desta classes
* para desfrutar dos recursos oferecidos pelo autor
*
* @author  Antonio Feitosa
* @version 1.0
* @since   09/06/2024
*/

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        //TODO: Conhecer e importar a classe Scanner
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        
        //Solicita o numero da conta
        System.out.println("Por favor, informe o número da sua conta: ");
        int numeroConta = scanner.nextInt();

        //Solicita o numero da agencia
        System.out.println("Informe o número da sua Agência: ");
        String numeroAgencia = scanner.next();

        //Solicita o nome do cliente
        System.out.println("Por favor, informe o seu nome: ");
        String nomeCliente = scanner.next();

        //Solicita o sobrenome do cliente
        System.out.println("Por favor, agora informe o seu sobrenome: ");
        String sobrenomeCliente = scanner.next();

        //Solicita o sobrenome do cliente
        System.out.println("Informe o valor do seu primeiro deposito: ");
        double saldo = scanner.nextDouble();

        //Exibir a mensagem conta criada
        System.out.println("Olá " + nomeCliente + " " + sobrenomeCliente + ", obrigado por criar uma conta em nosso banco, a sua agência é " +
        numeroAgencia + ", conta: " + numeroConta + " e o seu saldo R$ " + saldo + " já está disponível para saque!");
    }
}

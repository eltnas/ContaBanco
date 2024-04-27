import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception{
        // Definindo as variaveis
        int contaNumero;
        String contaAgencia, contaCliente, saldoInput;
        Double contaSaldo;
        String contaSaldoFm; // Aqui recebe o valor de contaSaldo e formata para ter 2 casas decimais sempre

        // TODO: Conhecer e importar a classe Scanner
        // Definindo o Scanner
        Scanner conta = new Scanner(System.in);

        // TODO: Exibir as mensagens para o nosso usuário
        // TODO: Obter os valores digitados pelo terminal usando a classe scanner

        // Entrada do numero da Conta
        System.out.print("Insira o número da conta: ");
        contaNumero = conta.nextInt();

        // Entrada do numero da Agencia
        System.out.print("Insira o numero da agencia (xxx-x): ");
        contaAgencia = conta.next(); 

        // Entrada do nome do usuário
        System.out.print( "Digite o nome do cliente: " );
        contaCliente = conta.next();

        // Saldo inicial da conta
        System.out.print("Insira o saldo inicial: R$ ");
        saldoInput = conta.next();

        saldoInput = saldoInput.replace(",", ".");
        contaSaldo = Double.parseDouble(saldoInput);

        // Fecha o Scanner
        conta.close();

        // TODO: Exibir a mensagem de conta criada
        contaSaldoFm = String.format("%.2f", contaSaldo);
        System.out.println("Olá "+ contaCliente +", obrigado por criar uma conta em nosso banco, sua agência é " + contaAgencia +", conta "+ contaNumero +" e seu saldo R$ "+ contaSaldoFm +" já está disponível para saque");
    }
}

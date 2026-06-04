import java.util.Scanner;


public class ContaTerminal {
    static Scanner scanner = new Scanner(System.in);
    static String name;
    static int conta;
    static double saldo;
    public static void main(String[] args) throws Exception {
        //Conhecer e importar a classe Scanner

        //Exibir a mensagem para usuario

        //Obter pelo Scanner as informaçoes do usuario

        //Exibir novamente a mensagem para p usuario com os dados bancarios dele
        System.out.println("Hello, World!");
        System.out.println("Olá sejá bem vindo. Digite o número da sua agência!");
        String agencia = scanner.next();
        receberInformacoes();
        
        System.out.println(String.format("Olá %s, obrigado por criar uma conta em nosso banco, sua agência é %s, conta %s e seu saldo atual é %s e já está disponivel para saque.", name, agencia, conta, saldo));
    }
    static void receberInformacoes (){
            System.out.println("Qual o seu nome?");
            name = scanner.next();
            System.out.println("Agora digite sua conta e seu saldo.");
            System.out.println("Conta:");
            conta = scanner.nextInt();
            scanner.nextLine();
            System.out.println("Saldo:");
            saldo = scanner.nextDouble();
        }
    }
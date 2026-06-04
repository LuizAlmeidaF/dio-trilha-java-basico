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

        System.out.println("Qual operação deseja realizar? \n1. Saque \n2. Deposito \n3. Transferência");
        int operacao = scanner.nextInt();

        switch (operacao){
            case 1:
                saque();
                break;
            
            case 2:
                deposito();
                break;

            case 3:
                System.out.println("Essa opção ainda não está no momento em breve essa funcionalidade vontará a funcionar.");
        }
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
        
    static void saque (){
        System.out.println("Quanto você gostaria de sacar?");
        double valor = scanner.nextDouble();
        System.out.println(String.format("Você sacou %s com sucesso", valor));
        double restante = saldo - valor;
        System.out.println("Seu saldo atual é: " + restante);
    }

    static void deposito(){
        System.out.println("Quanto você irá depositar?");
        double valor = scanner.nextDouble();
        double total = saldo + valor;
        System.out.println(String.format("Seu depósito de %s foi realizado com sucesso, seu saldo atual é %s.", valor, total));
    }

    }
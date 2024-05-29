import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Cliente cliente = new Cliente();
        int option = 0;
        System.out.println("Digite o seu nome: ");
        String name = scanner.nextLine();
        Conta cc = null;
        Conta poupanca = null;

        cliente.setNome(name);


        while (option != 7) {
            System.out.println("Escolha a ação desejada : ");
            System.out.println("1: Criar conta Corrente.");
            System.out.println("2: Criar conta poupança.");
            System.out.println("3: Depositar.");
            System.out.println("4: Sacar.");
            System.out.println("5: Transferir.");
            System.out.println("6: Mostrar Saldo.");
            System.out.println("7: Sair.");

            option = scanner.nextInt();

            if (option == 1) {
                cc = new ContaCorrente(cliente);
                System.out.println("Conta corrente criada!");
            }
            if (option == 2) {
                poupanca = new ContaPoupanca(cliente);
                System.out.println("Conta Poupança criada!");
            }
            if (option == 3) {
                System.out.println("1: Valor para depositar: ");
                int valor = scanner.nextInt();


                System.out.println("1: Depositar na conta corrente!");
                System.out.println("2: Depositar na conta poupanca!");
                int escolhaConta = scanner.nextInt();
                if (escolhaConta == 1) {
                    cc.depositar(valor);
                }
                if (escolhaConta == 2) {
                    poupanca.depositar(valor);
                }
            }
            if (option == 4) {
                System.out.println("1: Valor para sacar: ");
                int valor = scanner.nextInt();


                System.out.println("1: Sacar da conta corrente!");
                System.out.println("2: Sacar da conta poupanca!");
                int escolhaConta = scanner.nextInt();
                if (escolhaConta == 1) {
                    cc.sacar(valor);
                }
                if (escolhaConta == 2) {
                    poupanca.sacar(valor);
                }
            }
			if (option == 5) {
				System.out.println("1: Valor para transferir: ");
				int valor = scanner.nextInt();
				System.out.println("1: Transferir da conta corrente para conta poupança!");
				System.out.println("2: Transferir da conta poupança para conta corrente!");
				int escolhaConta = scanner.nextInt();
				if (escolhaConta == 1) {
					cc.transferir(valor, poupanca);
				}
				if (escolhaConta == 2) {
					poupanca.transferir(valor, cc);
				}
			}

            if (option == 6) {
                cc.imprimirExtrato();
                poupanca.imprimirExtrato();
            }


        }

//		Conta cc = new ContaCorrente(venilton);
//		Conta poupanca = new ContaPoupanca(venilton);
//
//		cc.depositar(100);
//		cc.transferir(100, poupanca);
//
//		cc.imprimirExtrato();
//		poupanca.imprimirExtrato();
    }

}

import java.util.Scanner;



public class TelaInicioConta {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String usuario = "Phelipe Oliveira";
        double dinheiroConta = 2000;
        double transferencia;
        int opcao;
        boolean interfaceRodando = true;


        System.out.println();
        System.out.println("Bem vindo! " + usuario);
        System.out.println();

        while (interfaceRodando){

            System.out.println("1. Ver saldo atualizado.");
            System.out.println("2. Fazer Transferência.");
            System.out.println("3. Adicionar Saldo.");
            System.out.println("4. Sair.");
            System.out.println();
            System.out.printf("Digite o número da operação que deseja fazer: ");

            opcao = scanner.nextInt();

            switch (opcao) {

                case 1:
                    System.out.println("Saldo atualizado de sua conta: R$" + dinheiroConta);
                    System.out.println();
                    break;
                case 2:

                    System.out.printf("Digite o valor que deseja transferir ou digite 0 para cancelar: ");
                    transferencia = scanner.nextDouble();

                    if (transferencia<dinheiroConta && transferencia!=0){
                            dinheiroConta -= transferencia;
                        System.out.println();
                        System.out.println("Transferência realizada com sucesso!");
                        System.out.println("Saldo atualizado: R$" + dinheiroConta);
                        System.out.println();
                    }else if(transferencia>dinheiroConta){
                        System.out.println();
                        System.out.println("Você não tem valor o suficiente para essa transferência");
                        System.out.println();
                    }else{
                        System.out.println();
                        System.out.println("Operação cancelada.");
                        System.out.println();
                    }
                    break;

                case 3:
                    System.out.println();
                    System.out.printf("Digite o saldo que deseja adicionar ou digite 0 para cancelar: ");
                    transferencia = scanner.nextDouble();
                    if (transferencia<0) {
                        System.out.println();
                        System.out.println("Digite um valor maior que zero!");
                        System.out.println();
                    }else if (transferencia>0) {
                        System.out.println("Saldo adicionado com sucesso!");
                        dinheiroConta += transferencia;
                        System.out.println("Saldo atualizado: R$" + dinheiroConta);
                        System.out.println();
                    }else{
                        System.out.println();
                        System.out.println("Operação cancelada.");
                        System.out.println();
                    }

                    break;

                case 4:
                    System.out.println();
                    System.out.println("Obrigado por usar nosso aplicativo! Até mais!");
                    System.out.println();
                    interfaceRodando = false;
                    break;

                default:
                    System.out.println();
                    System.out.println("Digite um número de 1 a 4 correspondentes à opção desejada!");
                    System.out.println();
                    break;

            }
            }
        }
        }


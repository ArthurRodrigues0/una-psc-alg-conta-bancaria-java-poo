package Atv11P2;
import java.util.Scanner;

public class Atv2{
    public static void main(String[] args) {
        Info info = new Info();
        Scanner scanner = new Scanner(System.in);
        String op3;

        System.out.println("Escreva seu nome: ");
           info.setNome(scanner.nextLine());
        System.out.println("Escreva o numero da conta: ");
           info.setConta(scanner.nextLine());
        System.out.println("Escreva seu saldo inicial: ");
           info.setSaldo(scanner.nextDouble());

        System.out.println("Conta bancária criada com sucesso!");
        System.out.println("Proximo (R)");
            String op1 = scanner.next();
   


    if(op1.equalsIgnoreCase("R"))    
        do{
            System.out.println("\tOPÇÕES");
            System.out.println("(1)Depositar valor. \n(2)Sacar valor. \n(3)Obter saldo.");
                int op2 = scanner.nextInt();

            switch (op2) {
                case 1:
                    System.out.println("Valor que deseja depositar: ");
                        double depo = scanner.nextDouble();
                        info.setSaldo(info.Soma(depo, info.getSaldo()));
                    System.out.println("Deposito de R$" + depo + " feito com sucesso!");  
                    break;
                case 2:
                    System.out.println("Valor que deseja sacar: ");
                        double saq = scanner.nextDouble();
                    if(saq > info.getSaldo()){
                        System.out.println("Saldo insuficiente para realizar a operação.");
                    }else if(saq > 5000){
                        System.out.println("Valor do saque acima do permitido.");
                    }else{
                        info.setSaldo(info.Sub(info.getSaldo(), saq));
                    System.out.println("Saque de R$" + saq + " feito com sucesso!");
                }
                    break;
                case 3:
                    System.out.println("Seu saldo é de " + info.getSaldo());
                    break;
              }  
              
                System.out.println("Parar (Q) \tVoltar (R)");
                    op3 = scanner.next();
            
        }while (op3.equalsIgnoreCase("R"));
        

    scanner.close();

    }
}
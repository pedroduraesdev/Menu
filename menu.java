import java.util.Scanner;

/*

Criar uma aplicação que leia os nomes de 20 produtos e armazene em um vetor.
Em outro vetor armazene o valor unitário de cada produto.
Crie um menu onde o usuário poderá encerrar na hora que ele quiser, informando o número 0.

*/
public class menu {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String nomeProduto[] = new String[20];
        int valorProduto[] = new int[20];

        System.out.println("Digite o nome e código dos produtos que deseja armazenar.\n");

        for (int i = 0; i < 3 ; i++) {
            System.out.println("Digite o nome do " + (i+1) + "° produto.");
            nomeProduto[i] = input.nextLine();
            input.nextLine();
            
            System.out.println("Digite o valor unitário do " + (i+1) + "° produto.");
            valorProduto[i] = input.nextInt();
        }

        int escolha = 0;

        do {
            System.out.println("==================MENU==================");
            System.out.println("|     1- Vender                        |");
            System.out.println("|     2- Fechar Caixa                  |");
            System.out.println("|     3- Mais vendidos ordem crescente |");
            System.out.println("|     4- Listagem completa             |");
            System.out.println("|     0- Sair                          |");
            System.out.println("========================================");

            switch (escolha){
                case 1:
            }


        } while (escolha != 0);
    }
}

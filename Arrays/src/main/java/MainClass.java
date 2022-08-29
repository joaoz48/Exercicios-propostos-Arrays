import java.util.Scanner;

public class MainClass {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        System.out.println("Cadastre seu Jardim!");
        System.out.println("Insira o nome do dono, contato e endereco: ");

        String nome = inp.nextLine();
        String contato = inp.nextLine();
        String endereco = inp.nextLine();

        Jardim jardim = new Jardim(nome, contato, endereco);


        int escolha;
        boolean flag = true;

        System.out.println("Bem vindo ao menu!");
        System.out.println("Escolha a acao desejada: ");
        System.out.println("0 - Adicionar Arvore");
        System.out.println("1 - Mostrar media dos precos");
        System.out.println("2 - Verificar replantio");
        System.out.println("3 - Mostrar todas as informacoes");
        System.out.println("4 - Sair do menu");

        while (flag) {
            System.out.println("Escolha uma nova acao: ");
            escolha = inp.nextInt();
            switch (escolha) {
                case 0:
                    for (int j = 0; j<jardim.arvores.length; j++)  {
                        if (jardim.arvores[j] == null) {

                            Arvore aux = new Arvore();

                            System.out.println("Insira a especie");
                            inp.nextLine();
                            aux.especie = inp.nextLine();

                            System.out.println("Insira a altura em metros");
                            aux.altura = inp.nextFloat();

                            System.out.println("Insira o diametro");
                            aux.diametro = inp.nextFloat();

                            System.out.println("Insira o preco");
                            aux.preco = inp.nextFloat();

                            jardim.arvores[j] = aux;

                            System.out.println("Arvore cadastrada");
                            break;
                        } else {
                            System.out.println("Numero maximo de arvores atingido");
                        }
                    }
                    break;
                case 1:
                    jardim.precoMedio();
                    break;
                case 2:
                    jardim.replantar();
                    break;
                case 3:
                    jardim.mostraInfo();
                    break;
                case 4:
                    flag = false;
                    break;
            }
        }
    }
}

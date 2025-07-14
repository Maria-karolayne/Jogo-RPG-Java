import java.util.Scanner;

public class JogoFinal{

    public static void main(String[]args){

        Scanner ler =new Scanner(System.in);
        Guerreiro jogo1 = new Guerreiro ();
        Guerreiro jogo2 = new Guerreiro ();
        

        //regras
        System.out.println("----Regras---- \n 1-Para usar habilidade especial precisa de 50 mana;\n 2-Vida maxima 100; \n 3-Para carregar mana precisa subir nivel");

        //guerreiro
        System.out.print("Informe o nome do  guerreiro1:");
        jogo1.nomeDoGuerreiro1 = ler.nextLine();

        System.out.print("Informe o nome do  guerreiro2:");
        jogo2.nomeDoGuerreiro1 = ler.nextLine();

        //personagem aq
       

        jogo1.mostrarStatusGuerreiro1();
        jogo2.mostrarStatusGuerreiro1();

        boolean jogoAtivo = true;

        while (jogoAtivo) {

            // Turno do Guerreiro1
            for (int i = 1; i <= 3; i++) {
                System.out.println("\nTurno de "+jogo1.nomeDoGuerreiro1+" - Acao " + i + " de 3");
                System.out.println("1. Ataque simples");
                System.out.println("2. Usar habilidade especial");
                System.out.println("3. Subir nivel");
                System.out.println("4. Status do guerreiro");
                System.out.print("Escolha a acao: ");
                int escolha = ler.nextInt();
                ler.nextLine(); // Consumir enter

                switch (escolha) {
                    case 1:
                        jogo1.ataqueGuerreiro1();
                        break;
                    case 2:
                        if (jogo1.manaDoGuerreiro1 >= 50) {
                            jogo1.usarHabilidadeEspecialGuerreiro1();
                        } else {
                            System.out.println("Mana insuficiente!");
                            i--; // não conta essa ação
                        }
                        break;
                    case 3:
                        jogo1.subirNivelGuerreiro1();
                        break;
                    case 4:
                        jogo1.mostrarStatusGuerreiro1();
                        i--;
                        break;
                    default:
                        System.out.println("Opção inválida!");
                        i--; // não conta essa ação
                }

                // Verifica vitória do Guerreiro
                if (jogo1.vidaDoArqueiro <= 0) {
                    System.out.println("\nO arqueiro " + jogo2.nomeDoArqueiro + " foi derrotado!");
                    System.out.println("O guerreiro " + jogo1.nomeDoGuerreiro1 + " venceu!");
                    jogoAtivo = false;
                    break;
                }
            }
    }
    // Turno do Guerreiro2
            for (int i = 1; i <= 3; i++) {
                System.out.println("\nTurno de "+jogo2.nomeDoGuerreiro1+" - Acao " + i + " de 3");
                System.out.println("1. Ataque simples");
                System.out.println("2. Usar habilidade especial");
                System.out.println("3. Subir nivel");
                System.out.println("4. Status do guerreiro");
                System.out.print("Escolha a acao: ");
                int escolha = ler.nextInt();
                ler.nextLine(); // Consumir enter

                switch (escolha) {
                    case 1:
                        jogo2.ataqueGuerreiro1();
                        break;
                    case 2:
                        if (jogo2.manaDoGuerreiro1 >= 50) {
                            jogo2.usarHabilidadeEspecialGuerreiro1();
                        } else {
                            System.out.println("Mana insuficiente!");
                            i--; // não conta essa ação
                        }
                        break;
                    case 3:
                        jogo2.subirNivelGuerreiro1();
                        break;
                    case 4:
                        jogo2.mostrarStatusGuerreiro1();
                        i--;
                        break;
                    default:
                        System.out.println("Opção inválida!");
                        i--; // não conta essa ação
                }

                // Verifica vitória do Guerreiro
                if (jogo1.vidaDoArqueiro <= 0) {
                    System.out.println("\nO arqueiro " + jogo2.nomeDoGuerreiro1 + " foi derrotado!");
                    System.out.println("O guerreiro " + jogo1.nomeDoGuerreiro1 + " venceu!");
                    jogoAtivo = false;
                    break;
                }
            }
    


}
}



/*import java.util.Scanner;

public class JogoFinal {

    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);
        Guerreiro jogo = new Guerreiro();

        // Regras
        System.out.println("---- Regras ----");
        System.out.println("1 - Para usar habilidade especial precisa de 50 mana(para subir mana usar subir nivel)");
        System.out.println("2 - Vida maxima: 100;");
        System.out.println("3 - Cada jogador pode jogar 3 vezes antes de passar a vez;\n");

        // Recebe nomes
        System.out.print("Informe o nome do guerreiro: ");
        jogo.nomeDoGuerreiro1 = ler.nextLine();

        System.out.print("Informe o nome do arqueiro: ");
        jogo.nomeDoArqueiro = ler.nextLine();

        boolean jogoAtivo = true;

        while (jogoAtivo) {

            // Turno do Guerreiro
            for (int i = 1; i <= 3; i++) {
                System.out.println("\nTurno do Guerreiro - Acao " + i + " de 3");
                System.out.println("1. Ataque simples");
                System.out.println("2. Usar habilidade especial");
                System.out.println("3. Subir nivel");
                System.out.println("4. Status do guerreiro");
                System.out.print("Escolha a acao: ");
                int escolha = ler.nextInt();
                ler.nextLine(); // Consumir enter

                switch (escolha) {
                    case 1:
                        jogo.ataqueGuerreiro1();
                        break;
                    case 2:
                        if (jogo.manaDoGuerreiro1 >= 50) {
                            jogo.usarHabilidadeEspecialGuerreiro1();
                        } else {
                            System.out.println("Mana insuficiente!");
                            i--; // não conta essa ação
                        }
                        break;
                    case 3:
                        jogo.subirNivelGuerreiro1();
                        break;
                    case 4:
                        jogo.mostrarStatusGuerreiro1();
                        i--;
                        break;
                    default:
                        System.out.println("Opção inválida!");
                        i--; // não conta essa ação
                }

                // Verifica vitória do Guerreiro
                if (jogo.vidaDoArqueiro <= 0) {
                    System.out.println("\nO arqueiro " + jogo.nomeDoArqueiro + " foi derrotado!");
                    System.out.println("O guerreiro " + jogo.nomeDoGuerreiro1 + " venceu!");
                    jogoAtivo = false;
                    break;
                }
            }

            if (!jogoAtivo) break;

            // Turno do Arqueiro
            for (int i = 1; i <= 3; i++) {
                System.out.println("\nTurno do Arqueiro - Ação " + i + " de 3");
                System.out.println("1. Ataque simples");
                System.out.println("2. Usar habilidade especial");
                System.out.println("3. Subir nível");
                System.out.println("4. Status do arqueiro");
                System.out.print("Escolha a ação: ");
                int escolha = ler.nextInt();
                ler.nextLine(); // Consumir enter

                switch (escolha) {
                    case 1:
                        jogo.ataqueArqueiro();
                        break;
                    case 2:
                        if (jogo.manaDoArqueiro >= 50) {
                            jogo.usarHabilidadeEspecialArqueiro();
                        } else {
                            System.out.println("Mana insuficiente!");
                            i--; // não conta essa ação
                        }
                        break;
                    case 3:
                        jogo.subirNivelArqueiro();
                        break;
                    case 4:
                        jogo.mostrarStatusArqueiro();
                        i--;
                        break;
                    default:
                        System.out.println("Opção inválida!");
                        i--; // não conta essa ação
                }

                // Verifica vitória do Arqueiro
                if (jogo.vidaDoGuerreiro1 <= 0) {
                    System.out.println("\nO guerreiro " + jogo.nomeDoGuerreiro1 + " foi derrotado!");
                    System.out.println("O arqueiro " + jogo.nomeDoArqueiro + " venceu!");
                    jogoAtivo = false;
                    break;
                }
            }
        }

        ler.close();
    }
}
*/



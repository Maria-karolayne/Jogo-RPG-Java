import java.util.Scanner;

public class JogoFinal{

    public static void main(String[]args){

        Scanner ler =new Scanner(System.in);
        Guerreiro jogo1 = new Guerreiro ();
        Guerreiro jogo2 = new Guerreiro ();

        //regras
        System.out.println("----Regras---- \n 1-Para usar habilidade especial precisa de 50 mana;\n 2-Vida maxima 100;");

        //guerreiro1
        System.out.print("Informe o nome do  guerreiro1:");
        jogo.nomeDoGuerreiro1 = ler.nextLine();

        jogo.mostrarStatusGuerreiro1();

        System.out.println("---Guerreiro1 da um soco---");
        jogo.ataqueGuerreiro1();

        System.out.println("---guerreiro2 ataca---");
        jogo.receberDano1();

        System.out.println("---Guerreiro1 da multiplos socos---");
        jogo.usarHabilidadeEspecialGuerreiro1();

        System.out.println("---Guerreiro1 carrega nivel---");
        jogo.subirNivelGuerreiro1();

        jogo.mostrarStatusGuerreiro1();

        //guerreiro2

         System.out.print("Informe o nome do  guerreiro2:");
        jogo.nomeDoGuerreiro2 = ler.nextLine();

        jogo.mostrarStatusGuerreiro2();

        System.out.println("---Guerreiro2 da um soco---");
        jogo.ataqueGuerreiro2();

        System.out.println("---guerreiro1 ataca---");
        jogo.receberDano2();

        System.out.println("---Guerreiro2 da multiplos socos---");
        jogo.usarHabilidadeEspecialGuerreiro2();

        System.out.println("---Guerreiro2 carrega nivel---");
        jogo.subirNivelGuerreiro2();

        jogo.mostrarStatusGuerreiro2();

    }


}



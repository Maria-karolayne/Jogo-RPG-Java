public class Guerreiro{
 
    // Atributos do guerreiro
    public String nomeDoGuerreiro;
    public String classeDoGuerreiro = "guerreiro";
    public int nivelDoGuerreiro = 1;
    public int vidaDoGuerreiro = 100;
    public int manaDoGuerreiro = 0;
    public int forcaDoGuerreiro = 10;

    // Metodosguerreiro1
    public void ataqueGuerreiro(){
        vidaDoGuerreiro -= 10;

        String mensagem = "Ataque Soco = 10 \nVida do guerreiro2 depois do ataque = "+vidaDoGuerreiro2;
        System.out.println(mensagem);
    } 
 
    public void receberDano(int dano){
        vidaDoGuerreiro -= dano;

       String mensagem = "Ataque do guerrreiro2 = 10 \nVida do guerreiro1 depois do ataque = "+vidaDoGuerreiro1;
        System.out.println(mensagem);
    }
   
    public void usarHabilidadeEspecialGuerreiro(){


        manaDoGuerreiro -=50;

       String mensagem = " Ataque especial = 30  \nVida do guerreiro2 depois do ataque = "+vidaDoGuerreiro2;
       System.out.println(mensagem);
       
    }
 
    public void mostrarStatusGuerreiro(){
        String mensagem = "Nome do guerreiro1: " +nomeDoGuerreiro1+" | Classe: "+classeDoGuerreiro1+" | Nível: "+nivelDoGuerreiro1+ " | Força: "+forcaDoGuerreiro1+ " | Mana: "+manaDoGuerreiro1;
        System.out.println(mensagem);
       
    }
 
    public void subirNivelGuerreiro(){
        nivelDoGuerreiro += 1;
        vidaDoGuerreiro += 10;
        manaDoGuerreiro += 50;
        forcaDoGuerreiro +=10;

        String mensagem = "Nível do guerreiro1: "+nivelDoGuerreiro1+ "\nVida do guerreiro1:"+vidaDoGuerreiro1;
        System.out.println(mensagem);
    }
 
 
    public void desenharPersonagem(){
       
    }

    
}
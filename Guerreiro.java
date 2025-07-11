public class Guerreiro{
 
    // Atributos do guerreiro1
    public String nomeDoGuerreiro1;
    public String classeDoGuerreiro1 = "guerreiro";
    public int nivelDoGuerreiro1 = 1;
    public int vidaDoGuerreiro1 = 100;
    public int manaDoGuerreiro1 = 0;
    public int forcaDoGuerreiro1 = 10;

    //guerreiro2

    public String nomeDoGuerreiro2;
    public String classeDoGuerreiro2 = "guerreiro";
    public int nivelDoGuerreiro2 = 1;
    public int vidaDoGuerreiro2 = 100;
    public int manaDoGuerreiro2 = 0;
    public int forcaDoGuerreiro2 = 10;
 

    // Metodosguerreiro1
    public void ataqueGuerreiro1(){
        vidaDoGuerreiro2 -= 10;

        String mensagem = "Ataque Soco = 10 \nVida do guerreiro2 depois do ataque = "+vidaDoGuerreiro2;
        System.out.println(mensagem);
    } 
 
    public void receberDano1(){
        vidaDoGuerreiro1 -= 10;

       String mensagem = "Ataque do guerrreiro2 = 10 \nVida do guerreiro1 depois do ataque = "+vidaDoGuerreiro1;
        System.out.println(mensagem);
    }
   
    public void usarHabilidadeEspecialGuerreiro1(){

        vidaDoGuerreiro2 -=30;
        manaDoGuerreiro1 -=50;

       String mensagem = " Ataque especial = 30  \nVida do guerreiro2 depois do ataque = "+vidaDoGuerreiro2;
       System.out.println(mensagem);
       
    }
 
    public void mostrarStatusGuerreiro1(){
        String mensagem = "Nome do guerreiro1: " +nomeDoGuerreiro1+" | Classe: "+classeDoGuerreiro1+" | Nível: "+nivelDoGuerreiro1+ " | Força: "+forcaDoGuerreiro1+ " | Mana: "+manaDoGuerreiro1;
        System.out.println(mensagem);
       
    }
 
    public void subirNivelGuerreiro1(){
        nivelDoGuerreiro1 += 1;
        vidaDoGuerreiro1 += 10;
        manaDoGuerreiro1 += 50;
        forcaDoGuerreiro1 +=10;

        String mensagem = "Nível do guerreiro1: "+nivelDoGuerreiro1+ "\nVida do guerreiro1:"+vidaDoGuerreiro1;
        System.out.println(mensagem);
    }
 
 
    public void desenharPersonagem(){
       
    }

    // Metodosguerreiro2
    public void ataqueGuerreiro2(){
        vidaDoGuerreiro1 -= 10;

        String mensagem = "Ataque Soco = 10 \nVida do guerreiro1 depois do ataque = "+vidaDoGuerreiro1;
        System.out.println(mensagem);
    } 
 
    public void receberDano2(){
        vidaDoGuerreiro2 -= 10;

       String mensagem = "Ataque do guerrreiro1 = 10 \nVida do guerreiro2 depois do ataque = "+vidaDoGuerreiro2;
        System.out.println(mensagem);
    }
   
    public void usarHabilidadeEspecialGuerreiro2(){

        vidaDoGuerreiro1 -=30;
        manaDoGuerreiro2 -=50;

       String mensagem = " Ataque especial = 30  \nVida do guerreiro1 depois do ataque = "+vidaDoGuerreiro1;
       System.out.println(mensagem);
       
    }
 
    public void mostrarStatusGuerreiro2(){
        String mensagem = "Nome do guerreiro2: " +nomeDoGuerreiro2+" | Classe: "+classeDoGuerreiro2+" | Nível: "+nivelDoGuerreiro2+ " | Força: "+forcaDoGuerreiro2+ " | Mana: "+manaDoGuerreiro2;
        System.out.println(mensagem);
       
    }
 
    public void subirNivelGuerreiro2(){
        nivelDoGuerreiro2 += 1;
        vidaDoGuerreiro2 += 10;
        manaDoGuerreiro2 += 50;
        forcaDoGuerreiro2 +=10;

        String mensagem = "Nível do guerreiro2: "+nivelDoGuerreiro2+ "\nVida do guerreiro2:"+vidaDoGuerreiro2;
        System.out.println(mensagem);
    }
}
public class Guerreiro{
 
    // Atributos do guerreiro1
    public String nomeDoGuerreiro1;
    public String classeDoGuerreiro1 = "Guerreiro";
    public int nivelDoGuerreiro1 = 1;
    public int vidaDoGuerreiro1 = 100;
    public int manaDoGuerreiro1 = 0;
    public int forcaDoGuerreiro1 = 10;

    //Arqueiro

    public String nomeDoArqueiro;
    public String classeDoArqueiro = "Arqueiro";
    public int nivelDoArqueiro = 1;
    public int vidaDoArqueiro = 100;
    public int manaDoArqueiro = 0;
    public int forcaDoArqueiro = 10;
 

    // Metodosguerreiro1
    public void ataqueGuerreiro1(){
        vidaDoArqueiro -= 10;

        String mensagem = "Ataque Soco = 10 \nVida do arqueiro depois do ataque = "+vidaDoArqueiro;
        System.out.println(mensagem);
    } 
 
    public void receberDanoGuerreiro(){
        vidaDoGuerreiro1 -= 10;

       String mensagem = "Ataque do Arqueiro = 10 \nVida do guerreiro depois do ataque = "+vidaDoGuerreiro1;
        System.out.println(mensagem);
    }
   
    public void usarHabilidadeEspecialGuerreiro1(){

        vidaDoArqueiro -=30;
        manaDoGuerreiro1 -=50;

       String mensagem = " Ataque especial = 30  \nVida do arqueiro depois do ataque = "+vidaDoArqueiro;
       System.out.println(mensagem);
       
    }
 
    public void mostrarStatusGuerreiro1(){
        String mensagem = "Nome do guerreiro: " +nomeDoGuerreiro1+" | Classe: "+classeDoGuerreiro1+" | Nivel: "+nivelDoGuerreiro1+ " | Forca: "+forcaDoGuerreiro1+ " | Mana: "+manaDoGuerreiro1;
        String personagem = 
        "  O  \n" +
      " /|\\ \n" +
      "  |   --|>\n" +
      " / \\ \n";
    

                  
        System.out.println(mensagem);
        System.out.println(personagem);
       
    }
 
    public void subirNivelGuerreiro1(){
        nivelDoGuerreiro1 += 1;
        vidaDoGuerreiro1 += 10;
        if (vidaDoGuerreiro1 > 100){
            vidaDoGuerreiro1 = 100;
        }
        manaDoGuerreiro1 += 50;
        forcaDoGuerreiro1 +=10;

        String mensagem = "Nivel do guerreiro: "+nivelDoGuerreiro1+ "\nVida do guerreiro:"+vidaDoGuerreiro1;
        System.out.println(mensagem);
    }
 


    // Metodos Arqueiro
    public void ataqueArqueiro(){
        vidaDoGuerreiro1 -= 10;

        String mensagem = "Ataque de flexa = 10 \nVida do guerreiro depois do ataque = "+vidaDoGuerreiro1;
        System.out.println(mensagem);
    } 
 
    public void receberDanoArqueiro(){
        vidaDoArqueiro -= 10;

       String mensagem = "Ataque do guerrreiro = 10 \nVida do arqueiro depois do ataque = "+vidaDoArqueiro;
        System.out.println(mensagem);
    }
   
    public void usarHabilidadeEspecialArqueiro(){

        vidaDoGuerreiro1 -=30;
        manaDoArqueiro -=50;

       String mensagem = " Ataque especial (Multiplas flexas)= 30  \nVida do guerreiro depois do ataque = "+vidaDoGuerreiro1;
       System.out.println(mensagem);
       
    }
 
    public void mostrarStatusArqueiro(){
        String mensagem = "Nome do arqueiro: " +nomeDoArqueiro+" | Classe: "+classeDoArqueiro+" | Nivel: "+nivelDoArqueiro+ " | Forca: "+forcaDoArqueiro+ " | Mana: "+manaDoArqueiro;
        String personagemA = 
      "  O  \n" +
      " /|\\ \n" +
     "  |}====> \n "+
      "/ \\ \n";
    
        System.out.println(mensagem);
        System.out.println(personagemA);


       
    }
 
    public void subirNivelArqueiro(){
        nivelDoArqueiro += 1;
        vidaDoArqueiro += 10;
        if (vidaDoArqueiro > 100){
            vidaDoArqueiro = 100;
        }
        manaDoArqueiro += 50;
        forcaDoArqueiro +=10;

        String mensagem = "Nivel do arqueiro: "+nivelDoArqueiro+ "\nVida do arqueiro:"+vidaDoArqueiro;
        System.out.println(mensagem);
    }

}
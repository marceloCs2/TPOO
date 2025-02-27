package Personagem;

import Armas.Arma_IF;
import jogomodelado2.InOut;

public class Personagens {
    protected Arma_IF arma;
    public int vida = 100;
    public String nome;
    
    public void setNome(String nome){
       this.nome = nome; 
    }
    
    public String getNome(){
      return this.nome;
    }
   
   public String desenhar() {
    return "Desenhando personagem";
}
    
    protected void falar() { 
        InOut.MsgDeInformacao("Fala", "O personagem está falando");
    }
    
    public void arma() { 
        arma.usarArma();
    }
    
    public void setArma(Arma_IF armaSelecionada) {
        if (canHandleGuns()) {
            this.arma = armaSelecionada;
            InOut.MsgDeInformacao("Arma", "Arma foi equipada");
        } else {
            InOut.MsgDeErro("Erro", "O personagem não pode usar armas");
        }
    }
    
    public Arma_IF getArma() {
    return this.arma;
}
    
    public void correr() { 
        if (canRun()) {
            InOut.MsgDeInformacao("Ação", "O personagem está correndo");
        } else {
            InOut.MsgDeErro("Erro", "O personagem não pode correr");
        }
    }
     
    public void tomarDano(int dano) {
        this.vida -= dano;
    }
     
    public void soltarFogo() {
        if (podeSoltarFogo()) {
            InOut.MsgDeInformacao("Ação", "O personagem soltou fogo...");
        } else {
            InOut.MsgDeErro("Erro", "O personagem não pode soltar fogo");
        }
    }
      
    public void morrer() {
        if (this.vida <= 0) {
            InOut.MsgDeInformacao("Morte", "O personagem morreu");
        }
    }
    
    public void voar() {
        if (this.vida <= 0 && canFly()) {
            InOut.MsgDeInformacao("Voar", "O personagem abriu voo");
        }
    }
    
    public void darSoco() {
        if (this.vida <= 0 && canHandleGuns() == false) {
            InOut.MsgDeInformacao("darSoco", "O personagem socou o adversário");
        }
    }
    
    public void teleportar() { 
        if (canTeleport()) {
            InOut.MsgDeInformacao("Ação", "O personagem desapareceu");
        } else {
            InOut.MsgDeErro("Erro", "O personagem não pode teleportar");
        }
    }
    
    
   public boolean canTeleport() {
        return false;
   }
   public boolean canFly() {
        return false;
    }
      
    public boolean canRun() {
        return false;
    }
      
    public boolean podeSoltarFogo() {
        return false;
    }
        
    public boolean canHandleGuns() {
        return false;
    }
}
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package jogomodelado2;
import Armas.Arma_IF;
import Armas.Revolver;
import Armas.Fuzil;
import Armas.Desarmado;
import Armas.Faca;
import Personagem.Personagens;
import Personagem.Soldado;
import Personagem.General;
import Personagem.Dragao;
import Personagem.LutSumo;
import Personagem.Mago;
import Inimigos.Inimigo;


public class JogoModelado2 {
     public static void main(String[] args) {
         Personagens jogador = null;
        String personagemEscolhido = InOut.leString("Escolha um personagem digitando: (1 - Soldado, 2 - General, 3 - Dragao, 4- LutSumo, 5- Mago): ");

        switch (personagemEscolhido) {
            case "1":
                jogador = new Soldado();
                jogador.setNome("Soldado");
                break;
            case "2":
                jogador = new General();
                jogador.setNome("General");
                break;
                
             case "3":
                jogador = new Dragao();
                jogador.setNome("Dragao");
                break;
             case "4":
                jogador = new LutSumo();
                jogador.setNome("Lutador de Sumo");
                break;
             case "5":
                jogador = new Mago();
                jogador.setNome("Mago");
                break;
            default:
                InOut.MsgDeErro("Erro", "Insira apenas 1, 2, 3, 4 ou 5 para escolher o personagem.");
                return;
        }
        
        
         String armaEscolhida = InOut.leString("Escolha uma arma (1 - Fuzil, 2 - Revolver, 3 - Faca, 4 - Ficar desarmado): ");
        switch (armaEscolhida) {
            case "1":
                jogador.setArma(new Fuzil());
                break;
            case "2":
                jogador.setArma(new Revolver());
                break;
             case "3":
                jogador.setArma(new Faca());
                break;
              case "4":
                jogador.setArma(new Desarmado());
                break;
            default:
                InOut.MsgDeErro("Erro", "Arma inválida! Nenhuma arma foi equipada.");
                return;
        }

     
        Inimigo inimigo = new Inimigo();

     
        while (jogador.vida > 0 && inimigo.getVida() > 0)
        {
            InOut.MsgDeInformacao("Status", jogador.nome + " tem " + jogador.vida + " de vida." + jogador.desenhar() );
            InOut.MsgDeInformacao("Status", "Inimigo tem " + inimigo.getVida() + " de vida." + inimigo.desenhar());

           String acao = InOut.leString("Escolha uma ação (1 - Atacar, 2 - Correr, 3 - Soltar Fogo, 4 - Voar, 5 - Socar, 6 - Teleportar): ");
            switch (acao) {
                case "1":
                    if(jogador.canHandleGuns() && !(jogador.getArma() instanceof Desarmado)&& !(jogador.getArma() instanceof Faca)){
                    jogador.arma();
                    inimigo.tomarDano(50); 
                    InOut.MsgDeInformacao("Ação", jogador.nome + " atacou o inimigo e causou 50 de dano!");
                     break;
                    }
                    else if (jogador.getArma() instanceof Faca){
                    jogador.arma();
                    inimigo.tomarDano(30); 
                    InOut.MsgDeInformacao("Ação", jogador.nome + " esfaqueou o inimigo e causou 30 de dano!");
                     break;
                    }
                    else if (jogador.getArma() instanceof Desarmado){
                    jogador.arma();
                    inimigo.tomarDano(0); 
                    InOut.MsgDeInformacao("Ação", jogador.nome + " nao conseguiu causar dano!");
                     break;
                    }
                    else{
                    InOut.MsgDeInformacao("Ação", jogador.nome + " tentou atacar, mas ele não possui armas!");
                    break;
                    }
                case "2":
                    jogador.correr();
                    if(jogador.canRun()){
                     InOut.MsgDeInformacao("Ação", jogador.nome + " correu e fugiu da batalha!");
                     return;
                    }
                    else{
                    InOut.MsgDeInformacao("Ação", jogador.nome + " tentou correr, mas ele não consegue!");
                    break; 
                    }
                case "3":
                    jogador.soltarFogo();
                    if(jogador.podeSoltarFogo()){
                     inimigo.tomarDano(70); 
                     InOut.MsgDeInformacao("Ação", jogador.nome + " soltou fogo no inimigo e causou 70 de dano!");
                     break;
                    }
                    else{
                    InOut.MsgDeInformacao("Ação", jogador.nome + " tentou soltar fogo mas ele não pode!");
                    break;
                    }
                case "4":
                    jogador.voar();
                    if(jogador.canFly()){
                     InOut.MsgDeInformacao("Ação", jogador.nome + " Saiu voando e fugiu da batalha!");
                     return;
                    }
                    else{
                    InOut.MsgDeInformacao("Ação", jogador.nome + " tentou voar, mas isso não é possível!");
                    break;
                    }
                    
                     case "5":
                    jogador.darSoco();
                    if(jogador.canHandleGuns() == false){
                     InOut.MsgDeInformacao("Ação", jogador.nome + " socou o inimigo e causou 40 de dano!");
                      inimigo.tomarDano(40);
                     break;
                    }
                    else{
                    InOut.MsgDeInformacao("Ação", jogador.nome + " tentou socar, mas isso não é possível!");
                    break;
                    }
                    
                    case "6":
                    jogador.teleportar();
                    if(jogador.canTeleport()){
                     InOut.MsgDeInformacao("Ação", jogador.nome + " desapareceu e fugiu da batalha!");
                     return;
                    }
                    else{
                    InOut.MsgDeInformacao("Ação", jogador.nome + " tentou teleportar, mas isso não é possível!");
                    break;
                    }
                default:
                    InOut.MsgDeErro("Erro", "Ação inválida!");
                    break;
            }

         
            if (inimigo.getVida() > 0) {
                inimigo.atacar(jogador);
            }

         
            if (jogador.vida <= 0) {
                jogador.morrer();
                InOut.MsgDeAviso("Fim de Jogo", "Você foi derrotado pelo inimigo.");
            }
            if (inimigo.getVida() <= 0) {
                InOut.MsgDeInformacao("Vitória", "Você derrotou o inimigo!");
            }
        }
    }
}

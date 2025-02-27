
package Inimigos;
import Personagem.Personagens;
import jogomodelado2.InOut;

public class Inimigo {
    private int vida = 100;
    private int dano = 20;
    
   public void atacar(Personagens personagem) {
        personagem.tomarDano(dano);
        InOut.MsgDeInformacao("Ataque", "O inimigo atacou " + personagem.nome + " e deu " + dano + " de dano");

        if (personagem.vida <= 0) {
            InOut.MsgDeInformacao("Morte", "O inimigo matou o " + personagem.nome);
        }
    }
   
    public int getVida() {
        return vida;
    }
    
    public void tomarDano(int dano) {
        this.vida -= dano;
    }
    
 public String desenhar() {
    return 
        "                            ,-.\n" +
"       ___,---.__          /'|`\\          __,---,___\n" +
"    ,-'    \\`    `-.____,-'  |  `-.____,-'    //    `-.\n" +
"  ,'        |           ~'\\     /`~           |        `.\n" +
" /      ___//              `. ,'          ,  , \\___      \\\n" +
"|    ,-'   `-.__   _         |        ,    __,-'   `-.    |\n" +
"|   /          /\\_  `   .    |    ,      _/\\          \\   |\n" +
"\\  |           \\ \\`-.___ \\   |   / ___,-'/ /           |  /\n" +
" \\  \\           | `._   `\\\\  |  //'   _,' |           /  /\n" +
"  `-.\\         /'  _ `---'' , . ``---' _  `\\         /,-'\n" +
"     ``       /     \\    ,='/ \\`=.    /     \\       ''\n" +
"             |__   /|\\_,--.,-.--,--._/|\\   __|\n" +
"             /  `./  \\\\`\\ |  |  | /,//' \\,'  \\\n" +
"eViL        /   /     ||--+--|--+-/-|     \\   \\\n" +
"           |   |     /'\\_\\_\\ | /_/_/`\\     |   |\n" +
"            \\   \\__, \\_     `~'     _/ .__/   /\n" +
"             `-._,-'   `-._______,-'   `-._,-'";
}
}

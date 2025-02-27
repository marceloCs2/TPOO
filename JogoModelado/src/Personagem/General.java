/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Personagem;

import jogomodelado2.InOut;

public class General extends Personagens{
    
      public String nome = "General";
      
     @Override
      public boolean canHandleGuns() {
        return true;
    }
      
    @Override
    public boolean canRun() {
        return true;
    }
    
   public String desenhar() {
    return 
 "    _.-----._\n" +
"   _'    '    '_\n" +
"  '_____________'\n" +
"      | +_+ |\n" +
"  ==--'_D__,'---==.\n" +
" /    > \\_/ <     |\n" +
"/  >__\\o_| o/     |\n" +
"|      | |_/    , |\n" +
"\\,_____/_)  o   | |\n" +
"   |   o '  o   | |\n" +
"   |   o |  o   |_/|\n" +
"   '   o |  o   '  |\n" +
"   |   o |  o   |_/\n" +
"   |   o |  o   |))\n" +
"   |     |      |\n" +
"   |     \\      |\n" +
"   |___o/ \\_____|\n" +
"     |   |   |\n" +
"   __)  >|<  (__\n" +
"  (____,_|_,____)";
}
    }



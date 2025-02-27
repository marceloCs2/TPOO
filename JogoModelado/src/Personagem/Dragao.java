/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Personagem;

import jogomodelado2.InOut;

public class Dragao extends Personagens{
     @Override
    public boolean podeSoltarFogo() {
        return true;
    }
      
    
   @Override
public String desenhar() {
    return 
 "             __====-_  _-====__\n" +
"       _--^^^#####//      \\\\#####^^^--_\n" +
"    _-^##########// (    ) \\\\##########^-_\n" +
"   -############//  |\\^^/|  \\\\############-\n" +
" _/############//   (@::@)   \\\\############\\_\n" +
"/#############((     \\\\//     ))#############\\\n" +
"-###############\\\\    (oo)    //###############-\n" +
"-#################\\\\  / \"\" \\  //#################-\n" +
"-###################\\\\/  |  \\//###################-\n" +
"_#/|##########/\\######(   ||   )######/\\##########|\\#_\n" +
"|/ |#/\\#/\\#/\\/  \\#/\\#|   ||   |/\\#/\\#/  \\/\\#/\\#/\\#| \\|";
}
    
     @Override
    public boolean canFly() {
        return true;
    }
}

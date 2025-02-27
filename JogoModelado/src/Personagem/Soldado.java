/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Personagem;

import jogomodelado2.InOut;

public class Soldado extends Personagens{
     
    public String nome = "Soldado";
   
     @Override
      public boolean canHandleGuns() {
        return true;
    }
      
      @Override
    public boolean canRun() {
        return true;
    }
    
    @Override
public String desenhar() {
    return
"      ______\n" +
"                   <((((((\\\\\\\n" +
"                   /      . }\\\n" +
"                   ;--..--._|}\n" +
"(\\                 '--/\\--'  )\n" +
" \\\\                | '-'  :'|\n" +
"  \\\\               . -==- .-|\n" +
"   \\\\               \\.__.'   \\--._\n" +
"   [\\\\          __.--|       //  _/'--.\n" +
"   \\ \\\\       .'-._ ('-----'/ __/      \\\n" +
"    \\ \\\\     /   __>|      | '--.       |\n" +
"     \\ \\\\   |   \\   |     /    /       /\n" +
"      \\ '\\ /     \\  |     |  _/       /\n" +
"       \\  \\       \\ |     | /        /\n" +
"        \\  \\      \\        /";
}
}

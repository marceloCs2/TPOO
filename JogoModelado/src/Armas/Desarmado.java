/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Armas;
import jogomodelado2.InOut;

public class Desarmado extends Arma_IF {
   @Override
   public void usarArma() {
       
        InOut.MsgDeInformacao("Arma", "O personagem está desarmado...");
    
   }
}


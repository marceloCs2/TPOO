/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Personagem;

/**
 *
 * @author danil
 */
public class Mago extends Personagens{
    
    @Override
    public boolean podeSoltarFogo() {
        return true;
    }
    @Override
    public boolean canTeleport() {
        return true;
   }
    
       @Override
public String desenhar() { 
    return
             "                                  ....\n" +
"                                .'' .'''\n" +
".                             .'   :\n" +
"\\\\                          .:    :\n" +
" \\\\                        _:    :       ..----.._\n" +
"  \\\\                    .:::.....:::.. .'         ''.\n" +
"   \\\\                 .'  #-. .-######'     #        '.\n" +
"    \\\\                 '.##'/ ' ################       :\n" +
"     \\\\                  #####################         :\n" +
"      \\\\               ..##.-.#### .''''###'.._        :\n" +
"       \\\\             :--:########:            '.    .' :\n" +
"        \\\\..__...--.. :--:#######.'   '.         '.     :\n" +
"        :     :  : : '':'-:'':'::        .         '.  .'\n" +
"        '---'''..: :    ':    '..'''.      '.        :'\n" +
"           \\\\  :: : :     '      ''''''.     '.      .:\n" +
"            \\\\ ::  : :     '            '.      '      :\n" +
"             \\\\::   : :           ....' ..:       '     '.\n" +
"              \\\\::  : :    .....####\\\\ .~~.:.             :\n" +
"               \\\\':.:.:.:'#########.===. ~ |.'-.   . '''.. :\n" +
"                \\\\    .'  ########## \\ \\ _.' '. '-.       '''.\n" +
"                :\\\\  :     ########   \\ \\      '.  '-.        :\n" +
"               :  \\\\'    '   #### :    \\ \\      :.    '-.      :\n" +
"              :  .'\\\\   :'  :     :     \\ \\       :      '-.    :\n" +
"             : .'  .\\\\  '  :      :     :\\ \\       :        '.   :\n" +
"             ::   :  \\\\'  :.      :     : \\ \\      :          '. :\n" +
"             ::. :    \\\\  : :      :    ;  \\ \\     :           '.:\n" +
"              : ':    '\\\\ :  :     :     :  \\:\\     :        ..'\n" +
"                 :    ' \\\\ :        :     ;  \\|      :   .'''\n" +
"                 '.   '  \\\\:                         :.''\n" +
"                  .:..... \\\\:       :            ..''\n" +
"                 '._____|'.\\\\......'''''''.:..'''\n" +
"                            \\\\";
}
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package contador01;

/**
 *
 * @author sando
 */
public class Contador01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /*int cc = 1;
        while(cc<=20){   //Estrutura de repetição while
            System.out.println("Cambalhota " + cc);
            cc++;
        }*/
         int cc =0;
        while(cc<=10){
            cc++;
            if (cc==2 || cc==3 || cc==4){
                continue; // modifica o fluxo do laço, retornando para o laço
            }
            if (cc==7){
                break; // modifica parando o laço e saindo do laço.
            }
            System.out.println("Cambalhota " + cc); 
            
        }
    }
    
}

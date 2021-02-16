/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exerciciorepita;

import javax.swing.JOptionPane;

/**
 *
 * @author sando
 */
public class ExercicioRepita {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int n, s = 0, totPar=-1,totImpar=0,mCem=0;
        double m ;
        int cont = 0;
       
        
      
       
        do{ 
         n = Integer.parseInt(JOptionPane.showInputDialog(null, 
                 "<html>Informar um número: <br><em>(Valor 0 interrompe</html>"));
         
         
        if (n>0){
        s += n;
        cont++;
        }
        if (n>=100){
           mCem++;
        } 
        if(n%2==0){ 
            totPar++;
          
        }else{
            totImpar++;
        }
       
         
    } while(n !=0);
         m = s/cont;
         JOptionPane.showMessageDialog(null,"<html> Resultado <hr>" + 
                 "<br>Total Soma dos Valores: " + s + 
                 "<br>Total Quantidade: " + cont +
                 "<br>Total de Pares: " + totPar + 
                 "<br>Total de impares :" + totImpar + 
                 "<br>Acima de 100: " + mCem + 
                 "<br>Média dos valores: " + m + 
                 "</html> ");
         
    }
}

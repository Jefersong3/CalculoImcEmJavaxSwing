
package somaimc;

import javax.swing.JOptionPane;
/**
 *
 * @author jefg3
 */
public class SomaImc {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      
        int peso;
        float altura;
        float imc;
        String resp;
        String resul;
        
       resp = JOptionPane.showInputDialog("Digite seu Peso: ");
       peso = Integer.parseInt(resp);
       
       resp = JOptionPane.showInputDialog("Digite sua Altura: ");
       altura = Float.parseFloat(resp);
       
       imc = peso/(altura*altura);
       
       if (imc <= 19)
         resul = "Abaixo do Peso";
      else
         if (imc <= 25)
            resul = "Peso ideal";
         else
            if (imc <= 30)
               resul = "Acima do Peso";
            else
               if (imc <= 35)
                  resul = "Obesidade Leve";
               else
                  resul = "Obesidade";
         
       JOptionPane.showMessageDialog(null, "Seu IMC é: "+imc+ " "+resul);
        
       
      
    }
    
}

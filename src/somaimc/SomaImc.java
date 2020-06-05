
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
        
       resp = JOptionPane.showInputDialog("Digite seu Peso: ");
       peso = Integer.parseInt(resp);
       
       resp = JOptionPane.showInputDialog("Digite sua Altura: ");
       altura = Float.parseFloat(resp);
       
       imc = peso/(altura*altura);
         
       JOptionPane.showMessageDialog(null, "Seu IMC é: "+imc);
        
       
      
    }
    
}

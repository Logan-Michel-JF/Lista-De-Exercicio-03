import javax.swing.JOptionPane;

public class Ex03L3{

    public static void main(String[] args){

        int contador = 0;

        double peso = Double.parseDouble(JOptionPane.showInputDialog("Digite seu Peso: ")); 
            while (peso > 0 && peso < 300){
                peso = Double.parseDouble(JOptionPane.showInputDialog("Digite seu Peso: "));
            contador += 1;
    
        }
        JOptionPane.showMessageDialog(null, "Quantidade: " + contador);
    }

}
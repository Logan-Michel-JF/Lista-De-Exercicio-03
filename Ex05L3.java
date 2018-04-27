import javax.swing.JOptionPane;

public class Ex05L3{

    public static void main(String[] args){

        int numero1 = Integer.parseInt(JOptionPane.showInputDialog("Digite seu Número: "));
        int numero2 = Integer.parseInt(JOptionPane.showInputDialog("Digite seu Segundo Número: "));
        String sair = "";

        int opcao = Integer.parseInt(JOptionPane.showInputDialog("Escolha um número: \n1- Somar \n2- Subtrair \n3- Multiplicar \n4- Dividir \n5- Sair"));

        while (opcao != 5){

            if (opcao == 1){
                JOptionPane.showMessageDialog(null, numero1 + numero2);
            }else if(opcao == 2){
                JOptionPane.showMessageDialog(null, numero1 - numero2);
            }else if(opcao == 3){
                JOptionPane.showMessageDialog(null, numero1 * numero2);
            }else if(opcao == 4){
                JOptionPane.showMessageDialog(null, numero1 / numero2);
            }
            opcao = Integer.parseInt(JOptionPane.showInputDialog("Escolha um número: \n1- Somar \n2- Subtrair \n3- Multiplicar \n4- Dividir \n5- Sair"));

        }
    }
}
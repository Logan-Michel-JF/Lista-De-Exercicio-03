import javax.swing.JOptionPane;

public class Ex01L3{

    public static void main(String[] args){

        String nome = JOptionPane.showInputDialog(null, "Digte seu Nome: ");
            while ( !nome.equalsIgnoreCase("Sair")){
                nome = JOptionPane.showInputDialog(null, "Digite seu Nome: ");
        }
    }
}
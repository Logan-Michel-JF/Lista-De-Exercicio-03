import javax.swing.JOptionPane;

public class Ex02L3{

    public static void main(String[] args){

        int idade = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite sua Idade: "));
            while ( idade < 128){
                idade = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite sua Idade: "));
        }        
    }
}
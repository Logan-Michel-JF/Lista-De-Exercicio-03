import javax.swing.JOptionPane;

public class Ex04L3{

    public static void main(String[] args){

        int contador = 0;
        int carros = Integer.parseInt(JOptionPane.showInputDialog("Quantidade de Carros que Deseja Cadastrar? "));
        int somaAno = 0;
        double somaValor = 0;
        int quantidadeDeCarrosG = 0;
        int quantidadeDeCarrosA = 0;
        while (contador < carros ){
            
            String modelo = JOptionPane.showInputDialog( "Este é um cadastro de um novo carro.\nModelo: ");
            double valor = Double.parseDouble(JOptionPane.showInputDialog( "Valor: "));
            int ano = Integer.parseInt(JOptionPane.showInputDialog("Ano: "));
            contador = contador + 1;
            somaAno = somaAno + ano;
            somaValor = somaValor + valor;
        
        char letra = modelo.charAt (0);
            if (letra == 'G' || letra == 'g'){
                quantidadeDeCarrosG = quantidadeDeCarrosG + 1;
            }else if (letra == 'A' || letra == 'a'){
                quantidadeDeCarrosA = quantidadeDeCarrosA + 1;
            }

        }
        
            double media = somaAno / contador;
            double mediaValor = somaValor / contador;

        JOptionPane.showMessageDialog(null, 
        "Media do Ano: " + media + 
        "\nValor da Media: " + mediaValor +
        "\nQuantidade de Carros com G. " + quantidadeDeCarrosG +
        "\nQUantidade de Carros com A. " + quantidadeDeCarrosA);
    } 
}
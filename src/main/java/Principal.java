import javax.swing.JOptionPane;      

public class Principal {

    public static void main(String[] args) {
        int conta = 0;
        int soma = 0;
        int n = Integer.parseInt(JOptionPane.showInputDialog("Digite um número positivo ou -1 para sair"));
        while (n > 0){
            soma = soma + n;
            conta = conta + 1;
        n = Integer.parseInt(JOptionPane.showInputDialog("Digite um número positivo ou -1 para sair"));
    }
        JOptionPane.showMessageDialog(null, "A soma é: " + soma);
        JOptionPane.showMessageDialog(null, "A contagem de números é: " + conta);
    }
}
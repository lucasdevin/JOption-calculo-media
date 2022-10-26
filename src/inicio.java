import javax.swing.JOptionPane;

public class inicio {

    public static void main(String[] args) {

        String valor1 = JOptionPane.showInputDialog("Digite um valor : ");
        String valor2 = JOptionPane.showInputDialog("Digite outro valor : ");

        double valor1Double = Double.parseDouble(valor1);
        double valor2Double = Double.parseDouble(valor2);

        double media = (valor1Double + valor2Double)/ 2;

        JOptionPane.showMessageDialog(null, "A media é : " + media);
    }
}

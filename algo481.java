import javax.swing.JOptionPane;

public class algo481 {
     public static void main(String[] args) {
        int num = Integer.parseInt(JOptionPane.showInputDialog("Digite um número inteiro não negativo:"));
        while (num < 0) {
            num = Integer.parseInt(JOptionPane.showInputDialog("Número inválido. Digite um número inteiro não negativo:"));
        }
        int base = Integer.parseInt(JOptionPane.showInputDialog("Digite a base para a qual deseja converter o número (entre 2 e 10):"));
        while (base < 2 || base > 10) {
            base = Integer.parseInt(JOptionPane.showInputDialog("Base inválida. Digite a base para a qual deseja converter o número (entre 2 e 10):"));
        }
        String resultado = converterParaBase(num, base);
        JOptionPane.showMessageDialog(null, "Número em base " + base + ": " + resultado);
    }

    public static String converterParaBase(int num, int base) {
        StringBuilder sb = new StringBuilder();
        while (num > 0) {
            int resto = num % base;
            sb.append(resto);
            num /= base;
        }
        return sb.reverse().toString();
    }
}


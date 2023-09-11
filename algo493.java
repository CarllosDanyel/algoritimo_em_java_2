import javax.swing.JOptionPane;

public class algo493 {
      public static void main(String[] args) {
        int[] vetor = new int[10];
        int tamanho = 10;
        for (int i = 0; i < tamanho; i++) {
            vetor[i] = Integer.parseInt(JOptionPane.showInputDialog("Digite o número " + (i + 1) + ":"));
        }
        int resultado = verificarOrdenacao(vetor, tamanho);
        if (resultado == 1) {
            JOptionPane.showMessageDialog(null, "ORDENAÇÃO CRESCENTE");
        } else if (resultado == 2) {
            JOptionPane.showMessageDialog(null, "ORDENAÇÃO DECRESCENTE");
        } else {
            JOptionPane.showMessageDialog(null, "NÃO ESTÁ ORDENADO OU nUMERO FOI DIGITALIZADO ERRADO");
        }
    }

    public static int verificarOrdenacao(int[] vetor, int tamanho) {
        boolean crescente = true;
        boolean decrescente = true;
        for (int i = 0; i < tamanho - 1; i++) {
            if (vetor[i] > vetor[i + 1]) {
                crescente = false;
            }
            if (vetor[i] < vetor[i + 1]) {
                decrescente = false;
            }
        }
        if (crescente) {
            return 1;
        } else if (decrescente) {
            return 2;
        } else {
            return 0;
        }
    }
}


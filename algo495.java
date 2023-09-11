import javax.swing.JOptionPane;

public class algo495 {
    public static void main(String[] args) {
        String[] vetor = new String[5];
        int tamanho = 5;
        for (int i = 0; i < tamanho; i++) {
            vetor[i] = JOptionPane.showInputDialog("Digite o nome " + (i + 1) + ":");
        }
        ordena(vetor, tamanho);
        System.out.println("\nNOMES ORDENADOS\n");
        for (int i = 0; i < tamanho; i++) {
            System.out.println((i + 1) + " - " + vetor[i]);
        }
    }

    public static void ordena(String[] vetor, int tamanho) {
        for (int i = 0; i < tamanho - 1; i++) {
            for (int j = i + 1; j < tamanho; j++) {
                if (vetor[i].compareTo(vetor[j]) > 0) {
                    String aux = vetor[i];
                    vetor[i] = vetor[j];
                    vetor[j] = aux;
                }
            }
        }
    }
}

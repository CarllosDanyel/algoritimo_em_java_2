import javax.swing.JOptionPane;

public class algo490 {
 public static void main(String[] args) {
        String[] vetor = new String[10];
        int tamanho = 10;
        char caractere = 'o';
        for (int i = 0; i < tamanho; i++) {
            vetor[i] = JOptionPane.showInputDialog("Digite a palavra " + (i + 1) + ":");
        }
        int totalRetirados = retirarCaractere(vetor, tamanho, caractere);
        JOptionPane.showMessageDialog(null, "VETOR\n" + imprimirVetor(vetor, tamanho) + "\nTotal de caracteres retirados: " + totalRetirados);
    }

    public static int retirarCaractere(String[] vetor, int tamanho, char caractere) {
        int totalRetirados = 0;
        for (int i = 0; i < tamanho; i++) {
            String palavra = vetor[i];
            for (int j = 0; j < palavra.length(); j++) {
                if (palavra.charAt(j) == caractere) {
                    vetor[i] = palavra.substring(0, j) + "*" + palavra.substring(j + 1);
                    totalRetirados++;
                }
            }
        }
        return totalRetirados;
    }

    public static String imprimirVetor(String[] vetor, int tamanho) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < tamanho; i++) {
            sb.append(i + 1).append(" - ").append(vetor[i]).append("\n");
        }
        return sb.toString();
    }
}    
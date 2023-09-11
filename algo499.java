import javax.swing.JOptionPane;

public class algo499 {
    public static void main(String[] args) {
    int[] vetor = new int[5];
    int opcao = 0;
    boolean dadosInseridos = false;
    do {
      opcao = Integer.parseInt(JOptionPane.showInputDialog("MENU VETOR - FUNCAO\n1. Dados do VETOR\n2. Ordena VETOR\n3. Imprime VETOR\n4. Sai do programa\nOPCAO:"));
      switch (opcao) {
        case 1:
          entrada(vetor, 5);
          dadosInseridos = true;
          break;
        case 2:
          if (dadosInseridos) {
            ordena(vetor, 5);
          } else {
            JOptionPane.showMessageDialog(null, "Escolha primeiro opcao 1");
          }
          break;
        case 3:
          if (dadosInseridos) {
            JOptionPane.showMessageDialog(null, "VETOR\n" + toString(vetor, 5));
          } else {
            JOptionPane.showMessageDialog(null, "Escolha primeiro opcao 1");
          }
          break;
        case 4:
          JOptionPane.showMessageDialog(null, "Saindo do algoritmo");
          break;
        default:
          JOptionPane.showMessageDialog(null, "Opcao invalida");
          break;
      }
    } while (opcao != 4);
  }
  
  public static void entrada(int[] vetor, int tamanho) {
    for (int i = 0; i < tamanho; i++) {
      String entrada = JOptionPane.showInputDialog("Digite o numero " + (i+1) + ":");
      vetor[i] = Integer.parseInt(entrada);
    }
  }
  
  public static void ordena(int[] vetor, int tamanho) {
    for (int i = 0; i < tamanho - 1; i++) {
      for (int j = i + 1; j < tamanho; j++) {
        if (vetor[i] > vetor[j]) {
          int temp = vetor[i];
          vetor[i] = vetor[j];
          vetor[j] = temp;
        }
      }
    }
  }
  
  public static String toString(int[] vetor, int tamanho) {
    String resultado = "";
    for (int i = 0; i < tamanho; i++) {
      resultado += (i+1) + "- " + vetor[i] + "\n";
    }
    return resultado;
  }
}


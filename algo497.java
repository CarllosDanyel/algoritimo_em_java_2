import javax.swing.JOptionPane;

public class algo497 {
        public static void main(String[] args) {
          int[] numeros = new int[10];
          for (int i = 0; i < numeros.length; i++) {
            String entrada = JOptionPane.showInputDialog("Digite o número " + (i+1) + ":");
            numeros[i] = Integer.parseInt(entrada);
          }
          String busca = JOptionPane.showInputDialog("Digite o número a ser buscado:");
          int chave = Integer.parseInt(busca);
          ordena(numeros);
          int posicao = buscaBinaria(numeros, numeros.length, chave);
          if (posicao >= 0) {
            JOptionPane.showMessageDialog(null, "Posição no vetor: " + posicao);
          } else {
            JOptionPane.showMessageDialog(null, "Não encontrado");
          }
          JOptionPane.showMessageDialog(null, "VETOR\n" + toString(numeros));
        }
        
        public static void ordena(int[] vetor) {
          for (int i = 0; i < vetor.length - 1; i++) {
            for (int j = i + 1; j < vetor.length; j++) {
              if (vetor[i] > vetor[j]) {
                int temp = vetor[i];
                vetor[i] = vetor[j];
                vetor[j] = temp;
              }
            }
          }
        }
        
        public static int buscaBinaria(int[] vetor, int tamanho, int chave) {
          int inicio = 0;
          int fim = tamanho - 1;
          while (inicio <= fim) {
            int meio = (inicio + fim) / 2;
            if (vetor[meio] == chave) {
              return meio;
            } else if (vetor[meio] < chave) {
              inicio = meio + 1;
            } else {
              fim = meio - 1;
            }
          }
          return -1;
        }
        
        public static String toString(int[] vetor) {
          String resultado = "";
          for (int i = 0; i < vetor.length; i++) {
            resultado += (i+1) + "- " + vetor[i] + "\n";
          }
          return resultado;
        }
      }
    

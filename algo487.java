public class algo487 {
    public static void inverteVetor(int[] vetor, int tamanho) {
        for (int i = 0; i < tamanho / 2; i++) {
            int temp = vetor[i];
            vetor[i] = vetor[tamanho - i - 1];
            vetor[tamanho - i - 1] = temp;
        }
    }

public static void main(String[] args) {
    int[] vetor = {23, 45, 67, 89, 12, 13, 14, 15, 16, 17};
    int tamanho = 10;
    inverteVetor(vetor, tamanho);
    System.out.println("VETOR");
    for (int i = 0; i < tamanho; i++) {
        System.out.println((i + 1) + " - " + vetor[i]);
    }
}
}


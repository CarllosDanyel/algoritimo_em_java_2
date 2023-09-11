public class algo483 {
    public static int produtoInterno(int[] vetor1, int[] vetor2, int tamanho) {
        int produtoInterno = 0;
        for (int i = 0; i < tamanho; i++) {
            produtoInterno += vetor1[i] * vetor2[i];
        }
        return produtoInterno;
    }

public static void main(String[] args) {
    int[] vetor1 = {2, 3, 4, 5};
    int[] vetor2 = {1, 2, 3, 4};
    int tamanho = 4;
    int resultado = produtoInterno(vetor1, vetor2, tamanho);
    System.out.println("Produto interno: " + resultado);
}
}




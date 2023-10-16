package Hash;

public class InsercaoComparador {
    public static void main(String[] args) {
        int tamanhoDaHash = 10000; // Tamanho da hash
        HashLista hashLista = new HashLista(tamanhoDaHash);
        HashLista hashListaAlternativa = new HashLista(tamanhoDaHash);

        // Medindo o tempo de execução da função inserir da HashLista original
        long inicioOriginal = System.nanoTime();
        for (int i = 0; i < tamanhoDaHash; i++) {
            String nome = "Aluno" + i;
            int nota = i;
            hashLista.inserir(nome, nota);
        }
        long fimOriginal = System.nanoTime();
        long tempoOriginal = (fimOriginal - inicioOriginal) / 1000000; // Tempo em milissegundos

        // Medindo o tempo de execução da função inserir da HashLista alternativa
        long inicioAlternativa = System.nanoTime();
        for (int i = 0; i < tamanhoDaHash; i++) {
            String nome = "Aluno" + i;
            int nota = i;
            hashListaAlternativa.inserir(nome, nota);
        }
        long fimAlternativa = System.nanoTime();
        long tempoAlternativa = (fimAlternativa - inicioAlternativa) / 1000000; // Tempo em milissegundos

        System.out.println("Tempo da função inserir da HashLista original: " + tempoOriginal + " ms");
        System.out.println("Tempo da função inserir da HashLista alternativa: " + tempoAlternativa + " ms");

        // Você pode comparar os tempos e tomar decisões com base nos resultados.
    }
}


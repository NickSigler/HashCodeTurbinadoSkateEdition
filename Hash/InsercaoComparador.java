package Hash;

public class InsercaoComparador {
    public static void main(String[] args) {
        int tamanhoDaHash = 10000;
        HashLista hashLista = new HashLista(tamanhoDaHash);
        HashSoldagemLinear hashListaAlternativa = new HashSoldagemLinear(tamanhoDaHash);
        for (int i = 0; i < tamanhoDaHash; i++) {
            String nome = "Aluno" + i;
            int nota = i;
            hashLista.inserir(nome, nota);
        }
        for (int i = 0; i < tamanhoDaHash; i++) {
            String nome = "Aluno" + i;
            int nota = i;
            hashLista.inserir(nome, nota);
        }

        long inicioOriginal = System.nanoTime();

        hashLista.buscar(54, "Aluno");

        long fimOriginal = System.nanoTime();
        long tempoOriginal = (fimOriginal - inicioOriginal) / 1000000;
        //
        long inicioAlternativa = System.nanoTime();

        hashListaAlternativa.buscar(54, "Aluno");

        long fimAlternativa = System.nanoTime();
        long tempoAlternativa = (fimAlternativa - inicioAlternativa) / 1000000;

        System.out.println("Tempo da função inserir da HashSoldagemLinear: " + tempoOriginal + " ms");
        System.out.println("Tempo da função inserir da HashLista alternativa: " + tempoAlternativa + " ms");


    }
}


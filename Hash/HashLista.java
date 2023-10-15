package Hash;

import Objeto.Aluno;
import lista.Lista;

public class HashLista
{
    private int tamanho = 0;
    private Lista vetor[];
    private float fatorDeCarga;

    //Construtor da Hash, aqui é onde ela é inicializada, chamada, construida.
    public HashLista(int tamanho)
    {
        this.vetor = new Lista[tamanho];
        this.tamanho = tamanho;
    }

    //Inserir da Hash, nessa função nós chamamos a função Hash para que possamos descobrir a onde alocar o dado no vetor/Array.
    public void inserir(String nome, int nota)
    {
        Aluno aluno = new Aluno(nome, nota);

        int posicao = funcaoHash(aluno.getNota());


        //Caso essa posição esteja ocupada, nós vamos usar uma lista duplamente encadeada para evitar colisão
        //alocando os elementos em uma mesma lista.
        if(vetor[posicao] != null)
        {
            vetor[posicao].insert(aluno);
        }
        else
        {
            Lista lista = new Lista<>();
            vetor[posicao] = lista;
            vetor[posicao].insert(aluno);
        }
    }

    //Função Hash para descobrir qual chave o dado será inserido.
    public int funcaoHash(int nota)
    {
        return (nota % tamanho);
    }
    public boolean estaCheio()
    {
        if(fatorDeCarga == 0)
        {
            return true;
        }
        return false;
    }
    public Lista deletar(int nota)
    {
        int poicao = funcaoHash(nota);
        Lista aluno = vetor[poicao];
        vetor[funcaoHash(nota)] = null;
        return aluno;
    }
    public Lista buscar(int chave)
    {
        int posicao = funcaoHash(chave);
        return vetor[posicao];
    }












    public Lista getVetor(int posicao)
    {
        return this.vetor[posicao];
    }




}

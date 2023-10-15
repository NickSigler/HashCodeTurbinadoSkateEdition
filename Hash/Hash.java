package Hash;

import Objeto.Aluno;
public class Hash
{
    private int tamanho = 0;
    private Aluno vetor[];
    private float fatorDeCarga;
    public Hash(int tamanho)
    {
        this.vetor = new Aluno[tamanho];
    }
    public void inserir(String nome, int nota)
    {
        Aluno aluno = new Aluno(nome, nota);
        int posicao = funcaoHash(aluno.getNota());
        vetor[posicao] = aluno;
    }
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
    public Aluno deletar(int nota)
    {
        int poicao = funcaoHash(nota);
        Aluno aluno = vetor[poicao];
        vetor[funcaoHash(nota)] = null;
        return aluno;
    }
    public Aluno buscar(int chave)
    {
        int posicao = funcaoHash(chave);
        return vetor[posicao];
    }












    public Aluno getVetor(int posicao)
    {
        return this.vetor[posicao];
    }




}

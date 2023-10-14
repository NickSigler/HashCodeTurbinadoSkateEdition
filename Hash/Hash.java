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
    public void insert(String nome, int nota)
    {
        Aluno aluno = new Aluno(nome, nota);
        int posicao = funcaoHash(aluno);
        vetor[posicao] = aluno;
    }
    public int funcaoHash(Aluno aluno)
    {
        return (aluno.getNota() % tamanho);
    }
    //public float conf
    //
    //
    //
    // erirCarga(int chave)
    //{
    //}
    public boolean isEmpty()
    {
        if(fatorDeCarga == 0)
        {
            return true;
        }
        return false;
    }












    public Aluno getVetor(int posicao)
    {
        return this.vetor[posicao];
    }




}

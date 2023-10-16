package Hash;

import Objeto.Aluno;
public class HashSoldagemLinear
{
    private int tamanho = 0;
    private Aluno vetor[];
    private float fatorDeCarga;
    public HashSoldagemLinear(int tamanho)
    {
        this.vetor = new Aluno[tamanho];
        this.tamanho = tamanho;
    }
    public void inserir(String nome, int nota)
    {
        Aluno aluno = new Aluno(nome, nota);
        int posicao = funcaoHash(aluno.getNota());
        int analisarPosicao = posicao;
        while(true)
        {
            if(vetor[analisarPosicao] != null)
            {
                analisarPosicao = funcaoHash(aluno.getNota() + 2);
            }
            else
            {
                vetor[analisarPosicao] = aluno;
                break;
            }
        }
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
    public String deletar(int nota, String nome)
    {
        int posicao = funcaoHash(nota);
        int analisarPosicao = posicao;
        while(true)
        {
            if(vetor[posicao].getNome() == nome & vetor[posicao].getNota() == nota)
            {
                vetor[posicao] = null;
                return String.format("Aluno: %s com nota: %d encontrado",nome, nota);
            }
            else
            {
                analisarPosicao = funcaoHash(nota + 2);
            }
        }
    }
    public String buscar(int nota, String nome)
    {
        int posicao = funcaoHash(nota);
        int analisarPosicao = posicao;
        while(true)
        {
            if(vetor[posicao] == null)
            {
                return String.format("Aluno não encontrado!");
            }
            else if(vetor[analisarPosicao].getNome() == nome & vetor[analisarPosicao].getNota() == nota)
            {

                return String.format("Aluno: %s com nota: %d encontrado",nome, nota);

            }
            else
            {
                analisarPosicao = funcaoHash(nota + 2);
            }
        }
    }
    public Aluno getVetor(int posicao)
    {
        return this.vetor[posicao];
    }
}

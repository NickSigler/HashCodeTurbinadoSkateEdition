package Hash;

import Objeto.Aluno;
import lista.Lista;
import lista.No;

import java.util.ArrayList;

public class HashLista
{
    private int tamanho = 0;
    private Lista vetor[];
    private float elementos = 0;
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
        elementos++;
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


    public void deletar(int nota, String nome)
    {
        int poicao = funcaoHash(nota);
        Lista aluno = vetor[poicao];

        vetor[poicao].remove(vetor[poicao].buscar(nome,nota));

        imprimirTabela();

    }

    //Ele busca atraves da nota e do nome do alunona lista e retorna os valores do Nó
    public String buscar(int nota, String nome)
    {
        int posicao = funcaoHash(nota);

        if(vetor[posicao] == null)
        {
            return String.format("Aluno não encontrado!");
        }
        else if(vetor[posicao] instanceof Lista)
        {
            No aluno = vetor[posicao].buscar(nome, nota);
            return String.format("Aluno  com nota  encontrado! ");

        }
        return String.format("Aluno não encontrado! ");
    }
    public Object getVetor(int posicao)
    {
        return this.vetor[posicao];
    }

    public void imprimirTabela() {
        for (int i = 0; i < tamanho; i++) {
            if (vetor[i] != null) {
                System.out.print(i + " {");
                Lista lista = vetor[i];
                No atual = lista.getNoInicial();
                while (atual != null) {
                    Aluno aluno = atual.getData();
                    System.out.print("Nome: " + aluno.getNome() + ", Nota: " + aluno.getNota());
                    if (atual.getNoProximo() != null) {
                        System.out.print(", ");
                    }
                    atual = atual.getNoProximo();
                }
                System.out.println("}");
            }
        }
    }
    public void expandirTamanho()
    {
        ArrayList<Lista> guardarArray = new ArrayList<>();

        if(elementos >= 0.8)
        {
            for(int i = 0; i < tamanho; i++)
            {
                if(vetor[i] != null)
                {
                    guardarArray.add(vetor[i]);
                }
            }

            this.vetor = new Lista[tamanho * 2];

            for(Lista alunos: guardarArray)
            {

                

            }
        }
    }



}

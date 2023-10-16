package lista;

import Objeto.Aluno;

public class Lista<T>
{
    private No noInicial = null;

    //Construtor da lista
    public Lista(){}

    //Inserindo o elemento dentro da Lista
    public No insert(Aluno data)
    {
        No no = new No(data);

        //Se noInicial for zero, ele será inserido aqui
        if(noInicial == null)
        {
            noInicial = no;
            //Inserindo um elemento vazio no anterior para evitar que algum no seja inserido aqui
            Aluno alunoVazio = new Aluno("Vazio", -1);
            no.setNoAnterior(new No(alunoVazio));
            return no;
        }

        //Laço de repetição para verificar o noAtual e verificar se tem espaço no próximo ou no anterior, caso não, ele
        //reinicia o laço com o atualNo a ser analisado
        No noAtual = noInicial;
        while(true)
        {
            if(noAtual.getNoProximo() == null)
            {
                noAtual.setNoProximo(no);
                no.setNoAnterior(noAtual);
                return no;
            }
            else if(noAtual.getNoAnterior() == null)
            {
                noAtual.setNoAnterior(no);
                no.setNoAnterior(noAtual);
                return no;
            }
            else
            {
                noAtual = noAtual.getNoProximo();
            }
        }
    }

    //
    public T remove(T data)
    {
        No noAtual = noInicial;
        while(true)
        {
            //Verifica se o dado do nó atual é o mesmo dado do nó que estamos procurando para remover
            if(noAtual.getData() == data)
            {

                //Ele rearranja a ordem dos nós para que não ocorra deles perderem a conexão
                noAtual.getNoProximo().setNoAnterior(noAtual.getNoAnterior());
                noAtual.getNoAnterior().setNoProximo(noAtual.getNoProximo());
                return (T) noAtual.getData();
            }
            //Fazer uma condição para tratar o erro e não achar
            else
            {
                noAtual = noAtual.getNoProximo();
            }

        }

    }
    public No buscar(Aluno valorProcurado) {
        No noAtual = noInicial;

        while (noAtual != null) {
            if (noAtual.getData().equals(valorProcurado)) {
                return noAtual;
            }
            noAtual = noAtual.getNoProximo();
        }

        // Retorna null se o elemento não for encontrado na lista
        return null;
    }





}

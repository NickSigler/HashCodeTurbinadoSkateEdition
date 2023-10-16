package lista;

import Objeto.Aluno;

public class No
{
    private No noAnterior;
    private No noProximo;
    private Aluno data;
    public No(Aluno data)
    {
        this.data = data;
    }
    public No getNoAnterior()
    {
        return this.noAnterior;
    }
    public void setNoAnterior(No noAnterior)
    {
        this.noAnterior = noAnterior;
    }
    public No getNoProximo()
    {
        return this.noProximo;
    }
    public void setNoProximo(No noProximo)
    {
        this.noProximo = noProximo;
    }
    public Aluno getData()
    {
        return this.data;
    }
    public void setData(Aluno data)
    {
        this.data = data;
    }

}

package lista;

public class No<T>
{
    private No noAnterior;
    private No noProximo;
    private T data;
    public No(T data)
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
    public T getData()
    {
        return this.data;
    }
    public void setData(T data)
    {
        this.data = data;
    }

}

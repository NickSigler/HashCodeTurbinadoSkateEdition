package lista;

public class Lista<T>
{
    private No noInicial = null;
    public Lista()
    {

    }
    public No insert(T data)
    {
        No no = new No<T>(data);

        if(noInicial == null)
        {
            noInicial = no;
            no.setNoAnterior(new No<>("vazio"));
            return no;
        }
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
    public No remove(No no)
    {
        No noAtual = noInicial;
        while(true)
        {
            if(noAtual.equals(noAtual))
            {
                return no;

            }

        }

    }
    



}

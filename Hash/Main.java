package Hash;

import lista.*;

import Objeto.Aluno;

import java.util.ArrayList;

public class Main
{
    public static void main(String[] args)
    {
       //HashSoldagemLinear hash = new HashSoldagemLinear(20);
       //hash.inserir("Nicolas", 10);
       //hash.inserir("Natalia", 10);
       //System.out.println(hash.buscar(10, "Natalia"));

        HashLista hash = new HashLista(20);
        hash.inserir("Nicolas", 10);

        hash.inserir("Nathalia", 10);
        hash.imprimirTabela();
        hash.deletar(10, "Nathalia");
        System.out.println(hash.buscar(10, "Nicolas"));
        hash.imprimirTabela();
    }
}

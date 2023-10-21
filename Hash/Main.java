package Hash;

import lista.*;

import Objeto.Aluno;

import java.util.ArrayList;

public class Main
{
    public static void main(String[] args)
    {
        /*
       HashSoldagemLinear hash = new HashSoldagemLinear(20);
       hash.inserir("Nicolas", 10);
       hash.deletar(10, "Natalia");
       hash.inserir("Natalia", 10);
       System.out.println(hash.buscar(10, "Natalia"));


         */

        HashLista hash = new HashLista(20);
        hash.inserir("Nicolas", 10);

        hash.inserir("Nathalia", 10);
        hash.inserir("Natha", 10);
        hash.inserir("Natlia", 10);
        hash.inserir("Nthalia", 10);
        hash.inserir("athalia", 10);
        hash.inserir("Nalia", 10);

        hash.imprimirTabela();
        hash.deletar(10, "Nalia");
        System.out.println(hash.buscar(10, "Nicolas"));
        hash.imprimirTabela();


    }
}

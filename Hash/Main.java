package Hash;

import lista.*;

import Objeto.Aluno;

import java.util.ArrayList;

public class Main
{
    public static void main(String[] args)
    {
       HashLista hashLista = new HashLista(10);
       hashLista.inserir("Nicolas", 10);
       hashLista.inserir("Natalia", 10);
    }
}

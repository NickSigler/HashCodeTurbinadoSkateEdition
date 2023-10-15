package Hash;

import lista.*;

import Objeto.Aluno;

import java.util.ArrayList;

public class Main
{
    public static void main(String[] args)
    {
        Lista lista = new Lista();
        lista.insert("Olá1");
        lista.insert("Olá2");
        lista.insert("Ola3");

        System.out.println(lista.remove("Olá1"));
    }
}

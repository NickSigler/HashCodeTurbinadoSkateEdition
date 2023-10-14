package Hash;

public class Main
{
    public static void main(String[] args)
    {
        Hash hash = new Hash(10);
        System.out.println(hash.getVetor(0));
        hash.insert("Nicolas", 2);
    }
}

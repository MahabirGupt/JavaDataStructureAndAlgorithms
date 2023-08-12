public class Test11
{
    public static void main(String[] args)
    {
        Boolean b1 = new Boolean(null);
        Boolean b2 = new Boolean(false);
        System.out.print((b1 == b2)+" ");
        System.out.print(b1.equals(b2));
    }
}

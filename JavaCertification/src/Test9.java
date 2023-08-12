public class Test9
{
    public static void main(String[] args)
    {
        int[] a = {10,20,30};
        int[] b = {10,20};
        a=b;
        for(int i :a)
        {
            System.out.print(i);
        }
    }
}

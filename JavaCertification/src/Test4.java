public class Test4
{
    static int i =10;
    int j = 20;
    public void m1()
    {
        i++;
        j++;
    }
    public static void main(String[] args)
    {
        Test4 t1 = new Test4();
        t1.m1();

        Test4 t2 = new Test4();
        t2.m1();

        System.out.print(t2.i+" "+t2.j);
    }
}

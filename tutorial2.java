
public class tutorial2 {
    public static void main(String[] args)
    {
        String name = "tadokoro";
        int age = 114514;
        hello(name, age);
        int sb = add(114,514);
        System.out.println(sb);
        //classtest tdkr = new classtest(114);
    }
    static void hello(String s, int i)
    {
        System.out.println("hello "+s+"! "+i);
    }
    static int add(int i, int j)
    {
        return i+j;
    }
    
}

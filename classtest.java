public class classtest
{
    public static void main(String[] args)
    {
        animals senpai = new animals("tadokoro", 114514, "iiyo, koiyo!!!");
        System.out.println(senpai.name + " " + senpai.weight);
        senpai.Shout();
        animals snail = new animals("mysnail", 810);
        System.out.println(snail.name + " " + snail.weight);
        snail.Shout();
        Cat mycat = new Cat("mimi", 10, 5);
        System.out.println(mycat.name + " " + mycat.weight);
        mycat.Shout();
    }
}
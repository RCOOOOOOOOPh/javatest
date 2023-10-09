public class animals {
    String name;
    int weight;
    String shout;
    animals(String namee, int weightt, String shoutt)
    {
        this.name = namee;
        this.weight = weightt;
        this.shout = shoutt;
    }
    animals(String namee, int weightt)
    {
        this.name = namee;
        this.weight = weightt;
    }
    void Shout()
    {
        if (shout != null) System.out.println(shout);
        else
        {
            System.out.println("this animal don't shout");
        }
    }
}

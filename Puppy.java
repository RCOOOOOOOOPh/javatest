public class Puppy {
    int puppyAge;
    public Puppy(String name)
    {
        System.out.println(name);
    }
    public void setAge(int age)
    {
        puppyAge = age;
    }
    public int getAge()
    {
        System.out.println("puppy's age is " + puppyAge);
        return puppyAge;
    }
    public static void main(String[] args)
    {
        Puppy mypuppy = new Puppy("MUR");
        mypuppy.setAge(24);
        System.out.println(mypuppy.getAge());
    }
}
//javac xxx.java 生成一个.class文件
//java xxx
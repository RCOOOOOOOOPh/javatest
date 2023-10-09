import java.util.Scanner;

public class testinput {
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        String mystr = s.nextLine();
        System.out.println("Hello, "+mystr);
        int myint = s.nextInt();
        System.out.println(myint);
    }
}

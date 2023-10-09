import java.util.Collections;
import java.util.ArrayList;
import java.util.Arrays;
public class test {
    public static void main(String[] args)
    {
        String s = "tadokoro, kouji";
        System.out.println(s);
        System.out.println(s.charAt(2));
        System.out.println(s.length());
        String s2 = "ccc, aa,wee,e";
        String s3 = s.concat(s2);
        System.out.println(s3);
        System.out.println(s3.compareTo(s));
        //String[] splitted = s3.split(",");
        //for (String ss:splitted) System.out.println(ss);
        String sub1 = s.substring(1, 6);
        System.out.println(sub1);
        String sub2 = s.substring(3);
        System.out.println(sub2);
        char[] chararr = s.toCharArray();//to char array
        Arrays.sort(chararr);
        for (char c:chararr) System.out.print(c);
        System.out.println("");
        String s4 = chararr.toString();
        System.out.println(s4);

        ArrayList<Integer> intlist = new ArrayList<>();
        intlist.add(1);
        intlist.add(4);
        Arrays.sort(intlist);
        for(int i: intlist) System.out.println(i);
    }
}

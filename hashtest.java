import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class hashtest {
    public static void main(String[] arg)
    {
        //HashSet create
        HashSet<String> myset = new HashSet<>();
        //add
        myset.add("abc");
        myset.add("def");
        myset.add("ghi");
        //print
        System.out.println(myset);
        //find
        System.out.println(myset.contains("abc"));
        //remove
        myset.remove("abc");
        //iterate
        for (String s: myset) System.out.println(s);

        //HashMap create
        HashMap<String, Integer> mymap = new HashMap<>();
        //add
        mymap.put("tadokoro", 24);
        mymap.put("aaa", 114514);
        mymap.put("bbb", 810);
        //print
        System.out.println(mymap);
        //modify
        mymap.put("tadokoro", 1919);
        //find
        System.out.println(mymap.get("ffdsf"));
        //remove
        mymap.remove("aaa");
        //iterate
        for (String k : mymap.keySet()) System.out.print(k+" ");
        System.out.println(""); 
        for (int v : mymap.values()) System.out.print(v+" "); 
        System.out.println(""); 
        for (Map.Entry<String, Integer> e : mymap.entrySet()) System.out.print(e.getKey()+" "+e.getValue()+" "); 
    }
}

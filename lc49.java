import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class lc49 {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> mymap = new HashMap<>();
        for (String s: strs)
        {
            char[] chararr = s.toCharArray();
            Arrays.sort(chararr);
            String k = String.valueOf(chararr);
            if (! mymap.containsKey(k)) mymap.put(k, new ArrayList<String>());
            mymap.get(k).add(s);
        }
        List<List<String>> ans = new ArrayList<>();
        for (Map.Entry<String, List<String>> e : mymap.entrySet())
        {
            ans.add(e.getValue());
        }
        return ans;
    }

    public static void main(String[] args)
    {
        String[] strlist = {"iiyo", "iyio", "koiyo", "ikuiku", "iikkuu"};
        lc49 solution = new lc49();
        List<List<String>> ans = solution.groupAnagrams(strlist);
        for (List<String> l : ans)
        {
            for (String s: l)
            {
                System.out.print(s+" ");
            }
            System.out.println("");
        }
    }
}

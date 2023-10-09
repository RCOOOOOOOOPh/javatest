import java.util.ArrayList;

public class tutorial1 {
    public static void main(String[] args)
    {
        String name = "tadokoro";
        boolean result = name.equals("Tadokoro");
        System.out.println(result);
        result = name.equalsIgnoreCase("Tadokoro");
        System.out.println(result);
        char resultchar = name.charAt(2);
        System.out.println(resultchar);
        ArrayList<String> arr0 = new ArrayList<String>();
        arr0.add("arr00");
        arr0.add("arr01");
        arr0.add("arr02");
        for (String s: arr0) System.out.println(s);
        ArrayList<ArrayList<String>> arr2d = new ArrayList();
        arr2d.add(arr0);
        ArrayList<String> arr1 = new ArrayList<String>();
        arr1.add("arr10");
        arr1.add("arr11");
        arr2d.add(arr1);
        for (int i=0;i<arr2d.size(); i++)
        {
            for (int j=0; j<arr2d.get(i).size(); j++)
            {
                System.out.println(arr2d.get(i).get(j));
            }
        }
    }
    
}

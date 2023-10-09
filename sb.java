class Result {
    static double parse(String s)
    {
        String[] splitted = s.split("\t");
        double ans = 0.0;
        //System.out.println(splitted[splitted.length-1]);
        try
        {
            ans = Double.parseDouble(splitted[splitted.length-1]);
            return ans;
        }
        catch(Exception e)
        {
            return -1.0;
        }
    }
    /*
     * Complete the 'calcMissing' function below.
     *
     * The function accepts STRING_ARRAY readings as parameter.
     */

    public static void calcMissing(List<String> readings) {
    // Write your code here
    List<Double> mylist = new ArrayList<>();
        for (String s: readings) mylist.add(parse(s));
        //System.out.println(mylist);
        for (int i=0; i<mylist.size(); i++)
        {
            if (mylist.get(i) < 0.0)
            {
                List<Integer> left = new ArrayList<>();
                List<Integer> right = new ArrayList<>();
                int j = i + 1;
                while (j < mylist.size() && right.size() < 2)
                {
                    if (mylist.get(j) > 0.0) right.add(j);
                    j++;
                }
                j = i - 1;
                while (j >= 0 && right.size() < 2)
                {
                    if (mylist.get(j) > 0.0) right.add(j);
                    j--;
                }
                if (left.size() == 0)
                {
                    System.out.println(mylist.get(right.get(0)) - (right.get(0) - i)
                     * (mylist.get(right.get(1))-mylist.get(right.get(0))) 
                     / (right.get(1)-right.get(0)));
                }
                else if (right.size() == 0)
                {
                    System.out.println(mylist.get(left.get(0)) - (left.get(0) - i)
                     * (mylist.get(left.get(1))-mylist.get(left.get(0))) 
                     / (left.get(1)-left.get(0)));
                }
                else
                {
                    System.out.println(mylist.get(left.get(0)) - (left.get(0) - i)
                     * (mylist.get(left.get(0))-mylist.get(right.get(0))) 
                     / (left.get(0)-right.get(0)));
                }
            }
        }
    }

}
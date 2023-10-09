public class testArray {
    public static void myprint(String[] strings)
    {
        for(String s: strings)
        {
            System.out.println(s);
        }
    }
    public static void main(String[] args)
    {
        /*int[] intarr = new int[10];
        intarr[2] = 114514;
        for(int i: intarr)
        {
            System.out.println(i);
        }
        int[] intarr2 = {1,1,4,5,1,4};
        for(int i: intarr2)
        {
            System.out.println(i);
        }
        String[] strarr = new String[3];
        strarr[0] = "tadokoro";
        strarr[1] = "kouji";
        strarr[2] = "iiyokoiyo";
        myprint(strarr);*/
        //int[][] arr2d = new int[3][2];
        int[][] arr2d = {{1,1,4}, {5,1,4}, {8,1,0}};
        for(int i=0;i<arr2d.length;i++)
        {
            for(int j=0;j<arr2d[0].length;j++)
            {
                System.out.println(arr2d[i][j]);
            }
        }
    }
}

class MyThread extends Thread{
    public int myrun(){
        if(n % 2) n++;
        return n;
    }
}


public class ThreadTest2 {
    public static void main(String[] arg)
    {
        int num = 0;
        MyThread t1 = new MyThread();
        MyThread t2 = new MyThread();
        t1.run();
    }
}

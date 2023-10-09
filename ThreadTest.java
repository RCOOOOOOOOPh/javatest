class MyThread1 extends Thread{
    public void run(){
        for (int i=0; i<10; i++) System.out.println("thread1 printing " + i);
    }
}

class MyThread2 extends Thread{
    public void run(){
        for (int i=0; i<10; i++) System.out.println("thread2 printing " + i);
    }
}

class MyThread3 implements Runnable{
    public void run(){
        for (int i=0; i<10; i++) System.out.println("thread3 printing " + i);
    }
}

public class ThreadTest {
    public static void main(String[] arg)
    {
        MyThread1 t1 = new MyThread1();
        t1.start();
        Runnable r = new MyThread3();
        Thread t3 = new Thread(r);
        t3.start();
        for (int i=0; i<10; i++) System.out.println("main printing "+i);
    }
}

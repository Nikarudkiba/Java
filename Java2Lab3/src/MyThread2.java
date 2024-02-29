public class MyThread2 implements Runnable {
    int loop;

    public MyThread2(int x)
    {loop = x;}

    public MyThread2() {}

    public void run() {
        System.out.println("Runnable is starting");
        for (int i=0;i<=loop;i++){
            System.out.println(i);}

        System.out.println("Runnable is terminated");
    }
}

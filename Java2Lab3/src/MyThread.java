public class MyThread extends Thread {
    int loop;

    public MyThread(int x)
    {loop = x;}

    public void run() {
    System.out.println("thread is starting");
    for (int i=0;i<=loop;i++){
        System.out.println(i);}

    System.out.println("Thread is terminated");
    }
}

public class Lab7 {

    public static void main (String[]Args){
    //Thread part start
    MyThread m1= new MyThread(200);
    m1.start();
    MyThread m2= new MyThread(300);
    m2.start();   // Thread part end
    //Runnable Part Start
    MyThread2 m3 = new MyThread2(250);
    Thread t1= new Thread(m3);
    t1.start();
    MyThread2 m4 = new MyThread2(350);
    Thread t2 = new Thread(m4);
    t2.start();
    }
    //Runnable Part End
}


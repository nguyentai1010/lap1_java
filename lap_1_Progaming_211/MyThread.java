package lap_1_Progaming_211;
public class MyThread extends Thread{
    public void run() {
        System.out.println("Current thread: " + Thread.currentThread().getName());
        Thread.currentThread().setName("myJavaThread");
        System.out.println("Thread renamed to: " + Thread.currentThread().getName());
        for (int i = 2; i <= 20; i+=2) {
            System.out.println(i);
            try {
                Thread.sleep(1500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

class Main1 {
    public static void main(String args[]) {
        MyThread thread = new MyThread();
        thread.start();
    }
}
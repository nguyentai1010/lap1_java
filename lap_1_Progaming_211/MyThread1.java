package lap_1_Progaming_211;
class MyThread1 implements Runnable {

    public void run() {
        for (int i = 2; i <= 20; i += 2) {
            System.out.println(i);
            try {
                Thread.sleep(1500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
class Main2 {
    public static void main(String args[]) {
        MyThread1 myThread = new MyThread1();
        Thread thread = new Thread(myThread);
        thread.start();
    }
}
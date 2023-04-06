package deamon;

public class DeamonApp {
    public static void main(String[] args) {
        System.out.println("===> main thread running");
        //tao ra 1 thread
        Thread deamonThread = new DeamonThread();
        //set la deamon thread
        deamonThread.setDaemon(true);
        deamonThread.start();
        new NoneDeamon().start();
        //tao 1 luong khac
        try {
            //ngu 5 giay
            Thread.sleep(5000);
        }catch (InterruptedException e)
        {
            e.printStackTrace();
        }
        System.out.println(" main thread ending");
        System.out.println("main thread" + deamonThread.isAlive());
    }
}

package Thread1;

public class RunnaableApp {
    public static void main(String[] args)throws InterruptedException {
        System.out.println(" main thread running...");
        Thread thread = new Thread(new DemoRunnableInterface());
        thread.start();
        //sleep  3 giay
        Thread.sleep(3000);
        System.out.println("main thread stooped");

    }
}
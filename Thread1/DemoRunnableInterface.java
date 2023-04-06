package Thread1;

import java.sql.SQLSyntaxErrorException;

public class DemoRunnableInterface implements Runnable {
    @Override
    public void run() {
        int idx = 1;
        for (int i =0; i< 10; i++){
            System.out.println("Hello From DemoRunnable " + idx++);
            //ngu 2 giay
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e){
                e.printStackTrace();
            }
        }
    }
}
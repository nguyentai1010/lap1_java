package deamon;

public class NoneDeamon extends Thread {
    @Override
    public void run() {
      int i=0;
      while (i<10){
          //vong lap chay 10 lan
          System.out.println(" none deamon thread "  + i++);
          try {
              //ngu 1 giay
              Thread.sleep(1000);
          }catch (InterruptedException e){
              e.printStackTrace();
          }
      }
    }
}

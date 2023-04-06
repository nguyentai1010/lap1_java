package deamon;

public class DeamonThread extends  Thread{
    @Override
    public void run() {
        int count = 0;
        while (true){
            //vong lap vo tan
            System.out.println("  +deamon thread "  + count++);
            try {
                Thread.sleep(2000);
            }catch (InterruptedException e){
                e.printStackTrace();
            }
        }
    }
}

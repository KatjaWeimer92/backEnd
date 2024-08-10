public class Task implements  Runnable{
    public void run(){
        for (int i=0; i < 1_000_000; i++){
            Main.counterInc();
        }
    }
}

package Homework;

public class DivBy2 extends Thread{
    public void run(){
        int i=1;
        while (true){
            i++;
            if (i%2==0){
                System.out.println(i + "делится на 2");
            }
            try {
                sleep(100);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}

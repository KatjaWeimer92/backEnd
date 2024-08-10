package Homework;

public class DivBy3 extends Thread{
    public void run(){
        int i=1;
        while (true){
            i++;
            if (i%3==0){
                System.out.println(i + "делится на 3");
            }
            try {
                sleep(100);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}

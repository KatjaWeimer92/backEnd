package Homework;
/*
Реализовать 2 потока:
первый поток должен выводить на экран все числа, которые делятся на 2;
второй поток должен выводить все числа которые делятся на 3;
Main должен запускать оба эти потока, засыпать на 3 секунды и завершать выполнение программы (т.е. оба потока тоже должны прекратить свою работу)
*/

public class Main {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("Main start");

        DivBy2 thread1 = new DivBy2();
        Thread thread2 = new Thread(new DivBy3());

        thread1.setDaemon(true);
        thread2.setDaemon(true);

        thread1.start();
        thread2.start();

        try{
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw  new  RuntimeException(e);
        }
        System.out.println("Main end");
    }
}
